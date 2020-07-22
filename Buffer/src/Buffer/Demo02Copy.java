package Buffer;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import javax.xml.crypto.Data;

/*
	 	public class BufferedReader extends Reader--->���ַ��������ж�ȡ�ı�����������ַ����Ӷ�ʵ���ַ���������еĸ�Ч��ȡ��
	 	Reader ������ÿ����ȡ���󶼻ᵼ�¶Եײ��ַ����ֽ���������Ӧ�Ķ�ȡ����
	 	��ˣ������� BufferedReader ��װ������ read() �������ܿ����ܸߵ� Reader���� FileReader �� InputStreamReader�������磬 
 		BufferedReader in = new BufferedReader(new FileReader("foo.in"));
		
		���췽��ժҪ 
			BufferedReader(Reader in)  ����һ��ʹ��Ĭ�ϴ�С���뻺�����Ļ����ַ��������� 
			BufferedReader(Reader in, int sz) ����һ��ʹ��ָ����С���뻺�����Ļ����ַ��������� 
		
		����ժҪ
	 	 	int read()  ��ȡ�����ַ��� 
 			int read(char[] cbuf, int off, int len) ���ַ����������ĳһ���֡� 
 			void close() �رո������ͷ���֮������������Դ�� 
		
		
		public class BufferedWriter extends Writer--->���ı�д���ַ����������������ַ����Ӷ��ṩ�����ַ���������ַ����ĸ�Чд�롣 
		ͨ�� Writer ��������������͵��ײ��ַ����ֽ���������Ҫ����ʾ�����
		�������� BufferedWriter ��װ������ write() �������ܿ����ܸߵ� Writer���� FileWriters �� OutputStreamWriters�������磬 
		PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("foo.out")));
		
		���췽��ժҪ 
			BufferedWriter(Writer out) ����һ��ʹ��Ĭ�ϴ�С����������Ļ����ַ�������� 
			BufferedWriter(Writer out, int sz) ����һ��ʹ�ø�����С������������»����ַ�������� 
		
		����ժҪ 
			 void close() �رմ�������Ҫ��ˢ������ 
			 void flush() ˢ�¸����Ļ��塣 
			 void newLine() д��һ���зָ����� ���ݲ�ͬ����ϵͳ������ȥ�Զ�ƥ����
			 void write(char[] cbuf, int off, int len) д���ַ������ĳһ���֡� 
			 void write(int c) д�뵥���ַ��� 
			 void write(String s, int off, int len) д���ַ�����ĳһ���֡� 

		 String readLine() ��ȡһ���ı��С� 
	 */
public class Demo02Copy {
	public static void main(String[] args) throws IOException {
		FileInputStream fd = new FileInputStream("E:\\SVN\\ideaIU-2019.1.3.exe");
		FileOutputStream fw = new FileOutputStream("E:\\SVN\\Languages\\ideaIU-2019.1.3.exe");
		BufferedInputStream br = new BufferedInputStream(fd);//---->BufferedReader br = new BufferedReader(new FileReader("E:\\SVN\\Buffer");)
		BufferedOutputStream bw = new BufferedOutputStream(fw);
		long A = System.currentTimeMillis();
		byte[] bt = new byte[10240]; 
		int len = 0;
		while((len = br.read(bt)) != -1) {
			bw.write(bt);
		}
		bw.close();//���˳����Ҫ����ģ��϶���Ҫд��֮��Źرյģ����Ƕ���֮�þ͹رա�����м��ʱ�����ܻ���д����
		br.close(); 
		long B = System.currentTimeMillis();
		System.out.println(B-A);
	}
		
}
