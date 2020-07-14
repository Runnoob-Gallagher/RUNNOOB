package cn.zj.cq;

import java.io.File;
//这个demo就是判断下一级是否为文件夹，如果是的话那就继续遍历该文件夹，直到为文件为止；
public class Demo05File {
	public static void main(String[] args) {
		File file = new File("E:\\SVN");
		methodA(file);
		
	}

	private static void methodA(File file) {
		// TODO Auto-generated method stub
		File[] fileA = file.listFiles();
		for(File fileB : fileA) {
			if(fileB.isFile()) {
				if(fileB.getName().endsWith(".txt")) {
					System.out.println(fileB.getName());
				}
			}else if(fileB.isDirectory()) {
				methodA(fileB.getAbsoluteFile());
			}
		}
	}
	
}
