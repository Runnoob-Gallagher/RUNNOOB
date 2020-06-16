package cn.zj.cq;

public class Demo04MyThread {
	public static void main(String[] args) {
		Demo04ChangeThread dc = new Demo04ChangeThread("ThreadB");
		dc.start();
		//dc.setName("ThreadA");
		 
	}
}
