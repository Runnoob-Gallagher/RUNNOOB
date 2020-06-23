package PackageB;
//不同包下的不同子类，没有继承关系
import PackageA.ClassA;

public class ClassD {
	public void methodD() {
		System.out.println(new ClassA().name);//这样只能当权限为public时才能访问
	}
}
