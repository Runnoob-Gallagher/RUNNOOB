package cn.zj.cq;
//����߳�����ĵڶ��ַ�����
	//���ͬ������
/*ʵ��ԭ��
	ͬ������Ҳ���÷����ڲ��Ĵ�����ס��ֻҪһ���߳�ִ��
	ͬ���������������˭��
		Runnable�ӿڵ�ʵ���࣬Ҳ����this---->˭����������������this��ָ˭*///---->��ͬ�����������֤
//���demo�úÿ��������Ǻܶ���
public class Demo11SnycMethod implements Runnable{
	
	private static int ticket = 10;
	@Override
	public  synchronized  void run() {
	//	System.out.println(this);
		// TODO Auto-generated method stub
		while(true) {
			methodA();
			/*
			 * try { Thread.sleep(1000); } catch (InterruptedException e) { // TODO
			 * Auto-generated catch block e.printStackTrace(); } if(ticket > 0) {
			 * System.out.println(Thread.currentThread().getName() + " " + ticket);
			 * ticket--; }
			 */
		}
		
	}

	public /* static */ void methodA() {
		synchronized(this) {//����Ҳ��֤�������Ķ������Runnable�ýӿ� Ҳ���ǵ�����������ö���this--Ҳ��Demo11Synchronized
			System.out.println(this);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			if(ticket > 0) {
				System.out.println(Thread.currentThread().getName() + " " + ticket);
				ticket--;
			}
		}
	}

	public static /* synchronized */  void methodB() {
		synchronized(Demo11SnycMethod.class) {//��̬ͬ��������������this�����������������ʲô�أ�----�����class����---class�ļ����ԣ����䣩
			//System.out.println(this);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			if(ticket > 0) {
				System.out.println(Thread.currentThread().getName() + " " + ticket);
				ticket--;
			}
		}
	}
}


