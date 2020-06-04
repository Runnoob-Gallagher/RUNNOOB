package cn.zi.cq02;
//这个demo是熟悉含有泛型的方法
/*格式：
修饰符 <泛型> 返回值类型 方法名(参数列表(使用泛型)) {  //泛型类型必须在返回值类型前面
	方法体;
}*/
//和之前含有泛型的类一样，之前是在创建对象时来确定泛型的类型，这个是在调用方法时来确定泛型的类型
public class Demo03FanXinMethod {
	public  <M> void methodA(M m) {
		System.out.println(m);
	}
	//定义一个指定类型的泛型 
	public <String> void methodC(String str) {
		System.out.println(str);
	}
	public static <S> void methodB(S s) {
		System.out.println(s);
	}
}
