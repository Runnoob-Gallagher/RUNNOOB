package cn.zj.cq;

public class Demo09ThreadProblem implements Runnable{
	private int ticket = 100;
	@Override
	public void run() {
		// TODO Auto-generated method stub
		while(true) {
			if(ticket > 0) {
				System.out.println(Thread.currentThread().getName() + "���ڵ�Ʊ��" + ticket);
				ticket--;
			}
		}
	}

}
