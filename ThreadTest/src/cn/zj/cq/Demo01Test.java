package cn.zj.cq;

/*�����࣬��main������������
�������Ӷ���
�����������߳�
�����˿��̣߳��԰���*/
public class Demo01Test {
	public static void main(String[] args) {
		Demo01BaoZi dpz = new Demo01BaoZi();
		//�����������߳���������
		new Demo01BaoZiPu(dpz).start();
		//�����Ի��̳߳԰���
		new Demo01Guke(dpz).start();
	}
}
