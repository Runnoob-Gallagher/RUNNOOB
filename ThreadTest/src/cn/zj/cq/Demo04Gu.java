package cn.zj.cq;
//同上，这个顾客线程还是要使用包子对象，进行加锁和互斥唤醒及睡眠
public class Demo04Gu extends Thread{
	private  Demo04BaoZi bz;
	public Demo04Gu(Demo04BaoZi bz) {//同前面的
		// TODO Auto-generated constructor stub
		this.bz=bz; 
	} 
	@Override
	public void run() {
		while(true) {
			synchronized (bz) {
				// TODO Auto-generated method stub
				if(bz.flag == false) {
					System.out.println("顾客发现没包子");
					try {
						bz.wait();//顾客线程等待
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}else{
					bz.notify();//这里唤醒顾客线程
					System.out.println("已经唤醒，顾客吃包子");
					try {
						Thread.sleep(10000);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					System.out.println("顾客吃完包子");
					bz.flag=false;
					System.out.println("现在没包子了");
				}
			}
		}
		
		}

}
