package cn.zi.cq02;

/*���з��͵Ľӿ�,��һ��ʹ�÷�ʽ:����ӿڵ�ʵ����,ʵ�ֽӿ�,ָ���ӿڵķ���;ע��һ��Ҫָ���ӿڵķ���
 * ������������˵������ʵ�ֽӿڵ�ʱ���Ҫָ�����͵�����
public interface Iterator<E> {
    E next();
}
Scanner��ʵ����Iterator�ӿ�,��ָ���ӿڵķ���ΪString,������д��next��������Ĭ�Ͼ���String
public final class Scanner implements Iterator<String>{
    public String next() {}
}*/
/*
 * public class Demo03FanXinImplA implements Demo03FanXinJiekou<I> { //������û��ָ�����͵Ľӿڱ���
 * //�����ó�����д�ӿڳ��󷽷�ʱ���Զ����Ϸ�������I
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
		System.out.println("ֻ����String����" + str);
	} 
	
	public static void main(String[] args) {
		Demo03FanXinImplA da = new Demo03FanXinImplA();
		da.method("String");
	}
	
}


 




