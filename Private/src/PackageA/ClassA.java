package PackageA;
/*//����Ȩ�����η���                                                public > protected > (default) > private    ע�⣺(default)���ǹؼ���default���ǲ�д������
ͬһ���ָࣺ�ľ��Ǳ���							Y			Y           Y          Y			
ͬһ������ֵ�þ�����һ��package��	                Y           Y           Y          N
��ͬ�����ࣺ����ͬһ�����£������и��Ӽ̳й�ϵ        Y           Y           N          N
��ͬ����ͬ���ࣺɶ��ϵҲû��						Y			N			N		   N*/

public class ClassA {
	public static String name = "Gallagher";
	public void methodA() {
		System.out.println(name);
	}
}
