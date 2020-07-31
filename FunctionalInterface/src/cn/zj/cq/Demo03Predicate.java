package cn.zj.cq;

import java.util.function.Predicate;

import Test.Test;

/*java.util.function.Predicate<T>接口
作用：对某种数据类型的数据进行判断，结果返回一个boolean值；  注意是对数据进行判断，比如长度呀，大小呀，不仅仅是数据的类型

Predicate接口中包含一个抽象方法：
	boolean test(T t):用来对指定数据类型的数据进行判断*/
	
//还有 Or 和  negate  分表表示或  取反
public class Demo03Predicate {
	public static boolean Judge(String s,Predicate<String> pre) {
		return pre.test(s);
	}
	public static void main(String[] args) {
		String str ="Runnoob-Gallagher";
		Boolean boo = Judge(str, new Predicate<String>() {

			@Override
			public boolean test(String str) {
				// TODO Auto-generated method stub
				return str.length() > 16;
			}
		}); 
		//System.out.println(boo);
		Boolean bool = Judge(str,(String s) -> {
			return s.length()>25;
		});
		System.out.println(bool);
	}
}
 