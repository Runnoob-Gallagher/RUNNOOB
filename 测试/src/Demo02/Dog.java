package Demo02;
/*
 * 创建一个Dog类继承抽象父类Animal。重写抽象方法eat；
 * 子类方法methodA()参数为抽象类，根据输出结果知道，实际传递的是抽象父类的子类Dog对象
 */
public class Dog extends Animal {
	@Override
	public void eat() {
		// TODO Auto-generated method stub
		System.out.println("恰屎");
	}
	public void methodA(Animal an) {
		an.eat();
	}
	public static void main(String[] args) {
		Dog d = new Dog();
		d.eat();
	}
}
