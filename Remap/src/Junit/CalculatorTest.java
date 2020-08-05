package Junit;

public class CalculatorTest {
	public static void main(String[] args) {
		Demo01 de = new Demo01();
		int sumresult = de.add(1, 2);
		System.out.println(sumresult);
		int subresult = de.sub(5, 3);
		System.out.println(subresult);
	}
}
