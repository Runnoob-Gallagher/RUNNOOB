package cn.zj.cq;

import java.io.File;
import java.io.FileFilter;

public class Demo07FileImp implements FileFilter{

	@Override
	public boolean accept(File pathname) {
		// TODO Auto-generated method stub
		if(pathname.isDirectory()) {//�����������һ���ļ��еĻ��Ǿ�ֱ�ӷ���Ϊ�棬�����ٴα���
			return true;  
		}else if(pathname.isFile()&&pathname.getAbsolutePath().endsWith(".txt")) {
			System.out.println(pathname.getAbsolutePath());
			return false;
		} 
		return false;
	}

}
