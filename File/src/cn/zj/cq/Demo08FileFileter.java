package cn.zj.cq;

import java.io.File;
import java.io.FileFilter;

public class Demo08FileFileter {
	public static void main(String[] args) {
		File file = new File("E:\\SVN");
		System.out.println(file);
		methodA(file); 
	}
	private static void methodA(File filename) {//���filename��ʾ���ݹ������ļ�����----��E:/SVN
		// TODO Auto-generated method stub
		File[] fileA = filename.listFiles(new FileFilter(){
			@Override 
			public boolean accept(File pathname) {//���pathname��ʾ�Ľ��շ��صĶ���(E:/SVN�ļ����µ��ļ�)����������.txt��β���ļ������ļ���
				// TODO Auto-generated method stub
			return pathname.getName().endsWith(".txt") || pathname.isDirectory();
	}
		});   
		for(File fileB:fileA) {
			if(fileB.isFile()) {
				System.out.println(fileB.getAbsolutePath());
			}else {//����ǵ�д��else��ʾ��һ���������ʾһ�ַ�֧��
				methodA(fileB); 
			}  
		}
	}
}   
