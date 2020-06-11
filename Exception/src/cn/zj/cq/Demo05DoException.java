package cn.zj.cq;

import java.io.FileNotFoundException;
import java.io.IOException;

//这个demo是处理注意是编译器编译器编译器异常的第一种方式---->throws  交给别人去处理
/*作用：
	当方法内部抛出这个异常时，我们就必须处理这个异常对象
	就可以使用throws关键字处理异常对象，把异常对象声明抛给方法的调用者处理（自己不处理，交给别人处理）最终交给JVM处理
格式：在方法声明时使用
	修饰符 返回值类型 方法名(参数列表) throws AAAException,BBBException{
		throw new AAAException("产生原因");
		throw new BBBException("产生原因");
		...
}
注意：
	throws关键字必须卸载方法声明处
	throws关键字后边声明的异常必须是Exception或者是Exception的子类
	方法内部如果抛出多个异常，那么throws后边必须也是多个异常
	调用一个声明排除异常的方法，我们就必须处理声明的异常
		要么继续使用throws声明抛出，交给方法的调用者处理，最终交给JVM
		要么try...catch自己处理异常*/

//如果抛出的异常有子父类关系，可以直接声明父类一场即可
public class Demo05DoException {  //注意编译异常就必须使用throws抛出异常
	public static void main(String[] args) throws FileNotFoundException,IOException {//FileNotFoundException继承IOException 可以不用前者，直接使用父类
		methodA("D:/ext");
	}
	public static void methodA(String str) throws IOException {
		String filepath = "D:/text";
		if(!filepath.endsWith(".test")) {
			throw new IOException("后缀名不对");
		}
		if(!str.equals(filepath)) { //if(str != filepath) 
			throw new FileNotFoundException("你的文件路径有问题哟");
		}
		
	}
}

