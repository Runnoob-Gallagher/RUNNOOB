package Test;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import Junit.Demo01;

public class CalculatorTest {
	//��ʼ������   �������쳣�е�finally   �ڲ��Է���ִ��֮ǰִ��   ���ڷ���֮ǰ����  @Before
	@Before
	public void init() {
		System.out.println("���ǳ��Է���");
	}
	
	@Test
	public void addtest() {
		System.out.println("��֣���û��main����Ҳ��ִ��");
		//1.�������������󣬵��ü��㹦��
		Demo01 de = new Demo01();
		int addresult = de.add(1, 2);
		System.out.println(addresult);  //ֱ��ִ�з���������������ɫ�Ŀ򣬴������ͨ��
		//������һ�����������Ľ������������Ҫ�ģ�����������û�б����������ǿ���Ԥ����----����
		Assert.assertEquals(3, addresult);   //�����ҰѼӷ���Ϊ�˳˷����϶���Ԥ��ֵ3 ��һ��
	}
	@After
	public void fina() {
		System.out.println("�������ķ���");
	}
	
}
