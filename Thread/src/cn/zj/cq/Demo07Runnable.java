package cn.zj.cq;
//第二种方法实现Runnable和第一种继承Thread的优势
/*	1.避免了单继承的局限性
		一个类只能有一个直接父类，如果该类继承了Thread类那么他就不能继承其他类了，但是
		你实现了Runnable接口，就还可以继承其他类
	2.增强了程序的扩展性，降低了程序的耦合性
		在传递实现类的对象的时候，可以根据不同的实现类对象去开启不同的线程任务*/
public class Demo07Runnable implements Runnable {

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println(Thread.currentThread().getName());
	}
	
}
