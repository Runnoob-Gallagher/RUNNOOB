package Package;
//����ڲ�����ⲿ��������������
/*�����
	�ⲿ������.this.�ڲ�������*/
public class Repeat {
	String name = "Yasuo";
	public class Inner{
		String name = "guer";
				public void InnerMethod() {
			String name = "Jianhao";
			System.out.println(name);//��ӡ��Jianhao,�ͽ�ԭ��
			System.out.println(this.name);//��ӡ��guer����Ϊʹ����this�������Ա����
			System.out.println(Repeat.this.name);//��ӡ��Yasuo
		}
	}
}
