package Tcp;

	import java.io.IOException;
/*public class ServerSocket extends Object ����ʵ�ַ������׽��֡��������׽��ֵȴ�����ͨ�����紫��;
	
	���췽����
	ServerSocket(int port) �����󶨵��ض��˿ڵķ������׽��֡�---->��Ϊ�ͻ��˷��͹���֮ǰ�Ѿ�ȷ���ð汾����
	
	����ժҪ 
	 InputStream accept()  ���������ܵ����׽��ֵ����ӡ� ---->������ȷ�ĸ��ͻ��˷��͵����� 
	 
	 ���裺
	 	1.����һ������˶���ServerSocket,���췽���󶨿ͻ��˷������Ķ˿ں�
		2.ʹ��Socket�����еķ���getInputStream()��ȡ�����ֽ�������InputStream����
		3.ʹ�������ֽ�������InputStream�����е�read��������ȡ�ͻ��˷��͹�������Ϣ 
		4.ʹ��Socket�����еķ���getOutputStream(����ȡ�����ֽ������OutputStream����
		5.ʹ�������ֽ�������OutpuStream�����е�write������������������Ϣ��д���ͻ���
		6.�ر���Դ*/
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Demo02Server {
	public static void main(String[] args) throws IOException {
		ServerSocket ss = new ServerSocket(2222);
		Socket soc = ss.accept();
		InputStream ips = soc.getInputStream();
		byte[] by = new byte[1024];
		int len = ips.read(by);
		System.out.println(new String (by,0,len));
		 OutputStream oup = soc.getOutputStream();
		 oup.write("Copy That".getBytes());
		 soc.close();
		 ss.close();
	}  
}
