package cn.zj.cq;
//创建多线程的第一种方式：创建thread类的子类
/*java.lang.Thread类:是描述线程的类，要实现多线程程序就必须时间Thread类
步骤：
1.创建一个Thread类的子类
2.在Thread类的子类中重写run方法，设置线程任务
3.创建Thread类的子类对象
4.调用Thread类中的方法start方法，开启新的线程，执行run方法
	void start() 使线程开始执行，java虚拟机调用线程的run方法。--->这里的调用start视为了让他来执行论run方法，因为他会开辟一条新的线程
	结果就是两个线程并发的运行；当线程（main线程）和另一个线程（创建新的行程，执行run方法）
	多次启动一个线程是非法的---->java.lang.IllegalThreadStateException 看21行   特别当前线程已经结束执行后，不能重新启动*/
//java是抢占式的
public class Demo02Thread {
	public static void main(String[] args) {
		//这里注意了，如果我将循环放在前面他就自己按顺序执行了。但是多线程在前面，他就会多线程
		Demo02MyThread dm = new Demo02MyThread();
		dm.start();
		for(int i = 0;i<10;i++) {
			System.out.println("main" + i);
		}
		dm.start();
	}
}
