package cn.zj.cq;
//这个demo是用以获取当前的线程名
public class Demo03CurrentThread extends Thread{
	@Override 
	public void run() {
		// TODO Auto-generated method stub
		/*
		 * Thread thA = currentThread(); 
		 * System.out.println(thA);
		 * System.out.println(thA.getName());
		 *///这几排等同于下面几排
	System.out.println(new Thread().currentThread().getName());//这里虽然写了两个获取Thread名字的方法，但是显示的还是Thread0
	//因为你那边只开启了一个线程；
	//前面写了两个线程现在得出结果正常---->Thread-0  Thread-1

	}
	
}
