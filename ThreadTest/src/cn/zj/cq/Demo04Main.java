package cn.zj.cq;
//��������Կ����̵߳�
public class Demo04Main {
	public static void main(String[] args) {
		/*Demo04Gu dg = new Demo04Gu(null);
		new Thread(dg).start();
		Demo04Pu dp = new Demo04Pu(null);
		new Thread(dp).start();*/ //��������ˣ���Ϊ��ʹ�õĶ����ǰ�������㴴���Ķ����ֻ���ǰ���
		//�������̺߳͹˿��̶߳���ʹ�õİ��ӣ���������ʵ����ô�����̵߳����أ�
		/*Demo04BaoZi demo04BaoZi = new Demo04BaoZi();
		new Thread(demo04BaoZi)*///����Ҳ���и㶨   ���ʹ��ʵ�ֵķ�ʽʵ��
		Demo04BaoZi bz = new Demo04BaoZi();
		new Demo04Pu(bz).start();
		new Demo04Gu(bz).start();
		
	}
}
 