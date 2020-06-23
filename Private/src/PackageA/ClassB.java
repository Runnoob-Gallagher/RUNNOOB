package PackageA;
//这个ClassB和ClassA是在同一个包下，但是不同类。相当于邻居
/*在这里ClassB想要访问ClassA中的成员变量name,因为成员变量name不是被static修饰的，所以需要通过name所属对象去访问;
	这里就算加了static也是不能访问的，想一想都不科学*/
public class ClassB {
	public void menthodB() {
		System.out.println(new ClassA().name);//这里是通过创建匿名对象进行访问的；但是权限一旦为private就不行。
											  //private修饰的只能在本类中访问
	}
}
