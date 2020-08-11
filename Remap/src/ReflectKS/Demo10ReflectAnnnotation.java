package ReflectKS;

import java.lang.annotation.Annotation;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.lang.reflect.Field;

public class Demo10ReflectAnnnotation {
	public static void main(String[] args) throws ClassNotFoundException, NoSuchFieldException, SecurityException {
		Class claA = Class.forName("ReflectKS.SuperMan");  
		Annotation[] annoA = claA.getAnnotations();
		for (Annotation annotation : annoA) {
			System.out.println(annotation);//@ReflectKS.MyAnnotationA(value=Table)
		}
		//获取注解具体的值
		MyAnnotationA annoB = (MyAnnotationA)claA.getAnnotation(MyAnnotationA.class); //必须要强转才能有value这个方法欸
		System.out.println(annoB.value());
		MyAnnotaionB annoC = (MyAnnotaionB)claA.getAnnotation(MyAnnotaionB.class);
		//获得指定的注解，比如你按annoC的方式想获得指定的注解，是不行的，因为要指定到对应的属性上去。比如db_XM
		Field field = claA.getDeclaredField("name");
		MyAnnotaionB annoD = (MyAnnotaionB)field.getAnnotation(MyAnnotaionB.class);
		System.out.println(annoD);
		System.out.println(annoD.db_NL());//这里你就可以获取想要的注解的值
	}
}
@MyAnnotationA("Table") //我上面是对SuperMan类的映射，所以对类的注解肯定要放在对应的类上
class SuperMan{
	@MyAnnotaionB(db_XM="Varchar",db_NL=24,type = "Varchar2")
	private String name;
	@MyAnnotaionB(db_XM="Fional",db_NL=22,type = "int")
	private int age ;
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
	public SuperMan(String name, int age) {
		this.name = name;
		this.age = age;
	}
	public SuperMan() {
	}
	public void methodA() {
		System.out.println("我就是一个普通方法");
	}
}
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.FIELD,ElementType.METHOD})
@interface MyAnnotaionB{
	String db_XM();
	String type();
	int db_NL();
}

@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.TYPE,ElementType.METHOD})
@interface MyAnnotationA{
	String value();
}