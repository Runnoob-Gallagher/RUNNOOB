package Demo13;

public /*abstract*/ class AbstractZi extends AbstractFu {

	@Override
	public void methodA() {
		// TODO Auto-generated method stub
		System.out.println("��������ǳ����࣬Ҫô��д����ĳ��󷽷���Ҫô������Ҳ����Ϊ������");
	}
	/*@Override
	public void methodA() {
		// TODO Auto-generated method stub
		System.out.println("���񲻹������ǲ��ǳ����࣬��Ҫ��д�G");
	}
	*/
	public static void main(String[] args) {
		AbstractZi az = new AbstractZi();
		az.methodA();
		AbstractFu af = new AbstractZi();
		af.methodA();  //��ӡ�Ķ���һ���ġ�˵�����õĶ�������ķ���
	}
	
	
}
