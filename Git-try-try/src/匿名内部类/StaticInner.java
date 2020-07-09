package 匿名内部类;
//这个demo涵盖了上面的所有点
public class StaticInner {
	private String nameA = "非静态外部类名A";
	private void methodOutA() {
		System.out.println("非静态外部类方法A");
	}
	private static String nameB = "重名静态外部类名B";
	private static void methodOutB() {
		System.out.println("重名静态外部类方法B");
	}
	private  String nameC = "非静态外部类名C";
	private  void methodOutC() {
		System.out.println("非静态外部类方法C");
	}
	//你看里边的变量名nameB和methodB都是一致的但是没有冲突，是不是说明了静态内部类和外部类无关
	private static class Inner{
		private static String nameB = "重名静态内部类名B";
		private static void methodOutB() {
			System.out.println("重名静态内部类方法B");
		}
		private String nameD = "静态内部名D";
		private void methodInD() {
			System.out.println("静态内部方法名D");
		}
		private static String nameC = "静态内部类名C";
		private static void methodOutC() {
			System.out.println("静态内部类方法C");
		}
		
	}
	//Inner in = new Inner();
	public static void main(String[] args) {
		Inner inA = new Inner();//如果时普通内部类，在这个静态主方法中创建普通对象，是会报错的 //创建静态内部类的第一种方式
		System.out.println(inA.nameD + "  " + inA.nameC );//这里访问的时
		StaticInner.Inner inB = new StaticInner.Inner();//创建静态内部类的第二种方式
		System.out.println(inB.nameD + "  " + inB.nameC);
		//Inner inC = new StaticInner().new Inner();//报错：Illegal enclosing instance specification for type StaticInner.Inner
		//上面的报错是因为使用了之前非静态内部类的方法去创建对象，相当于绑定了外部类，这是和静态内部类不符的，所以有问题
		//System.out.println(inC.nameA + inC.nameB);
		inA.methodInD();
		inB.methodInD();
		//inC.methodInA();
		
		
		//System.out.println(inA.nameA);这里静态内部类访问外部类非静态就报错了
		System.out.println(StaticInner.Inner.nameB);  //这个时直接通过外部类.内部类.属性(方法)去访问匿名内部类的东西
		StaticInner si = new StaticInner();//这个时外部类的对象
		System.out.println(si.nameB); //这里外部类的对象不能访问静态内部类的任何变量
	}
}
