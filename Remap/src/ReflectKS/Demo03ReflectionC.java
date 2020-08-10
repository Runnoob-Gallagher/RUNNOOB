package ReflectKS;

import java.lang.annotation.ElementType;

import javax.lang.model.element.Element;

public class Demo03ReflectionC {
	public static void main(String[] args) {
		Class claA = Object.class;    //类
		Class claB = Comparable.class;  //接口
		Class claC = String[].class;  //一维数组
		Class claD = int[][].class;  //二维数组
		Class claE = Override.class; //注解
		Class claF = ElementType.class; //枚举
		Class claG = Integer.class; //基本类型 
		Class claH = void.class;  //空类型
		Class claI = Class.class; //Class本身
		System.out.println(claA);
		System.out.println(claB);
		System.out.println(claC);
		System.out.println(claD);
		System.out.println(claE);
		System.out.println(claF);
		System.out.println(claG);
		System.out.println(claH);
		System.out.println(claI);
			
		// 只要元素类型与维度是一样的，就是同一个Class对象
		int[] arryA =new int[5];
		int[] arryB =new int[500];
		System.out.println(/*arryA.hashCode()*/ arryA.getClass().hashCode());
		System.out.println(/*arryB.hashCode()*/ arryB.getClass().hashCode());  //这里开始是用数组求hashcode肯定是不对的  不同的应勇，肯定是不一样的
	}
}
