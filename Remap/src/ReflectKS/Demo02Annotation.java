package ReflectKS;
//重点 ：把字节视为表的数据
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

public class Demo02Annotation {
	//注解可以显示赋值
	@MyAnnotationAC(name = "Gallagher",school = "TSUPT")
	public void methodA() {
		System.out.println("测试注解的");
	}
	@MyAnnotationBC("Gallagher") //如果只有一个值，就可以使用value作为变量，且可以省略
	public void methodB() {
		System.out.println("测试注解只有一个变量的");
	}
}
	
@Retention(value = RetentionPolicy.RUNTIME)	
@Target(value = ElementType.METHOD)
@interface MyAnnotationAC{
	//定义注解的参数 格式： 参数类型   参数名();
	String name() default "";  //设置默认值。  默认是这样操作的？？？？  注意一下
	int age() default -1;//-1代表可能不存在
	String[] school() default {"CQUPT"};
}
@Retention(value = RetentionPolicy.RUNTIME)
@Target(value = {ElementType.METHOD,ElementType.FIELD})
@interface MyAnnotationBC{
	String value();//如果只有一个值，就可以使用value作为变量，且可以省略
}