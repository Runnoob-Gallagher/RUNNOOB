package cn.zj.cq;
//���demo��Ϊ�����̵��߳�  ��Ҫ�õ�baozi�������ʹ��ʵ��Runnable�ӿڵķ�ʽ
public class Demo04Pu extends Thread {
	private  Demo04BaoZi bz;
	public  Demo04Pu(Demo04BaoZi bz) {//ע�����ǹ��������������вεġ����������ڳ�ʼ������
		// TODO Auto-generated constructor stub
		this.bz=bz;
	}
	@Override
	public void run() {
		int count = 0;
		while(true) { 
			synchronized (bz) {//ʹ���߳�ͬ��synchronized
				// TODO Auto-generated method stub
				if(bz.flag) {//����Ϊ��˵���а��ӣ���ô�������߳̾͵ȴ���ע�����������ڰ������߳��£�������
					System.out.println("����Ϊ��˵���а��ӣ���ô�������߳̾͵ȴ�");
					try {
						bz.wait();
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}else if(bz.flag==false) {//����û���ӣ���ô�������߳̿�ʼ��������
					System.out.println("����û���ӣ���ô�������߳̿�ʼ��������");
					try {
						Thread.sleep(5000);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					if(count%2==0) {
						bz.P = "������";
						bz.X = "��";
						System.out.println("�����������"+bz.P+bz.X+"�İ���");
					}else if(count%2==1){
						bz.P = "Բ��";
						bz.X = "��";
						System.out.println("�����������"+bz.P+bz.X+"�İ���");
					}
					count++;
				}
				System.out.println("����������");
				bz.flag = true;//�������Ѿ����ð�����
				System.out.println("���ﲻӦ�û��ѹ˿ͳ԰��ӣ�Ӧ��ֹͣ�������߳��������ӣ����濪ʼֹͣ�������̡߳�����");
				System.out.println("�������Ѿ�ֹͣ");
				try {
					bz.wait();//��������߳��Ѿ�ֹͣ�ˣ�����Ͳ�ִ�У�������
								} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				//System.out.println("�������Ѿ�ֹͣ");
			}
		}
		
	}
	
	
}
