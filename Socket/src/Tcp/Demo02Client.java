package Tcp;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

/*	��ʾ�ͻ��˵��ࣺ
		public class Socket extends Object;����ʵ�ֿͻ����׽��֣�Ҳ���ԾͽС��׽��֡������׽�������̨������ͨ�ŵĶ˵㡣
		�׽��֣�����IP��ַ�Ͷ˿ڵ����絥λ��
		
		���췽����
		Socket(String host, int port) ����һ�����׽��ֲ��������ӵ�ָ�������ϵ�ָ���˿ںš�
			String host --->��ʾ����������������/IP��ַ
			int port---->�������Ķ˿ں�
		
		��Ա������
		 OutputStream getOutputStream() ���ش��׽��ֵ��������
		 InputStream getInputStream()  ���ش��׽��ֵ���������
		 void close() �رմ��׽��֡� ��*/
	
	/*	 ʵ�ֲ��裺
			1.����һ���ͻ��˶���Socket,���췽���󶨷�������IP��ַ�Ͷ˿ں�
			2.ʹ��Socket�����еķ���getOutputStream()��ȡ�����ֽ������OutputStream����
			3.ʹ�������ֽ������OutputStream�����е�write����������������������
			4.ʹ��Socket�����еķ���getInputStream(����ȡ�����ֽ�������InputStream����
			5.ʹ�������ֽ�������InpuStream�����е�read���������շ�������д������
			6.�ر���Դ
		
		ע�⣺
			1.�ͻ��˺ͷ�������������ʹ��Socket�ṩ��������������ʹ���Լ�������������
			2.�����Ǵ����ͻ��˶���Socketʱ���ͻ�ȥ������������ͷ���������������������ͨ·
				�������ʧ�ܣ���ʾ�쳣 */

public class Demo02Client {
		public static void main(String[] args) throws IOException {
//			1.����һ���ͻ��˶���Socket,���췽���󶨷�������IP��ַ�Ͷ˿ں�
			Socket soc = new Socket("127.0.0.1", 2222);
//			2.ʹ��Socket�����еķ���getOutputStream()��ȡ�����ֽ������OutputStream����
			OutputStream ops = soc.getOutputStream();
//			3.ʹ�������ֽ������OutputStream�����е�write����������������������
			ops.write("This is My message".getBytes());
//			4.ʹ��Socket�����еķ���getInputStream(����ȡ�����ֽ�������InputStream����
			InputStream ips = soc.getInputStream();
//			5.ʹ�������ֽ�������InpuStream�����е�read���������շ�������д������
			byte[] by = new byte[1024];
			int len = ips.read(by);
			System.out.println(new String (by,0,len));
//			6.�ر���Դ 
			ops.close(); //���ﵽ��ʲôʱ��ùأ���ʲô���Ⱥ�˳����ʲô
			soc.close(); 
		}
}
