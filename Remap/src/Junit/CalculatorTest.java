package Junit;
//在对计算器类进行测试的时候，需要借助main方法执行。不是那么方便，没有达到测试的目的。那么我们新建一个包去测试JunitTest
public class CalculatorTest {
	public static void main(String[] args) {
		Calculator Ca = new Calculator();
		int result = Ca.add(1, 3);
		System.out.println(result);
	}
} 
