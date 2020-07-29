package Demo03;

public class NiMin {
	public static void methodA(Flying f) {
		f.fly();
	}
	public static void main(String[] args) {
		methodA(new Flying() {
			@Override
			public void fly() {
				// TODO Auto-generated method stub
				System.out.println("匿名内部类" + "  " + "我是用翅膀在飞");
			}
		});
		methodA(new Flying() {
			
			@Override
			public void fly() {
				// TODO Auto-generated method stub
				System.out.println("匿名内部类" + "  " + "我是用燃油在飞");
			}
		});
		
	}
}
