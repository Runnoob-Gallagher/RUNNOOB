package Quote;

public class Zi extends Fu{
	@Override
	public void say() {
		// TODO Auto-generated method stub
		//super.say();   //��ע�͵Ļ�  ��ִ�и���ķ���
		System.out.println("woshizi");
	}

	/*	@Override
		public void methodC(ZiFuInterface zfi) {
			// TODO Auto-generated method stub
			super.methodC(zfi);
		}*/  //���û��Ҫд
	
	public void  methodD(ZiFuInterface zfi) {
		zfi.methodA();
	}
	public void methodZi() {    //ΪʲôҪ��ôд��  ��Ĳ�Ϊʲô ���������෽���Ĳ�����һ���ӿڡ�Ȼ����ø÷���ʵ�ֽӿڣ�����ø���ķ�����Ȼ����super
		methodD(new ZiFuInterface() {
			
			@Override
			public void methodA() {
				// TODO Auto-generated method stub
			Fu fu = new Fu();
			fu.say();
			}
		});
		//�����Ӹ��࣬���Կ���ʹ��super�����ֱ࣬��ʹ��super���ø��෽��
		methodD(() -> {super.say();});
		/*	���򵥵�д�� 
			super�������Ѿ�����
			�䷽��sayҲ�Ǵ��ڵ�
			�Ϳ���ֱ��ʹ��super���ø÷���
			*/
		methodD(super::say);
	}
	public static void main(String[] args) {
		new Zi().methodZi();
	}
}
