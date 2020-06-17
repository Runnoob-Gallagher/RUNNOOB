package cn.zj.cq;

public class Demo10MyThread {
	public static void main(String[] args) {
		Demo10Synchronized ds = new Demo10Synchronized();
		Thread thA = new Thread(ds);
		Thread thB = new Thread(ds);
		Thread thC = new Thread(ds);
		thA.setName("线程A");
		thB.setName("线程B");
		thC.setName("线程C");
		 
		thA.start();
		thB.start(); 
		//thC.start();
}
}
