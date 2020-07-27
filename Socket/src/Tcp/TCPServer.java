package Tcp;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class TCPServer {
	 public static void main(String[] args) throws IOException {
	        //1.����һ��������ServerSocket����,��ϵͳҪָ���Ķ˿ں�
	        ServerSocket server = new ServerSocket(8888);
	        //2.ʹ��ServerSocket�����еķ���accept,��ȡ������Ŀͻ���Socket����
	        Socket socket = server.accept();
	        //3.ʹ��Socket�����еķ���getInputStream,��ȡ�������ֽ�������InputStream����
	        InputStream is = socket.getInputStream();
	        //5.����һ�������ֽ������FileOutputStream����,���췽���а�Ҫ�����Ŀ�ĵ�
	        FileOutputStream fos = new FileOutputStream("E:\\SVN\\Gallagher\\Galler.txt");
	        //6.ʹ�������ֽ�������InputStream�����еķ���read,��ȡ�ͻ����ϴ����ļ�
	        int len =0;
	        byte[] bytes = new byte[1024];
	        while((len = is.read(bytes))!=-1){
	            //7.ʹ�ñ����ֽ������FileOutputStream�����еķ���write,�Ѷ�ȡ�����ļ����浽��������Ӳ����
	            fos.write(bytes,0,len);
	        }
	        //8.ʹ��Socket�����еķ���getOutputStream,��ȡ�������ֽ������OutputStream����
	        //9.ʹ�������ֽ������OutputStream�����еķ���write,���ͻ��˻�д"�ϴ��ɹ�"
	        socket.getOutputStream().write("�ϴ��ɹ�".getBytes());
	        //10.�ͷ���Դ(FileOutputStream,Socket,ServerSocket)
	        fos.close();
	        socket.close();
	        server.close();
	    }
}
