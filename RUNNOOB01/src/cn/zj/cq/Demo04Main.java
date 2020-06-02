package cn.zj.cq;

public class Demo04Main {
	public static void main(String[] args) {
		Demo04FanxinMethod df = new Demo04FanxinMethod();
		//你传递什么类型他就是什么类型
		df.method("这是String类型");
		df.method('A');
		df.method(5);
		df.method(true);
		
		Demo04FanxinMethod.jump("传递String");
	}
}
