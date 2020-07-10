package 匿名内部类;

class Demo02Test{
	private String MZ = "A";
	private void methodOuter() {
	 String MZ = "B";  //前面默认加上final
         //String MZ = "DD";  //前面我虽然没有写final，jdk8默认加上了final。不能做出修改，会提示报错的
	  class Inner{       //这里如果你加了public、private、static修饰，那么会提示：Remove invalid modifiers
			private String name = "C"; 
			private void methodInner() { 
				String name ="D";
				System.out.println("输出局部内部类方法中的名："+ name);
				System.out.println("输出局部内部类定义中的名：" + this.name);
				System.out.println("输出外部类定义的名字：" + MZ); 
				System.out.println("输出包含内部类的方法中定义的名字" + Demo02Test.this.MZ);
			}  
		} 
	  //在他的方法中创建内部类对象
	  Inner in = new Inner();
	  in.methodInner();
	  System.out.println("我要访问包含内部类的方法中的属性值：" + Demo02Test.this.MZ);
	  System.out.println("我要访问外部类的属性值：" + new Demo02Test().MZ);
	  	}
	  //这里我在外部类中创建内部类的实例,是会提示报错的
	/*
	 * Inner in = new Inner();
	 * System.out.println(name);
	 */
	  public static void main(String[] args) {
		Demo02Test dt = new Demo02Test();
		dt.methodOuter();
	}
}