package cn.zj.cq;

public class Onemore implements Runnable{
	private int stance = 100;
	private String Winer;
	@Override
	public void run() {//����ȷ���ܵ�����
		// TODO Auto-generated method stub
		for(int i=0;i<=stance;i++) { 
			if(Thread.currentThread().getName() == "����") {
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
			System.out.println("��ǰ"+Thread.currentThread().getName()+"����"+i+"��");//��ӡ��ǰ�߳�
		}
	} 
	private boolean Over(int i) {
		// TODO Auto-generated method stub
		if(Winer != null) {
						return true;
		}else if(i>=stance){
			Winer = Thread.currentThread().getName();
			System.out.println("Ӯ���ǣ�"+Winer);
			return true;
		} 
	{
			return false;
		}
		
	
	}
	public static void main(String[] args) {
		Onemore om = new Onemore();
		new Thread(om,"�ڹ�").start();
		new Thread(om,"����").start();
	}

}