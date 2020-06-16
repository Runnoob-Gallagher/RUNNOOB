package cn.zj.cq;

public class Demo09MyThread {
	public static void main(String[] args) {
		Demo09ThreadProblem dp = new Demo09ThreadProblem();//这里创建的实现类只有这一个，所以保障了票只有100张。就是这个实现类提供的
		Thread thA = new Thread(dp);
		Thread thB = new Thread(dp);
		Thread thC = new Thread(dp);
		thA.start();
		thB.start();
		//thC.start();
	}
}
