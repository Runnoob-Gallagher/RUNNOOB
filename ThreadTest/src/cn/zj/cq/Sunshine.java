package cn.zj.cq;

public class Sunshine extends Thread {//�̳�Thread�ഴ���߳�
	private Electric e;//����һ����Ķ�����Ϊ������
	 public Sunshine(Electric e) {
		// TODO Auto-generated constructor stub
		this.e = e;
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		synchronized (e) { 
			if(e.flag == false) {
				System.out.println("û�е磬��׼������̫��");
				e.notify();
				System.out.println("û�е磬���Ѿ�������̫��");
			}else if(e.flag = true) {
				System.out.println("��ǰ���е�ģ����Ҿ�ҪϨ��̫��");
				try {
					e.wait();
				} catch (InterruptedException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
			
		}

		}
	
}
