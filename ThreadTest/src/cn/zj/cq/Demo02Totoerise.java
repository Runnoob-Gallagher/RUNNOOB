package cn.zj.cq;

public class Demo02Totoerise implements Runnable{
	private static String winner ;
	@Override
	public void run() {
		// TODO Auto-generated method stub
		for(int i=0;i<=20;i++){
			boolean flag = Over(i);
				if(flag ) { 
					break;
				}  
				System.out.println("��ǰ��" + Thread.currentThread().getName()+"����"+i+"��");

		}
		
	}
	public boolean Over(int steps) {
		if(winner != null) {//˵���Ѿ�����ʤ�����ˣ����ȡ���˻���������߳�ͬʱд��winner��˭��������ǵ�����winner��ֹͣ
			return true;
		}else { 
			if(steps >= 20) {
				winner = Thread.currentThread().getName();
				System.out.println("winner����" + winner);
				 return true; 
			}{
				return false;
			}
		}
	}
	public static void main(String[] args) {
		Demo02Totoerise dt = new Demo02Totoerise();
		new Thread(dt, "����").start();
		new Thread(dt, "�ڹ�").start();
	}
}
