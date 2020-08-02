package Quote;

public class ObjectRefrence {
	public static void methodA(ObjectInterface oi) {
		oi.Toupper("Gallagher"); //这里又有个疑问   接口中的方法可以直接调用？？？？   看测试 Demo12
	}
	
	//在这里！！！！！！！！   如果我们有一个方法可以直接做到将给定的数据进行大写呢 ！！！！！！！！！！！
			public static void methodB(String s) {
				System.out.println(s.toUpperCase());
			}
	public static void main(String[] args) {
		new ObjectInterface() {			
			@Override
			public void Toupper(String s) {
				// TODO Auto-generated method stub
				System.out.println(s.toUpperCase());
			}
		};  //这一部分是普通写法
		//ObjectInterface oo = ((s) -> {System.out.println(s.toUpperCase());});  //这是lambda写法
		//methodA(oo);
		//methodA((s) -> System.out.println(s.toUpperCase()));  //其实这部分不是方法引用  看下面
		
		methodA((s) -> {
			ObjectRefrence OR = new ObjectRefrence();
			OR.methodB(s);
		});
		//下面是对上面的化简
		ObjectRefrence OR = new ObjectRefrence();
	//	methodA(OR::methodB);//在这里有一个错  我将methodB置为静态方法，这里就会报错，难道类中的方法 对象不能调用 看测试demo12   答案式可以的呀 
							//哦  看下一章内容  会得到解释    我真牛皮  能发现后面的问题
		
		
		
		methodA(ObjectRefrence::methodB);  //完美   我真他妈聪明
	}
}
