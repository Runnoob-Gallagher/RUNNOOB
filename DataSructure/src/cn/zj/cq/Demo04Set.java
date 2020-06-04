package cn.zj.cq;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/*这是一个Set集合的demo---->java.utils.HashSet集合 implements Set接口 
特点：
1.Set集合不包含重复元素；
2.没有带索引的方法，既不能使用普通的for循环；
3.因为不带索引，所以存进去和取出来的元素的顺序可能不一致
4.底层是哈希表结构，查询速度非常快*/
public class Demo04Set {
	public static void main(String[] args) {
		Set<String> set = new HashSet<String>();
		set.add("美国");
		set.add("中国");
		set.add("英国");
		set.add("法国");
		set.add("法国");
				Iterator<String> it = set.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
	}
}
