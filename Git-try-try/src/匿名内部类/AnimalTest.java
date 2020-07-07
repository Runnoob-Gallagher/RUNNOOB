package 匿名内部类;


	public class AnimalTest {
		String name = "外部类名字";
		  public AnimalTest() {
			  
		  }
		  public AnimalTest(String string){
			  // TODO Auto-generated constructor stub }
		  }
		 
		public void methodOuter() {
			System.out.println("外部类方法");
		}
		
		class Inner{
			private String name;
			//String name = "内部类名字";
			public Inner(String name) {
				// TODO Auto-generated constructor stub
				this.name = name;
			}
			void methodAbstractA() {//外部类中的静态方法，需要匿名内部类去实现的
				System.out.println("不一定是抽象的" +"      "+ pig.name);//開始沒有🐖，因为在構造方法中没有加上this.name = name;没有传值的过程
			}
			void methodAbstractB() {
				
			}
		}
		
		Inner pig = new Inner("猪") {//重写父类中的抽象方法
			
			@Override
			void methodAbstractA() {
				methodOuter();
				// TODO Auto-generated method stub
				System.out.println("抽象方法A");
				super.methodAbstractA();
			}
			@Override
			void methodAbstractB() {
				// TODO Auto-generated method stub
				System.out.println("抽象方法B");
				super.methodAbstractB();
			}
		};
		public void println() {
			pig.methodAbstractA();
		}
		
		public static void main(String[] args) {
			AnimalTest at = new AnimalTest();
			at.println();
		}
	 
	}

