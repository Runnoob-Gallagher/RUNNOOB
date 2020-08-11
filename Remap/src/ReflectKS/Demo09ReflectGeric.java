package ReflectKS;

import java.lang.reflect.Method;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.List;
import java.util.Map;

import RefletHM.Person;

//通过反射获取泛型的信息
public class Demo09ReflectGeric {
	public void methodA(Map<String,Person> map,List<String> list ) {
		System.out.println("methodA");
	}
	public Map<String,Person> methodB(){
		System.out.println("methodB");
		return null;
	}
	
	public static void main(String[] args) throws NoSuchMethodException, SecurityException {
		Class claA = Demo09ReflectGeric.class;
		Method method = claA.getMethod("methodA", Map.class,List.class);
		Type[] typeA = method.getGenericParameterTypes(); //获取泛型信息的参数信息
		for (Type type : typeA) {
			System.out.println(type);
			/*
			 * 执行结果：
			 * java.util.Map<java.lang.String, RefletHM.Person>
             * java.util.List<java.lang.String>    但是没有返回具体，所以还需要遍历type里面的信息
			 */
			if(type instanceof ParameterizedType) { //标志这个type类型属于参数化类型，就要继续遍历
				Type[] typeB = ((ParameterizedType)type).getActualTypeArguments();     //获得真实的参数类型
				for (Type typeC : typeB) {
					System.out.println(typeC);
					/*
					 * 执行结果：
					 * java.util.Map<java.lang.String, RefletHM.Person>
					 *class java.lang.String
					 *class RefletHM.Person
					 *java.util.List<java.lang.String>
					 *class java.lang.String
					 */
				}
			}
		}//ParameterizedType 表示一种参数化类型，比如这里写的Map<String,Person>
		Method methodb = claA.getMethod("methodB", null);
		Type type = methodb.getGenericReturnType();
		System.out.println(type);
		if(type instanceof ParameterizedType) {
			Type[] typeD = ((ParameterizedType)type).getActualTypeArguments();
			for (Type typeE : typeD) {
				System.out.println(typeE);
			}
		}
	}
}
