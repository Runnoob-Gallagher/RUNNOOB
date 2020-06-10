package cn.zj.cq;

import java.util.Objects;

//这个demo是判断传递的参数是否为空的简易方法
public class Demo04Requirenull {
	public static void main(String[] args) {
		methodA(null);
	}
	/*
	 * public static void methodA(Object obj)
	 *  { if(obj == null) { 
	 *  throw new NullPointerException("你传递的参数是空的"); 
	 *  	} 
	 *  		}
	 */
	public static void methodA(Object obj) {
		Objects.requireNonNull(obj,"传递的参数是空的");//这个等同于上面那一段
	}
}
