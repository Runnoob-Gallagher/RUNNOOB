package cn.zj.cq;
//疑问：感觉这个finally代码块没啥用呀，要不要都行。后面的语句都会执行
import java.io.FileNotFoundException;

//这个demo补充另一个demo，不用finally
public class Demo07NotFinally {
	public static void main(String[] args) {
	try {
		methodA("E:\\\\\\Repositor");//如果这里出现了异常，那么后面的语句就不会执行的
		System.out.println("wohuizhixingma?");
	}catch(FileNotFoundException e) {
		e.printStackTrace();
		
	} 
	System.out.println("你觉得我会不会执行呢？");
}
 
	public static void methodA(String filepath) throws FileNotFoundException {
		/*
		 * if(!filepath.endsWith("tory")) { System.out.println("文件名后缀怕是不对哦"); }
		 */
		String path = "E:\\\\Repositor";
		if(!path.equals(filepath)) {
			//System.out.println("文件路径找不到");开始我是这样写的但是前面的try catch报错：Unreachable catch block for FileNotFoundException. This exception is never thrown from the try statement body
			//报错的原因是因为catch中的语句永远不会跑出异常，在原来的类中跑出异常即可，你看下面的
			throw new FileNotFoundException("你的文件名对不上");
		}
				System.out.println("路径没错");
}
	}
