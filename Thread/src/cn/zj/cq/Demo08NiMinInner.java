package cn.zj.cq;
//���demo�������ڲ���---->������ĳ�����е�û�����ֵ���

/*���ã��򻯴���
	1.������̳и��࣬��д���෽����������������һ�����
	2.��ʵ����ʵ�ֽӿڣ���д�ӿ��еķ���������ʵ�������ϳ�һ�����
	����/ʵ������󣬶�û������������*/
	
public class Demo08NiMinInner {
	public static void main(String[] args) {
		new Thread("�����ڲ����߳�") {
			@Override
			public void run() {
				// TODO Auto-generated method stub
				System.out.println(currentThread().getName());
			}
		}.start(); 
		new Thread(new Runnable() {

			@Override
			public void run() {
				// TODO Auto-generated method stub
				System.out.println(Thread.currentThread().getName());
			}
			
		}).start();
	}	
}
