package cn.zj.cq;

import java.io.File;

public class Demo03File {
	public static void main(String[] args) {
		File fileA = new File("E:\\SVN");
		System.out.println(fileA.getAbsolutePath());//获取该目录的绝对路径
		File fileB = new File("Gallagher.txt");//这个文件我放在改工程相对路径下了,注意是工程的路径，不是该demo的路径
		System.out.println(fileB.getAbsolutePath());//获取改文件的绝对路径
		System.out.println(fileB.getPath());//返回文件名称或者路径名称
		System.out.println(fileB.length());//获取改文件的大小
	}
}
 