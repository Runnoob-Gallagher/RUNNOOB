package ReflectKS;
/*
 * 对象通过反射可以得到的信息：某个类的属性、方法和构造器、某个类实现的哪些接口。
 * 对于每个类而言，JRE都为其保留一个不变的Class类型的对象。
 * 
 * Class本身也是一个类
 * Class对象只能由系统建立对象
 * 一个加载的类在JVM中只会由一个Class实例
 * 一个Class对象对应的是一个加载到JVM中的一个class对象
 * 每个类的实例都会记得自己是由哪个Class实例所生成
 * 通过Class可以完整的得到一个类中所有被加载的结构
 * Class类是Reflection的根源，针对任何你想要动态加载、运行的类，唯有先获得相应的对象
 * 
 * 
 * 如何获取Class类的实例
 * 
 * 	若已知具体的类，通过类的class属性获取，该方法最为安全可靠
 * 		Class cla = Person.class;
 *  已知某个类的实例，调用该实例的getClass()方法获取Class对象
 *  	Class cla = person.getClass();
 *  已知一个类的全类名，且该类在类路径下，可通过Class类的静态方法forName()获取
 */
public class Demo03ReflectionB {
	public static void main(String[] args) throws ClassNotFoundException {
		Person person = new Student();
		System.out.println(person.name);
		//通过对象获得
		Class claA = person.getClass();
		System.out.println(claA);
		//通过forName获得
		Class claB = Class.forName("ReflectKS.Student");
		System.out.println(claB);
		//通过类名.class
		Class claC = Student.class;
		System.out.println(claC);
		
		//获得父类类型
		Class superclass = claA.getSuperclass();
		System.out.println(superclass);   //打印出学生类的父类Person
	}
	
	
	
}

class Person{
	String name;
	int age;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	public Person() {
	}
	
	
}
class Student extends Person{
	public Student() {
		this.name = "学生娃儿";  //这个是继承父类的属性   记住呀！！！！
	}
}

class Teacher extends Person{
	public Teacher() {
		this.name = "老师";
	}
}














