package Quote;

public class ThisClass {
	public void saysomething() {
		System.out.println("˵��ʲô");
	}
	public void dosomething(ThisInterface ti) {
		ti.seesomething();
	}
	
	public void ThisMethod() {
		dosomething(new ThisInterface() {
			
			@Override
			public void seesomething() {
				// TODO Auto-generated method stub
				System.out.println("������ʲô");
			}
		});
		
		dosomething(() -> this.saysomething());
		dosomething(this::saysomething);
	}
	public static void main(String[] args) {
		new ThisClass().ThisMethod();
	}
}
