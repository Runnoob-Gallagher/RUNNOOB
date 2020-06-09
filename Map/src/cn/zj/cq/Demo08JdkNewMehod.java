package cn.zj.cq;

import java.util.ArrayList;
import java.util.List;
待定  我这个jdk是1.8的
//这个demo是验证jdk9的新特性 
/*List接口、Set接口、Map接口里增加了静态方法of，可以集合中一次添加多个元素
	static <E> List<E> of (E....element)
	注意：在使用时集合中储存的元素的个数已经确定，不再改变时使用
	1.of方法只适用于List接口，Set接口、Map接口 不适用于接口的实现类
	2.of方法的返回值是一个不能改变的集合，集合不能再使用add、put方法添加元素，会抛出异常
	3.Set接口和Map接口在使用这个方法时不能添加重复元素，否则会抛出异常*/
public class Demo08JdkNewMehod {
	public static void main(String[] args) {
		/*
		 * List<String> list = new ArrayList<String>();//这个应该是不行的，现在你创建的就是一个空的。已经确定了
		 * System.out.println(list);//所以必须在初始化的时候就赋值？？？？？？
		 */		
		List<String> list = List.of
		
	}
}
