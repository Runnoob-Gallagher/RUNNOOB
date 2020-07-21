package 字符;

import java.io.FileWriter;
import java.io.IOException;

/*
 * 	public abstract class Writer--->作为字符输出流的最顶层父类，是一个抽象类
 * 	FileWriter extends OutputStreamWriter extends Writer
 * 	共性的成员方法：
 * 		abstract  void close() 关闭此流，但要先刷新它。 
		abstract  void flush() 刷新该流的缓冲。 
 		void write(char[] cbuf) 写入字符数组。 
		abstract  void write(char[] cbuf, int off, int len)  写入字符数组的某一部分。 
 		void write(int c) 写入单个字符。 
 		void write(String str) 写入字符串。 
 		void write(String str, int off, int len) 写入字符串的某一部分。 
	构造方法摘要 
	FileWriter(File file)  根据给定的 File 对象构造一个 FileWriter 对象。 
	FileWriter(String fileName) 根据给定的文件名构造一个 FileWriter 对象。
	构造方法作用：
		1.创建一个FileWriter对象，在构造器中传入字符输出的目标地址。filename---文件名称  file----文件路径
		2.会根据构造方法中的文件/文件路径，创造文件
		3.把FileWriter对象指向创建好的文件
	
	字符输出流写入原理：
		1.创建FileWriter对象，构造方法中绑定写入数据的目的地
		2.使用FileWriter中的方法，把数据写入到内存缓冲区中（字符转换为直接的过程）
		3.使用FileWriter中的方法flush，把内存缓冲区中的数据，刷新到文件中
		4.释放资源（会先把内存缓冲区中的数据刷新到文件中）
		 */
public class Demo02FileWriter {
	public static void main(String[] args) throws IOException {
	FileWriter fw = new FileWriter("Gallagher.txt");
	char[] ch = {97,98,99,100};
	fw.write(ch);
	fw.flush(); //如果没有刷新这个步骤的话，他是写不进去的。因为他现在存在于内存缓冲区中
	fw.close();//如果不刷新，直接关闭的话，他会自动进行刷新这个操作的
	/*
	 flush和close的区别：
	 	flush 刷新缓冲区，流对象按可以继续使用
	 	close 刷新缓冲区，通知系统释放资源，流对象不可再次使用
	 */
}
}
