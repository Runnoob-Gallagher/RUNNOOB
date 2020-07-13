package 瞎几把测试;
//递归的精髓：就是在方法中调用方法；
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
