package �ֽ�;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Arrays;

/*				��Ҫʹ�õ��ķ���
 * 
 * 
 * 				���췽��ժҪ	
 * 	String(byte[] bytes) ͨ��ʹ��ƽ̨��Ĭ���ַ�������ָ���� byte ���飬����һ���µ� String��
  	String(byte[] bytes, int offset, int length) ͨ��ʹ��ƽ̨��Ĭ���ַ�������ָ���� byte �����飬����һ���µ� String��

Arrays���     static String toString(byte[] a)  ����
����ָ���������ݵ��ַ�����ʾ��ʽ�� 
*/
public class Demo05FileInputStream {
	public static void main(String[] args) throws IOException {
		/*
		 * File file = new File("Code_Gallagher"); 
		 * FileOutputStream fos = new FileOutputStream("Code_Gallagher");
		 * fos.write("abcdefghijklmnopqrstuvwxyz".getBytes());
		 */
		FileInputStream fis = new FileInputStream("Code_Gallagher");
		byte[] bt = new byte[4];  //���byte�����൱��һ������������������Ĵ�С��len=20����ô��һ�ζ�ȡ20���ֽڵ����ݷŵ���������С�
//		System.out.println(new String(bt));
		int len = fis.read(bt); //���ص��Ƕ�ȡ���ֽڵ���Ч���� 
//		System.out.println(new String(bt));//--->String(byte[] bytes)  ͨ��ʹ��ƽ̨��Ĭ���ַ�������ָ���� byte ���飬����һ���µ� String��
		while( fis.read(bt)!= -1) {
			//System.out.println(len =fis.read(bt));
			System.out.println(Arrays.toString(bt));    //����Ĵ�ӡΪʲô����ֿո��أ��պ���4���ո�,--->һ�ֽ��������ڴ�������ֽ������ǾͿ����˿ռ�
			//System.out.println(new String(bt,0,len));  �����
			
		}
		//fos.close(); 
		fis.close();  
	}
} 
