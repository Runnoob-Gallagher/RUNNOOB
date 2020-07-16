package 字节;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Arrays;

/*				需要使用到的方法
 * 
 * 
 * 				构造方法摘要	
 * 	String(byte[] bytes) 通过使用平台的默认字符集解码指定的 byte 数组，构造一个新的 String。
  	String(byte[] bytes, int offset, int length) 通过使用平台的默认字符集解码指定的 byte 子数组，构造一个新的 String。

Arrays类的     static String toString(byte[] a)  方法
返回指定数组内容的字符串表示形式。 
*/
public class Demo05FileInputStream {
	public static void main(String[] args) throws IOException {
		/*
		 * File file = new File("Code_Gallagher"); 
		 * FileOutputStream fos = new FileOutputStream("Code_Gallagher");
		 * fos.write("abcdefghijklmnopqrstuvwxyz".getBytes());
		 */
		FileInputStream fis = new FileInputStream("Code_Gallagher");
		byte[] bt = new byte[4];  //这个byte数组相当于一个缓冲区，比如这里的大小是len=20，那么就一次读取20个字节的数据放到这个数组中。
//		System.out.println(new String(bt));
		int len = fis.read(bt); //返回的是读取的字节的有效个数 
//		System.out.println(new String(bt));//--->String(byte[] bytes)  通过使用平台的默认字符集解码指定的 byte 数组，构造一个新的 String。
		while( fis.read(bt)!= -1) {
			//System.out.println(len =fis.read(bt));
			System.out.println(Arrays.toString(bt));    //下面的打印为什么会出现空格呢？刚好是4个空格,--->一种解释是你在创建这个字节数组是就开辟了空间
			//System.out.println(new String(bt,0,len));  这个好
			
		}
		//fos.close(); 
		fis.close();  
	}
} 
