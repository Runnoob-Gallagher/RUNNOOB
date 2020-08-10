package ReflectKS;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

public class Demo02Annotation {
	//ע�������ʾ��ֵ
	@MyAnnotationA(name = "Gallagher",school = "TSUPT")
	public void methodA() {
		System.out.println("����ע���");
	}
	@MyAnnotationB("Gallagher") //���ֻ��һ��ֵ���Ϳ���ʹ��value��Ϊ�������ҿ���ʡ��
	public void methodB() {
		System.out.println("����ע��ֻ��һ��������");
	}
}
	
@Retention(value = RetentionPolicy.RUNTIME)	
@Target(value = ElementType.METHOD)
@interface MyAnnotationA{
	//����ע��Ĳ��� ��ʽ�� ��������   ������();
	String name() default "";  //����Ĭ��ֵ��  Ĭ�������������ģ�������  ע��һ��
	int age() default -1;//-1�������ܲ�����
	String[] school() default {"CQUPT"};
}
@Retention(value = RetentionPolicy.RUNTIME)
@Target(value = {ElementType.METHOD,ElementType.FIELD})
@interface MyAnnotationB{
	String value();//���ֻ��һ��ֵ���Ϳ���ʹ��value��Ϊ�������ҿ���ʡ��
}