package Demo03;

public class Main {
	public static void methodA(Flying f) {//方法参数中传递的是接口类型，看下面的输出结果，就相当于传递的是接口的实现类对象
		f.fly();
	}
	public static void main(String[] args) {
		Main main = new Main();
		methodA(new Bird() {	
			@Override
			public void fly() {
				// TODO Auto-generated method stub
				System.out.println( "我是用翅膀在飞");
			}
		});
		methodA(new AirPlane() {
			@Override
			public void fly() {
				// TODO Auto-generated method stub
				System.out.println( "我是用燃油在飞");
			}
		});
	}
}
