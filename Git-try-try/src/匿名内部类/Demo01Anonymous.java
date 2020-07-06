package 匿名内部类;

public class Demo01Anonymous {
	private String name = "外部类成员";
	private void outermethod() {
				class inner{
			private String name = "内部类成员";
			private void innermethod() {
				String name = "内部类成员";
				System.out.println("局部内部类方法");
			}
		}
				inner in = new inner();
				in.innermethod();
	}
	public static void main(String[] args) {
		Demo01Anonymous da = new Demo01Anonymous();
		System.out.println(da.name);
		da.outermethod();
	}
}
 