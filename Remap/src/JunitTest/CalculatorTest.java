package JunitTest;


import org.junit.After;
/*
 * ��ʼ��������Before
 * ������Դ���룬���൱����ִ�в��Է���֮ǰ������ȥִ����
 * ���շ��� After
 * ������Դ���������൱�����ձ���Ҫִ�е�һ�δ���
 */
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import Junit.Calculator;

public class CalculatorTest {
	
	//ֱ�Ӷ��巽��ȥ����,���ǲ���Ҫmain����ȥ��Ϊ��������� �����Ҫ�õ�Junit���@Test����,��Ҫ����Junit������	 
	
	//ע�⣺ʹ����Junit֮����ڲ��Խ���ǲ��ÿ����Խ�����ǿ���ɫ��������и����⣬�����������ִ�У����ǽ������Ԥ�ڣ���������ʾ��ɫ��
	//�����Ǿ�Ҫʹ����һ��-----���ԣ����൱�ڽ����Ԥ�����Assert
	@Test
	public void add() {
		Calculator Ca = new Calculator();
		int resultA = Ca.add(1, 3);
		System.out.println("֤����Ҳ��ִ���˵�");
		//System.out.println(result);
		int resultB = Ca.sub(1, 2);  //����ʵ�ʽ��Ϊ2����������õ��Ľ����-1.ԭ�����ҷ���д����
		//��������Assertȥ�ж�
		Assert.assertEquals(-1, resultB);//�������ʱ����ʾ�ľ��Ǻ�ɫ
	}
	@Before
	public void before() {
		System.out.println("Before����");
	}
	@After
	public void after() {
		System.out.println("After����");
	}
}
