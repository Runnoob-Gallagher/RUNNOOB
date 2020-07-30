package Demo10;

public interface Code {
	public abstract void methodA();	

	/*
	 * Code cd = new Code() {
	 * 
	 * @Override public void methodA() { // TODO Auto-generated method stub
	 * System.out.println("Lambda"); } };
	 */
	  Code cd = () -> {System.out.println("Lamba");};
	  public static void main(String[] args) {
		cd.methodA();
	}
}
	