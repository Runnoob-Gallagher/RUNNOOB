package Demo09;

public class Main {
	public static void main(String[] args) {
		Person p = new Man();
		p.eat();
		new Person() {
			@Override
			public void eat() {
				// TODO Auto-generated method stub
				System.out.println("≥‘ ∫");
			}
		}.eat();
	}
}
