package cn.zj.cq;

public class Demo11MyThread {
	public static void main(String[] args) {
		Demo11SnycMethod ds = new Demo11SnycMethod();
		System.out.println(ds);
		//System.out.println(new Demo11SnycMethod());//这里的为什么不相等
		Thread thA = new Thread(ds);
		Thread thB = new Thread(ds);
		thA.setName("线程A");
		thB.setName("线程B");
		thA.start();
		thB.start();
	}
}
 