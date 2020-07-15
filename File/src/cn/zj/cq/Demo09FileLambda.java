package cn.zj.cq;

import java.io.File;
import java.io.FileFilter;

public class Demo09FileLambda {
	public static void main(String[] args) {
		File file = new File("E:\\SVN");
		methodA(file);
		
	}

	private static void methodA(File filename) {
		// TODO Auto-generated method stub
		File[] fileA = filename.listFiles(new FileFilter() {
			
			@Override 
			public boolean accept(File pathname) {
				// TODO Auto-generated method stub
				return pathname.getName().endsWith(".txt") || pathname.isDirectory();
			} 
		});  
		for(File fileB:fileA) { 
			if(fileB.isFile()) {
				System.out.println(fileB.getAbsolutePath());
			}else {
				methodA(fileB); 
			}
		}
	}
}
