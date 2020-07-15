package cn.zj.cq;

import java.io.File;
import java.io.FilenameFilter;

public class Demo10FilenameFileter {
	public static void main(String[] args) {
		File file = new File("E://SVN");
		methodA(file);
	}

	private static void methodA(File filename) {
		// TODO Auto-generated method stub
		File[] fileA = filename.listFiles(new FilenameFilter() {
			
			@Override
			public boolean accept(File dir, String name) {
				// TODO Auto-generated method stub
				return new File(dir,name).isDirectory() || name.endsWith(".txt");//������Ҫע��
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
