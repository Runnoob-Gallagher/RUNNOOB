package cn.zj.cq;

import java.util.ArrayList;
import java.util.Collection;

public class Demo01Collection {
	public static void main(String[] args) {
		Collection<String> colA = new ArrayList<String>();
		colA.add("��˰");
		colA.add("�籣");
		colA.add("��˰");
		colA.add("��Ȼ��");
		colA.add("����");
		System.out.println(colA);
		System.out.println("��֤��ʱ��Բ��ԣ�" + colA.contains("ƶ����"));
		}
	}

