package Ϲ���Ѳ���;
//�ݹ�ľ��裺�����ڷ����е��÷�����
public class Demo03Cheng {
	public static void main(String[] args) {
		int Sum = 5;
		System.out.println(methodB( Sum));
	}

	private static int  methodB(int sum) {
		// TODO Auto-generated method stub
		if(sum == 1) {
			return sum = 1;
		}{
			return sum = sum * methodB(sum -1);
		}
	}
	
}
