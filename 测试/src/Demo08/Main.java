package Demo08;

public class Main {
	public static void main(String[] args) {
		//Lambda lambda = () -> {return new Person();};//������Ϊ�ӿ��еķ���ʱ����һ��Person����
		
		//��������ǹ��췽��������
		Lambda lambda = Person::new; //��Ϊ���췽���ǶԶ�����г�ʼ���ģ�������������Ҫ�����Ķ��󣿣�
		Person p = lambda.getConstructor();
	}
	//����һ��
}
