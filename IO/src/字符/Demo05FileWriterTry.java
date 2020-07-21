package 字符;

import java.io.FileWriter;
import java.io.IOException;

/*
	 异常处理的逻辑：
	 	try{
	 	//可能会出现的异常的
	 	}catch(异常类变量 异常名){
	 	//异常处理
	 	}finally{
	 	//一定会执行的代码
	 	 * 资源释放
	 	}
	 */
public class Demo05FileWriterTry {
	public static void main(String[] args) {
		FileWriter fw = null;//直接写fw.close,会提示fw.close未定义。查看前面知道，fw变量在try代码块中定义的，那么他的有效范围就仅在代码块中；所以拿到最外边的大括号中
		//这里的fw.close还是报错，因为方法中的变量在定义时可以不赋值，但是在使用的时候必须赋值;
		try {
			 fw = new FileWriter("Ee:\\SVN\\RUNOOB.xt");
			char[] chA = {'一','二','三','四','五','六','七'};
			char[] chB = {};
			fw.write(chB);
			//fw.close();//这里资源关闭不能放在这，因为如果fw.write()方法执行失败的话，fw.close()就不会执行。
		} catch (IOException e) {
			// TODO: handle exception
			System.out.println(e);
		}finally {
			try {
				fw.close();//这里的fw.close还是报错，因为方法中的变量在定义时可以不赋值，但是在使用的时候必须赋值;
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} //直接写fw.close,会提示fw.close未定义。查看前面知道，fw变量在try代码块中定义的，那么他的有效范围就仅在代码块中；
		}
	}
}
