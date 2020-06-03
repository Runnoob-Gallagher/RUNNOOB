package cn.zi.cq02;
//这个demo是熟悉含有泛型的方法
/*格式：
修饰符 <泛型> 返回值类型 方法名(参数列表(使用泛型)) {
	方法体;
}*/
//和之前含有泛型的类一样，之前是在创建对象时来确定泛型的类型，这个是在调用方法时来确定泛型的类型
public class Demo03FanXinMethod {
	public <M> void methodA(M m) {
		System.out.println(m);
	}
	public static <S> void methodB(S s) {
		System.out.println(s);
	}
}
