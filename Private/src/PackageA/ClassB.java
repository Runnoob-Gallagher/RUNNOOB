package PackageA;
//���ClassB��ClassA����ͬһ�����£����ǲ�ͬ�ࡣ�൱���ھ�
/*������ClassB��Ҫ����ClassA�еĳ�Ա����name,��Ϊ��Ա����name���Ǳ�static���εģ�������Ҫͨ��name��������ȥ����;
	����������staticҲ�ǲ��ܷ��ʵģ���һ�붼����ѧ*/
public class ClassB {
	public void menthodB() {
		System.out.println(new ClassA().name);//������ͨ����������������з��ʵģ�����Ȩ��һ��Ϊprivate�Ͳ��С�
											  //private���ε�ֻ���ڱ����з���
	}
}
