package cn.zj.cq;

public class Demo03Chi extends Thread {
	private Demo03BaoZi BaoZi;
	public Demo03Chi(Demo03BaoZi BaoZi){
		this.BaoZi=BaoZi;
	}
	@Override
	
		
	
	public void run() {
		// TODO Auto-gene
		while(true) {
			
		
		synchronized(BaoZi) {
		if(BaoZi.flag=true) {
			System.out.println("顾客吃"+BaoZi.Pi+BaoZi.Xian);
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("顾客吃完包子了");
			BaoZi.flag=false;
			BaoZi.notify();
			System.out.println("已经吃完包子");
			try {
				BaoZi.wait(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}else {
			try {
				BaoZi.wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}
		}
	}
}
