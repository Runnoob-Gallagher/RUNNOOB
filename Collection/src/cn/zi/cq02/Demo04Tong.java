package cn.zi.cq02;

import java.util.ArrayList;
import java.util.Iterator;

//这个demo是用以熟悉泛型通配符的
/*泛型通配符只能作为方法的参数使用，不能用于创建对象使用
？ 代表任意类型*/
public class Demo04Tong {
	public static void main(String[] args) {
		ArrayList<String> al = new ArrayList<String>();
		al.add("String");
		al.add("How");
		ArrayList<Integer> ai = new ArrayList<Integer>();
		ai.add(666);
		ai.add(999);
		Demo04Tong dt = new Demo04Tong();
	
		
		methodE(ai);
		methodE(al); 
		
	}

	public static void methodE(ArrayList<?> ae) {//这里用了泛型通配符表示可以表示任意类型，你在方法中指定的泛型类型
		Iterator<?> it = ae.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
	}
}
