package Demo07;

public class Method {
	public static void main(String[] args) {	
			Method me = new Method();
//		  Lambda lambda = (a,b) -> add(a,b);
		    Lambda lambda  = me::add;
		  int result = lambda.Sum(8, 9);
		  System.out.println(result);
	}
	public  int add(int c,int d) {
			return c+d;
	}
}
