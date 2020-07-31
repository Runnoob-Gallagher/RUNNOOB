package Test;

public class Outer {
	String name = "СоЅа";
	class Inner{
		int age = 24;
	} 
	public static void main(String[] args) {
		Outer out = new Outer();
		Inner in = out.new Inner();
		System.out.println(in.age);
		System.out.println(out.name);
	}
}
