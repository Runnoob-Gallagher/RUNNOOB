package Package;

public class Demo02BuFen {
	public static void main(String[] args) {
		BuFen bf = new BuFen();
		bf.methodA();//这里通过对象调用方法，但是仅仅只是调用了方法，这里属于外部，不能调用内部类的东西。让他自己去
	}
}
