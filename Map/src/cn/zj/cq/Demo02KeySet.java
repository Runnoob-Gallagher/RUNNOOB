package cn.zj.cq;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

//熟悉Map集合的遍历方法
/*Map集合的第一种遍历方法：通过键找值得方式
Map集合中的方法：
	Set<K> keySet() 返回映射中包含的键的Set视图
实现步骤：
	1.使用Map集合中的方法keySet(),把Map集合中的key取出来，存储到一个Set集合中去
	2.遍历Set集合，获取Map集合重的每一个key
	3.通过Map集合的方法get(key),通过key找到value*/
public class Demo02KeySet {
	public static void main(String[] args) {
		Map<String,Integer> mapA = new HashMap();
		mapA.put("中国",6666);
		mapA.put("美国",4444);
		mapA.put("法国",3333); 
		mapA.put("狗国",2222);
		Set<String> set = mapA.keySet();
		//System.out.println(set);
		Iterator<String> it= set.iterator();
		while(it.hasNext()) {
			String key = it.next();
			System.out.println(key +"="+ mapA.get(key));
		} 
		  for(String value: set) {
			  System.out.println(value + "=" + mapA.get(value));
		  } 
		
		  
		
	}
}
