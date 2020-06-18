package cn.zj.cq;
//这个demo是匿名内部类---->创建在某个类中的没有名字的类

/*作用：简化代码
	1.把子类继承父类，重写父类方法，创建子类对象合一步完成
	2.把实现类实现接口，重写接口中的方法，创建实现类对象合成一步完成
	子类/实现类对象，而没有这个类的名字*/
	
public class Demo08NiMinInner {
	public static void main(String[] args) {
		new Thread("匿名内部类线程") {
			@Override
			public void run() {
				// TODO Auto-generated method stub
				System.out.println(currentThread().getName());
			}
		}.start(); 
		new Thread(new Runnable() {

			@Override
			public void run() {
				// TODO Auto-generated method stub
				System.out.println(Thread.currentThread().getName());
			}
			
		}).start();
	}	
}
