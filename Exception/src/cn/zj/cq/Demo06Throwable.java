package cn.zj.cq;

import java.io.FileNotFoundException;

//���demo����ϤThrowable����쳣����������,����Ͳ���ʹ��throws��
/*1.String getMessage() ���ش�throwable�ļ������
2.String toString() ����throwable����ϸ��Ϣ�ַ���
3.void printStackTrace()  JVM��ӡ�쳣����Ĭ�ϸ÷�������Ϣ����ȫ���*/
public class Demo06Throwable {
	public static void main(String[] args) throws FileNotFoundException {
		try {
		methodA("D:/sk");
	}catch(FileNotFoundException e) {//�������ߵ���Ϣ��Խ��Խȫ
		System.out.println(e.getMessage());
		System.out.println(e.toString());//�����toString��ͬ��ʲô����д��
		e.printStackTrace(); 
	}
	}
	public static void methodA(String filepath) throws FileNotFoundException {
		String filepa = "D:/task";
		
		  if(!filepa.equals(filepath)) { 
		  throw new FileNotFoundException("����ļ�������");
		    }
		 
		
	}
}

