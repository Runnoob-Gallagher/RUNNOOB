package cn.zj.cq;

/*�������ࣺ��һ���߳��࣬���Լ̳�Thread
�����߳�����run������������
�԰��ӵ�״̬�����жϣ�
true---->�а���  �������߳̽���wait״̬�����ѹ˿��̳߳԰���
false---->û���� �������߳���������*/

/*ע�⣺
	Ҫ��֤�����̺͹˿ͻ��⣬ͬһʱ��ֻ��һ����ִ��
	�����ͱ���ʹ��ͬһ���������ˣ���Ϊ��������ͬ����������ͬ��������ִ�У�ͬʱֻ����һ���߳���ִ�У�����������
	�����̺͹˿;�Ҫ�����Ӷ�����Ϊ�������ݳ���
	1.�ڳ�Աλ�ã�����һ�����Ӷ���
	2.�����������Ĺ��췽��Ϊ���ӱ�����ֵ*/
public class Demo01BaoZiPu extends Thread{
	//1.�ڳ�Աλ�ã�����һ�����Ӷ���
	private Demo01BaoZi dpz;
	
	private Demo01BaoZi dpzA = new Demo01BaoZi();
	//2.�����������Ĺ��췽��Ϊ���ӱ�����ֵ
	public Demo01BaoZiPu(Demo01BaoZi dpz) {
			this.dpz = dpz;
	}
	//�����߳�����run����������
	@Override
	public void run() {
		// TODO Auto-generated method stub
		//Ϊ��֤��ͬһ���߳���ִ�У���Ҫ����ͬ���������
		synchronized (dpz) {
			int count = 0;
			if(dpz.flag == true) {//����������а��ӣ��Ǿ��Լ�����ȴ�״̬
				try {
					dpz.wait();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}else {
				dpz.notify();//wait֮��Ĵ����Ǳ�����֮��ִ��
				//��������
				if(count%2 == 0 ) {
					dpz.Pi="��";
					dpz.Xian="��";
				}else {
					dpz.Pi = "��";
					dpz.Xian = "��";
				}
				
				count++;
				System.out.println("������������������" + dpz.Pi + dpz.Xian);
				//�ȴ���������
				try {
					Thread.sleep(10000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
							}
			//���������ˣ�֪ͨ���
			dpz.flag = true;//true����
			
			System.out.println("������������" + dpz.Pi + dpz.Xian);
			
		}
	}
	
		
}
