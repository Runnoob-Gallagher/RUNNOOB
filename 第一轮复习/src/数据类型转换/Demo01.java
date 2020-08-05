package 数据类型转换;

public class Demo01 {
	public static void main(String[] args) {
		int a = 1;
		byte b = 2;
		int c = a + b;
		System.out.println("这个时候b由byte提升为int类型，c的值为：" + c);
		
		double e = 1.5;
//		int f = c + e; 编译报错：cannot convert from double to int
		int f = (int)(c + e);
		System.out.println("强制类型转换，f 的值为：" + f); //这个是不存在四舍五入的哈
	}
}