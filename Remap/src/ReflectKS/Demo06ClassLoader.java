package ReflectKS;
/*
 * 类加载器的作用：将字节码文件.class加载进内存中；JAVA中有如下加载器
 * Bootstap Classloader 引导类加载器：用C++编写，时JVM自带的类加载器，负载JAVA平台何幸苦，用来装载核心库类，改加载器无法直接获取。rt.jar
 * 
 * Extension Classloader 扩展类加载器：负载jre/lib/ext目录下的jar包或-D java.ext.dirs指定目录下的jar包装入工作库
 * 
 * System Classloader 系统类加载器：负载java -classpath 或 -D java.class.path所指的目录下的类与jar包装入工作，最常用的加载器
 * 
 * 自底向上检查类是否已装载，自顶向下尝试加载类
 */
/*
 * 双亲委派机制：
 *  会一层一层想上找，比如自己定义一个java.lang.String类，但是它会想上找，找到之后你自己这个就没用了
 *  多重检测保证安全性
 */
public class Demo06ClassLoader {
	public static void main(String[] args) throws ClassNotFoundException {
		//获取系统类的加载器
		ClassLoader systemClassLoader = ClassLoader.getSystemClassLoader();
		System.out.println(systemClassLoader);//sun.misc.Launcher$AppClassLoader@18b4aac2
		//获取系统类加载器的父类加载器---》扩展类加载器
		ClassLoader parentA = systemClassLoader.getParent();
		System.out.println(parentA);//sun.misc.Launcher$ExtClassLoader@5ce65a89
		//获取扩展类加载器的父类加载器--->根加载器
		ClassLoader parentB = parentA.getParent();
		System.out.println(parentB);//null   C/C++编写，获取不到
		//查看当前类的加载器
		ClassLoader current = Class.forName("ReflectKS.Demo06ClassLoader").getClassLoader();
		System.out.println(current);//sun.misc.Launcher$AppClassLoader@18b4aac2   系统加载器
		//查看JDK内置类的加载器
		ClassLoader Inner = Class.forName("java.lang.Object").getClassLoader();
		System.out.println(Inner); //null  根加载器
		//获取系统类加载器可以加载的路径
		System.out.println(System.getProperty("java.class.path"));
		/*
		 * 执行结果：   /eclipse不一样？？？
		 * E:\Repository\Remap\bin;
		 * E:\Eclipse\eclipse-java-2020-03-R-win32-x86_64\eclipse\plugins\org.junit_4.13.0.v20200204-1500.jar;
		 * E:\Eclipse\eclipse-java-2020-03-R-win32-x86_64\eclipse\plugins\org.hamcrest.core_1.3.0.v20180420-1519.jar;
		 * E:\Eclipse\eclipse-java-2020-03-R-win32-x86_64\eclipse\configuration\org.eclipse.osgi\454\0\.cp\jacocoagent.jar

		 */
	}
}
