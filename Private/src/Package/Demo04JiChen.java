package Package;
//这个是继承中使用匿名内部类
/*格式：
	子类名称 对象名 = new 子类名称{
		重写父类的方法
}*/
public class Demo04JiChen {
	public void methodB() {
		System.out.println("父类");
	}
	public static void main(String[] args) {
		Demo04NiMin dnm = new Demo04NiMin() {
			public void methodA() {
				// TODO Auto-generated method stub
				System.out.println("匿名");
			}
		};
		dnm.methodA();
	}
	
}
