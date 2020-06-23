package PackageB;
//这里继承了不同包下的类，都是需要导包的
import PackageA.ClassA;

public class ClassC extends ClassA {
	public void methodC() {
		System.out.println(super.name);//这里不写权限(default) 和private都是会报错的
		System.out.println(new ClassA().name);
	}
}
