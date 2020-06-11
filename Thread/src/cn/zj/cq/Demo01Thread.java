package cn.zj.cq;
//这个demo是介绍线程的
/*并发：指两个事件或者多个事件在同一时间段内发生  ---->一个人吃馒头，只能交替着吃
并行：指两个事件或者多个事件在同一时刻发生(同时进行) ---->两个人吃馒头，同时吃
进程和线程：
1.进程是系统中正在运行的一个程序，程序一旦运行就是进程。
2.进程是系统资源分配的独立实体，每个进程都拥有独立的地址空间。
3.同一进程内的多个线程会共享部分状态，多个线程可以读写同一块内存（一个进程无法直接访问另一进程的内存）
4.线程是进程的一个实体，是进程的一条执行路径。*/

/*线程调度：分时---->线程平均分配CPU的使用权，平均分配CPU使用时间
		抢占---->谁的优先级高，谁就先用或者多用*/
public class Demo01Thread extends Thread{
	public static void main(String[] args) {
		Demo01Person dpA = new Demo01Person("Gallagher");
		dpA.run();
		System.out.println(0/0); //Exception in thread "main"  说明这是主线程main
		Demo01Person dpB = new Demo01Person("YangJie");
		dpB.run(); 
	}
	
}
