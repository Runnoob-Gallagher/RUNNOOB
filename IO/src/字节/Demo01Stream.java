package �ֽ�;

import java.io.FileOutputStream;
import java.io.IOException;

/*
	����ʹ�õĵ�OutputStream  �ֽ����������ʾ���ڴ��е�����д��������
	OutoutStream��һ�������࣬��ʾ����ֽ�����������ĳ��ࡣ
	��Ϊ�����ǳ����࣬����ֱ��ʹ�á���ô���������Ҫʹ�������ࣻ---->FileOutputStream  �ļ��ֽ������
	���췽����
		FileOutputStream(File file) ����һ����ָ�� File �����ʾ���ļ���д�����ݵ��ļ��������---->��ʾֱ�������ָ���ļ���,��������һ���ļ����͵�
		FileOutputStream(String name)  ����һ�������ָ�����Ƶ��ļ���д�����ݵ�����ļ�����---->��ʾ�����ļ�·��ȥ���
	���췽�����ã�
		1.����һ��FileOutputStream����
		2.���ݹ��췽���д��ݵ��ļ�/�ļ�·��������һ���µ��ļ�
		3.���FileOutputStream����ָ�򴴽��õ��ļ�
	��Ա������
		 	void close() �رմ���������ͷ�������йص�����ϵͳ��Դ�� 
 			void flush()  ˢ�´��������ǿ��д�����л��������ֽڡ� 
 			void write(byte[] b) �� b.length ���ֽڴ�ָ���� byte ����д���������� 
 			void write(byte[] b, int off, int len)   ��ָ�� byte �����д�ƫ���� off ��ʼ�� len ���ֽ�д���������� 
			abstract  void write(int b) ��ָ�����ֽ�д���������� 
		���ڴ���д�����̵Ĺ��̣�
			����---->JVM---->OS--->OS����д���ݵķ���---->д���ļ���
		д�ļ���һ�����̣�
			1.����FileOutputStream�����ڹ��췽���д���д�����ݵ��ļ�Ŀ��
			2.����FileOutputStream�����е�write������������д�뵽�ļ���
			3.�ر���Դ

 */
public class Demo01Stream {
	public static void main(String[] args) throws IOException {
//		1.����FileOutputStream�����ڹ��췽���д���д�����ݵ��ļ�Ŀ��
		FileOutputStream fos = new FileOutputStream("E:\\SVN\\Gallagher.txt");
//		2.����FileOutputStream�����е�write������������д�뵽�ļ���
		fos.write(99);//��ΪӲ����ֻ�ܴ洢���������ݣ����ԻὫ99ת��Ϊ01100011�����Ӳ���С�  �ļ��༭���ٴ��ļ�ʱ�����ѯ������ֽڱ�ʾΪ�ַ���
						//����0-127���ѯASCII��   99---->C    
//		3.�ر���Դ
		fos.close();
	}
}
