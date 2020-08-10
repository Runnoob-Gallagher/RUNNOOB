package ReflectKS;
/*
 * Reflection是JAVA被视为动态语言的关键，反射机制允许程序在执行期借助于Reflection API取得任何类的内部信息，并能直接操作任意对象的内部属性即方法
 * Class c = Class.forName("java.lang.String")
 * 
 * 加载完类之后，在堆内存的方法区中就产生了一个Class类型的对象（一个类只有一个Class对象）
 * 这个对象包含了完整的类的结构信息。通过这个类看到类的结果：如果查询的属性，方法等
 */
public class Demo03ReflectionA {
	public static void main(String[] args) throws ClassNotFoundException {
		//通过反射获取类的Class对象
		Class clA = Class.forName("ReflectKS.User");
		System.out.println(clA);
		Class clB = Class.forName("ReflectKS.User");
		System.out.println(clB); //这个证明一个类只有一个Class对象，且一个类被加载之后整个类的结构都会封装在Class对象中。比如你输出clA就会提示这个类的很多东西
		//clA.
		/*
		 * 重点：在Object类中定义了一下的方法，此方法被所有子类继承 public final Class getClass()
		 * 		该方法的返回值类型是一个Class类。此类是Java反射的源头， 通过对象反射求出类的名称，这样就能知道类的结构
		 */
	}
}

class User{
	private String name;
	private int age;
	private int id;
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
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public User(String name, int age, int id) {
		this.name = name;
		this.age = age;
		this.id = id;
	}
	public User() {
	}
	@Override
	public String toString() {
		return "User [name=" + name + ", age=" + age + ", id=" + id + "]";
	}
	
}
