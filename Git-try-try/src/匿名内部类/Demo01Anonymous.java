package �����ڲ���;

public class Demo01Anonymous {
	private String name = "�ⲿ���Ա";
	private void outermethod() {
				class inner{
			private String name = "�ڲ����Ա";
			private void innermethod() {
				String name = "�ڲ����Ա";
				System.out.println("�ֲ��ڲ��෽��");
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
 