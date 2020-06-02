package cn.zj.cq;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class Demo07Fanxin {
	public static void main(String[] args) {
		ArrayList<String> al = new ArrayList<String>();
		al.add("String");
		al.add(1, "Str");
		ArrayList<Integer> ai = new ArrayList<Integer>();
		ai.add(40);
		ai.add(1, 33);
		Collection<Object> co = new ArrayList<Object>();
		Iterator<Object> it = co.iterator();
		if(it.hasNext()) {
			System.out.println(it.next());
		}
	}
}
