package cn.zj.cq;
//���demo���޸��̵߳�����
/*	��ʽһ��
 * 	API��void setName(String name) 
				�ı��߳����ƣ�ʹ֮����� name ��ͬ�� */
/*��ʽ���� 
	�����������Ĺ��췽����
	API��Thread(String name) 
    		�����µ� Thread ����*/
public class Demo04ChangeThread extends Thread{
	@Override
	public void run() {
		// TODO Auto-generated method stub
		//System.out.println(currentThread().getName());//������һ���߳�---->Thread-0
	}
	
	public Demo04ChangeThread(String name) {//����һ�����εĹ��췽��
		super(name);//������Ҫ--->���ø�����ι��췽�������س����ƴ��ݸ����࣬�ø��ࣨThread�������߳���һ������
	}//����ĵ��ø��๹�췽�������ͬ���Ϳ��Լ�д�Ĳ���
}
