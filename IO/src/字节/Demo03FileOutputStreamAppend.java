package 字节;

import java.io.FileOutputStream;
import java.io.IOException;

/*
 FileOutputStream(String name, boolean append)  创建一个向具有指定 name 的文件中写入数据的输出文件流
 */
public class Demo03FileOutputStreamAppend {
	public static void main(String[] args) throws IOException {
//		创建FileOutputStream对象，在构造器中传入指定的路径文件
//		FileOutputStream fosA = new FileOutputStream("E:\\SVN\\Code_Gallagher.txt");
//		引用写方法
		//fosA.write("Good Good Study,Day Day Up".getBytes());
//		关闭资源
		//fosA.close();
		/*
		 * 现在使用FileOutputStream(String name, boolean append)方法，往里面追加数据。
		 * 如果append的boolean值为true那么就是追加，如果是false那么就是新建一个文件，写入内容，覆盖原来的文件；
		 */
		FileOutputStream fosB = new FileOutputStream("E:\\SVN\\Code_Gallagher.txt", true);
		fosB.write("这是我追加的内容,因为append的boolean值是true".getBytes());
//		fosB.close();
		
//		换行操作
		/*
		 win：\r\n
		 linux:/n
		 */
		
		fosB.write("\r\n".getBytes());
		fosB.write("Good Good Study,Day Day Up".getBytes());
		fosB.close(); 
	}
}
