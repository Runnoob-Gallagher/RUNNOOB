package Package;
//注意点：
/*格式：
	接口名称	对象名称 = new 接口名称() {
		重写接口中的抽象方法
};*/
/*1.这里的new代表创建对象的操作
2.接口名称就是匿名内部类需要实现的哪个接口
3.{}这个里面才是匿名内部类中的内容

一、匿名内部类创建之后只能使用一次，如果想使用多次，那么就只能创建对象使用了；*/
//二、匿名对象调用方法的时候，只能使用一次。如果还想多次调用的话，那就要去一个名字去调用。否则只有多次去重复之前的代码
public class Demo05Main {
	public static void main(String[] args) {
		Demo05Attention demo;
	
		Demo05Attention daA = new Demo05Attention() {

			@Override
			public void methodA() {
				// TODO Auto-generated method stub
				System.out.println("我是匿名内部类，但是不是匿名对象。因为我还有Demo05Attention da");
			}
			
		};
		daA.methodA();
		 new Demo05Attention() {//

			@Override
			public void methodA() {
				// TODO Auto-generated method stub
				System.out.println("我是匿名内部类，也是匿名对象。因为我没有Demo05Attention da");
			}
			
		}.methodA();
		
	}
}
