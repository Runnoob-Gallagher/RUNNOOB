package cn.zj.cq;

import java.io.File;
//���demo�����ж���һ���Ƿ�Ϊ�ļ��У�����ǵĻ��Ǿͼ����������ļ��У�ֱ��Ϊ�ļ�Ϊֹ��
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
