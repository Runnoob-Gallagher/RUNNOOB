package RefletHM;
/*
 * ���䣺����ĸ�����ɲ��ַ�װΪ��������
 * ����ִ�е������׶Σ�
 * һ��SourceԴ����׶�
 * ������д�õĴ�����javac����Ϊ.class�ļ��Ľ׶�
 * ����Class�����׶�
 * ͨ�������������.class�ļ����ص��ڴ�����ȥ�������ڴ��������������������ֽ����ļ� ��������л�����ֽ����ļ��ж���ķ��������췽������Ա������
 * �ֱ��װΪFiled����Constractor����Method�����⼸�������п��ܺ��ж��������������������ʾ������Filed[] Filed
 * 
 * ��������ʱ�׶�
 * ��������new����Ȼ����ö�������ķ���
 * 
 * ��ȡClass�������׶Σ���Ӧǰ��������׶Σ���Ӧ��������
 * 1.Class.forName("ȫ����")�����ֽ����ļ����ؽ��ڴ棬����Class����   ����׶�ֻ���ֽ����ļ�����û���ڴ�
 * 2.����.class��ͨ������������class��ȡ    ����׶Σ��ֽ����ļ��Ѿ����ڴ��У�class������Ѵ��ڣ���������������󣨱���class�����ǲ����ڵ�
 * 3.����.getClass()      ����׶����Ѿ��������˶���
 * 
 */
public class Demo01Reflect {
	public static void main(String[] args) throws ClassNotFoundException {
		Class claA = Class.forName("RefletHM.Person");   //�����������ļ��������������������ļ��У���ȡ�ļ�������class����
		System.out.println(claA);
		Class claB = Person.class; //��������
		System.out.println(claB);
		Person p = new Person();
		Class claC = p.getClass(); //���ڶ����ȡ�ֽ����ļ�����
		//��������������ȵ�
		System.out.println(claA == claB);
		System.out.println(claA == claC);
		
		Class claD = Student.class;  //˵����ͬ�����class����϶��ǲ�ͬ��
		System.out.println(claD);
	}
}
