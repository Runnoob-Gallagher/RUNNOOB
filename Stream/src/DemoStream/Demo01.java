package DemoStream;

import java.util.ArrayList;
import java.util.List;

public class Demo01 {
	public static void main(String[] args) {
//		����һ��List���ϴ洢����
		List<String> list = new ArrayList();
		list.add("���");
		list.add("�����");
		list.add("������");
		list.add("�����");
		list.add("����");
		list.add("������");
		//�Լ��Ͻ��й��ˣ�Ȼ��洢���¼���
		List<String> listA = new ArrayList<String>();
		for (String listB : list) {
			if(listB.startsWith("��")) {
				listA.add(listB);
			}
		}
		List<String> listD = new ArrayList<String>();
		for (String listC : listA) {
			if(listC.length() == 2) {
				listD.add(listC);
			}
		}
		for (String listE : listD) {
			System.out.println(listE);
		}
	}
}
