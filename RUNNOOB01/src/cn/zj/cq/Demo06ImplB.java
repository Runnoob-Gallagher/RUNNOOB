package cn.zj.cq;

public class Demo06ImplB<E> implements Demo06Fanxinjiekou<E>{

	@Override
	public void run(E e) {
		// TODO Auto-generated method stub
		System.out.println(e);
	}
	public static void main(String[] args) {
		Demo06ImplB<Integer> db = new Demo06ImplB<Integer>();
		//db.run("dirt÷–");
		db.run(55555);
	
		Demo06ImplB<String> ds = new Demo06ImplB<String>();
		ds.run("dsdsadasd");
		
}
}
