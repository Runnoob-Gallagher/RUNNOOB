package PackageA;
/*//四种权限修饰符：                                                public > protected > (default) > private    注意：(default)不是关键字default而是不写！！！
同一个类：指的就是本类							Y			Y           Y          Y			
同一个包：值得就是在一个package下	                Y           Y           Y          N
不同包子类：不在同一个包下，但是有父子继承关系        Y           Y           N          N
不同包不同子类：啥关系也没；						Y			N			N		   N*/

public class ClassA {
	public static String name = "Gallagher";
	public void methodA() {
		System.out.println(name);
	}
}
