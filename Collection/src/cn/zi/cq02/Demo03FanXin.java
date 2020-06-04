package cn.zi.cq02;

public class Demo03FanXin {
	public static void main(String[] args) {
		Demo03FanXinMethod df = new Demo03FanXinMethod();
		df.methodA(6);
		df.methodA("String");
		df.methodA('A');
		 
		System.out.println("========");
		
		df.methodB(999);
		df.methodB("啥子类型都可以");
		df.methodB(true);
		
		System.out.println("===========");
		df.methodC("这个方法只能说是String类型");
		//这里我开始使用的类名时Demo03FanXin。这样是不对的，因为静态方法并不在这个类下
		Demo03FanXinMethod.methodB(666);
		Demo03FanXinMethod.methodB("String");
		Demo03FanXinMethod.methodB(false);
		
		//我能不能创建这个类的对象去调用呢，想来是不能，又没有关系??? 确实不能，两者没有关系
		Demo03FanXin dx = new Demo03FanXin();
		//dx. 只能调用自己的主方法，有什么用呢
	}
	
}
