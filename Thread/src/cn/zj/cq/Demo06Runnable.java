package cn.zj.cq;
//创建线程的第二种方式：创建线程的另一种方法是声明实现 Runnable 接口的类。该类然后实现 run 方法。
//然后可以分配该类的实例，在创建 Thread 时作为一个参数来传递并启动。采用这种风格的同一个例子
/*class PrimeRun implements Runnable {
    long minPrime;
    PrimeRun(long minPrime) {
        this.minPrime = minPrime;
    }

    public void run() {
        // compute primes larger than minPrime
         . . .
    }
}

--------------------------------------------------------------------------------

然后，下列代码会创建并启动一个线程： 


PrimeRun p = new PrimeRun(143);
new Thread(p).start();*/

/*步骤：
	1.创建一个Runnable接口的实现类
	2.在实现类中重写Runnable接口中的润方法，设置线程任务
	3.创建一个Runnable接口的实现类对象
	4.创建Thread对象，构造方法中传递Runnable接口的实现类对象   ---->重要！！！！
	5.调用Thread类中的start方法，开启新的线程执行run方法*/
public class Demo06Runnable {
	public static void main(String[] args) {
				Demo06RunnableImp diA = new Demo06RunnableImp();
				Thread th = new Thread(diA);
				th.start();
				for(int i = 0; i< 5; i++) {
					System.out.println("main" + i);
				}
	}	
}	
