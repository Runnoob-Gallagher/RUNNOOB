package ReflectKS;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

import RefletHM.Person;

//通过反射获得类之后，我们能干嘛呢---->创建对象
public class Demo08CreateObject {
	public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, SecurityException, InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException, NoSuchFieldException {
		Class claA = Class.forName("RefletHM.Person");
		//通过得到的类获取构造器
		Constructor conA = claA.getConstructor();//因为这里没赋值，返回一个无参构造器，所以你删除之后Person累的无参构造器就会报错
		System.out.println(conA);
		//通过反射得到的类创建对象
		Object obj = claA.newInstance(); //可以进行强转   Person person = (Person)claA.newInstance();
		System.out.println(obj);//返回的对象是无参的
		//通过构造器创建对象
		Constructor conB = claA.getConstructor(String.class,int.class,int.class,String.class);
		Person person = (Person) conB.newInstance("Gallagher",24,25,"Success");
		System.out.println(person);
		System.out.println(person.getName());
		//通过反射获取返回
		Method setname = claA.getMethod("setName", String.class);
		//invoke():用于激活  
		/*invoke返回格式：
		 * (对象,"方法参数值")  比如下面的： setname.invoke(person,"杨洁");  
		 * 用以激活这个setname的方法，方法值传递这个setname方法的对象，和方法参数值
		 */
		setname.invoke(person,"杨洁");
		System.out.println(person.getName()); 
		
		
		//通过反射获取对象，并操作属性
		Person personA = (Person) claA.newInstance();
		Field field = claA.getDeclaredField("name");
		field.setAccessible(true);  //关闭程序的安全监测，这样就能打印出了
		field.set(personA, "杨浩");
		System.out.println(personA.getName());//报错：Person with modifiers "private"  因为Name被private修饰
	}
}
