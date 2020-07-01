package cn.zj.cq;
//这个demo作为包子铺的线程  就要用到baozi这个对象，使用实现Runnable接口的方式
public class Demo04Pu extends Thread {
	private  Demo04BaoZi bz;
	public  Demo04Pu(Demo04BaoZi bz) {//注意这是构造器，而且是有参的。构造器用于初始化对象
		// TODO Auto-generated constructor stub
		this.bz=bz;
	}
	@Override
	public void run() {
		int count = 0;
		while(true) { 
			synchronized (bz) {//使用线程同步synchronized
				// TODO Auto-generated method stub
				if(bz.flag) {//这里为真说明有包子，那么包子铺线程就等待。注意你现在是在包子铺线程下！！！！
					System.out.println("这里为真说明有包子，那么包子铺线程就等待");
					try {
						bz.wait();
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}else if(bz.flag==false) {//这里没包子，那么包子铺线程开始生产包子
					System.out.println("这里没包子，那么包子铺线程开始生产包子");
					try {
						Thread.sleep(5000);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					if(count%2==0) {
						bz.P = "正方形";
						bz.X = "素";
						System.out.println("这个生产的是"+bz.P+bz.X+"的包子");
					}else if(count%2==1){
						bz.P = "圆形";
						bz.X = "荤";
						System.out.println("这个生产的是"+bz.P+bz.X+"的包子");
					}
					count++;
				}
				System.out.println("包子做好了");
				bz.flag = true;//这里我已经做好包子了
				System.out.println("这里不应该唤醒顾客吃包子，应该停止包子铺线程生产包子，下面开始停止包子铺线程。。。");
				System.out.println("包子铺已经停止");
				try {
					bz.wait();//这里这个线程已经停止了，下面就不执行？？？？
								} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				//System.out.println("包子铺已经停止");
			}
		}
		
	}
	
	
}
