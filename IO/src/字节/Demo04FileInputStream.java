package �ֽ�;

import java.io.FileInputStream;
import java.io.IOException;

/*
 	InputStream�ֽ�������
 	public abstract class InputStream--->�˳������ʾ����ֱ����������������ĳ���
 	
 	FileInputStream���ļ��ֽ�������---->���ļ�ϵͳ��ĳ���ļ��л�������ֽ�
 	���췽��ժҪ 
	FileInputStream(File file)   ͨ����һ����ʵ���ļ�������������һ�� FileInputStream�����ļ�ͨ���ļ�ϵͳ�е� File ���� file ָ����
	FileInputStream(String name)   ͨ����һ����ʵ���ļ�������������һ�� FileInputStream�����ļ�ͨ���ļ�ϵͳ�е�·���� name ָ���� 


	 int read()  �Ӵ��������ж�ȡһ�������ֽڡ�  ��ȡһ���ֽڵ�����������ƶ�һ��������ָ��
 	 int read(byte[] b)   �Ӵ��������н���� b.length ���ֽڵ����ݶ���һ�� byte �����С� 
 	 int read(byte[] b, int off, int len) �Ӵ��������н���� len ���ֽڵ����ݶ���һ�� byte �����С� 

 */
public class Demo04FileInputStream {
	public static void main(String[] args) throws IOException {
		FileInputStream fis = new FileInputStream("E:\\SVN\\Gallagher.txt");//�������file�ļ� ��"E:\\SVN\\Gallagher.txt"����name·��
	/*	int bt = fis.read();//��ȡ�ļ��е�һ���ֽڣ������ļ�ĩβ����-1
		System.out.println(bt);
		bt = fis.read();//��ȡ�ļ��е�һ���ֽڣ������ļ�ĩβ����-1
		System.out.println(bt);
		bt = fis.read();//��ȡ�ļ��е�һ���ֽڣ������ļ�ĩβ����-1
		System.out.println(bt);
		bt = fis.read();//��ȡ�ļ��е�һ���ֽڣ������ļ�ĩβ����-1
		System.out.println(bt);
		bt = fis.read();//��ȡ�ļ��е�һ���ֽڣ������ļ�ĩβ����-1 
		System.out.println(bt);  */
		int len = 0;
		while((len = fis.read())!=-1) {   
//			 int read()  �Ӵ��������ж�ȡһ�������ֽ�   ע��������ص���һ��intֵ
			System.out.println(len); 
			System.out.println((char)len);//�����������һ���ֽ�һ���ַ��ģ����Գ���ת��char�������鿴���ݣ���
//			System.out.print((char)fis.read());
		}
		fis.close();
	}
}
