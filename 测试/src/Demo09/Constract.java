package Demo09;

public class Constract {
	public interface NoneCanCon{ 
		public abstract Person CreateA();
	}
		NoneCanCon NoneCanCreateA = new NoneCanCon() {//这个是多态 +匿名内部类	
//	 static NoneCanCon NoneCanCreateA = new NoneCanCon() {	
		@Override
		public Person CreateA() {
			// TODO Auto-generated method stub
			return new Person();
		}
	};
		NoneCanCon lambdaA = () -> new Person();
//下面是有参的接口
	public interface YouCanCon{
		public abstract Person CreateB(String name,int age);
	}
	YouCanCon YouCan = new YouCanCon() {
		@Override
		public Person CreateB(String name, int age) {
			// TODO Auto-generated method stub
			return new Person(name,age);
		}  
	};  
	YouCanCon YCC = (name,age) -> new Person(name,age);
	YouCanCon YCCA = Person::new;
	//YouCanCon YCCB = (name,age) -> {return new Person(name,age);};
	public static void main(String[] args) {
		Constract con = new Constract();
//		NoneCanCreateA.CreateA();
//		con.NoneCanCreateA.CreateA(); //不适用lambda方法调用无参
//		con.lambdaA.CreateA();//使用lambda方法调用无参
		con.YouCan.CreateB("yangjie", 24); 
		con.YCCA.CreateB("yangjie", 24);
		System.out.println(con.YCC.CreateB("yangjie", 25).getName());//因为是这里返回了对象，所以可以直接调用gett方法返回值
	}
} 