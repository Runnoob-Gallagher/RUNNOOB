package cn.zj.cq;
//�������̵߳ĵ�һ�ַ�ʽ������thread�������
/*java.lang.Thread��:�������̵߳��࣬Ҫʵ�ֶ��̳߳���ͱ���ʱ��Thread��
���裺
1.����һ��Thread�������
2.��Thread�����������дrun�����������߳�����
3.����Thread����������
4.����Thread���еķ���start�����������µ��̣߳�ִ��run����
	void start() ʹ�߳̿�ʼִ�У�java����������̵߳�run������--->����ĵ���start��Ϊ��������ִ����run��������Ϊ���Ὺ��һ���µ��߳�
	������������̲߳��������У����̣߳�main�̣߳�����һ���̣߳������µ��г̣�ִ��run������
	�������һ���߳��ǷǷ���---->java.lang.IllegalThreadStateException ��21��   �ر�ǰ�߳��Ѿ�����ִ�к󣬲�����������*/
//java����ռʽ��
public class Demo02Thread {
	public static void main(String[] args) {
		//����ע���ˣ�����ҽ�ѭ������ǰ�������Լ���˳��ִ���ˡ����Ƕ��߳���ǰ�棬���ͻ���߳�
		Demo02MyThread dm = new Demo02MyThread();
		dm.start();
		for(int i = 0;i<10;i++) {
			System.out.println("main" + i);
		}
		dm.start();
	}
}
