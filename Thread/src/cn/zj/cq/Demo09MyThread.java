package cn.zj.cq;

public class Demo09MyThread {
	public static void main(String[] args) {
		Demo09ThreadProblem dp = new Demo09ThreadProblem();//���ﴴ����ʵ����ֻ����һ�������Ա�����Ʊֻ��100�š��������ʵ�����ṩ��
		Thread thA = new Thread(dp);
		Thread thB = new Thread(dp);
		Thread thC = new Thread(dp);
		thA.start();
		thB.start();
		thC.start();
	}
}

//��Ʊ�����ظ���Ʊ�͸�����Ʊ   �Լ���ͼ���
/*
 * Thread-2���ڵ�Ʊ��100 
 * Thread-0���ڵ�Ʊ��100
 * 
 * Thread-1���ڵ�Ʊ��1 
 * Thread-2���ڵ�Ʊ��0 
 * Thread-0���ڵ�Ʊ��-1
 */