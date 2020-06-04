package cn.zi.cq02;
//这个demo是用来测试适用泛型的好处及缺点：指定类型就不会出现转换异常
import java.util.ArrayList;
import java.util.Iterator;

public class Demo01FanXin {
	public static void main(String[] args) {
		ArrayList arrA = new ArrayList();//当不适用泛型的时候，类型为Object
		arrA.add("这是String类型");
		arrA.add(5);
		arrA.add(true); 
		for(Object obj:arrA) {
			System.out.println(obj);
		}
		Iterator<String> it = arrA.iterator();
		while(it.hasNext()) {
			Object obj = it.next();
			//当使用向下转型的时候：会出现类型转换异常
			String strA = (String) obj;
			System.out.println(strA.length());//Exception in thread "main" java.lang.ClassCastException: java.lang.Integer cannot be cast to java.lang.String
		}
		
	}
}
