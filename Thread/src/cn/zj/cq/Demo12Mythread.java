package cn.zj.cq;

public class Demo12Mythread {
	public static void main(String[] args) {
		Demo12Lock dl = new Demo12Lock();
		Thread thA = new Thread(dl);
		Thread thB = new Thread(dl);
		Thread thC = new Thread(dl);
		thA.setName("�߳�A");
		thB.setName("�߳�B");
		thC.setName("�߳�C");
		thA.start();
		thB.start();
		thC.start();
	}
}
