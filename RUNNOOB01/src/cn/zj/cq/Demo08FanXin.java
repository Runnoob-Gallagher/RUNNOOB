package cn.zj.cq;

import java.util.ArrayList;
import java.util.Iterator;

public class Demo08FanXin {
	public static void main(String[] args) {
		ArrayList<String> strA = new ArrayList<String>();
		strA.add("泛型通配符");
		strA.add("不能创建对象使用");
		strA.add("只能作为方法参数使用");
		ArrayList<Integer> strB = new ArrayList<Integer>();
		strB.add(777);
		strB.add(888);
		//这里我想使用方法将ArrayList集合中的对象打印出来，但是不论这个集合的类型是String还是Integer
		//使用Object应该能行？？ 下面调用这恶method方法试试
		Demo08FanXin df = new Demo08FanXin();
		//df.method(strB);自己看报错---->The method method(ArrayList<Object>) in the type Demo08FanXin is not applicable for the arguments (ArrayList<Integer>)
		df.method(strA); //当下面的参数列表为Integer时，就只能传入类型为Integer的参数了，这个时候使用通配符就能全部兼容了
		
	}
	public void method(ArrayList<?> strA) { //这里这个参数列表用来接收集合，开始不是写的静态方法
		Iterator<?> obj = strA.iterator();
		if(obj.hasNext()) {
			System.out.println(obj.next());
		}
	}
}
