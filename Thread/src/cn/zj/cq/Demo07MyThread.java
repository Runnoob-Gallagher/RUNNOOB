package cn.zj.cq;

public class Demo07MyThread {
	public static void main(String[] args) {
		Demo07Runnable dr = new Demo07Runnable();
		Thread th = new Thread(dr);
		th.start();
		th.setName("Ïß³Ì");
				}
}
