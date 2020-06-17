package cn.zj.cq;
//这个代码解决线程安全的
/*方法：
	1.同步代码块
	2.同步方法
	3.锁机制*/
/*同步代码块： 
	格式：
		sychronized(锁对象){
		可能出现线程安全问题的代码(访问了共享数据的代码--->比如共同卖的那一百张票)
}
	注意：
		1.代码块中的锁对象，可以是任意的对象
		2.必须保证多个线程使用的锁对象是同一个
		3.锁对象的作用：
			把同步代码块锁住，只让一个线程在同步代码块中执行*/
/*同步技术原理：
	当线程A获得CPU执行权的时候执行run方法，会遇到同步代码块，然后同步代码块就去检查线程A有没有这个锁。有的话，
	就会获取到锁对象，进入到同步中执行；
	与之相反，线程B抢到CPU执行权，想要执行的时候，同样也会被Sync同步代码块检查是否有锁对象。没有就不行，
	必须等到线程A执行完成之后，释放锁，然后将锁归还给线程B，然后线程B才能进入到同步代码块中执行；*/
public class Demo10Synchronized implements Runnable {
	private int ticket = 20;
	Object obj = new Object();
	@Override
	public void run() {
		// TODO Auto-generated method stub
		
		synchronized (obj) {
			while(true) {
				if(ticket > 0) {
					System.out.println(Thread.currentThread().getName() + " " + "票还有" + ticket);
					ticket--;
				}
			}
		}
		
		/*
		 * for(int i=0;i<5;i++) { System.out.println(Thread.currentThread().getName());
		 * }
		 */
	}
	
}
