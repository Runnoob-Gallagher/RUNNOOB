package ReflectKS;
/*
 * 类的主动引用（一定会发生类的初始化）
 * 1.当虚拟机启动，运行程序时，先初始化main方法所在的类
 * 2.new一个类的对象
 * 3.调用类的静态成员（除final常量）和静态方法
 * 4.使用java.lang.reflect包得方法对类进行反射调用
 * 5.当初始化一个类，如果父类没有被初始化，则会初始化它的父类
 * 
 * 类的被动引用（不会发生类的初始化）
 * 1.当访问一个静态域时，只有真正申明这个域的类才会被初始化。如：当通过子类引用父类的静态变量，不会导致子类初始化
 * 2.通过数组定义类引用，不会触发此类的初始化
 * 3.引用常量不会触发此类的初始化（常量再链接阶段就存入的调用类的常量池中）
 */
public class Demo05ClassInitial {
	static {
		System.out.println("main类被加载 ");
	}
	
	public static void main(String[] args) throws ClassNotFoundException {
		//1.主动应用,体现了上面的 第 1、2、3和第5点
		//Man ma = new Man();
		/* 执行结果：
		 * main类被加载 
		   *父类被加载
			子类被加载 */
		//2.通过反射产生主动引用
		//Class claA = Class.forName("ReflectKS.Man");
		/*
		 * 执行结果：
		 * main类被加载 
		 *父类被加载
         *子类被加载
		 */
		//3.不会产生类的引用的方法
	//	System.out.println(Man.grade); //子类调用父类的静态变量或方法，不会让子类进行加载
		/*
		 * 执行结果：
		 * main类被加载 
         *父类被加载
		 */
	//	Man[] arry = new Man[5]; //由子类创建的数组也不会 
		System.out.println(Man.AGE);// 调用子类的静态常量，也不会加载子类及父类
		/*
		 * 常量再链接阶段已经掉入了常量池
		 */
	}
	
}
class People{
	static int grade = 12;
	static {
		System.out.println("父类被加载");
	}
}
class Man extends People{
	static String sex = "男";
	static {
		System.out.println("子类被加载");
		age = 100;
	}
	static int age = 10;
	static final int AGE = 1000;
}
