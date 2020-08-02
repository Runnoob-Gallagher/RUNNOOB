package DemoStream;

import java.util.ArrayList;
import java.util.List;

public class Demo01 {
	public static void main(String[] args) {
//		创建一个List集合存储数据
		List<String> list = new ArrayList();
		list.add("杨洁");
		list.add("杨洁篪");
		list.add("刘佩佩");
		list.add("黄玉虹");
		list.add("杨柳");
		list.add("黄钰棋");
		//对集合进行过滤，然后存储到新集合
		List<String> listA = new ArrayList<String>();
		for (String listB : list) {
			if(listB.startsWith("杨")) {
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
