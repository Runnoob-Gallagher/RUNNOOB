package Buffer;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/*
	    public class BufferedOutputStream extends FilterOutputStream -->该类实现缓冲的输出流。通过设置这种输出流，
	    							-->应用程序就可以将各个字节写入底层输出流中，而不必针对每次字节写入调用底层系统。
	 	public class BufferedInputStream extends FilterInputStream;	-->在创建 BufferedInputStream 时，会创建一个内部缓冲区数组。
	 									-->在读取或跳过流中的字节时，可根据需要从包含的输入流再次填充该内部缓冲区，一次填充多个字节
	 	
	 	构造方法摘要 
			BufferedOutputStream(OutputStream out)  创建一个新的缓冲输出流，以将数据写入指定的底层输出流。 
			BufferedOutputStream(OutputStream out, int size)  创建一个新的缓冲输出流，以将具有指定缓冲区大小的数据写入指定的底层输出流。 
		方法摘要 
 			void flush() 刷新此缓冲的输出流。 
 			void write(byte[] b, int off, int len)  将指定 byte 数组中从偏移量 off 开始的 len 个字节写入此缓冲的输出流。 
 			void write(int b) 将指定的字节写入此缓冲的输出流。 
		实现步骤：
				1.创建一个FileOutputStream对象，制定目标文件/文件路径
				2.创建一个BufferOutputStream对象，构造方法中传递FileOutputStream对象
				3.调用BufferOutputStream对象中的write方法，将数据写入到缓冲区中
				4.调用flush方法将缓冲区中的数据刷新到文件中
				5.释放资源
	 									
	 */
public class Demo01Buffer {
	public static void main(String[] args) throws IOException {
		FileOutputStream fos = new FileOutputStream("E:\\SVN\\Buffer");
		FileInputStream fis = new FileInputStream("E:\\SVN\\Buffer");
		BufferedOutputStream bos = new BufferedOutputStream(fos);
		BufferedInputStream bis = new BufferedInputStream(fis);
		bos.write("我要好好学习".getBytes());
		byte[] bt = {'A','B','C','D','F'};
		bos.write(bt,1,4);
		bos.flush();
		bos.write(97);//这个不像FileOutputStream和FileWriter类  这个不需要appen续写，这个就直接续写了
		bos.close();
		int len = 0 ;
		while((len = bis.read() ) != -1) {
			System.out.println((char)len);
		}
		bis.close();
	}
}















