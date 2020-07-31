package Demo09;

public class Lambda {
	interface Printer{
	public abstract	void printer(String val);		
	}
	public void printersome(String something,Printer printer) {
		printer.printer(something);
	}
	public static void main(String[] args) {
		Lambda lambda = new Lambda();
		String something = "Lambda±Ì¥Ô Ω";
		Printer printer = new Printer() {
			
			@Override
			public void printer(String val) {
				// TODO Auto-generated method stub
				System.out.println(val);
			}
		};
		lambda.printersome(something, printer);  
	}
}
 