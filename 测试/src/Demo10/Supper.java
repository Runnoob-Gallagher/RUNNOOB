package Demo10;

import java.util.function.Supplier;

public class Supper {
	public static String GetString(Supplier<String> sup) {
		return sup.get();	
	}

	public static void main(String[] args) {
		GetString(new Supplier<String>() {
			@Override
			public String get() {
				// TODO Auto-generated method stub
				return  "这个是利用匿名内部类重写的";
			}
		});
		GetString(() -> {return  "这个是利用匿名内部类重写的";});
		GetString(() -> "这个是利用匿名内部类重写的");
	}
}
