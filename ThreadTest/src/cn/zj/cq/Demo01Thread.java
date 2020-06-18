package cn.zj.cq;

public class Demo01Thread {
	public static void main(String[] args) {
		Demo01ExtendsThread det = new Demo01ExtendsThread();
		Thread th = new Thread(det);
		th.start();
		for(int i = 0;i<10;i++) {
			System.out.println(i);
		}
	}
}
