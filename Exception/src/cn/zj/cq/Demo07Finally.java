package cn.zj.cq;

import java.io.FileNotFoundException;

//这个demo是熟悉finally，无论是否出现异常，finally中的代码都会执行,那如果不使用呢？看下一个例子
public class Demo07Finally {
	public static void main(String[] args) throws FileNotFoundException {
		try {
			methodA("D:/ddd");
		}catch(FileNotFoundException e) {
			e.printStackTrace();
		}finally{
			System.out.println("不管程序正常与否，我都会执行");
		}

	}  
	public static void methodA(String filepath) throws FileNotFoundException {
		String path = "D:/ddd";
		if(!path.equals(filepath)) { 
		throw new FileNotFoundException("文件名不对");
		}
	}
}
