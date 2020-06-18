package cn.zj.cq;

public class Demo01ExtendsThread extends Thread{
	private int age = 40;
	@Override
	public void run() {
		// TODO Auto-generated method stub
		while(age>0) {
			System.out.println(Thread.currentThread().getName() + " " + age);
			age--;
		}
		
	}
}
