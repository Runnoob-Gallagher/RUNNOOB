package Demo12;

public class TestInterfaceObject {
	public static void methodB(TestInterface ti) {
		ti.methodA();
	}
	public static void main(String[] args) {
		methodB(new TestInterface() {
			
			@Override
			public void methodA() {
				// TODO Auto-generated method stub
				System.out.println("虽然他直接调用了接口中的方法，但是不能使用的。你要是用就必须实现接口重写接口中的方法");
			}
		});
	}
}
