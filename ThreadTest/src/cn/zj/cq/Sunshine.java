package cn.zj.cq;

public class Sunshine extends Thread {//继承Thread类创建线程
	private Electric e;//创建一个电的对象作为锁对象
	 public Sunshine(Electric e) {
		// TODO Auto-generated constructor stub
		this.e = e;
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		synchronized (e) { 
			if(e.flag == false) {
				System.out.println("没有电，我准备唤醒太阳");
				e.notify();
				System.out.println("没有电，我已经唤醒了太阳");
			}else if(e.flag = true) {
				System.out.println("当前是有电的，那我就要熄灭太阳");
				try {
					e.wait();
				} catch (InterruptedException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
			
		}

		}
	
}
