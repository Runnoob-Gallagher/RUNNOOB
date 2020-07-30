package cn.zj.cq;

import java.util.function.Supplier;

/*Supplier为函数式接口：
	java.util.function.Supplier<T>接口仅包含一个无参的方法：T get() 用来获取一个泛型参数指定类型的对象数据。
	Supplier<T>接口称为生产型接口，指定接口的泛型是什么类型，那么接口中的get方法就会生产什么类型的数据*/
public class Demo01Supplier {
	public static String GetSomething(Supplier<String> sup) {
		return sup.get();
	}
	public static void main(String[] args) {
		String s =GetSomething(() -> "函数式接口，且无参数");  //这里的返回值类型就是泛型定义的类型
		System.out.println(s);
	}
}
