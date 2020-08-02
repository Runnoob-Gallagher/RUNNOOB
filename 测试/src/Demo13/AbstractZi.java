package Demo13;

public /*abstract*/ class AbstractZi extends AbstractFu {

	@Override
	public void methodA() {
		// TODO Auto-generated method stub
		System.out.println("如果父类是抽象类，要么重写父类的抽象方法，要么将子类也更改为抽象类");
	}
	/*@Override
	public void methodA() {
		// TODO Auto-generated method stub
		System.out.println("好像不管子类是不是抽象类，都要重写欸");
	}
	*/
	public static void main(String[] args) {
		AbstractZi az = new AbstractZi();
		az.methodA();
		AbstractFu af = new AbstractZi();
		af.methodA();  //打印的都是一样的。说明调用的都是子类的方法
	}
	
	
}
