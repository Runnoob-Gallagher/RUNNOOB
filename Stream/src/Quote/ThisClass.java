package Quote;

public class ThisClass {
	public void saysomething() {
		System.out.println("说点什么");
	}
	public void dosomething(ThisInterface ti) {
		ti.seesomething();
	}
	
	public void ThisMethod() {
		dosomething(new ThisInterface() {
			
			@Override
			public void seesomething() {
				// TODO Auto-generated method stub
				System.out.println("看见了什么");
			}
		});
		
		dosomething(() -> this.saysomething());
		dosomething(this::saysomething);
	}
	public static void main(String[] args) {
		new ThisClass().ThisMethod();
	}
}
