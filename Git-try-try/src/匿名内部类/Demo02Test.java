package 匿名内部类;

class Demo02Test{
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
		Demo02Test dt = new Demo02Test();
		dt.A();//调用了A方法，要想继续，就得在A方法中创建对象继续调用
	}
}