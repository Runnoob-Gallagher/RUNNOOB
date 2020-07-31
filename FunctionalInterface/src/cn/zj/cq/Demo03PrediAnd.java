package cn.zj.cq;

import java.util.function.Predicate;

/*	Predicate接口中有一个方法and，表示并且关系 类似于 && 用于连接两个判断条件
	源代码：
		default Predicate<T> and (Predicate<? super T> other){
		Object.requireNonNull(other);
		return (t) -> test(t) && other.test(t);
	}
	*/
public class Demo03PrediAnd {
	public static boolean Judge(String str,Predicate<String> preA,Predicate<Integer> preB,int age) {
		return preA.test(str) && preB.test(age);
		//preA.and(preB);反正就是这样，我这里因为类型不同，所以不能使用。方法知道就行；
	}
	public static void main(String[] args) {
		String stry = "Runnoob-Gallagher";
		int number = 12456;
	boolean b = Judge(stry, (String st) -> { 
				return st.contains("G");
			}, (Integer num)/* (int num) 这里面必须放包装型,要么都不放*/ -> {  
				return  num > 500;
				}, number);
		System.out.println(b);
	}
}
