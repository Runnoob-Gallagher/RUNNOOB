package Buffer;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;

/*public class OutputStreamWriter extends Writer ;  OutputStreamWriter 是字符流通向字节流的桥梁：
可使用指定的 charset 将要写入流中的字符编码成字节。它使用的字符集可以由名称指定或显式给定，否则将接受平台默认的字符集。 

每次调用 write() 方法都会导致在给定字符（或字符集）上调用编码转换器。在写入底层输出流之前，得到的这些字节将在缓冲区中累积。
可以指定此缓冲区的大小，不过，默认的缓冲区对多数用途来说已足够大。注意，传递给 write() 方法的字符没有缓冲。
	构造方法摘要 
		OutputStreamWriter(OutputStream out)创建使用默认字符编码的 OutputStreamWriter。 
		OutputStreamWriter(OutputStream out, String charsetName) 创建使用指定字符集的 OutputStreamWriter。
		参数：
				OutputStream out 字节输出流
				charsetName 指定的字符编码格式
	方法摘要 
 	void close() 关闭此流，但要先刷新它。 
 	void flush() 刷新该流的缓冲。 
 	String getEncoding() 返回此流使用的字符编码的名称。 
 	void write(char[] cbuf, int off, int len) 写入字符数组的某一部分。 
 	void write(int c) 写入单个字符。 
 	void write(String str, int off, int len)  写入字符串的某一部分。 
*/
/*
 * 操作步骤：
 * 		1.创建OutPutStreamWriter对象，构造器中传入OutPutStream，指定编码格式 因为OutputStream类此抽象类是表示输出字节流的所有类的超类。
 * 		2.调用OutPutStreamWruter对象的方法writer()，将内存中的数据写到本地中
 * 		3.关闭资源
 */

public class Demo06OutputStreamWriter {	
	public static void main(String[] args) throws IOException {
		FileOutputStream fos = new FileOutputStream("E:\\SVN\\Writer");
		OutputStreamWriter osw = new OutputStreamWriter(fos, "utf-8");
		osw.write("撒拉嘿哟");
		osw.close();
	}
}
