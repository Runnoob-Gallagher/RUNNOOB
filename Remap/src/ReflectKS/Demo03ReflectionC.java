package ReflectKS;

import java.lang.annotation.ElementType;

import javax.lang.model.element.Element;

public class Demo03ReflectionC {
	public static void main(String[] args) {
		Class claA = Object.class;    //��
		Class claB = Comparable.class;  //�ӿ�
		Class claC = String[].class;  //һά����
		Class claD = int[][].class;  //��ά����
		Class claE = Override.class; //ע��
		Class claF = ElementType.class; //ö��
		Class claG = Integer.class; //�������� 
		Class claH = void.class;  //������
		Class claI = Class.class; //Class����
		System.out.println(claA);
		System.out.println(claB);
		System.out.println(claC);
		System.out.println(claD);
		System.out.println(claE);
		System.out.println(claF);
		System.out.println(claG);
		System.out.println(claH);
		System.out.println(claI);
			
		// ֻҪԪ��������ά����һ���ģ�����ͬһ��Class����
		int[] arryA =new int[5];
		int[] arryB =new int[500];
		System.out.println(/*arryA.hashCode()*/ arryA.getClass().hashCode());
		System.out.println(/*arryB.hashCode()*/ arryB.getClass().hashCode());  //���￪ʼ����������hashcode�϶��ǲ��Ե�  ��ͬ��Ӧ�£��϶��ǲ�һ����
	}
}
