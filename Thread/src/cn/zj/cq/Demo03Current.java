package cn.zj.cq;

/*��ȡ�̵߳�����
	1.ʹ��Thread���еķ���getName();
		String getName() ���ظ��̵߳�����
	2.���Ի�ȡ��ǰ����ִ�е��̣߳�ʹ���߳��еķ�����ȡ�ֳɵ�����
		static Thread currentThread() ���ضԵ�ǰ����ִ�е��̶߳�������á�*/
import java.io.ObjectInputStream.GetField;

public class Demo03Current {
	public static void main(String[] args) {
		Demo03CurrentThread dmA = new Demo03CurrentThread();
		dmA.start();
		new Demo03CurrentThread().start();
}
}
