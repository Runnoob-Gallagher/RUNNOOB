package 字符;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;

/*
 	这个demo是说明jdk7和jdk9中try catch的不同
 	jdk7：
 	try(可以定义流对象){
 		//可能会产生异常的代码
 	}catch(//异常变量   变量名){
 		//异常处理逻辑
 	}finally{
 		//一定会执行的代码， 在这里为资源释放的对象
 	}
 	jdk9:在try的前面可以定义流对象，在try的后边可以直接引入流对象的 名称（变量名）
 	try(变量名){
 	//可能会产生异常的代码
 	}catch(//异常变量   变量名){
 		//异常处理逻辑
 	}finally{
 		//一定会执行的代码， 在这里为资源释放的对象
 	}
 */
public class Demo06FileWriterTryC {
	public static void main(String[] args) {
		try(FileInputStream fis = new FileInputStream("E:\\SVN\\1.gif");
				FileOutputStream fos = new FileOutputStream("E:\\1.gif");){
			int len = 0;
			byte[] bt = new byte[2];
			while((len = fis.read())!= -1) {
				fos.write(bt);
		} 
		}catch(IOException e) {
			System.out.println(e);
		} 
	}
		/*try(FileWriter fw = new FileWriter("Ew:\\\\SVN\\\\shit.txt");){
			//直接将创建流的对象在try()中创建，这样的话FileWriter的对象引用fw的作用范围就在try{}中，那么就不用执行fw.close();资源就自动释放掉了
			char[] ch = {'A','B','C'};
			fw.write(ch);
		}catch(IOException e) {
			System.out.println(e);
		}
	}
	*/
	/*public static void main(String[] args) {
		FileWriter fw = null;
		try {
			fw = new FileWriter("Ew:\\SVN\\shit.txt");
			char[] ch = {'A','B','C'};
			fw.write(ch);
			
		}catch(IOException e) {
			System.out.println(e);
		}finally {
			try {
				fw.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}	
		}
	}*/
}
