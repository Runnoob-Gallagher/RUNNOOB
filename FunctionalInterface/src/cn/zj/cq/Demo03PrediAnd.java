package cn.zj.cq;

import java.util.function.Predicate;

/*	Predicate�ӿ�����һ������and����ʾ���ҹ�ϵ ������ && �������������ж�����
	Դ���룺
		default Predicate<T> and (Predicate<? super T> other){
		Object.requireNonNull(other);
		return (t) -> test(t) && other.test(t);
	}
	*/
public class Demo03PrediAnd {
	public static boolean Judge(String str,Predicate<String> preA,Predicate<Integer> preB,int age) {
		return preA.test(str) && preB.test(age);
		//preA.and(preB);����������������������Ϊ���Ͳ�ͬ�����Բ���ʹ�á�����֪�����У�
	}
	public static void main(String[] args) {
		String stry = "Runnoob-Gallagher";
		int number = 12456;
	boolean b = Judge(stry, (String st) -> { 
				return st.contains("G");
			}, (Integer num)/* (int num) ���������Ű�װ��,Ҫô������*/ -> {  
				return  num > 500;
				}, number);
		System.out.println(b);
	}
}
