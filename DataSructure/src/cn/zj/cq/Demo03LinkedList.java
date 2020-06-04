package cn.zj.cq;

import java.util.LinkedList;
import java.util.List;

//这个demo是用以测试LinkedList集合----》LinkedList集合不能使用多态！！！！！！,但是我就是使用多态了？？？？？？？
/*java.util.LinkedList集合 implements list接口
LinkedList集合特点：
1.底层是一个链表结构：查询满，增删快
2.包含大量首位元素的方法
public void addFirst(E e):将指定元素插入列表开头
public void addLast(E e):将指定元素添加到此列表的结尾
public void push(E e):将元素此列表所表示的堆栈
public E getFirst():返回此列表的第一个元素
public E removeFirst():移除并返回此列表的第一个元素
public E removeLast():移除并返回此列表的最后一个元素
public E pop():从此列表所表示的堆栈处弹出一个元素
public boolean isEmpty():如果列表不包含元素，则返回true*/
public class Demo03LinkedList {
	public static void main(String[] args) {
		List<String> list = new LinkedList<String>();
		List listA = new LinkedList();
		list.add("英语");
		list.add("美术");
		list.add("数学");
		list.add("物理");
		System.out.println(list);
		LinkedList<String> ll = (LinkedList) list;
		ll.addFirst("体育");
		System.out.println(list);
		ll.addLast("计算机");
		System.out.println(list);
		Boolean b = ll.isEmpty();
		System.out.println(b);
		ll.push("心理健康");
		System.out.println(list);
		ll.pop();
		System.out.println(ll);
		String aa = ll.getFirst();
		String bb = ll.getLast();
		System.out.println(aa +" " + bb);
		}
		
}









