package ReflectKS;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

//获取类的属性结构
public class Demo07ReflectGet {
	public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, SecurityException {
		Class claPerson = Class.forName("RefletHM.Person");
		//获取类的类名
		System.out.println(claPerson.getName()); //RefletHM.Person  包 + 类名
		System.out.println(claPerson.getSimpleName());//Person  类名
		//获取类的属性
		Field[] fieldA = claPerson.getFields();
		for (Field field : fieldA) {
			System.out.println(field);  //只会打印由public修饰的
		}
		Field[] fieldB = claPerson.getDeclaredFields();
		for (Field field : fieldB) {
			System.out.println(field);  //不管是private修饰还是public修饰，都会打印
		}
		//获取指定方法   getDeclareMethod是获取本类的所有方法，包括私有   没加Declare的是父类也会打印出来
		//Method getname = claPerson.getMethod("getname", String.class);  //这里是不行的，因为是私有的方法
		Method getname = claPerson.getMethod("getName", null);//这里有方法重载的意思，根据参数类型去找对应的方法
		System.out.println(getname);
		Method setname = claPerson.getMethod("setName", String.class);
		System.out.println(setname);
	}
}
