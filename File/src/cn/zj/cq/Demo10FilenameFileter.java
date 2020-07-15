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
				return new File(dir,name).isDirectory() || name.endsWith(".txt");//这里需要注意，为什么要new一个文件对象呢，看一下API文档
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
