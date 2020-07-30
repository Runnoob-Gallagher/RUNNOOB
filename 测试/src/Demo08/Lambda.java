package Demo08;

public class Lambda {
	PersonCreat PC = new PersonCreat() {//匿名内部类
		@Override
		public Person Create() {
			// TODO Auto-generated method stub
			return new Person();
		}
	};
	PersonC Pe = new PersonC() {
		
		@Override
		public Person Create(String name, int age) {
			// TODO Auto-generated method stub
			return new Person("yy",32);
		}
	};
	static PersonCreat PP = () -> {return new Person();}; //--->static PersonCreat PP = () -> new Person();
	static PersonCreat CC = Person::new;//这个new代表构造方法
	Person a = Pe.Create("yan",33);
	public interface PersonCreat{
		public  abstract Person Create();
	}
	public interface PersonC{
		public abstract Person Create(String name,int age);
	}
	public static void main(String[] args) {
		Lambda lambda = new Lambda();
		lambda.PC.Create();
	//	PP.Create();
	}
}

 