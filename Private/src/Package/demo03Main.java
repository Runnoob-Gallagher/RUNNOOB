package Package;
//如果接口中的实现类和父类中的子类只是用一次，那么就可以使用匿名内部类 
/*格式：
	接口名称 对象名 = new 接口名称() {
		重写接口中的抽象方法
};*/
public class demo03Main {
	public static void main(String[] args) {
		/*
		 * Demo03 dmA = new Demo03(); dmA.methodA(); Demo03NiMing dmB = new
		 * Demo03();//这个是多态，左父右子 dmB.methodA();
		 *///这是之前的普通的操作方法。通过对象调用，通过多态调用
		Demo03NiMing dnm = new Demo03NiMing() {

			@Override
			public void methodA() {
				// TODO Auto-generated method stub
				System.out.println("匿名内部类中的方法");
			}
		};
		dnm.methodA();
		/*
		 * {
		 * 
		 * @Override public void methodA() { // TODO Auto-generated method stub
		 * System.out.println("匿名内部类中的方法"); } };
		 */  //注意！！！！！这一部分就是匿名内部类
}
}
