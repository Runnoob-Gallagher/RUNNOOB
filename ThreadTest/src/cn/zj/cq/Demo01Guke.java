package cn.zj.cq;

/*�˿�Ҳ��һ���߳��࣬���Լ̳�Thread
�԰��ӵ�״̬�����ж�
	true--->�а���---->�˿ͳ԰���--->������Ӻ��޸İ��ӵ�״̬Ϊfalse
	false---->û�а���---->�˿ͽ���ȴ�*/
public class Demo01Guke extends Thread {
//ͬ��
	private Demo01BaoZi dpz;

public Demo01Guke(Demo01BaoZi dpz) {
	
	this.dpz = dpz;
}
	@Override
		public void run() {
			// TODO Auto-generated method stub
			synchronized (dpz) {
				if(dpz.flag == false) {
					try {
						dpz.wait();
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				} /* ������֮��Ĵ��� */else {
					System.out.println("�԰���" + dpz.Pi + dpz.Xian);
					//��������Ӻ��޸İ��ӵ�״̬
					dpz.flag = false;
					//�˿ͻ��Ѱ������߳�
					dpz.notify();
					System.out.println("�˿��Ѿ������� "+  dpz.Pi + dpz.Xian + "��������������");
					System.out.println("--------");
				}
			}
		}
}
