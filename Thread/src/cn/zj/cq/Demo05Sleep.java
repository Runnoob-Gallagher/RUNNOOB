package cn.zj.cq;
//这个demo是验证sleep
public class Demo05Sleep extends Thread{
	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println(currentThread().getName());
	}
}
