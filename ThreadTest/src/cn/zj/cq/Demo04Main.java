package cn.zj.cq;
//这个是用以开启线程的
public class Demo04Main {
	public static void main(String[] args) {
		/*Demo04Gu dg = new Demo04Gu(null);
		new Thread(dg).start();
		Demo04Pu dp = new Demo04Pu(null);
		new Thread(dp).start();*/ //这里想错了，因为你使用的对象是包子嘛，那你创建的对象就只能是包子
		//包子铺线程和顾客线程都是使用的包子，那你的这个实现怎么进行线程调用呢？
		/*Demo04BaoZi demo04BaoZi = new Demo04BaoZi();
		new Thread(demo04BaoZi)*///这里也灭有搞定   如何使用实现的方式实现
		Demo04BaoZi bz = new Demo04BaoZi();
		new Demo04Pu(bz).start();
		new Demo04Gu(bz).start();
		
	}
}
 