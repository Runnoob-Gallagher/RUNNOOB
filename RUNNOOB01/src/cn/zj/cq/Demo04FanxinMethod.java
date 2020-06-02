package cn.zj.cq;
//定义含有泛型的方法
/*格式：
	修饰符 <泛型> 返回值类型 方法名(参数列表(泛型类型)) {
		方法体;
	}
	再进行方法调用的时候，根据传入的参数类型来确定泛型类型*/
public class Demo04FanxinMethod {
	public <E> void method(E e) {
		System.out.println(e);
	}
	
	//定义含有泛型的静态方法
	public static <M> void jump(M m) {
		System.out.println(m);
	}
} 
