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
	 	public class BufferedReader extends Reader--->从字符输入流中读取文本，缓冲各个字符，从而实现字符、数组和行的高效读取。
	 	Reader 所作的每个读取请求都会导致对底层字符或字节流进行相应的读取请求。
	 	因此，建议用 BufferedReader 包装所有其 read() 操作可能开销很高的 Reader（如 FileReader 和 InputStreamReader）。例如， 
 		BufferedReader in = new BufferedReader(new FileReader("foo.in"));
		
		构造方法摘要 
			BufferedReader(Reader in)  创建一个使用默认大小输入缓冲区的缓冲字符输入流。 
			BufferedReader(Reader in, int sz) 创建一个使用指定大小输入缓冲区的缓冲字符输入流。 
		
		方法摘要
	 	 	int read()  读取单个字符。 
 			int read(char[] cbuf, int off, int len) 将字符读入数组的某一部分。 
 			void close() 关闭该流并释放与之关联的所有资源。 
		
		
		public class BufferedWriter extends Writer--->将文本写入字符输出流，缓冲各个字符，从而提供单个字符、数组和字符串的高效写入。 
		通常 Writer 将其输出立即发送到底层字符或字节流。除非要求提示输出，
		否则建议用 BufferedWriter 包装所有其 write() 操作可能开销很高的 Writer（如 FileWriters 和 OutputStreamWriters）。例如， 
		PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("foo.out")));
		
		构造方法摘要 
			BufferedWriter(Writer out) 创建一个使用默认大小输出缓冲区的缓冲字符输出流。 
			BufferedWriter(Writer out, int sz) 创建一个使用给定大小输出缓冲区的新缓冲字符输出流。 
		
		方法摘要 
			 void close() 关闭此流，但要先刷新它。 
			 void flush() 刷新该流的缓冲。 
			 void newLine() 写入一个行分隔符。 根据不同操作系统，他回去自动匹配诶
			 void write(char[] cbuf, int off, int len) 写入字符数组的某一部分。 
			 void write(int c) 写入单个字符。 
			 void write(String s, int off, int len) 写入字符串的某一部分。 

		 String readLine() 读取一个文本行。 
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
		bw.close();//这个顺序是要主义的，肯定是要写完之后才关闭的，不是读完之久就关闭。这个中间的时间差可能还在写数据
		br.close(); 
		long B = System.currentTimeMillis();
		System.out.println(B-A);
	}
		
}
