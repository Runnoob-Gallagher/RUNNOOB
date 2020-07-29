package Demo08;

public class Main {
	public static void main(String[] args) {
		//Lambda lambda = () -> {return new Person();};//这里因为接口中的方法时返回一个Person对象
		
		//下面这个是构造方法的引用
		Lambda lambda = Person::new; //因为构造方法是对对象进行初始化的，所属者属于想要创建的对象？？
		Person p = lambda.getConstructor();
	}
	//创建一个
}
