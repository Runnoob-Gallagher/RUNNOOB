package �ֽ�;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
//�ļ�����
	//����win�ĸ���ճ�������ƾ��Ƕ�Ҳ�������룬�Ӵ����ж����ڴ��У�ճ������дҲ������������ڴ���д��������
public class Demo06Copy {
	public static void main(String[] args) throws IOException {
		FileInputStream fis = new FileInputStream("E:\\TortoiseSVN\\Code_Gallagher\\sbf-app-web.war");
		FileOutputStream fos = new FileOutputStream("E:\\SVN\\Gallagher\\sbf-app-web.war");
		byte[] bt = new byte[1024];
		int len = 0;
		while((len=fis.read(bt))!=-1) {
			fos.write(bt);;
		} 
	
		fos.close(); 
		fis.close();  
	}
}
