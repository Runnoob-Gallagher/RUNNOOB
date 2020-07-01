package cn.zj.cq;
//这个demo是熟悉线程池---->容纳多个线程的容器 ？？？？？？？
/*java.util.concurrent.ExecutorService ---->是线程池的接口
static ExecutorService newFixedThreadPool(int nThreads) ---->创建一个可重用固定线程数的线程池，以共享的无界队列方式来运行这些线程。---->方法返回的就是线程池
返回值：ExecutorService接口---->返回的是接口类型的实现类，可以使用ExecutorService接口去接收（面向接口编程）？？？？？ 
	ExecutorService接口中提供了一个方法submit，用来调用线程池中的线程，调用start()方法执行线程任务；
submit(Runnable task) 
提交一个 Runnable 任务用于执行
	关闭和销毁线程池的方法
			void shutdown() 
				启动一次顺序关闭，执行以前提交的任务，但不接受新任务。
		实现步骤：
			1.使用线程池的工厂类Executors里提供的静态方法newFixedThreadPool生产一个指定线程数量的线程池
			2.创建一个类，实现Runnable接口，重写run方法，设置线程任务
			3.调用ExecutorService中的方法submit，传递县城任务（实现类），开启线程，执行run方法
			4.调用ExecutorService中的方法shutdown销毁线程池；*/

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Demo15ThreadPool {
	public static void main(String[] args) {
		ExecutorService es = Executors.newFixedThreadPool(3);
		Demo15Imp di = new Demo15Imp();
		es.submit(di);
		es.submit(di);
		es.submit(di);
		es.submit(di);
		es.submit(di);
//		当前线程是：pool-1-thread-1  //线程池会一直开着，使用完成之后会自动归还线程，线程可以继续使用；
//		当前线程是：pool-1-thread-2
//		当前线程是：pool-1-thread-1  //归还了？
//		当前线程是：pool-1-thread-3
//		当前线程是：pool-1-thread-2  //为什么当前执行结果是这样，而且是变化的 yi'zhi有123
	}
}
