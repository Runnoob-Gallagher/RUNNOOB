package cn.zj.cq;

import java.io.FileNotFoundException;

//���demo����Ϥfinally�������Ƿ�����쳣��finally�еĴ��붼��ִ��,�������ʹ���أ�����һ������
public class Demo07Finally {
	public static void main(String[] args) throws FileNotFoundException {
		try {
			methodA("D:/ddd");
		}catch(FileNotFoundException e) {
			e.printStackTrace();
		}finally{
			System.out.println("���ܳ�����������Ҷ���ִ��");
		}

	}  
	public static void methodA(String filepath) throws FileNotFoundException {
		String path = "D:/ddd";
		if(!path.equals(filepath)) { 
		throw new FileNotFoundException("�ļ�������");
		}
	}
}
