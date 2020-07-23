package Buffer;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;

/*public class OutputStreamWriter extends Writer ;  OutputStreamWriter ���ַ���ͨ���ֽ�����������
��ʹ��ָ���� charset ��Ҫд�����е��ַ�������ֽڡ���ʹ�õ��ַ�������������ָ������ʽ���������򽫽���ƽ̨Ĭ�ϵ��ַ����� 

ÿ�ε��� write() �������ᵼ���ڸ����ַ������ַ������ϵ��ñ���ת��������д��ײ������֮ǰ���õ�����Щ�ֽڽ��ڻ��������ۻ���
����ָ���˻������Ĵ�С��������Ĭ�ϵĻ������Զ�����;��˵���㹻��ע�⣬���ݸ� write() �������ַ�û�л��塣
	���췽��ժҪ 
		OutputStreamWriter(OutputStream out)����ʹ��Ĭ���ַ������ OutputStreamWriter�� 
		OutputStreamWriter(OutputStream out, String charsetName) ����ʹ��ָ���ַ����� OutputStreamWriter��
		������
				OutputStream out �ֽ������
				charsetName ָ�����ַ������ʽ
	����ժҪ 
 	void close() �رմ�������Ҫ��ˢ������ 
 	void flush() ˢ�¸����Ļ��塣 
 	String getEncoding() ���ش���ʹ�õ��ַ���������ơ� 
 	void write(char[] cbuf, int off, int len) д���ַ������ĳһ���֡� 
 	void write(int c) д�뵥���ַ��� 
 	void write(String str, int off, int len)  д���ַ�����ĳһ���֡� 
*/
/*
 * �������裺
 * 		1.����OutPutStreamWriter���󣬹������д���OutPutStream��ָ�������ʽ ��ΪOutputStream��˳������Ǳ�ʾ����ֽ�����������ĳ��ࡣ
 * 		2.����OutPutStreamWruter����ķ���writer()�����ڴ��е�����д��������
 * 		3.�ر���Դ
 */

public class Demo06OutputStreamWriter {	
	public static void main(String[] args) throws IOException {
		FileOutputStream fos = new FileOutputStream("E:\\SVN\\Writer");
		OutputStreamWriter osw = new OutputStreamWriter(fos, "utf-8");
		osw.write("������Ӵ");
		osw.close();
	}
}
