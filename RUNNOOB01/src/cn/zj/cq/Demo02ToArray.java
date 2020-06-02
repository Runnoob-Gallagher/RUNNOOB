package cn.zj.cq;

import java.util.ArrayList;
import java.util.Collection;

public class Demo02ToArray {
	public static void main(String[] args) {
		Collection<String> collA = new ArrayList<String>();
		collA.add("李文富");
		collA.add("熊老板");
		collA.add("杨洁");
		collA.add("李晓飞");
		collA.add("张广建");
		Object[] arrayA =  collA.toArray();
		for(int i = 0; i < arrayA.length; i++) {
			System.out.println(arrayA[i]);
		}
		String[] arrayC = new String[7];
		String[] arrayD = collA.toArray(arrayC);
		for(int i = 0; i < arrayD.length; i++) {
			System.out.print(arrayD[i] + " ");
		}
	}
}
