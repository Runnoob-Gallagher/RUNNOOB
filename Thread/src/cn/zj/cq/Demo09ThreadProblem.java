package cn.zj.cq;
//�����demo���ȥ�ǣ�

/*Thread-2���ڵ�Ʊ��1
Thread-3���ڵ�Ʊ��0---------->�����������ʾ�����и��Ⱥ�ѭ��ġ������ӡ�Ķ���һ���Ļ�����˵������ͬʱ��ӡ��仰
Thread-4���ڵ�Ʊ��-1
*/

/*Ϊʲô�أ������������ǣ��������߳�t2��t3��t4һ������CPU��Դ����ִ�е���if��������ע����仰����ִ�е���if����
����sleep����ִ�����ߡ�t2��t3��t4�����ߣ�
��t2�����ѣ�ִ�д�ӡ���--->���ڵ�Ʊ��1��Ȼ��ִ��--������ticket������0���ٵ�if����ж�ʧ�ܣ�ִֹͣ�У�
Ȼ��t3���ѣ�ִ�д�ӡ���--->���ڵ�Ʊ��0��Ȼ��ִ��--������ticket������-1���ٵ�if������ж�ʧ�ܣ�ִֹͣ�У�
Ȼ��t4���ѣ�ִ�д�ӡ���--->���ڵ�Ʊ��-1��Ȼ��ִ��--������ticket������-2���ٵ�if������ж�ʱ����ִֹͣ�У�*/

//z�����ҵ������� Ϊʲôֱ�ӽ��뵽��if�����ˣ�����
public class Demo09ThreadProblem implements Runnable{
	private int ticket = 1;
	@Override
	public void run() {
		// TODO Auto-generated method stub
		while(true) {
			if(ticket > 0) {
				try {
					Thread.sleep(100);//���߳�˯��Ϊʲô�������ظ�ִ�еĸ���
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				System.out.println(Thread.currentThread().getName() + "���ڵ�Ʊ��" + ticket);
				ticket--;
			}
		}
	}

}
