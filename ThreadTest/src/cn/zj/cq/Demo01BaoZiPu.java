package cn.zj.cq;

/*包子铺类：是一个线程类，可以继承Thread
设置线程任务：run进行生产包子
对包子的状态进行判断：
true---->有包子  包子铺线程进入wait状态，唤醒顾客线程吃包子
false---->没包子 包子铺线程生产包子*/

/*注意：
	要保证包子铺和顾客互斥，同一时间只有一个在执行
	这样就必须使用同一个锁对象了，因为锁对象在同步代码块或者同步函数中执行，同时只能有一个线程在执行，满足条件；
	包子铺和顾客就要将包子对象作为参数传递出来
	1.在成员位置，创建一个包子对象
	2.创建带参数的构造方法为包子变量赋值*/
public class Demo01BaoZiPu extends Thread{
	//1.在成员位置，创建一个包子对象
	private Demo01BaoZi dpz;
	
	private Demo01BaoZi dpzA = new Demo01BaoZi();
	//2.创建带参数的构造方法为包子变量赋值
	public Demo01BaoZiPu(Demo01BaoZi dpz) {
			this.dpz = dpz;
	}
	//设置线程任务run，生产包子
	@Override
	public void run() {
		// TODO Auto-generated method stub
		//为保证在同一个线程中执行，就要放在同步代码块中
		synchronized (dpz) {
			int count = 0;
			if(dpz.flag == true) {//这里是如果有包子，那就自己进入等待状态
				try {
					dpz.wait();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}else {
				dpz.notify();//wait之后的代码是被唤醒之后执行
				//生产包子
				if(count%2 == 0 ) {
					dpz.Pi="厚";
					dpz.Xian="肉";
				}else {
					dpz.Pi = "薄";
					dpz.Xian = "菜";
				}
				
				count++;
				System.out.println("包子铺正在生炒包子" + dpz.Pi + dpz.Xian);
				//等待包子做完
				try {
					Thread.sleep(10000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
							}
			//包子做完了，通知检查
			dpz.flag = true;//true就是
			
			System.out.println("包子生产好了" + dpz.Pi + dpz.Xian);
			
		}
	}
	
		
}
