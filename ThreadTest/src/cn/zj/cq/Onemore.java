package cn.zj.cq;

public class Onemore implements Runnable{
	private int stance = 100;
	private String Winer;
	@Override
	public void run() {//先来确定跑的米数
		// TODO Auto-generated method stub
		for(int i=0;i<=stance;i++) { 
			if(Thread.currentThread().getName() == "兔子") {
				try {
					Thread.sleep(1);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			boolean flag = Over( i);
			if(flag) {
				break; 
			}
			System.out.println("当前"+Thread.currentThread().getName()+"跑了"+i+"米");//打印当前线程
		}
	} 
	private boolean Over(int i) {
		// TODO Auto-generated method stub
		if(Winer != null) {
						return true;
		}else if(i>=stance){
			Winer = Thread.currentThread().getName();
			System.out.println("赢家是："+Winer);
			return true;
		} 
	{
			return false;
		}
		
	
	}
	public static void main(String[] args) {
		Onemore om = new Onemore();
		new Thread(om,"乌龟").start();
		new Thread(om,"兔子").start();
	}

}