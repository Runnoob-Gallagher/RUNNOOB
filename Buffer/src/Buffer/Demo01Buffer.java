package Buffer;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/*
	    public class BufferedOutputStream extends FilterOutputStream -->����ʵ�ֻ�����������ͨ�����������������
	    							-->Ӧ�ó���Ϳ��Խ������ֽ�д��ײ�������У����������ÿ���ֽ�д����õײ�ϵͳ��
	 	public class BufferedInputStream extends FilterInputStream;	-->�ڴ��� BufferedInputStream ʱ���ᴴ��һ���ڲ����������顣
	 									-->�ڶ�ȡ���������е��ֽ�ʱ���ɸ�����Ҫ�Ӱ������������ٴ������ڲ���������һ��������ֽ�
	 	
	 	���췽��ժҪ 
			BufferedOutputStream(OutputStream out)  ����һ���µĻ�����������Խ�����д��ָ���ĵײ�������� 
			BufferedOutputStream(OutputStream out, int size)  ����һ���µĻ�����������Խ�����ָ����������С������д��ָ���ĵײ�������� 
		����ժҪ 
 			void flush() ˢ�´˻����������� 
 			void write(byte[] b, int off, int len)  ��ָ�� byte �����д�ƫ���� off ��ʼ�� len ���ֽ�д��˻����������� 
 			void write(int b) ��ָ�����ֽ�д��˻����������� 
		ʵ�ֲ��裺
				1.����һ��FileOutputStream�����ƶ�Ŀ���ļ�/�ļ�·��
				2.����һ��BufferOutputStream���󣬹��췽���д���FileOutputStream����
				3.����BufferOutputStream�����е�write������������д�뵽��������
				4.����flush�������������е�����ˢ�µ��ļ���
				5.�ͷ���Դ
	 									
	 */
public class Demo01Buffer {
	public static void main(String[] args) throws IOException {
		FileOutputStream fos = new FileOutputStream("E:\\SVN\\Buffer");
		FileInputStream fis = new FileInputStream("E:\\SVN\\Buffer");
		BufferedOutputStream bos = new BufferedOutputStream(fos);
		BufferedInputStream bis = new BufferedInputStream(fis);
		bos.write("��Ҫ�ú�ѧϰ".getBytes());
		byte[] bt = {'A','B','C','D','F'};
		bos.write(bt,1,4);
		bos.flush();
		bos.write(97);//�������FileOutputStream��FileWriter��  �������Ҫappen��д�������ֱ����д��
		bos.close();
		int len = 0 ;
		while((len = bis.read() ) != -1) {
			System.out.println((char)len);
		}
		bis.close();
	}
}















