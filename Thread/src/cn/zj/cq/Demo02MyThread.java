package cn.zj.cq;
//创建一个Thread的子类
public class Demo02MyThread extends Thread {
	@Override
	public void run() {
		// TODO Auto-generated method stub
		for(int i=0;i< 10;i++) {
			System.out.println("run" + i);
		}
	}
}
