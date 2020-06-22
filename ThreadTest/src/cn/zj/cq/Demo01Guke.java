package cn.zj.cq;

/*顾客也是一个线程类，可以继承Thread
对包子的状态进行判断
	true--->有包子---->顾客吃包子--->吃完包子后修改包子的状态为false
	false---->没有包子---->顾客进入等待*/
public class Demo01Guke extends Thread {
//同上
	private Demo01BaoZi dpz;

public Demo01Guke(Demo01BaoZi dpz) {
	
	this.dpz = dpz;
}
	@Override
		public void run() {
			// TODO Auto-generated method stub
			synchronized (dpz) {
				if(dpz.flag == false) {
					try {
						dpz.wait();
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				} /* 被唤醒之后的代码 */else {
					System.out.println("吃包子" + dpz.Pi + dpz.Xian);
					//当吃完包子后，修改包子的状态
					dpz.flag = false;
					//顾客唤醒包子铺线程
					dpz.notify();
					System.out.println("顾客已经吃完了 "+  dpz.Pi + dpz.Xian + "可以生产包子了");
					System.out.println("--------");
				}
			}
		}
}
