package 瞎几把测试;

import java.io.File;
import java.io.IOException;

public class Demo02FileTest {


	public static void main(String[] args) {
		//methodA();
		//methodB();
		//methodC();
		//methodD();
		methodE();
	}
 
	private static void methodE() {
		// TODO Auto-generated method stub
		File fileR = new File("E:\\Repository\\File\\src\\几把测试");
		String[] arr = fileR.list();
		for(String filename:arr) {
			System.out.println(filename);
		}
	}

	private static void methodD() {
		// TODO Auto-generated method stub
		File fielF = new File("E:\\\\Repository\\\\File\\\\src\\\\几把测试\\\\one\\two\\three"); 
		System.out.println(fielF.mkdirs() + "dasdasdasd ");
	}

	private static void methodC() {
		// TODO Auto-generated method stub
		File fileE = new File("E:\\Repository\\File\\src\\瞎几把测试\\123.txt");
		try {
			System.out.println(fileE.createNewFile());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	private static void methodB() {
		// TODO Auto-generated method stub
		File fileC = new File("E:\\Repository");
		File fileD = new File("E:\\Repository\\config.ini");
		System.out.println(fileC.isFile());
		System.out.println(fileC.isDirectory());
		System.out.println(fileD.isFile());
		System.out.println(fileD.isDirectory());
	}
 
	private static void methodA() {
		// TODO Auto-generated method stub
		
		File fileA = new File("D:\\BBSJ\\单位扩展\\上海\\V1.0.00001.231.12SH001.00\\V1.0.001-SH\\2-数据库一键升级脚本\\V1.0.001-SH");
		System.out.println(fileA.getAbsolutePath());
		System.out.println(fileA.getPath());
		System.out.println(fileA.getName());
		//System.out.println(fileA.length());
		File fileB = new File("E:\\Repository\\config.ini");
		if(fileB.exists()) {
		System.out.println(fileB.getAbsolutePath());
		System.out.println(fileB.getName());
		System.out.println(fileB.length());
		}
	}
}
