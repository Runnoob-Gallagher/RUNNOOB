package Quote;

public class Fu {
	public static void methodB(ZiFuInterface zfi) {
		zfi.methodA();
		System.out.println("我是父类的静态方法，我的参数是一个接口");
	}
	public void methodC(ZiFuInterface zfi) {
		zfi.methodA();
		System.out.println("我是父类的普通方法，我的参数是一个接口");
	}
	public /*static*/ void say() {  //这里加了static就不能重写了，因为他是属于类的。具体详见测试Demo13
		System.out.println("说点东西吧，我是FU");
	}

}
