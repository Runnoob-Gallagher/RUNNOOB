package cn.zj.cq;

public class Computer extends Thread{
	private Electric e;//����������
	 public Computer(Electric e) {
		// TODO Auto-generated constructor stub
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		synchronized (e) { 
			if(e.flag == true) {
				System.out.println("�е磬�Ҿ�ҪϨ����");
				try {
					e.wait();
				} catch (InterruptedException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}{
				System.out.println("��û�磬����̫��");
			}
		}
		
	}
}
