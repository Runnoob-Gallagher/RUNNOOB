package cn.zj.cq;

public class Demo11MyThread {
	public static void main(String[] args) {
		Demo11SnycMethod ds = new Demo11SnycMethod();
		System.out.println(ds);
		//System.out.println(new Demo11SnycMethod());//�����Ϊʲô�����
		Thread thA = new Thread(ds);
		Thread thB = new Thread(ds);
		thA.setName("�߳�A");
		thB.setName("�߳�B");
		thA.start();
		thB.start();
	}
}
 