package �ֽ�;

import java.io.FileOutputStream;
import java.io.IOException;

/*
 FileOutputStream(String name, boolean append)  ����һ�������ָ�� name ���ļ���д�����ݵ�����ļ���
 */
public class Demo03FileOutputStreamAppend {
	public static void main(String[] args) throws IOException {
//		����FileOutputStream�����ڹ������д���ָ����·���ļ�
//		FileOutputStream fosA = new FileOutputStream("E:\\SVN\\Code_Gallagher.txt");
//		����д����
		//fosA.write("Good Good Study,Day Day Up".getBytes());
//		�ر���Դ
		//fosA.close();
		/*
		 * ����ʹ��FileOutputStream(String name, boolean append)������������׷�����ݡ�
		 * ���append��booleanֵΪtrue��ô����׷�ӣ������false��ô�����½�һ���ļ���д�����ݣ�����ԭ�����ļ���
		 */
		FileOutputStream fosB = new FileOutputStream("E:\\SVN\\Code_Gallagher.txt", true);
		fosB.write("������׷�ӵ�����,��Ϊappend��booleanֵ��true".getBytes());
//		fosB.close();
		
//		���в���
		/*
		 win��\r\n
		 linux:/n
		 */
		
		fosB.write("\r\n".getBytes());
		fosB.write("Good Good Study,Day Day Up".getBytes());
		fosB.close(); 
	}
}
