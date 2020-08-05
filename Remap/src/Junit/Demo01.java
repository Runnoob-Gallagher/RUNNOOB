package Junit;
/*
 * Junit测试：
 * 1.定义测试类
 * 2.定义测试方法：可以独立运行
 * 3.为了让这个测试方法独立运行，那么就要加注解。（一般都是在main方法中调用方法）
 * 4.给方法加@Test
 * 5.只加@Test会出现报错，因为还没有加Junit依赖环境
 */

public class Demo01 {
	public int add(int a,int b) {
		int s = 3/0;  //在被执行的代码中加入会报异常的代码，测试结果为红色  且会提示报错：java.lang.ArithmeticException: / by zero
		return  a * b;
	}
	public int sub(int c,int d) {
		return c - d;
	}
	
	
}
