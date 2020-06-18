package cn.zj.cq;
//这个demo是熟悉等待与唤醒的
/*举例：
	创建一个顾客线程：告知老板包子的属性，调用wait()方法，放弃cpu的执行，进入到WAITING
	创建一个老板线程：花了5秒钟做包子，做好之后，调用notify方法，唤醒顾客吃包子
注意：
	顾客和老板必须使用同步代码块包裹起来，保证等待和唤醒只有一个在执行
	锁对象必须保证唯一
	之后锁对象才能调用wait和notify方法
	
	Object类中的方法
	void wait()
		在其他线程调用此对象notify()方法或者notifyAll()方法之前，导致线程等待
	void notify()
		唤醒此对象监视器上等待的单个线程
		会继续执行wait之后的代码*/
public class Demo13Waiting {
	public static void main(String[] args) {
		Object obj = new Object();

	new Thread(new  Runnable() {
		 
		@Override
		public void run() {
			synchronized(obj) {
			// TODO Auto-generated method stub
			System.out.println("告知老板包子的属性");
			
			try {
				obj.wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			try {
				Thread.sleep(5000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("开吃");
			}
		}
	}).start();
	

		
	System.out.println("------------");
	try {
		Thread.sleep(5000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}

		new Thread() {
			@Override
			public void run() {
				synchronized (obj) {
					
				// TODO Auto-generated method stub
				System.out.println("等我个几分钟，我在做");
				obj.notify();
				}
			
			}
		}.start(); 
		
	
	
	}
}
