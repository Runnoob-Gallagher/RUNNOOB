package cn.zj.cq;

public class Demo10MyThread {
	public static void main(String[] args) {
		Demo10Synchronized ds = new Demo10Synchronized();
		Thread thA = new Thread(ds);
		Thread thB = new Thread(ds);
		Thread thC = new Thread(ds);
		thA.setName("�߳�A");
		thB.setName("�߳�B");
		thC.setName("�߳�C");
		 
		thA.start();
		thB.start(); 
		//thC.start();
}
}
