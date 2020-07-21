package 字节;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.lang.reflect.Array;
import java.util.Arrays;

/*一次写多个字节的方法
 			void write(byte[] b) 将 b.length 个字节从指定的 byte 数组写入此输出流。 
 			void write(byte[] b, int off, int len)   将指定 byte 数组中从偏移量 off 开始的 len 个字节写入此输出流。  
 */
public class Demo02FileOutputStream {
	public static void main(String[] args) throws IOException {
		// 创建FileOutputStream对象，在构造器中指定写入数据的目的地
		FileOutputStream fos = new FileOutputStream("E:\\SVN\\Gallagher.txt");
		// FileOutputStream fosB = new FileOutputStream(new
		// File("E:\\SVN\\Gallagher"));//同上一句
		// 调用一次写多个自己的方法---->void write(byte[] b) 传入的是byte字节数组
		byte[] bytes = {65, 66, 67, 68, -34, 65, -57, -52};// ---->（ABCD轆） //
															// 注意：当为正数时，打开文本会根据ASCII表去查找，当为负数时，会结合后一位组成中文显示
		fos.write(bytes);
		// void write(byte[] b, int off, int len) 将指定 byte 数组中从偏移量 off 开始的 len
		// 个字节写入此输出流。
		// fos.write(bytes, 1, 2); //——————>输出为BC 从"数组下标1开始写，写两个"
		// 也可以使用String中的方法 byte[] getBytes(String charsetName) 使用指定的字符集将此 String
		// 编码为 byte 序列，并将结果存储到一个新的 byte 数组中。
		
		  byte[] bt = "程序员".getBytes();
		  System.out.println(Arrays.toString(bt)); //输出[-77, -52, -48, -14,-44, -79] ---->static String toString(byte[] a) 返回指定数组内容的字符串表示形式。
		  fos.write(bt); //输出ABCD轆BC程序员
		 
		fos.close();
	}

}
