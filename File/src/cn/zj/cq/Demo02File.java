package cn.zj.cq;

import java.io.File;
import java.io.IOException;

public class Demo02File {
	public static void main(String[] args) {
		/*构造方法摘要     
		File(File parent, String child) 
		          根据 parent 抽象路径名和 child 路径名字符串创建一个新 File 实例。 
		File(String pathname) 
		          通过将给定路径名字符串转换为抽象路径名来创建一个新 File 实例。 
		File(String parent, String child) 
		          根据 parent 路径名字符串和 child 路径名字符串创建一个新 File 实例。 */
		String parent = "E:\\SVN";
		String child = "Gallagher.txt";
		File file = new File(parent, child);
		System.out.println(file); 
		//创建一个文件：
		//createNewfile();//新建文件路径和名称都要在构造方法中写出
		//删除一个文件或者文件目录
		//delete();//删除的文件路径和名称都要在构造方法中写出
		//新建一个文件夹
		//mkdir();//新建的文件夹路径要在构造方法中写出
		//创建多级文件夹
		mkdirs();//新建的文件夹路径要在构造方法中写出
		
		//用于判断
		/*public boolean exists()` ：此File表示的文件或目录是否实际存在。
		  public boolean isDirectory()` ：此File表示的是否为目录。
		  public boolean isFile()` ：此File表示的是否为文件。*/
		
	}

	private static void mkdirs() {
		// TODO Auto-generated method stub
		File fileE = new File("E:\\\\SVN\\\\Code_Gallagher\\Gallagher");
		System.out.println(fileE.mkdirs());
	}

	private static void mkdir() {
		// TODO Auto-generated method stub
		File fileD = new File("E:\\SVN\\Gallagher");
		System.out.println(fileD.mkdir());
	}

	private static void delete() {
		// TODO Auto-generated method stub
		File fileB = new File("E:\\\\SVN\\\\Gallagher.txt");//文件
		System.out.println(fileB.delete());//
		File fileC = new File("E:\\SVN\\Gallagher");//目录
		System.out.println(fileC.delete());
	}

	private static void createNewfile() {//
		// TODO Auto-generated method stub
		File fileA = new File("E:\\SVN\\Gallagher.txt");
		try {
			boolean b = fileA.createNewFile();
			System.out.println(b);//输出true代表创建文件成功
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println("你创建的文件可能有问题。可能路径不存在");
		}
		
	}

	
}
