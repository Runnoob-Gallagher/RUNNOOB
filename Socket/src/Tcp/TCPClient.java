package Tcp;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

public class TCPClient {
	  public static void main(String[] args) throws IOException {
	        //1.����һ�������ֽ�������FileInputStream����,���췽���а�Ҫ��ȡ������Դ
	        FileInputStream fis = new FileInputStream("E:\\SVN\\Gallagher.txt");
	        //2.����һ���ͻ���Socket����,���췽���а󶨷�������IP��ַ�Ͷ˿ں�
	        Socket socket = new Socket("127.0.0.1",8888);
	        //3.ʹ��Socket�еķ���getOutputStream,��ȡ�����ֽ������OutputStream����
	        OutputStream os = socket.getOutputStream();
	        //4.ʹ�ñ����ֽ�������FileInputStream�����еķ���read,��ȡ�����ļ�
	        int len = 0;
	        byte[] bytes = new byte[1024];
	        while((len = fis.read(bytes))!=-1){
	            //5.ʹ�������ֽ������OutputStream�����еķ���write,�Ѷ�ȡ�����ļ��ϴ���������
	            os.write(bytes,0,len);
	        }
	        //6.ʹ��Socket�еķ���getInputStream,��ȡ�����ֽ�������InputStream����
	        InputStream is = socket.getInputStream();
	        //7.ʹ�������ֽ�������InputStream�����еķ���read��ȡ�����д������
	        while((len = is.read(bytes))!=-1){
	            System.out.println(new String(bytes,0,len));
	        }
	        //8.�ͷ���Դ(FileInputStream,Socket)
	        fis.close();
	        socket.close();
	    }
}
