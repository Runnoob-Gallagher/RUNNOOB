package Quote;

public class ObjectRefrence {
	public static void methodA(ObjectInterface oi) {
		oi.Toupper("Gallagher"); //�������и�����   �ӿ��еķ�������ֱ�ӵ��ã�������   ������ Demo12
	}
	
	//�������������������   ���������һ����������ֱ�����������������ݽ��д�д�� ����������������������
			public static void methodB(String s) {
				System.out.println(s.toUpperCase());
			}
	public static void main(String[] args) {
		new ObjectInterface() {			
			@Override
			public void Toupper(String s) {
				// TODO Auto-generated method stub
				System.out.println(s.toUpperCase());
			}
		};  //��һ��������ͨд��
		//ObjectInterface oo = ((s) -> {System.out.println(s.toUpperCase());});  //����lambdaд��
		//methodA(oo);
		//methodA((s) -> System.out.println(s.toUpperCase()));  //��ʵ�ⲿ�ֲ��Ƿ�������  ������
		
		methodA((s) -> {
			ObjectRefrence OR = new ObjectRefrence();
			OR.methodB(s);
		});
		//�����Ƕ�����Ļ���
		ObjectRefrence OR = new ObjectRefrence();
	//	methodA(OR::methodB);//��������һ����  �ҽ�methodB��Ϊ��̬����������ͻᱨ���ѵ����еķ��� �����ܵ��� ������demo12   ��ʽ���Ե�ѽ 
							//Ŷ  ����һ������  ��õ�����    ����ţƤ  �ܷ��ֺ��������
		
		
		
		methodA(ObjectRefrence::methodB);  //����   �����������
	}
}
