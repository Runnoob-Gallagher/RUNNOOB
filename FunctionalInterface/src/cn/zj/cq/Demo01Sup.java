package cn.zj.cq;

import java.util.function.Supplier;

/*	求数组元素的最大值
	使用Supplier接口作为方法参数类型，通过Lambda表达式求出int数组的最大值
	*/
public class Demo01Sup {
	public static int GetMax(Supplier<Integer> sup) {
		return sup.get();
	}
	public static void main(String[] args) {
		int[] arryA = {11,33,22,55,77,66};
		int answer = GetMax(() -> {
			int Max= arryA[0] ; 
		for(int i=0;i<arryA.length;i++) {//这里也可以使用foreach
			if(arryA[i] > Max ) {
				Max = arryA[i];
			}
		}
		return Max; //这里为什么要用return呢，因为Supplier是一个函数式接口，返回泛型中的类型。这部分都是在GetMax方法中的。
		});
		System.out.println(answer);
	}
	
} 
