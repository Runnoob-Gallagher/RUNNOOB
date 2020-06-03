package cn.zj.cq01;
//这个demo是练习增强for及熟悉新建数组的几种方式
/*格式：
for(数组/集合类型   变量名: 集合名/数组名 ) {
	sout(变量名);
}*/
import java.util.ArrayList;
import java.util.Collection;

public class Demo03StrongFor {
	public static void main(String[] args) {
		Collection<String> collA = new ArrayList<String>();
		collA.add("浙江");
		collA.add("上海");
		collA.add("重庆");
		collA.add("湖南");
		System.out.println(collA);
		for(String strA:collA) {
			System.out.print(strA);
		}
		String[] strA = {"天津","北京","湖北"};
		String[] strB ;
		strB = new String[]{"天津","北京","湖北"};
		String[] strC = new String[5];
		for(String newstr:strA) {
			System.out.print(newstr);
		}
	}
}
