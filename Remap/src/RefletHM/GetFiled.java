package RefletHM;

import java.lang.reflect.Field;

public class GetFiled {
	public static void main(String[] args) throws NoSuchFieldException, SecurityException, IllegalArgumentException, IllegalAccessException {
		//获取Person的class对象
		Class personclass = Person.class;
		/*获取成员变量
		 * Field[] getFields​() 返回一个包含 Field对象的数组， Field对象反映由该 Class对象表示的类或接口的所有可访问的公共字段。 
		 * Field getField​(String name) 返回一个 Field对象，该对象反映由该 Class对象表示的类或接口的指定公共成员字段。     获取指定名称的class方法
		 */
		 
		Field[] filedA =  personclass.getFields();  //这里用getFields没有返回任何东西。因为成员变量都被private修饰了.
		//加上一个就有了：public java.lang.String RefletHM.Person.Sex
		for (Field filed : filedA) {
			System.out.println(filed);
		}
		System.out.println("---------");
		Field filedB = personclass.getField("grade");  //返回指定类型的属性
		System.out.println(filedB);
		/*
		 * 将获取到的成员变量进程操作：
		 *1.设置值：void set​(Object obj, Object value) 将指定的对象参数中由此 Field对象表示的字段设置为指定的新值。  
		 *2.获取值：Object get​(Object obj) 返回由该 Field表示的字段在指定对象上的值。  
		 */
		//因为成员变量是在对象中存在的
		Person person = new Person();
		Object valueB =  filedB.get(person);  //注意这里为什么要用Object  方法定义的
		System.out.println(valueB);
		filedB.set(person, 9);
		Object valueC =  filedB.get(person);
		System.out.println(valueC);
		System.out.println("------");
		
		/*
		 * Field getDeclaredField​(String name) 返回一个 Field对象，该对象反映由该 Class对象表示的类或接口的指定声明字段。  
		 * Field[] getDeclaredFields​() 返回一个 Field对象的数组，反映了由该 Class对象表示的类或接口声明的所有字段。
		 */
		Field[] fieldD = personclass.getDeclaredFields();//获取所有的属性，不考虑是什么修饰的
		for (Field field : fieldD) {
			System.out.println(field);   
		}
		System.out.println("----------");
		Field fieldE = personclass.getDeclaredField("Sex");
		System.out.println(fieldE);
		}
}
 