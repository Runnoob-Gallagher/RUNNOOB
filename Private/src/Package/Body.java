package Package;
//这个Demo是说的成员内部类
/*格式：
	权限修饰符 class 类名称{
		权限修饰符 class 类名称{
			....
		}
		....
}
注意：内部类中可以随意访问外部类，但是外部类访问内部类必须使用对象调用*/
public class Body {
	public class Heat {
		public int age = 24;
		public void methodHeart() {
						System.out.println("我是心脏" + name);//这里内部类访问外部类，随意访问。就算权限是private也一样
		}
	}
	private String name = "Galagher";
	public void methodBody() {
		//System.out.println("心脏存活的年龄是：" + age);//这里就算内部类中的权限是private还是布恩那个访问
		System.out.println(new Heat().age);//这里创建了Heart的匿名对象才访问到了
		System.out.println("我是一个身体");
	}
	public static void main(String[] args) {
		Body b = new Body();
		b.methodBody(); //通过调用外部类的方法间接调用内部类
		int num = b.new Heat().age;//这里通过外部类名称.内部类名称.方法名直接调用
		System.out.println(num);
	}
}
