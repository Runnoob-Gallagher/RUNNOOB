package cn.zj.cq;

public class Demo03Main {
	public static void main(String[] args) {
		Demo03BaoZi bz = new Demo03BaoZi();
		new Demo03BaoZiPu(bz).start();
		new Demo03Chi(bz).start();
	}
}
