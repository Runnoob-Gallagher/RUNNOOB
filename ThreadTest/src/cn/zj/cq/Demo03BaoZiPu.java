package cn.zj.cq;
/*�������̺߳ͳ԰����߳� ���뻥�⣬��ζ�Ų���ͬʱִ�С���ô��Ҫ��ͬһ��������ִ��
���������Ӧ��ѡ��ʲô�أ���   ��Ϊ�����Ǹ��ݰ��ӵ�״̬ȥ���ġ���ô��Ӧ��Ϊ���Ӷ���*/
public class Demo03BaoZiPu extends Thread {
	//�ȴ���һ�����ӱ���
	private Demo03BaoZi BaoZi;
	//ʹ�ô��������췽����Ϊ���ӱ�����ֵ
	public Demo03BaoZiPu(Demo03BaoZi pu){
		this.BaoZi = pu;
	}
	//��дrun��������������
	@Override
	public void run() {
		int count = 0;
		while(true) {
		// TODO Auto-generated method stub
		synchronized (BaoZi) {
			if(BaoZi.flag) {
				try {
					BaoZi.wait();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			//�������ڰ���ʱ,��������
			if(count%2==0) {
				BaoZi.Pi="��ƨ";
				BaoZi.Xian="�²�";
			}else {
				BaoZi.Pi="��Ƥ";
				BaoZi.Xian="Ģ��";
			}
			count++;
			System.out.println("�����̿�ʼ��������"+BaoZi.Pi+BaoZi.Xian+"�İ���");
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}//������������Ѿ������ð�����
			BaoZi.flag=true;
			BaoZi.notify();
			System.out.println("�������Ѿ����ð�����"+BaoZi.Pi+BaoZi.Xian+"�İ���");
		}
	}
	}
}
