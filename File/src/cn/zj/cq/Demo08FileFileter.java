package cn.zj.cq;

import java.io.File;
import java.io.FileFilter;

public class Demo08FileFileter {
	public static void main(String[] args) {
		File file = new File("E:\\SVN");
		System.out.println(file);
		methodA(file); 
	}
	private static void methodA(File filename) {//这个filename表示传递过来的文件参数----》E:/SVN
		// TODO Auto-generated method stub
		File[] fileA = filename.listFiles(new FileFilter(){
			@Override 
			public boolean accept(File pathname) {//这个pathname表示的接收返回的对象(E:/SVN文件夹下的文件)，可能是已.txt结尾的文件或者文件夹
				// TODO Auto-generated method stub
			return pathname.getName().endsWith(".txt") || pathname.isDirectory();
	}
		});   
		for(File fileB:fileA) {
			if(fileB.isFile()) {
				System.out.println(fileB.getAbsolutePath());
			}else {//这里记得写上else表示另一种情况，表示一种分支；
				methodA(fileB); 
			}  
		}
	}
}   
