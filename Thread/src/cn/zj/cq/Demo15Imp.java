package cn.zj.cq;

public class Demo15Imp implements Runnable {

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("当前线程是："+Thread.currentThread().getName());
	}

}
