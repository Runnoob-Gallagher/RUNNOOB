package Junit;
/*
 * Junit���ԣ�
 * 1.���������
 * 2.������Է��������Զ�������
 * 3.Ϊ����������Է����������У���ô��Ҫ��ע�⡣��һ�㶼����main�����е��÷�����
 * 4.��������@Test
 * 5.ֻ��@Test����ֱ�����Ϊ��û�м�Junit��������
 */

public class Demo01 {
	public int add(int a,int b) {
		int s = 3/0;  //�ڱ�ִ�еĴ����м���ᱨ�쳣�Ĵ��룬���Խ��Ϊ��ɫ  �һ���ʾ����java.lang.ArithmeticException: / by zero
		return  a * b;
	}
	public int sub(int c,int d) {
		return c - d;
	}
	
	
}
