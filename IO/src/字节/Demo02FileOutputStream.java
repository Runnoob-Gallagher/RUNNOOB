package �ֽ�;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.lang.reflect.Array;
import java.util.Arrays;

/*һ��д����ֽڵķ���
 			void write(byte[] b) �� b.length ���ֽڴ�ָ���� byte ����д���������� 
 			void write(byte[] b, int off, int len)   ��ָ�� byte �����д�ƫ���� off ��ʼ�� len ���ֽ�д����������  
 */
public class Demo02FileOutputStream {
	public static void main(String[] args) throws IOException {
		// ����FileOutputStream�����ڹ�������ָ��д�����ݵ�Ŀ�ĵ�
		FileOutputStream fos = new FileOutputStream("E:\\SVN\\Gallagher.txt");
		// FileOutputStream fosB = new FileOutputStream(new
		// File("E:\\SVN\\Gallagher"));//ͬ��һ��
		// ����һ��д����Լ��ķ���---->void write(byte[] b) �������byte�ֽ�����
		byte[] bytes = {65, 66, 67, 68, -34, 65, -57, -52};// ---->��ABCD�A�� //
															// ע�⣺��Ϊ����ʱ�����ı������ASCII��ȥ���ң���Ϊ����ʱ�����Ϻ�һλ���������ʾ
		fos.write(bytes);
		// void write(byte[] b, int off, int len) ��ָ�� byte �����д�ƫ���� off ��ʼ�� len
		// ���ֽ�д����������
		// fos.write(bytes, 1, 2); //������������>���ΪBC ��"�����±�1��ʼд��д����"
		// Ҳ����ʹ��String�еķ��� byte[] getBytes(String charsetName) ʹ��ָ�����ַ������� String
		// ����Ϊ byte ���У���������洢��һ���µ� byte �����С�
		
		  byte[] bt = "����Ա".getBytes();
		  System.out.println(Arrays.toString(bt)); //���[-77, -52, -48, -14,-44, -79] ---->static String toString(byte[] a) ����ָ���������ݵ��ַ�����ʾ��ʽ��
		  fos.write(bt); //���ABCD�ABC����Ա
		 
		fos.close();
	}

}
