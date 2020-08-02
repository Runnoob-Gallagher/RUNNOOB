 package Quote;

	/*怎么理解methodA(System.out::println);
		解：System就是Java自定义的一个类
		out是System里面的一个静态数据成员，public final static PrintStream out = null;而且这个成员是java.io.PrintStream类的引用    这个引用现在不懂啥意思
		println()就是java.io.PrintStream类里的一个方法，它的作用是向控制台输出信息。
		System.out.println(s);  就是类调用对象，对象调用方法；
		回到methodA(System.out::println);    就是方法的应用   println方法属于System.out对象，那么他就可以调用该方法*/
public class Normal {
	public static void main(String[] args) {
		methodA(new nomalinterface() {
			
			@Override
			public void print(String s) {
				// TODO Auto-generated method stub
				System.out.println(s);
			}
		});
		methodA((str) -> System.out.println(str));
		/*
		 * 看这个lambda表达式的作用：
		 * 	打印输出字符串str
		 * 		1.对象System.out对象已经存在
		 * 		2.println方法也已经存在
		 * 就可以直接使用对象引用方法的方式
		 */
		methodA(System.out::println);
		/*Normal nm = new Normal();
		String s =  nm::methodA("折旧额和");
		System.out::methodA("Ss");*/
	}
	public static void methodA(nomalinterface nf) {
		nf.print("自定义函数式接口");
	}
}
