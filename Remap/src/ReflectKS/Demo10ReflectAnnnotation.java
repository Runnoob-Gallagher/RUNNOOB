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
		//��ȡע������ֵ
		MyAnnotationA annoB = (MyAnnotationA)claA.getAnnotation(MyAnnotationA.class); //����Ҫǿת������value��������G
		System.out.println(annoB.value());
		MyAnnotaionB annoC = (MyAnnotaionB)claA.getAnnotation(MyAnnotaionB.class);
		//���ָ����ע�⣬�����㰴annoC�ķ�ʽ����ָ����ע�⣬�ǲ��еģ���ΪҪָ������Ӧ��������ȥ������db_XM
		Field field = claA.getDeclaredField("name");
		MyAnnotaionB annoD = (MyAnnotaionB)field.getAnnotation(MyAnnotaionB.class);
		System.out.println(annoD);
		System.out.println(annoD.db_NL());//������Ϳ��Ի�ȡ��Ҫ��ע���ֵ
	}
}
@MyAnnotationA("Table") //�������Ƕ�SuperMan���ӳ�䣬���Զ����ע��϶�Ҫ���ڶ�Ӧ������
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
		System.out.println("�Ҿ���һ����ͨ����");
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