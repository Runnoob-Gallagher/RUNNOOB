package Package;
//如果内部类和外部类出现重名的情况
/*解决：
	外部类名称.this.内部类属性*/
public class Repeat {
	String name = "Yasuo";
	public class Inner{
		String name = "guer";
				public void InnerMethod() {
			String name = "Jianhao";
			System.out.println(name);//打印出Jianhao,就近原则
			System.out.println(this.name);//打印出guer，因为使用了this，代表成员变量
			System.out.println(Repeat.this.name);//打印出Yasuo
		}
	}
}
