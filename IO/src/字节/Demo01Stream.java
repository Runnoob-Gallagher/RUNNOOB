package 字节;

import java.io.FileOutputStream;
import java.io.IOException;

/*
	这里使用的的OutputStream  字节输出流，表示将内存中的数据写到磁盘中
	OutoutStream是一个抽象类，表示输出字节流的所有类的超类。
	因为这里是抽象父类，不能直接使用。那么我们这里就要使用其子类；---->FileOutputStream  文件字节输出流
	构造方法：
		FileOutputStream(File file) 创建一个向指定 File 对象表示的文件中写入数据的文件输出流。---->表示直接输出到指定文件中,括号中是一个文件类型的
		FileOutputStream(String name)  创建一个向具有指定名称的文件中写入数据的输出文件流。---->表示根据文件路径去输出
	构造方法作用：
		1.创建一个FileOutputStream对象
		2.根据构造方法中传递的文件/文件路径，创建一个新的文件
		3.会把FileOutputStream对象指向创建好的文件
	成员方法：
		 	void close() 关闭此输出流并释放与此流有关的所有系统资源。 
 			void flush()  刷新此输出流并强制写出所有缓冲的输出字节。 
 			void write(byte[] b) 将 b.length 个字节从指定的 byte 数组写入此输出流。 
 			void write(byte[] b, int off, int len)   将指定 byte 数组中从偏移量 off 开始的 len 个字节写入此输出流。 
			abstract  void write(int b) 将指定的字节写入此输出流。 
		从内存中写到磁盘的过程：
			程序---->JVM---->OS--->OS调用写数据的方法---->写到文件中
		写文件的一个过程：
			1.创建FileOutputStream对象，在构造方法中传入写入数据的文件目的
			2.调用FileOutputStream对象中的write方法，将数据写入到文件中
			3.关闭资源

 */
public class Demo01Stream {
	public static void main(String[] args) throws IOException {
//		1.创建FileOutputStream对象，在构造方法中传入写入数据的文件目的
		FileOutputStream fos = new FileOutputStream("E:\\SVN\\Gallagher.txt");
//		2.调用FileOutputStream对象中的write方法，将数据写入到文件中
		fos.write(99);//因为硬盘中只能存储二进制数据，多以会将99转换为01100011存放在硬盘中。  文件编辑器再打开文件时，会查询编码表将字节表示为字符。
						//比如0-127会查询ASCII表   99---->C    
//		3.关闭资源
		fos.close();
	}
}
