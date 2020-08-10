package ReflectKS;
/*
 * 通过这个看类是怎么加载的
 * 1.将class文件字节码加载到内存中，并将这些静态数据转换成方法去的运行是结构，然后生成一个代表这个类的java.lang.Class对象
 * 2.链接，链接结束后 age = 0；
 * 3.初始化
 * 			<clinit>(){
 * 			sout("Classloader类的静态代码块")
 * 			int age = 24;
 * 			static int age = 5;   这里是一起加载的，最后5覆盖24	
 * }   注意这里的CLass对象在内加载的时候就产生了，在第一步
 */
public class Demo04ClassLoader {
	public static void main(String[] args) {
		Classloader cl = new Classloader();
		System.out.println(cl.age);
	}
}

class Classloader{
	static {
		System.out.println("Classloader类的静态代码块");
		int age = 24;
	}
	static int age = 5;
	public Classloader() {
		System.out.println("ClassLoader的无参构造器 ");
	}
}