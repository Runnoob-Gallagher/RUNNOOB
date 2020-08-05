package Test;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import Junit.Demo01;

public class CalculatorTest {
	//初始化方法   类似于异常中的finally   在测试方法执行之前执行   即在方法之前加上  @Before
	@Before
	public void init() {
		System.out.println("我是初试方法");
	}
	
	@Test
	public void addtest() {
		System.out.println("奇怪，我没有main方法也能执行");
		//1.创建计算器对象，调用计算功能
		Demo01 de = new Demo01();
		int addresult = de.add(1, 2);
		System.out.println(addresult);  //直接执行方法，会跳出绿颜色的框，代表测试通过
		//这里有一种情况，输出的结果不是我们想要的，但是呢它又没有报错。所以我们可以预设结果----断言
		Assert.assertEquals(3, addresult);   //这里我把加法改为了乘法，肯定和预想值3 不一样
	}
	@After
	public void fina() {
		System.out.println("我是最后的方法");
	}
	
}
