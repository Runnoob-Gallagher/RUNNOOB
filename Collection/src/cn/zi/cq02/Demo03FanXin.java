package cn.zi.cq02;

public class Demo03FanXin {
	public static void main(String[] args) {
		Demo03FanXinMethod df = new Demo03FanXinMethod();
		df.methodA(6);
		df.methodA("String");
		df.methodA('A');
		
		System.out.println("========");
		
		df.methodB(999);
		df.methodB("String");
		df.methodB(true);
		
		//�����ҿ�ʼʹ�õ�����ʱDemo03FanXin�������ǲ��Եģ���Ϊ��̬�����������������
		Demo03FanXinMethod.methodB(666);
		Demo03FanXinMethod.methodB("String");
		Demo03FanXinMethod.methodB(false);
		
		//���ܲ��ܴ��������Ķ���ȥ�����أ������ǲ��ܣ���û�й�ϵ??? ȷʵ���ܣ�����û�й�ϵ
		Demo03FanXin dx = new Demo03FanXin();
		//dx. ֻ�ܵ����Լ�������������ʲô����
	}
	
}
