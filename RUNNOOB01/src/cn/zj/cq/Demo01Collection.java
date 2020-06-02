package cn.zj.cq;

import java.util.ArrayList;
import java.util.Collection;

public class Demo01Collection {
	public static void main(String[] args) {
		Collection<String> colA = new ArrayList<String>();
		colA.add("个税");
		colA.add("社保");
		colA.add("电税");
		colA.add("自然人");
		colA.add("网厅");
		System.out.println(colA);
		System.out.println("验证的时候对不对：" + colA.contains("贫困户"));
		}
	}

