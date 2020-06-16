package cn.zj.cq;
//这里的demo输出去是：

/*Thread-2现在的票是1
Thread-3现在的票是0---------->这个输出结果表示还是有个先后循序的。如果打印的都是一样的话，那说明就是同时打印这句话
Thread-4现在的票是-1
*/

/*为什么呢：我这里的理解是，当三个线程t2、t3、t4一起抢夺CPU资源：都执行到了if条件语句后（注意这句话，都执行到了if语句后）
遇到sleep语句后，执行休眠。t2、t3、t4都休眠；
当t2想苏醒，执行打印语句--->现在的票是1，然后执行--操作，ticket现在是0；再到if语句判断失败，停止执行；
然后t3苏醒，执行打印语句--->现在得票是0，然后执行--操作，ticket现在是-1；再到if语句中判断失败，停止执行；
然后t4苏醒，执行打印语句--->现在的票是-1，然后执行--操作，ticket现在是-2；再到if语句中判断时报，停止执行；*/

//z这里我的疑问是 为什么直接进入到了if语句后了？？？
public class Demo09ThreadProblem implements Runnable{
	private int ticket = 1;
	@Override
	public void run() {
		// TODO Auto-generated method stub
		while(true) {
			if(ticket > 0) {
				try {
					Thread.sleep(100);//让线程睡眠为什么会增加重复执行的概率
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				System.out.println(Thread.currentThread().getName() + "现在的票是" + ticket);
				ticket--;
			}
		}
	}

}
