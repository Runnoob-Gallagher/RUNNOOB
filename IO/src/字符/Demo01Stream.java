package �ַ�;
//Reader ���ڶ�ȡ�ַ����ĳ����ࡣ���������д�ķ���ֻ��read(char[],int,int)��close()
/*��Ϊ���ǳ����࣬��������ʹ��������FileReader---->FileReader ������ȡ�ַ��ļ��ı����,���ڶ�ȡ�ַ���.
 
	java.io.FileReader extends InputStreamReader extends Reader
	FileReader:�ļ��ַ�������
	���ã���Ӳ���е��ļ����ַ������ƶ�ȡ���ڴ���
	 ���췽��ժҪ 
FileReader(File file)    �ڸ������ж�ȡ���ݵ� File ������´���һ���� FileReader�� �ļ�·��
FileReader(String fileName)  �ڸ������ж�ȡ���ݵ��ļ���������´���һ���� FileReader�� �ļ���
	FileReader���췽�����ã�
		1.����һ��FileReader����
		2.��FileReader����ָ����Ҫ��ȡ���ļ�
	
 * 
 */
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;

public class Demo01Stream {
	public static void main(String[] args) throws IOException {
		FileReader fr = new FileReader("E:\\SVN\\Gallagher.txt");
		char[] ch = new char[2];//---->��һ���Ƕ�ȡ�ַ��Ļ��������������൱�ڶ������ַ���������ַ�������
		int len = 0;//---->�������һ������ȥ����fr.read���ص�ֵ������Ϊ�����ж���������
		while(( len = fr.read(ch))!=-1) {//---->���ؽ���Ƕ�ȡ���ֽڸ��������ٴζ�ʱ���������-1˵�����˽�β��û�������ݣ�;��ȡ�����һ�����᷵��-1 �Դ����ж�
//			System.out.println(len);//---->���ؽ���Ƕ�ȡ���ֽڸ���
			System.out.println(new String(ch));//---->��ӡ���ַ��������е����ݣ�Ϊʲô��ʼ����len����ֻ��һ��int�ķ���ֵ��
		}  
		/*int chB = fr.read();
		System.out.println((char)chB);
		int chC = fr.read();
		System.out.println((char)chC); 
		int chD = fr.read();
		System.out.println((char)chD);
		int chE = fr.read();
		System.out.println((char)chE);
		int chF = fr.read();
		System.out.println((char)chF);
		int chG = fr.read();
		System.out.println((char)chG);
		int chH = fr.read();
		System.out.println((char)chH);*/
		fr.close();
		} 
	}

 