package cn.zi.cq02;
/*
���з��͵Ľӿڵڶ���ʹ�÷�ʽ:�ӿ�ʹ��ʲô����,ʵ�����ʹ��ʲô����,����Žӿ���   //ע��ȽϺ͵�һ�ֵ�����
���൱�ڶ�����һ�����з��͵���,���������ʱ��ȷ�����͵�����
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
	public void method(I i) {      //ע��Ƚϵ�һ�ֵ�����
		// TODO Auto-generated method stub
		System.out.println(i);
	}
	public static void main(String[] args) {
		Demo03FanXinImplB<String> db = new Demo03FanXinImplB<String>();
		db.method("��������ʱʹ�õ���String");
		Demo03FanXinImplB<Integer> di = new Demo03FanXinImplB<Integer>();
		di.method(9999);
	}

}
