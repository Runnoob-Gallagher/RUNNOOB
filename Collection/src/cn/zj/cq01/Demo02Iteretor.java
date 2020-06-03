package cn.zj.cq01;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

//这个demo是用来熟悉迭代器(Iterator)，有疑问
//迭代器是用来取出集合中的方法的，for循环依赖索引在这里是不行的，且迭代器不论集合里面的元素类型
public class Demo02Iteretor {
	public static void main(String[] args) {
		Collection<String> collA = new ArrayList<String>();
		collA.add("苹果");
		collA.add("华为");
		collA.add("VIVO");
		collA.add("小米");
		System.out.println(collA);
//迭代器Iterator	源码：Iterator<E> iterator();
		/*
		 * Iterator是一个接口，不能直接使用，需要用Iterator的实现类对象去调用使用：
		 * api: Iterator<E> iterator() 返回在此 collection 的元素上进行迭代的迭代器 
		 * 调用方法：使用Collection调用iterator方法返回Iterator的实现类对象：示例如下：
		 */
//体现了多态            接口                                =        实现类
		Iterator<String> it = collA.iterator();
		/* ??????????   这个是怎么实现的？？？？？？
		 * 迭代器中的for循环： for(Iterator<String> it2 = collA.iterator();it.hasNext();) {
		 * System.out.println(it2.next()); }
		 */
		/*
		 * while(it.hasNext()) { System.out.print(it.next()); }
		 */    //这一段不注释的话，下面就会报错NoSuchElementException，因为已经移到最后一个元素了？？
		boolean A = it.hasNext();
		System.out.println(A);
		String B = it.next();
		System.out.println(B);
	}
	
}
