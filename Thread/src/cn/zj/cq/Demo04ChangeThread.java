package cn.zj.cq;
//这个demo是修改线程的名称
/*	方式一：
 * 	API：void setName(String name) 
				改变线程名称，使之与参数 name 相同。 */
/*方式二： 
	创建带参数的构造方法：
	API：Thread(String name) 
    		分配新的 Thread 对象。*/
public class Demo04ChangeThread extends Thread{
	@Override
	public void run() {
		// TODO Auto-generated method stub
		//System.out.println(currentThread().getName());//开启了一个线程---->Thread-0
	}
	
	public Demo04ChangeThread(String name) {//创建一个代参的构造方法
		super(name);//这里重要--->调用父类带参构造方法，把县城名称传递给父类，让父类（Thread）给子线程起一个名字
	}//这里的调用父类构造方法如果不同，就看自己写的博客
}
