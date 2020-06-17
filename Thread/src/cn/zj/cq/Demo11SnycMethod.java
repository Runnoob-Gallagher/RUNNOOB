package cn.zj.cq;
//解决线程问题的第二种方法：
	//添加同步方法
/*实现原理：
	同步方法也会让方法内部的代码锁住，只要一个线程执行
	同步代码的锁对象是谁：
		Runnable接口的实现类，也就是this---->谁调用这个方法，这个this就指谁*///---->用同步代码块来验证
//这个demo好好看看，不是很懂了
public class Demo11SnycMethod implements Runnable{
	
	private static int ticket = 10;
	@Override
	public  synchronized  void run() {
	//	System.out.println(this);
		// TODO Auto-generated method stub
		while(true) {
			methodA();
			/*
			 * try { Thread.sleep(1000); } catch (InterruptedException e) { // TODO
			 * Auto-generated catch block e.printStackTrace(); } if(ticket > 0) {
			 * System.out.println(Thread.currentThread().getName() + " " + ticket);
			 * ticket--; }
			 */
		}
		
	}

	public /* static */ void methodA() {
		synchronized(this) {//从这也能证明创建的对象就是Runnable得接口 也就是调用这个方法得对象this--也是Demo11Synchronized
			System.out.println(this);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			if(ticket > 0) {
				System.out.println(Thread.currentThread().getName() + " " + ticket);
				ticket--;
			}
		}
	}

	public static /* synchronized */  void methodB() {
		synchronized(Demo11SnycMethod.class) {//静态同步当方法不能用this，那这里的锁对象是什么呢？----本类的class属性---class文件属性（反射）
			//System.out.println(this);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			if(ticket > 0) {
				System.out.println(Thread.currentThread().getName() + " " + ticket);
				ticket--;
			}
		}
	}
}


