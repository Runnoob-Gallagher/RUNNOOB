package cn.zj.cq;
//这个demo是练习递归的  利用递归实现1到100的相加 n + (n-1)+(n-2)+..+(1)
public class Demo04Cycle {
	public static void main(String[] args) {
		System.out.println(Sum(5));
		System.out.println(Cycle(5));
	}

	private static int Cycle(int mem) {
		// TODO Auto-generated method stub
		int answer;
		if(mem == 1) {
			return 1;
		}
		return answer = Cycle(mem - 1)*mem;
	}

	private static int Sum(int num) {
		// TODO Auto-generated method stub
		int sum;
		if(num == 1) {
			return 1;
		}
		return sum = Sum(num -1) + num;
	}
	
}
