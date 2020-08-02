package DemoStream;

import java.util.ArrayList;
import java.util.List;

/*
 * IO流主要用于读写，Stream用于对集合和数组进行简化操作，将集合或数组转化为Stream流，然后使用流中的方法对数据进行操作
 * Pipelining--流水线、管道     中间的多个操作视为一个管道，每一步的中间操作都会返回流对象本身，
 * 内部迭代：之前的集合遍历都是通过迭代器Iterator或者增加for显示的在集合外部进行迭代。Stream流提供内部迭代的方式，通过流直接遍历方法
 * 三个基本步骤：
 * 		1.获取一个数据源Source
 * 		2.数据转换--->转换为Stream流
 * 		3.执行操作获取想要的结果
 */
public class Demo01Stream {
	public static void main(String[] args) {
		List<String> list = new ArrayList();
		list.add("杨洁");
		list.add("杨洁篪");
		list.add("刘佩佩");
		list.add("黄玉虹");
		list.add("杨柳");
		list.add("黄钰棋");
		//对集合进行过滤，然后存储到新集合
		list.stream().filter((name) -> {return name.startsWith("杨");})  //等效于 name.startsWith("杨")  同下面
		.filter((name) -> name.length()== 2)
		.forEach((name) -> System.out.println(name));
	}
		
}
