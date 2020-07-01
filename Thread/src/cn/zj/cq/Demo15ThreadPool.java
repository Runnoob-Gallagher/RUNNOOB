package cn.zj.cq;
//���demo����Ϥ�̳߳�---->���ɶ���̵߳����� ��������������
/*java.util.concurrent.ExecutorService ---->���̳߳صĽӿ�
static ExecutorService newFixedThreadPool(int nThreads) ---->����һ�������ù̶��߳������̳߳أ��Թ�����޽���з�ʽ��������Щ�̡߳�---->�������صľ����̳߳�
����ֵ��ExecutorService�ӿ�---->���ص��ǽӿ����͵�ʵ���࣬����ʹ��ExecutorService�ӿ�ȥ���գ�����ӿڱ�̣����������� 
	ExecutorService�ӿ����ṩ��һ������submit�����������̳߳��е��̣߳�����start()����ִ���߳�����
submit(Runnable task) 
�ύһ�� Runnable ��������ִ��
	�رպ������̳߳صķ���
			void shutdown() 
				����һ��˳��رգ�ִ����ǰ�ύ�����񣬵�������������
		ʵ�ֲ��裺
			1.ʹ���̳߳صĹ�����Executors���ṩ�ľ�̬����newFixedThreadPool����һ��ָ���߳��������̳߳�
			2.����һ���࣬ʵ��Runnable�ӿڣ���дrun�����������߳�����
			3.����ExecutorService�еķ���submit�������س�����ʵ���ࣩ�������̣߳�ִ��run����
			4.����ExecutorService�еķ���shutdown�����̳߳أ�*/

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Demo15ThreadPool {
	public static void main(String[] args) {
		ExecutorService es = Executors.newFixedThreadPool(3);
		Demo15Imp di = new Demo15Imp();
		es.submit(di);
		es.submit(di);
		es.submit(di);
		es.submit(di);
		es.submit(di);
//		��ǰ�߳��ǣ�pool-1-thread-1  //�̳߳ػ�һֱ���ţ�ʹ�����֮����Զ��黹�̣߳��߳̿��Լ���ʹ�ã�
//		��ǰ�߳��ǣ�pool-1-thread-2
//		��ǰ�߳��ǣ�pool-1-thread-1  //�黹�ˣ�
//		��ǰ�߳��ǣ�pool-1-thread-3
//		��ǰ�߳��ǣ�pool-1-thread-2  //Ϊʲô��ǰִ�н���������������Ǳ仯�� yi'zhi��123
	}
}
