package cn.zj.cq;

public class Demo09MyThread {
	public static void main(String[] args) {
		Demo09ThreadProblem dp = new Demo09ThreadProblem();//���ﴴ����ʵ����ֻ����һ�������Ա�����Ʊֻ��100�š��������ʵ�����ṩ��
		Thread thA = new Thread(dp);
		Thread thB = new Thread(dp);
		Thread thC = new Thread(dp);
		thA.start();
		thB.start();
		//thC.start();
	}
}
