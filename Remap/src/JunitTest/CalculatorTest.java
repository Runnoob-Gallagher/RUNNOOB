package JunitTest;


import org.junit.After;
/*
 * 初始化方法：Before
 * 用于资源申请，就相当于早执行测试方法之前都会先去执行它
 * 最终方法 After
 * 用于资源结束，就相当于最终必须要执行的一段代码
 */
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import Junit.Calculator;

public class CalculatorTest {
	
	//直接定义方法去测试,但是不都要main方法去作为程序入口吗？ 这里就要用到Junit类的@Test方法,需要导入Junit的依赖	 
	
	//注意：使用了Junit之后对于测试结果是不用看测试结果，是看颜色。这里就有个问题，如果程序正常执行，但是结果不是预期，他还是显示绿色，
	//那我们就要使用另一种-----断言，就相当于将结果预测出来Assert
	@Test
	public void add() {
		Calculator Ca = new Calculator();
		int resultA = Ca.add(1, 3);
		System.out.println("证明我也是执行了的");
		//System.out.println(result);
		int resultB = Ca.sub(1, 2);  //这里实际结果为2，但是我想得到的结果是-1.原因是我方法写错了
		//所以我用Assert去判断
		Assert.assertEquals(-1, resultB);//所以这个时候显示的就是红色
	}
	@Before
	public void before() {
		System.out.println("Before方法");
	}
	@After
	public void after() {
		System.out.println("After方法");
	}
}
