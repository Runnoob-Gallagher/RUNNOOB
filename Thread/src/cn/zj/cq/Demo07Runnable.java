package cn.zj.cq;
//�ڶ��ַ���ʵ��Runnable�͵�һ�ּ̳�Thread������
/*	1.�����˵��̳еľ�����
		һ����ֻ����һ��ֱ�Ӹ��࣬�������̳���Thread����ô���Ͳ��ܼ̳��������ˣ�����
		��ʵ����Runnable�ӿڣ��ͻ����Լ̳�������
	2.��ǿ�˳������չ�ԣ������˳���������
		�ڴ���ʵ����Ķ����ʱ�򣬿��Ը��ݲ�ͬ��ʵ�������ȥ������ͬ���߳�����*/
public class Demo07Runnable implements Runnable {

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println(Thread.currentThread().getName());
	}
	
}
