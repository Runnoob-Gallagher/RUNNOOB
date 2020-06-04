package cn.zi.cq02;
/*
含有泛型的接口第二种使用方式:接口使用什么泛型,实现类就使用什么泛型,类跟着接口走   //注意比较和第一种的区别
就相当于定义了一个含有泛型的类,创建对象的时候确定泛型的类型
public interface List<E>{
    boolean add(E e);
    E get(int index);
}
public class ArrayList<E> implements List<E>{
    public boolean add(E e) {}
    public E get(int index) {}
}
*/ 
public class Demo03FanXinImplB<I> implements Demo03FanXinJiekou<I>{

	@Override
	public void method(I i) {      //注意比较第一种的区别
		// TODO Auto-generated method stub
		System.out.println(i);
	}
	public static void main(String[] args) {
		Demo03FanXinImplB<String> db = new Demo03FanXinImplB<String>();
		db.method("创建对象时使用的是String");
		Demo03FanXinImplB<Integer> di = new Demo03FanXinImplB<Integer>();
		di.method(9999);
	}

}
