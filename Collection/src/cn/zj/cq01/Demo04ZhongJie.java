package cn.zj.cq01;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;

public class Demo04ZhongJie {
	public static void main(String[] args) {
		Collection collA = new ArrayList<>();
		collA.add("第一章");
		collA.add("第二章");
		collA.add("第三章");
		collA.add("第四章");
		System.out.println(collA);
		Collection collB = new HashSet<>();
		collB.add("第一节");
		collB.add("第二节"); 
		collB.add("第三节");
		collA.addAll(collB);
		System.out.println(collA);
	}
}
