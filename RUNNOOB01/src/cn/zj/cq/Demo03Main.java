package cn.zj.cq;

public class Demo03Main {
	public static void main(String[] args) {
		Demo03 demo = new Demo03();
		demo.setname('A');
		Object ch = demo.getname(); //不写泛型默认为Object类型
		System.out.println(ch);
		//创建对象时使用泛型
		Demo03<Integer> di = new Demo03();
		//di.setname("这个是错误的"); 这里会报错，因为你设定的泛型类型是Integer，只能放入Integer类型，或者其子类
		di.setname(1);
		di.setname(44);
		Integer it = di.getname();
		System.out.println(it);
		
	}
}
