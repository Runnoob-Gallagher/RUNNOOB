package cn.zj.cq;
//�����̵߳ĵڶ��ַ�ʽ�������̵߳���һ�ַ���������ʵ�� Runnable �ӿڵ��ࡣ����Ȼ��ʵ�� run ������
//Ȼ����Է�������ʵ�����ڴ��� Thread ʱ��Ϊһ�����������ݲ��������������ַ���ͬһ������
/*class PrimeRun implements Runnable {
    long minPrime;
    PrimeRun(long minPrime) {
        this.minPrime = minPrime;
    }

    public void run() {
        // compute primes larger than minPrime
         . . .
    }
}

--------------------------------------------------------------------------------

Ȼ�����д���ᴴ��������һ���̣߳� 


PrimeRun p = new PrimeRun(143);
new Thread(p).start();*/

/*���裺
	1.����һ��Runnable�ӿڵ�ʵ����
	2.��ʵ��������дRunnable�ӿ��е��󷽷��������߳�����
	3.����һ��Runnable�ӿڵ�ʵ�������
	4.����Thread���󣬹��췽���д���Runnable�ӿڵ�ʵ�������   ---->��Ҫ��������
	5.����Thread���е�start�����������µ��߳�ִ��run����*/
public class Demo06Runnable {
	public static void main(String[] args) {
				Demo06RunnableImp diA = new Demo06RunnableImp();
				Thread th = new Thread(diA);
				th.start();
				for(int i = 0; i< 5; i++) {
					System.out.println("main" + i);
				}
	}	
}	
