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
			System.out.println("�˿ͳ�"+BaoZi.Pi+BaoZi.Xian);
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("�˿ͳ��������");
			BaoZi.flag=false;
			BaoZi.notify();
			System.out.println("�Ѿ��������");
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
