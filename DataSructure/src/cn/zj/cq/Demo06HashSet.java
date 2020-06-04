package cn.zj.cq;
//这个demo是说明为什么Set集合不能存储重复元素
//原因:因为Set集合重写了add方法，在增加元素的时候会调用hashcode方法去比较元素的hashcode值是否一样，然后再调用equals方法比较内容；
import java.util.HashSet;

public class Demo06HashSet {
	public static void main(String[] args) {
		HashSet<String> hash = new HashSet<String>();
		hash.add("abc");//hash值为96354
		hash.add("abc");//hash值为96354  eauqls方法比较后还是相等。这个元素就证明是重复的
		hash.add("通话");//hash值为1179395
		hash.add("种地");//hash值为1179395
		System.out.println(hash);
	}
}
