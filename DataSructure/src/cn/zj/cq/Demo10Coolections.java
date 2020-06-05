package cn.zj.cq;

import java.util.ArrayList;
import java.util.Collections;

//这个demo是说明java.utils.collections的方法---->是集合工具类，用来对集合进行操作
/*方法： 
public static <T> boolean addAll(Collection<T> c, T... elements):往集合添加一些元素。
public static void shuffle(List<?> list)打乱顺序：打乱集合顺序
public static <T> void sort (List<T> list) :将集合中的元素那默认排序
public static <T> void sort(List<T> list,Com parator<? super T>):将集合元素按指定规则排序*/
public class Demo10Coolections {
	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<String>();
		list.add("天空");
		list.add("大海");
		list.add("森林");
		list.add("湖泊");
		System.out.println(list);
		Collections.addAll(list, "男人","女人");
		System.out.println(list);
		Collections.shuffle(list);
		System.out.println(list);
		Collections.sort(list);
		System.out.println(list);
		//Collections.sort(list, c);
	}
}
