package cn.zj.cq;

import java.util.ArrayList;
import java.util.Collection;

public class Demo02ToArray {
	public static void main(String[] args) {
		Collection<String> collA = new ArrayList<String>();
		collA.add("���ĸ�");
		collA.add("���ϰ�");
		collA.add("���");
		collA.add("������");
		collA.add("�Ź㽨");
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
