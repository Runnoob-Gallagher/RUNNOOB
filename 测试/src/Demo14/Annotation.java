package Demo14;

public class Annotation {
	int age default 3;
	
	@interface Test{
		String name() default "";
	}
}
 