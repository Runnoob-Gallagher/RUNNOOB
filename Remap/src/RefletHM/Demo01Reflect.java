package RefletHM;
/*
 * 反射：将类的各个组成部分封装为其他对象
 * 代码执行的三个阶段：
 * 一：Source源代码阶段
 * 将我们写好的代码用javac编译为.class文件的阶段
 * 二、Class类对象阶段
 * 通过类加载器，将.class文件加载到内存里面去。且在内存中用类对象来表诉这个字节码文件 。类对象中会存在字节码文件中定义的方法，构造方法，成员变量等
 * 分别封装为Filed对象，Constractor对象，Method对象。这几个对象中可能含有多个方法，就用数据区表示。比如Filed[] Filed
 * 
 * 三、运行时阶段
 * 比如我们new对象，然后调用对象里面的方法
 * 
 * 获取Class的三个阶段，对应前面的三个阶段，对应三个方法
 * 1.Class.forName("全类名")：将字节码文件加载进内存，返回Class对象   这个阶段只有字节码文件，还没进内存
 * 2.类名.class：通过类名的属性class获取    这个阶段，字节码文件已经在内存中，class类对象已存在，但是类的真正对象（比如class）还是不存在的
 * 3.对象.getClass()      这个阶段是已经创建好了对象
 * 
 */
public class Demo01Reflect {
	public static void main(String[] args) throws ClassNotFoundException {
		Class claA = Class.forName("RefletHM.Person");   //多用于配置文件，将类名定义在配置文件中，读取文件，加载class对象
		System.out.println(claA);
		Class claB = Person.class; //参数传递
		System.out.println(claB);
		Person p = new Person();
		Class claC = p.getClass(); //用于对象获取字节码文件对象
		//这三个对象都是相等的
		System.out.println(claA == claB);
		System.out.println(claA == claC);
		
		Class claD = Student.class;  //说明不同的类的class对象肯定是不同的
		System.out.println(claD);
	}
}
