package cn.zi.cq02;

/*含有泛型的接口,第一种使用方式:定义接口的实现类,实现接口,指定接口的泛型;注意一定要指定接口的泛型
 * 下面的这个例子说明了在实现接口的时候就要指定泛型的类型
public interface Iterator<E> {
    E next();
}
Scanner类实现了Iterator接口,并指定接口的泛型为String,所以重写的next方法泛型默认就是String
public final class Scanner implements Iterator<String>{
    public String next() {}
}*/
/*
 * public class Demo03FanXinImplA implements Demo03FanXinJiekou<I> { //这里我没有指定泛型的接口报错
 * //在利用程序重写接口抽象方法时，自动加上泛型类型I
 * 
 * @Override public void method(I i) { // TODO Auto-generated method stub
 * 
 * }
 * 
 * }
 */
public class Demo03FanXinImplA implements Demo03FanXinJiekou<String> {

	@Override
	public void method(String str) {
		// TODO Auto-generated method stub
		System.out.println("只能是String类型" + str);
	} 
	
	public static void main(String[] args) {
		Demo03FanXinImplA da = new Demo03FanXinImplA();
		da.method("String");
	}
	
}


 




