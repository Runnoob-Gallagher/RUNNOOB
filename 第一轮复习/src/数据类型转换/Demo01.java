package ��������ת��;

public class Demo01 {
	public static void main(String[] args) {
		int a = 1;
		byte b = 2;
		int c = a + b;
		System.out.println("���ʱ��b��byte����Ϊint���ͣ�c��ֵΪ��" + c);
		
		double e = 1.5;
//		int f = c + e; ���뱨��cannot convert from double to int
		int f = (int)(c + e);
		System.out.println("ǿ������ת����f ��ֵΪ��" + f); //����ǲ�������������Ĺ�
	}
}