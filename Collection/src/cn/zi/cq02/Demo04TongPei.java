package cn.zi.cq02;
//这个demo用以熟悉泛型通配符
/*    ？ extends Number ----> 表示？这个必须为Number本身或者Number的子类--Integer
                  ？ super String ---->表示？这个必须为String本身或者String的父类--Object*/
import java.util.ArrayList;
import java.util.Iterator;

public class Demo04TongPei {
	public static void main(String[] args) {
		ArrayList<String> as = new ArrayList<String>();
		as.add("只能是String");
		ArrayList<Integer> ai = new ArrayList<Integer>();
		ai.add(999);
		ArrayList<Number> an = new ArrayList<Number>();
		an.add(888.888);
		ArrayList<Object> ao = new ArrayList<Object>();
		ao.add("String");
		ao.add(666);
		ao.add(true);
		
		methodA(as);
		methodA(ai);
		methodA(an);
		methodA(ao);
		
		methodB(as);
		methodB(ai);
		methodB(an);
		methodB(ao);
		
		methodC(as);
		methodC(ai);
		methodC(an);
		methodC(ao);
		
		methodD(as);
		methodD(ai);
		methodD(an);
		methodD(ao);
		
		methodE(as);
		methodE(ai);
		methodE(an);
		methodE(ao);
		
		methodF(as);
		methodF(ai);
		methodF(an);
		methodF(ao);
}
	public static void methodA(ArrayList<? extends String> as) {
		Iterator<?> it = as.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
	}
	public static void methodB(ArrayList<? extends Number> as) {
		Iterator<?> it = as.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
	}
	public static void methodC(ArrayList<? extends Object> as) {
		Iterator<?> it = as.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
	}
	public static void methodD(ArrayList<? super String> as) {
		Iterator<?> it = as.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
	}
	public static void methodE(ArrayList<? super Number> as) {
		Iterator<?> it = as.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
	}
	public static void methodF(ArrayList<? super Object> as) {
		Iterator<?> it = as.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
	}
}
