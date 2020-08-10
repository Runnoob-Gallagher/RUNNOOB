package ReflectKS;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

//@SuppressWarnings("all")  这个是一个镇压警告，把警告信息给排除掉
/*
 * 元注解：复制解释其他注解的注解
 * @Target：用于描述注解的适用范围
 * @Retention：表示需要在什么级别保存改注释信息，用于描述注解的生命周期（SOURCE<CLASS<RUNTIME)
 * @Document：说明改注解将被包含在javadoc中
 * @Inherited：说明子类可以继承父类中的该注解
 */
//测试元注解
public class Demo01Annotation {
	@MyAnnotation
	public void test() {
		System.out.println("我是测试元注解的");
	}
}
//定义一个注解
@Documented   //表示是否将注释生在在javadoc中
@Retention(value = RetentionPolicy.RUNTIME) //表示注解在什么地方才有效：SOURCE-在源码级别才有效 CLASS-在类中有效 RUNTIME-所有地方均有效
											//RUNTIME > CLASS > SOURCE
@Target(value = {ElementType.METHOD,ElementType.TYPE}) //作用范围限定在方法中,或者类中
@interface MyAnnotation{
	
}
