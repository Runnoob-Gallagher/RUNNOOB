package cn.zj.cq;
//这个demo是解释异常执行得过程
public class Demo02WhyException {
	public static void main(String[] args) {
		int[] arrA = {1,2,3};
		int re = methodA(arrA , 3);
		System.out.println(re);
	}
	public static int methodA(int[] arr,int index) {
		int result = arr[index];
		return result;
	}
}
/*
 * 1.当JVM发现上面的数组越界异常后，JVM会做两件事
 *  ①JVM会根据异常产生得原因创建一个异常对象，这个异常包括异常产生得原因、内容、位置
 * ②在出现异常的方法中，没有能够处理异常的逻辑-->try catch 那么JVM就会将异常抛给方法的调用者 main方法
 * 2.当main方法接收到这个异常之后，发现自己也没有办法解决这个异常，就继续把这个异常抛给上一级-->JVM
 * 3.JVM接收到这个异常之后
 * 	①将异常产生的位置、原因和内容输出到控制台上
 * 	②终止这个程序的进行
 */