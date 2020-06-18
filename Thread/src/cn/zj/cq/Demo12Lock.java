package cn.zj.cq;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

//解决线程安全的问题第三个方法：使用lock锁
//java.util.concurrent.locks.ReentrantLock implements Lock;
/*Lock 实现提供了比使用 synchronized 方法和语句可获得的更广泛的锁定操作。此实现允许更灵活的结构，可以具有差别很大的属性，可以支持多个相关的 Condition 对象。 

锁是控制多个线程对共享资源进行访问的工具。通常，锁提供了对共享资源的独占访问。一次只能有一个线程获得锁，对共享资源的所有访问都需要首先获得锁。
*/
/*lock
public void lock()获取锁。 
如果该锁没有被另一个线程保持，则获取该锁并立即返回，将锁的保持计数设置为 1。 
如果当前线程已经保持该锁，则将保持计数加 1，并且该方法立即返回。 
如果该锁被另一个线程保持，则出于线程调度的目的，禁用当前线程，并且在获得锁之前，该线程将一直处于休眠状态，此时锁保持计数被设置为 1。*/
/*unlock
public void unlock()试图释放此锁。 
如果当前线程是此锁所有者，则将保持计数减 1。如果保持计数现在为 0，则释放该锁。如果当前线程不是此锁的持有者，则抛出 IllegalMonitorStateException。 

*/


/*使用步骤:
    1.在成员位置创建一个ReentrantLock对象
    2.在可能会出现安全问题的代码前调用Lock接口中的方法lock获取锁
    3.在可能会出现安全问题的代码后调用Lock接口中的方法unlock释放锁*/
public class Demo12Lock implements Runnable {
	private int ticket = 100;
	Lock l = new ReentrantLock();
	@Override
	public void run() {
		
		// TODO Auto-generated method stub
		while(true) {
			
			l.lock();
			if(ticket > 0) {
				try {
					Thread.sleep(100);//为什么线程休眠会让概率增加
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				System.out.println(Thread.currentThread().getName() + " " + ticket);
				ticket--;
			}
			l.unlock();
		}
		
	}

}
