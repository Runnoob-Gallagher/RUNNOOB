package cn.zj.cq;

/*��ƹ������ܣ�
	1.ȷ�������ĳ���
	2.��ʼ�� �����߳�ͬʱ�� 
	3.ȷ��ʤ������*/
public class Onemore implements Runnable{
	//ȷ���ܵ�����
	private int chang = 30;
	//����ʤ����
	private String Winer;
	@Override 
	public void run() {
		if(Thread.currentThread().getName() == "����") {
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
				System.out.println(Thread.currentThread().getName()+"����"+i+"��");
				if(Winer != null) {
					break;
				}else if(i>=chang) {
					Winer = Thread.currentThread().getName();
					System.out.println("ʤ������"+ Winer);
				}
			}
			break;
		}
	}
	public static void main(String[] args) {
		Onemore onemore = new Onemore();
		new Thread(onemore, "����").start();
		new Thread(onemore, "�ڹ�").start();
	}
}