package cn.zj.cq;

public class Demo03Main {
	public static void main(String[] args) {
		Demo03 demo = new Demo03();
		demo.setname('A');
		Object ch = demo.getname(); //��д����Ĭ��ΪObject����
		System.out.println(ch);
		//��������ʱʹ�÷���
		Demo03<Integer> di = new Demo03();
		//di.setname("����Ǵ����"); ����ᱨ����Ϊ���趨�ķ���������Integer��ֻ�ܷ���Integer���ͣ�����������
		di.setname(1);
		di.setname(44);
		Integer it = di.getname();
		System.out.println(it);
		
	}
}
