package cn.zj.cq;

import java.util.function.Function;

/*java.util.function<T,R>接口用来根据一个类型的数据得到另一个类型的数据，
前者称为前置条件，后者称为后置条件。
function接口中最主要的抽象方法为： R apply(T t),根据类型T的参数获取类型R的结果。
例如将String类型转换为Integer类型。*/
public class Demo04Function {
	/*
	 * 定义一个方法 参数传递一个Function接口，泛型使用<String,Intege>
	 * 使用Function接口中的方法apply，把字符型的整数转换为Integer类型；
	 */
	public static void methodA(String stry,Function<String, Integer> fun) {
		fun.apply(stry);
	}
	public static void main(String[] args) {
		String number = "7489757";
		methodA(number, new Function<String, Integer>() {

			@Override
			public Integer apply(String t) {
				// TODO Auto-generated method stub
				return null;
			}
		});
		methodA(number,(num) -> {
			return Integer.parseInt(num); //其实这个我有点不懂，我既然都这么写了  我还要你这个函数式接口干嘛
		});
	}
}
