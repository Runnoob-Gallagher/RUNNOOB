package Demo13;

public class Zi extends FU {
	@Override
	public void methodB() {
		// TODO Auto-generated method stub
		System.out.println("重写父类方法B");
	}

	public static void main(String[] args) {
		Zi zi = new Zi();
		zi.methodB();
		
		FU fu = new Zi();
		fu.methodB();
	}
}
