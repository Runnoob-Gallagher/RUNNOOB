package cn.zj.cq01;
//���demo����ϰ��ǿfor����Ϥ�½�����ļ��ַ�ʽ
/*��ʽ��
for(����/��������   ������: ������/������ ) {
	sout(������);
}*/
import java.util.ArrayList;
import java.util.Collection;

public class Demo03StrongFor {
	public static void main(String[] args) {
		Collection<String> collA = new ArrayList<String>();
		collA.add("�㽭");
		collA.add("�Ϻ�");
		collA.add("����");
		collA.add("����");
		System.out.println(collA);
		for(String strA:collA) {
			System.out.print(strA);
		}
		String[] strA = {"���","����","����"};
		String[] strB ;
		strB = new String[]{"���","����","����"};
		String[] strC = new String[5];
		for(String newstr:strA) {
			System.out.print(newstr);
		}
	}
}
