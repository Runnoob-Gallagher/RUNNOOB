package cn.zj.cq01;

import java.util.Collection;
import java.util.HashSet;

//这个demo用以验证Collection作为单列集合最顶层的接口，所以单列集合（ArrayList、HashSet等等）都可以使用共用的方法
//       add、remove、isEmpty、contains、toArrays
public class Demo01Collection {
	public static void main(String[] args) {
		//Collection collA = new Collection();这里接口不能创建对象的，暂时理解接口不能创建对象：接口里面都是抽象方法，创建对象来干嘛呢
		Collection<String> collA = new HashSet<String>();
		collA.add("猪八戒");
		collA.add("唐僧");
		collA.add("孙悟空");
		collA.add("白龙马");
		//add的源码是boolean add(E e);返回的是一个boolean值：下例说明
		boolean boolA = collA.add("沙僧");
		System.out.println(boolA);//当你成功插入之后就返回false
		System.out.println(collA);
		collA.remove("白龙马");
		//同上remove的源码boolean remove(Object o);；返回一个boolean值：下例说明
		boolean boolB = collA.remove("白龙马");//这里返回错误，因为你已经删除
		System.out.println(boolB);
		System.out.println(collA);
		Collection<String> collB = new HashSet<String>();
		collB.add("唐");
		collB.add("猪八");
		collB.add("白龙");
		collA.addAll(collB);
		collA.removeAll(collB);
		/*
		 * 下面同理的方法： public boolean contains(E e): 判断当前集合中是否包含给定的对象。
		 *  public boolean isEmpty(): 判断当前集合是否为空。 
		 *  public int size(): 返回集合中元素的个数。
		 *   public void clear():清空集合中所有的元素。但是不删除集合,集合还存在 
		 */ 
		//public Object[] toArray(): 把集合中的元素，存储到数组中。:下例说明
		//String[] strA = new String[]; //这里报错，因为toArray的源码是Object[] toArray();类型为Object
		Object[] strA = new Object[4];
		strA = collA.toArray();
		for(int i = 0;i < collA.size(); i++) {
			System.out.print(strA[i] + " ");
		}
	}
}
