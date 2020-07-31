package cn.zj.cq;

import java.util.function.Predicate;
//
public class Demo03PrediOr {
	public static boolean Judging(String stryA,Predicate<String> preA,Predicate<String> preB,String stryB ) {
		//return preA.test(stryA) || preB.test(stryB);
		return preA.or(preB).test(stryB) || preA.or(preB).test(stryA);
	}
	public static void main(String[] args) {
		String strA = "Good Good Study,";
		String strB = "Day Day Up.";
		boolean b = Judging(strA, (String sryA) ->{
			return sryA.contains("G");
		}, (String sryB) ->{
			return sryB.length()>10;
		}, strB);
		System.out.println(b);
	}
}
