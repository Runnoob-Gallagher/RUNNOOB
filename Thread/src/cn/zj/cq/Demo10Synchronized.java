package cn.zj.cq;
//����������̰߳�ȫ��
/*������
	1.ͬ�������
	2.ͬ������
	3.������*/
/*ͬ������飺 
	��ʽ��
		sychronized(������){
		���ܳ����̰߳�ȫ����Ĵ���(�����˹������ݵĴ���--->���繲ͬ������һ����Ʊ)
}
	ע�⣺
		1.������е������󣬿���������Ķ���
		2.���뱣֤����߳�ʹ�õ���������ͬһ��
		3.����������ã�
			��ͬ���������ס��ֻ��һ���߳���ͬ���������ִ��*/
/*ͬ������ԭ��
	���߳�A���CPUִ��Ȩ��ʱ��ִ��run������������ͬ������飬Ȼ��ͬ��������ȥ����߳�A��û����������еĻ���
	�ͻ��ȡ�������󣬽��뵽ͬ����ִ�У�
	��֮�෴���߳�B����CPUִ��Ȩ����Ҫִ�е�ʱ��ͬ��Ҳ�ᱻSyncͬ����������Ƿ���������û�оͲ��У�
	����ȵ��߳�Aִ�����֮���ͷ�����Ȼ�����黹���߳�B��Ȼ���߳�B���ܽ��뵽ͬ���������ִ�У�*/
public class Demo10Synchronized implements Runnable {
	private int ticket = 20;
	Object obj = new Object();
	@Override
	public void run() {
		// TODO Auto-generated method stub
		
		synchronized (obj) {
			while(true) {
				if(ticket > 0) {
					System.out.println(Thread.currentThread().getName() + " " + "Ʊ����" + ticket);
					ticket--;
				}
			}
		}
		
		/*
		 * for(int i=0;i<5;i++) { System.out.println(Thread.currentThread().getName());
		 * }
		 */
	}
	
}
