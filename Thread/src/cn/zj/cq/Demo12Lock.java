package cn.zj.cq;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

//����̰߳�ȫ�����������������ʹ��lock��
//java.util.concurrent.locks.ReentrantLock implements Lock;
/*Lock ʵ���ṩ�˱�ʹ�� synchronized ���������ɻ�õĸ��㷺��������������ʵ����������Ľṹ�����Ծ��в��ܴ�����ԣ�����֧�ֶ����ص� Condition ���� 

���ǿ��ƶ���̶߳Թ�����Դ���з��ʵĹ��ߡ�ͨ�������ṩ�˶Թ�����Դ�Ķ�ռ���ʡ�һ��ֻ����һ���̻߳�������Թ�����Դ�����з��ʶ���Ҫ���Ȼ������
*/
/*lock
public void lock()��ȡ���� 
�������û�б���һ���̱߳��֣����ȡ�������������أ������ı��ּ�������Ϊ 1�� 
�����ǰ�߳��Ѿ����ָ������򽫱��ּ����� 1�����Ҹ÷����������ء� 
�����������һ���̱߳��֣�������̵߳��ȵ�Ŀ�ģ����õ�ǰ�̣߳������ڻ����֮ǰ�����߳̽�һֱ��������״̬����ʱ�����ּ���������Ϊ 1��*/
/*unlock
public void unlock()��ͼ�ͷŴ����� 
�����ǰ�߳��Ǵ��������ߣ��򽫱��ּ����� 1��������ּ�������Ϊ 0�����ͷŸ����������ǰ�̲߳��Ǵ����ĳ����ߣ����׳� IllegalMonitorStateException�� 

*/


/*ʹ�ò���:
    1.�ڳ�Աλ�ô���һ��ReentrantLock����
    2.�ڿ��ܻ���ְ�ȫ����Ĵ���ǰ����Lock�ӿ��еķ���lock��ȡ��
    3.�ڿ��ܻ���ְ�ȫ����Ĵ�������Lock�ӿ��еķ���unlock�ͷ���*/
public class Demo12Lock implements Runnable {
	private int ticket = 100;
	Lock l = new ReentrantLock();
	@Override
	public void run() {
		
		// TODO Auto-generated method stub
		while(true) {
			
			l.lock();
			if(ticket > 0) {
				try {
					Thread.sleep(100);//Ϊʲô�߳����߻��ø�������
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				System.out.println(Thread.currentThread().getName() + " " + ticket);
				ticket--;
			}
			l.unlock();
		}
		
	}

}
