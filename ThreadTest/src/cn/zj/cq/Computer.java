package cn.zj.cq;

public class Computer extends Thread{
	private Electric e;//传入锁对象
	 public Computer(Electric e) {
		// TODO Auto-generated constructor stub
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		synchronized (e) { 
			if(e.flag == true) {
				System.out.println("有电，我就要熄灭他");
				try {
					e.wait();
				} catch (InterruptedException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}{
				System.out.println("，没电，唤醒太阳");
			}
		}
		
	}
}
