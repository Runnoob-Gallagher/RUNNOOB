package Demo13;

public class Zi extends FU {
	@Override
	public void methodB() {
		// TODO Auto-generated method stub
		System.out.println("��д���෽��B");
	}

	public static void main(String[] args) {
		Zi zi = new Zi();
		zi.methodB();
		
		FU fu = new Zi();
		fu.methodB();
	}
}
