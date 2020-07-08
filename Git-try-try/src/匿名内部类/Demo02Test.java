package 匿名内部类;

class Demo02Test{
<<<<<<< HEAD
	private String MZ = "A";
	private void methodOuter() {
	 String MZ = "B";  //这个无法访问！！！！！
	 String MZ = "DD";  //前面我虽然没有写final，jdk8默认加上了final。不能做出修改
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
=======
	 void A() {
		class B{ 
			void C(){ 
				class D{
					//    d.E();开始我是写在这里的，但是呢报错：因为方法E()还没有定义呢，你怎么调用
						void E() {
						System.out.println("怎么访问呢：因为局部内部类在方法中，只能通过方法来访问，就从内至外一层一层访问");
					}
				}
				D d = new D();
				d.E();
			}
		}
		B b = new B();
		b.C();
	}
	 public static void main(String[] args) {
>>>>>>> a6dbd7774b5478ec0677739a0eedec518f83e1c1
		Demo02Test dt = new Demo02Test();
		dt.methodOuter();
	}
}