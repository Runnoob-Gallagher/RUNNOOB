package �ַ�;

import java.io.FileWriter;
import java.io.IOException;

/*
 * 	public abstract class Writer--->��Ϊ�ַ����������㸸�࣬��һ��������
 * 	FileWriter extends OutputStreamWriter extends Writer
 * 	���Եĳ�Ա������
 * 		abstract  void close() �رմ�������Ҫ��ˢ������ 
		abstract  void flush() ˢ�¸����Ļ��塣 
 		void write(char[] cbuf) д���ַ����顣 
		abstract  void write(char[] cbuf, int off, int len)  д���ַ������ĳһ���֡� 
 		void write(int c) д�뵥���ַ��� 
 		void write(String str) д���ַ����� 
 		void write(String str, int off, int len) д���ַ�����ĳһ���֡� 
	���췽��ժҪ 
	FileWriter(File file)  ���ݸ����� File ������һ�� FileWriter ���� 
	FileWriter(String fileName) ���ݸ������ļ�������һ�� FileWriter ����
	���췽�����ã�
		1.����һ��FileWriter�����ڹ������д����ַ������Ŀ���ַ��filename---�ļ�����  file----�ļ�·��
		2.����ݹ��췽���е��ļ�/�ļ�·���������ļ�
		3.��FileWriter����ָ�򴴽��õ��ļ�
	
	�ַ������д��ԭ��
		1.����FileWriter���󣬹��췽���а�д�����ݵ�Ŀ�ĵ�
		2.ʹ��FileWriter�еķ�����������д�뵽�ڴ滺�����У��ַ�ת��Ϊֱ�ӵĹ��̣�
		3.ʹ��FileWriter�еķ���flush�����ڴ滺�����е����ݣ�ˢ�µ��ļ���
		4.�ͷ���Դ�����Ȱ��ڴ滺�����е�����ˢ�µ��ļ��У�
		 */
public class Demo02FileWriter {
	public static void main(String[] args) throws IOException {
	FileWriter fw = new FileWriter("Gallagher.txt");
	char[] ch = {97,98,99,100};
	fw.write(ch);
	fw.flush(); //���û��ˢ���������Ļ�������д����ȥ�ġ���Ϊ�����ڴ������ڴ滺������
	fw.close();//�����ˢ�£�ֱ�ӹرյĻ��������Զ�����ˢ�����������
	/*
	 flush��close������
	 	flush ˢ�»������������󰴿��Լ���ʹ��
	 	close ˢ�»�������֪ͨϵͳ�ͷ���Դ�������󲻿��ٴ�ʹ��
	 */
}
}
