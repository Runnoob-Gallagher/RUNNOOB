package cn.zj.cq;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Demo12Lock implements Runnable {
	private int money = 50;
	Lock lock = new ReentrantLock();
	@Override
	public void run() {
		// TODO Auto-generated method stub
		lock.lock(); 
		try {
			Thread.sleep(100);
			while(money>0) {
				System.out.println(Thread.currentThread().getName()+" "+money);
				money--;
			}
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			lock.unlock();
		}
			}
	}


