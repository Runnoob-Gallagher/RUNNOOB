package cn.zj.cq;
//ͬ�ϣ�����˿��̻߳���Ҫʹ�ð��Ӷ��󣬽��м����ͻ��⻽�Ѽ�˯��
public class Demo04Gu extends Thread{
	private  Demo04BaoZi bz;
	public Demo04Gu(Demo04BaoZi bz) {//ͬǰ���
		// TODO Auto-generated constructor stub
		this.bz=bz; 
	} 
	@Override
	public void run() {
		while(true) {
			synchronized (bz) {
				// TODO Auto-generated method stub
				if(bz.flag == false) {
					System.out.println("�˿ͷ���û����");
					try {
						bz.wait();//�˿��̵߳ȴ�
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}else{
					bz.notify();//���﻽�ѹ˿��߳�
					System.out.println("�Ѿ����ѣ��˿ͳ԰���");
					try {
						Thread.sleep(10000);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					System.out.println("�˿ͳ������");
					bz.flag=false;
					System.out.println("����û������");
				}
			}
		}
		
		}

}
