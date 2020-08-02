package Quote;

public class Zi extends Fu{
	@Override
	public void say() {
		// TODO Auto-generated method stub
		//super.say();   //不注释的话  就执行父类的方法
		System.out.println("woshizi");
	}

	/*	@Override
		public void methodC(ZiFuInterface zfi) {
			// TODO Auto-generated method stub
			super.methodC(zfi);
		}*/  //这个没必要写
	
	public void  methodD(ZiFuInterface zfi) {
		zfi.methodA();
	}
	public void methodZi() {    //为什么要这么写，  真的不为什么 ，就是子类方法的参数是一个接口。然后调用该方法实现接口，想调用父类的方法，然后用super
		methodD(new ZiFuInterface() {
			
			@Override
			public void methodA() {
				// TODO Auto-generated method stub
			Fu fu = new Fu();
			fu.say();
			}
		});
		//具有子父类，所以可以使用super代表父类，直接使用super调用父类方法
		methodD(() -> {super.say();});
		/*	更简单的写法 
			super代表父类已经存在
			其方法say也是存在的
			就可以直接使用super调用该方法
			*/
		methodD(super::say);
	}
	public static void main(String[] args) {
		new Zi().methodZi();
	}
}
