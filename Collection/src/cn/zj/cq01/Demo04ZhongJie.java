package cn.zj.cq01;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;

public class Demo04ZhongJie {
	public static void main(String[] args) {
		Collection collA = new ArrayList<>();
		collA.add("��һ��");
		collA.add("�ڶ���");
		collA.add("������");
		collA.add("������");
		System.out.println(collA);
		Collection collB = new HashSet<>();
		collB.add("��һ��");
		collB.add("�ڶ���"); 
		collB.add("������");
		collA.addAll(collB);
		System.out.println(collA);
	}
}
