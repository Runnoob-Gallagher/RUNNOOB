package cn.zj.cq;
//���demo����Ϥ�ȴ��뻽�ѵ�
/*������
	����һ���˿��̣߳���֪�ϰ���ӵ����ԣ�����wait()����������cpu��ִ�У����뵽WAITING
	����һ���ϰ��̣߳�����5���������ӣ�����֮�󣬵���notify���������ѹ˿ͳ԰���
ע�⣺
	�˿ͺ��ϰ����ʹ��ͬ������������������֤�ȴ��ͻ���ֻ��һ����ִ��
	��������뱣֤Ψһ
	֮����������ܵ���wait��notify����
	
	Object���еķ���
	void wait()
		�������̵߳��ô˶���notify()��������notifyAll()����֮ǰ�������̵߳ȴ�
	void notify()
		���Ѵ˶���������ϵȴ��ĵ����߳�
		�����ִ��wait֮��Ĵ���*/
public class Demo13Waiting {
	public static void main(String[] args) {
		Object obj = new Object();

	new Thread(new  Runnable() {
		 
		@Override
		public void run() {
			synchronized(obj) {
			// TODO Auto-generated method stub
			System.out.println("��֪�ϰ���ӵ�����");
			
			try {
				obj.wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			try {
				Thread.sleep(5000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("����");
			}
		}
	}).start();
	

		
	System.out.println("------------");
	try {
		Thread.sleep(5000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}

		new Thread() {
			@Override
			public void run() {
				synchronized (obj) {
					
				// TODO Auto-generated method stub
				System.out.println("���Ҹ������ӣ�������");
				obj.notify();
				}
			
			}
		}.start(); 
		
	
	
	}
}
