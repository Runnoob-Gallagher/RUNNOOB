package cn.zj.cq;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class Demo09FanXin {
	public static void main(String[] args) {
		ArrayList<Integer> arrayA = new ArrayList<Integer>();
		ArrayList<Number> araryB = new ArrayList<Number>();
		ArrayList<Object> arrayC = new ArrayList<Object>();
		ArrayList<String> arrayD = new ArrayList<String>();
		methodA(arrayA);
		methodA(araryB);
	//	methodA(arrayC);
	//	methodA(arrayD);
		
	//根据这个报错去解释	
		
	//	methodB(arrayA);
	//	methodB(araryB);
		methodB(arrayC);
		methodB(arrayD);
	}
	public static void methodA(Collection<? extends Number> arrA) {
		Iterator<?> it = arrA.iterator();
		if(it.hasNext()) {
			System.out.println(it.next());
		}
			}
	public static void methodB(Collection<? super String> arrB) {
		Iterator<?> it = arrB.iterator();
		if(it.hasNext()) {
			System.out.println(it.next());
		}
	}
}
