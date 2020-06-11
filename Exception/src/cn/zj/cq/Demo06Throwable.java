package cn.zj.cq;

import java.io.FileNotFoundException;

//这个demo是熟悉Throwable输出异常的三个方法,这里就不是使用throws了
/*1.String getMessage() 返回此throwable的简短秒速
2.String toString() 返回throwable的详细消息字符串
3.void printStackTrace()  JVM打印异常对象，默认该方法，信息是最全面的*/
public class Demo06Throwable {
	public static void main(String[] args) throws FileNotFoundException {
		try {
		methodA("D:/sk");
	}catch(FileNotFoundException e) {//下面三者的信息是越来越全
		System.out.println(e.getMessage());
		System.out.println(e.toString());//这里的toString等同于什么都不写；
		e.printStackTrace(); 
	}
	}
	public static void methodA(String filepath) throws FileNotFoundException {
		String filepa = "D:/task";
		
		  if(!filepa.equals(filepath)) { 
		  throw new FileNotFoundException("你的文件名有误");
		    }
		 
		
	}
}

