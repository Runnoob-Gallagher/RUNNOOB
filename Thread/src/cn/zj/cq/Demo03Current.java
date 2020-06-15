package cn.zj.cq;

/*获取线程的名称
	1.使用Thread类中的方法getName();
		String getName() 返回该线程的名称
	2.用以获取当前正在执行的线程，使用线程中的方法获取现成的名称
		static Thread currentThread() 返回对当前正在执行的线程对象的引用。*/
import java.io.ObjectInputStream.GetField;

public class Demo03Current {
	public static void main(String[] args) {
		Demo03CurrentThread dmA = new Demo03CurrentThread();
		dmA.start();
		new Demo03CurrentThread().start();
}
}
