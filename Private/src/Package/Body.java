package Package;
//���Demo��˵�ĳ�Ա�ڲ���
/*��ʽ��
	Ȩ�����η� class ������{
		Ȩ�����η� class ������{
			....
		}
		....
}
ע�⣺�ڲ����п�����������ⲿ�࣬�����ⲿ������ڲ������ʹ�ö������*/
public class Body {
	public class Heat {
		public int age = 24;
		public void methodHeart() {
						System.out.println("��������" + name);//�����ڲ�������ⲿ�࣬������ʡ�����Ȩ����privateҲһ��
		}
	}
	private String name = "Galagher";
	public void methodBody() {
		//System.out.println("������������ǣ�" + age);//��������ڲ����е�Ȩ����private���ǲ����Ǹ�����
		System.out.println(new Heat().age);//���ﴴ����Heart����������ŷ��ʵ���
		System.out.println("����һ������");
	}
	public static void main(String[] args) {
		Body b = new Body();
		b.methodBody(); //ͨ�������ⲿ��ķ�����ӵ����ڲ���
		int num = b.new Heat().age;//����ͨ���ⲿ������.�ڲ�������.������ֱ�ӵ���
		System.out.println(num);
	}
}
