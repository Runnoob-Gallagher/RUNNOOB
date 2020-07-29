package Demo06;

public class Main {
	public static Flying methodA() {
		Flying ffB = new Bird();
		return ffB;
	}
	public static void main(String[] args) {
		Flying ff = methodA();//同理  调用methodA方法，返回的是实现了Flying接口的实现类对象
		ff.fly();
	}
}
