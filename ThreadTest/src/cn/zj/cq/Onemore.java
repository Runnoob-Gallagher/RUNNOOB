package cn.zj.cq;

/*设计龟兔赛跑：
	1.确定赛道的长度
	2.开始跑 开启线程同时跑 
	3.确定胜利条件*/
public class Onemore implements Runnable{
	//确定跑道长度
	private int chang = 30;
	//定义胜利者
	private String Winer;
	@Override 
	public void run() {
		if(Thread.currentThread().getName() == "兔子") {
			try {
				Thread.sleep(1);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		// TODO Auto-generated method stub
		while(true) {
			for(int i=0;i<=chang;i++) { 
				System.out.println(Thread.currentThread().getName()+"跑了"+i+"米");
				if(Winer != null) {
					break;
				}else if(i>=chang) {
					Winer = Thread.currentThread().getName();
					System.out.println("胜利者是"+ Winer);
				}
			}
			break;
		}
	}
	public static void main(String[] args) {
		Onemore onemore = new Onemore();
		new Thread(onemore, "兔子").start();
		new Thread(onemore, "乌龟").start();
	}
}