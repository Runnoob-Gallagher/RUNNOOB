package PackageB;
//����̳��˲�ͬ���µ��࣬������Ҫ������
import PackageA.ClassA;

public class ClassC extends ClassA {
	public void methodC() {
		System.out.println(super.name);//���ﲻдȨ��(default) ��private���ǻᱨ���
		System.out.println(new ClassA().name);
	}
}
