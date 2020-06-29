package cn.zj.cq;

public class Demo02Totoerise implements Runnable{
	private static String winner ;
	@Override
	public void run() {
		// TODO Auto-generated method stub
		for(int i=0;i<=20;i++){
			boolean flag = Over(i);
				if(flag ) { 
					break;
				}  
				System.out.println("当前是" + Thread.currentThread().getName()+"跑了"+i+"米");

		}
		
	}
	public boolean Over(int steps) {
		if(winner != null) {//说明已经存在胜利者了，如果取消了会出现两个线程同时写入winner是谁，这个就是当出现winner就停止
			return true;
		}else { 
			if(steps >= 20) {
				winner = Thread.currentThread().getName();
				System.out.println("winner就是" + winner);
				 return true; 
			}{
				return false;
			}
		}
	}
	public static void main(String[] args) {
		Demo02Totoerise dt = new Demo02Totoerise();
		new Thread(dt, "兔子").start();
		new Thread(dt, "乌龟").start();
	}
}
