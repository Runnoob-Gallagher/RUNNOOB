package Demo09;

public class Constract {
	public interface NoneCanCon{ 
		public abstract Person CreateA();
	}
		NoneCanCon NoneCanCreateA = new NoneCanCon() {//����Ƕ�̬ +�����ڲ���	
//	 static NoneCanCon NoneCanCreateA = new NoneCanCon() {	
		@Override
		public Person CreateA() {
			// TODO Auto-generated method stub
			return new Person();
		}
	};
		NoneCanCon lambdaA = () -> new Person();
//�������вεĽӿ�
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
//		con.NoneCanCreateA.CreateA(); //������lambda���������޲�
//		con.lambdaA.CreateA();//ʹ��lambda���������޲�
		con.YouCan.CreateB("yangjie", 24); 
		con.YCCA.CreateB("yangjie", 24);
		System.out.println(con.YCC.CreateB("yangjie", 25).getName());//��Ϊ�����ﷵ���˶������Կ���ֱ�ӵ���gett��������ֵ
	}
} 