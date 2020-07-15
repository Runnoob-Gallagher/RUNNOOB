package cn.zj.cq;

import java.io.File;
import java.io.FileFilter;

public class Demo07FileImp implements FileFilter{

	@Override
	public boolean accept(File pathname) {
		// TODO Auto-generated method stub
		if(pathname.isDirectory()) {//这里如果他是一个文件夹的话那就直接返回为真，让他再次遍历
			return true;  
		}else if(pathname.isFile()&&pathname.getAbsolutePath().endsWith(".txt")) {
			System.out.println(pathname.getAbsolutePath());
			return false;
		} 
		return false;
	}

}
