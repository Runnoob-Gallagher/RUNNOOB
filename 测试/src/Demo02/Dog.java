package Demo02;
/*
 * ����һ��Dog��̳г�����Animal����д���󷽷�eat��
 * ���෽��methodA()����Ϊ�����࣬����������֪����ʵ�ʴ��ݵ��ǳ����������Dog����
 */
public class Dog extends Animal {
	@Override
	public void eat() {
		// TODO Auto-generated method stub
		System.out.println("ǡʺ");
	}
	public void methodA(Animal an) {
		an.eat();
	}
	public static void main(String[] args) {
		Dog d = new Dog();
		d.eat();
	}
}
