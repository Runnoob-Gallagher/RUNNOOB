package ���Լ�;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;
import java.util.Set;

/*
 	Java.util.Properties��Properties ���ʾ��һ���־õ����Լ���Properties �ɱ��������л�����м��ء������б���ÿ���������Ӧֵ����һ���ַ����� 
	public class Properties extends Hashtable<Object,Object> implements Map<Object,Object> 
	
	 void load(InputStream inStream) ���������ж�ȡ�����б�����Ԫ�ضԣ��� 
 	 void load(Reader reader) ���򵥵������еĸ�ʽ�������ַ����ж�ȡ�����б�����Ԫ�ضԣ���
 	 
 	 load�������Խ�Ӳ���б�����ļ�����ֵ�ԣ�����ȡ��������ȥ
 	 
 	 void store(OutputStream out, String comments)  ���ʺ�ʹ�� load(InputStream) �������ص� Properties ���еĸ�ʽ������ Properties ���е������б�����Ԫ�ضԣ�д��������� 
 	 void store(Writer writer, String comments) ���ʺ�ʹ�� load(Reader) �����ĸ�ʽ������ Properties ���е������б�����Ԫ�ضԣ�д������ַ���
     
     store�������Խ������е���ʱ���ݴ����м���
     
	�����ȡֵ������ 
		1. String getProperty(String key)  ��ָ���ļ��ڴ������б����������ԡ�  ͨ��������ȡֵ
		2. String getProperty(String key, String defaultValue)   ��ָ���ļ��������б����������ԡ� 
  		3. Object setProperty(String key, String value)    ���� Hashtable �ķ��� put�� 
  		4.Set<String> stringPropertyNames()   ���ش������б��еļ��������иü������Ӧֵ���ַ������൱��Map���ϵ�KeySet�����������е�keyȡ��������һ��Set������
 */
public class Demo01Properties {
	public static void main(String[] args) throws IOException {
		//methodA();
		methodB();
		//methodC();
	}

	private static void methodC() throws IOException {
		// TODO Auto-generated method stub
		Properties ppC = new Properties();
		FileReader fr = new FileReader("E:\\SVN\\CQ.txt");
		FileInputStream fis = new FileInputStream("E:\\SVN\\ZJ.txt");
		ppC.load(fr);
		Set<String> string = ppC.stringPropertyNames();
		for (String str : string) {
			System.out.println(str + " = " + ppC.getProperty(str));
		}
	}

	private static void methodB() throws IOException {
		// TODO Auto-generated method stub
		Properties ppB = new Properties();
		ppB.setProperty("��", "��");
		ppB.setProperty("��", "���");
		ppB.setProperty("E", "F");
		ppB.setProperty("G", "H"); 
		FileWriter fe = new FileWriter("E:\\SVN\\CQ.txt");
		FileOutputStream fos = new FileOutputStream("E:\\SVN\\ZJ.txt");
		ppB.store(fos, " pp");
		ppB.store(fe, "date");
		fe.close();
	}

	private static void methodA() {
		// TODO Auto-generated method stub
		//����properties���󣬵������еķ�����
		Properties ppA = new Properties();
		ppA.setProperty("���A", "������");
		ppA.setProperty("���B", "�����");//��ʼȫ���洢������࣬�������һ���ͻḲ��ǰ�������ֵ
		ppA.setProperty("���C", "����");
		ppA.put(1, true);//��Ϊ���̳�hashtable�����Կ���ʹ��hashtable��put����
		Set<String> set = ppA.stringPropertyNames();//��������Լ��еļ��������set������
		for (String string : set) {
			System.out.println(string + " = " + ppA.getProperty(string));//��Ϊ��������string���͵ģ�����(1,true)�ǲ������������
		}
	}
}
