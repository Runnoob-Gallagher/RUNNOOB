package cn.zj.cq;

import java.util.Objects;

//���demo���жϴ��ݵĲ����Ƿ�Ϊ�յļ��׷���
public class Demo04Requirenull {
	public static void main(String[] args) {
		methodA(null);
	}
	/*
	 * public static void methodA(Object obj)
	 *  { if(obj == null) { 
	 *  throw new NullPointerException("�㴫�ݵĲ����ǿյ�"); 
	 *  	} 
	 *  		}
	 */
	public static void methodA(Object obj) {
		Objects.requireNonNull(obj,"���ݵĲ����ǿյ�");//�����ͬ��������һ��
	}
}
