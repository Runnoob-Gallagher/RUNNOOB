package cn.zj.cq;
//���ʣ��о����finally�����ûɶ��ѽ��Ҫ��Ҫ���С��������䶼��ִ��
import java.io.FileNotFoundException;

//���demo������һ��demo������finally
public class Demo07NotFinally {
	public static void main(String[] args) {
	try {
		methodA("E:\\\\\\Repositor");//�������������쳣����ô��������Ͳ���ִ�е�
		System.out.println("wohuizhixingma?");
	}catch(FileNotFoundException e) {
		e.printStackTrace();
		
	} 
	System.out.println("������һ᲻��ִ���أ�");
}
 
	public static void methodA(String filepath) throws FileNotFoundException {
		/*
		 * if(!filepath.endsWith("tory")) { System.out.println("�ļ�����׺���ǲ���Ŷ"); }
		 */
		String path = "E:\\\\Repositor";
		if(!path.equals(filepath)) {
			//System.out.println("�ļ�·���Ҳ���");��ʼ��������д�ĵ���ǰ���try catch����Unreachable catch block for FileNotFoundException. This exception is never thrown from the try statement body
			//�����ԭ������Ϊcatch�е������Զ�����ܳ��쳣����ԭ���������ܳ��쳣���ɣ��㿴�����
			throw new FileNotFoundException("����ļ����Բ���");
		}
				System.out.println("·��û��");
}
	}
