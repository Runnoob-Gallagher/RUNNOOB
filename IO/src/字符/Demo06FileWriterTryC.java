package �ַ�;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;

/*
 	���demo��˵��jdk7��jdk9��try catch�Ĳ�ͬ
 	jdk7��
 	try(���Զ���������){
 		//���ܻ�����쳣�Ĵ���
 	}catch(//�쳣����   ������){
 		//�쳣�����߼�
 	}finally{
 		//һ����ִ�еĴ��룬 ������Ϊ��Դ�ͷŵĶ���
 	}
 	jdk9:��try��ǰ����Զ�����������try�ĺ�߿���ֱ������������� ���ƣ���������
 	try(������){
 	//���ܻ�����쳣�Ĵ���
 	}catch(//�쳣����   ������){
 		//�쳣�����߼�
 	}finally{
 		//һ����ִ�еĴ��룬 ������Ϊ��Դ�ͷŵĶ���
 	}
 */
public class Demo06FileWriterTryC {
	public static void main(String[] args) {
		try(FileInputStream fis = new FileInputStream("E:\\SVN\\1.gif");
				FileOutputStream fos = new FileOutputStream("E:\\1.gif");){
			int len = 0;
			byte[] bt = new byte[2];
			while((len = fis.read())!= -1) {
				fos.write(bt);
		} 
		}catch(IOException e) {
			System.out.println(e);
		} 
	}
		/*try(FileWriter fw = new FileWriter("Ew:\\\\SVN\\\\shit.txt");){
			//ֱ�ӽ��������Ķ�����try()�д����������Ļ�FileWriter�Ķ�������fw�����÷�Χ����try{}�У���ô�Ͳ���ִ��fw.close();��Դ���Զ��ͷŵ���
			char[] ch = {'A','B','C'};
			fw.write(ch);
		}catch(IOException e) {
			System.out.println(e);
		}
	}
	*/
	/*public static void main(String[] args) {
		FileWriter fw = null;
		try {
			fw = new FileWriter("Ew:\\SVN\\shit.txt");
			char[] ch = {'A','B','C'};
			fw.write(ch);
			
		}catch(IOException e) {
			System.out.println(e);
		}finally {
			try {
				fw.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}	
		}
	}*/
}
