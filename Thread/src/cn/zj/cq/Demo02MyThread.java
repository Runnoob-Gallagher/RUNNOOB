package cn.zj.cq;
//����һ��Thread������
public class Demo02MyThread extends Thread {
	@Override
	public void run() {
		// TODO Auto-generated method stub
		for(int i=0;i< 10;i++) {
			System.out.println("run" + i);
		}
	}
}
