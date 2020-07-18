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
import java.io.FileReader;
import java.io.IOException;

public class Demo01Stream {
	public static void main(String[] args) throws IOException {
		FileReader fr = new FileReader("E:\\SVN\\Gallagher.txt");
		char[] ch = new char[2];//---->这一步是读取字符的缓冲区，这里我相当于读两个字符放在这个字符数组中
		int len = 0;//---->这个定义一个变量去接收fr.read返回的值，并作为下面判断语句的条件
		while(( len = fr.read(ch))!=-1) {//---->返回结果是读取的字节个数（当再次读时，如果返回-1说明到了结尾，没有了数据）;读取到最后一个他会返回-1 以此做判断
//			System.out.println(len);//---->返回结果是读取的字节个数
			System.out.println(new String(ch));//---->打印出字符缓冲区中的数据，为什么开始想用len，他只是一个int的返回值；
		}  
		/*int chB = fr.read();
		System.out.println((char)chB);
		int chC = fr.read();
		System.out.println((char)chC); 
		int chD = fr.read();
		System.out.println((char)chD);
		int chE = fr.read();
		System.out.println((char)chE);
		int chF = fr.read();
		System.out.println((char)chF);
		int chG = fr.read();
		System.out.println((char)chG);
		int chH = fr.read();
		System.out.println((char)chH);*/
		fr.close();
		} 
	}

 