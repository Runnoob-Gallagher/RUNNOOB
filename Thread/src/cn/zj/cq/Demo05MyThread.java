package cn.zj.cq;

public class Demo05MyThread {
	public static void main(String[] args) {
		Demo05Sleep dsA = new Demo05Sleep();
		dsA.start();
		for(int i=0; i < 10; i++) {
			try {
				Thread.sleep(1000);//dsA.sleep(1000);  ��Ϊsleep�Ǿ�̬���������Զ��ǿ��Ե�
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println(i);
		}
		
	}
}
