package cn.zj.cq;

public class Demo04Main {
	public static void main(String[] args) {
		Demo04FanxinMethod df = new Demo04FanxinMethod();
		//�㴫��ʲô����������ʲô����
		df.method("����String����");
		df.method('A');
		df.method(5);
		df.method(true);
		
		Demo04FanxinMethod.jump("����String");
	}
}
