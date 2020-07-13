package œπº∏∞—≤‚ ‘;

public class Demo03Sum {
	public static void main(String[] args) {
		int Sum = 3;
		System.out.println(methodSum(Sum));
	}
	
	private static int methodSum(int num) {
		// TODO Auto-generated method stub
		if(num ==1) {
			return 1;
		}else {
		return num = methodSum(num - 1) + num;
			
		}
			}
	
}
