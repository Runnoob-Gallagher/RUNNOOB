package DemoStream;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.stream.Stream;

/*
 * 方法一：
 * Interface Collection<E>  作为Stream流的最顶层接口
 * default Stream<E> stream​() 是Collection集合的默认方法，所有的Collection集合都可以使用这个方法
 * 返回一个序列Stream与此集合作为其来源。    //注意 必须是单列集合，如果不是map，那么就要转为单列集合去操作
 * 方法二：
 * Stream接口的静态方法of可以获得数组对应的流
 * 	static<T> Stream<T> of (T... value)
 * 参数是一个可变参数，就可以传递一个数组
 */

public class AcquireStrea {
	public static void main(String[] args) {
		//将集合转换为Stream流
		List<String> listA = new ArrayList();
		Stream<String> streamA = listA.stream();
		
		Set<String> setA = new HashSet();
		Stream<String> streamB = setA.stream();
		
		Map<String,String> map = new HashMap<String, String>();
			//获取键  ，存储在Set集合中
		Set<String> keysetA = map.keySet();
		Stream<String> streamC = keysetA.stream();
			//获取值，存储在Collection集合中
		Collection<String> valueA = map.values();
		Stream<String> streamD = valueA.stream();
			//获取键值对(键与值得对应关系) entrySet()
		Set<Map.Entry<String, String>> entriesA = map.entrySet();
		Stream<Entry<String, String>> streamE = entriesA.stream();
	
		//第二种  将数组转化为Stream流  直接使用Stream接口得of静态方法
		Stream<Integer> streamF = Stream.of(1,2,3,4,5);
		Integer[] arryA = {1,2,3,4,5,6,7};
		Stream<Integer> streamG = Stream.of(arryA);
		String[] strA = {"A","B","C","D"};
		Stream<String> arryB = Stream.of(strA);
	}
	

}
