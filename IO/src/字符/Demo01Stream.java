package 字符;
//Reader 用于读取字符流的抽象类。子类必须重写的方法只有read(char[],int,int)和close()
/*因为他是抽象类，所以我们使用其子类FileReader---->FileReader 用来读取字符文件的便捷类,用于读取字符流.
 
	java.io.FileReader extends InputStreamReader extends Reader
	FileReader:文件字符输入流
	作用：把硬盘中的文件以字符的形势读取到内存中
	 构造方法摘要 
FileReader(File file)    在给定从中读取数据的 File 的情况下创建一个新 FileReader。 文件路径
FileReader(String fileName)  在给定从中读取数据的文件名的情况下创建一个新 FileReader。 文件名
	FileReader构造方法作用：
		1.创建一个FileReader对象
		2.把FileReader对象指向需要读取的文件
	
 * 
 */
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Demo01Stream {
	public static void main(String[] args) throws IOException {
		
		} 
	}

 