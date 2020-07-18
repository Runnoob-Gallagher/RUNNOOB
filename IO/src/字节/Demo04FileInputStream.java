package 字节;

import java.io.FileInputStream;
import java.io.IOException;

/*
 	InputStream字节输入流
 	public abstract class InputStream--->此抽象类表示所有直接输入流的所有类的超类
 	
 	FileInputStream：文件字节输入流---->从文件系统的某个文件中获得输入字节
 	构造方法摘要 
	FileInputStream(File file)   通过打开一个到实际文件的连接来创建一个 FileInputStream，该文件通过文件系统中的 File 对象 file 指定。
	FileInputStream(String name)   通过打开一个到实际文件的连接来创建一个 FileInputStream，该文件通过文件系统中的路径名 name 指定。 


	 int read()  从此输入流中读取一个数据字节。  读取一个字节的数组就像下移动一个，考虑指针
 	 int read(byte[] b)   从此输入流中将最多 b.length 个字节的数据读入一个 byte 数组中。 
 	 int read(byte[] b, int off, int len) 从此输入流中将最多 len 个字节的数据读入一个 byte 数组中。 

 */
public class Demo04FileInputStream {
	public static void main(String[] args) throws IOException {
		FileInputStream fis = new FileInputStream("E:\\SVN\\Gallagher.txt");//这个就是file文件 ，"E:\\SVN\\Gallagher.txt"就是name路径
	/*	int bt = fis.read();//读取文件中的一个字节，读到文件末尾返回-1
		System.out.println(bt);
		bt = fis.read();//读取文件中的一个字节，读到文件末尾返回-1
		System.out.println(bt);
		bt = fis.read();//读取文件中的一个字节，读到文件末尾返回-1
		System.out.println(bt);
		bt = fis.read();//读取文件中的一个字节，读到文件末尾返回-1
		System.out.println(bt);
		bt = fis.read();//读取文件中的一个字节，读到文件末尾返回-1 
		System.out.println(bt);  */
		int len = 0;
		while((len = fis.read())!=-1) {   
//			 int read()  从此输入流中读取一个数据字节   注意这个返回的是一个int值
			System.out.println(len); 
			System.out.println((char)len);//如果编码是以一个字节一个字符的，可以尝试转成char，用来查看数据）。
//			System.out.print((char)fis.read());
		}
		fis.close();
	}
}
