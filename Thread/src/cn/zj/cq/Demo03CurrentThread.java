package cn.zj.cq;
//���demo�����Ի�ȡ��ǰ���߳���
public class Demo03CurrentThread extends Thread{
	@Override 
	public void run() {
		// TODO Auto-generated method stub
		/*
		 * Thread thA = currentThread(); 
		 * System.out.println(thA);
		 * System.out.println(thA.getName());
		 *///�⼸�ŵ�ͬ�����漸��
	System.out.println(new Thread().currentThread().getName());//������Ȼд��������ȡThread���ֵķ�����������ʾ�Ļ���Thread0
	//��Ϊ���Ǳ�ֻ������һ���̣߳�
	//ǰ��д�������߳����ڵó��������---->Thread-0  Thread-1

	}
	
}
