package �ַ�;

import java.io.FileWriter;
import java.io.IOException;

/*
	 �쳣������߼���
	 	try{
	 	//���ܻ���ֵ��쳣��
	 	}catch(�쳣����� �쳣��){
	 	//�쳣����
	 	}finally{
	 	//һ����ִ�еĴ���
	 	 * ��Դ�ͷ�
	 	}
	 */
public class Demo05FileWriterTry {
	public static void main(String[] args) {
		FileWriter fw = null;//ֱ��дfw.close,����ʾfw.closeδ���塣�鿴ǰ��֪����fw������try������ж���ģ���ô������Ч��Χ�ͽ��ڴ�����У������õ�����ߵĴ�������
		//�����fw.close���Ǳ�����Ϊ�����еı����ڶ���ʱ���Բ���ֵ��������ʹ�õ�ʱ����븳ֵ;
		try {
			 fw = new FileWriter("Ee:\\SVN\\RUNOOB.xt");
			char[] chA = {'һ','��','��','��','��','��','��'};
			char[] chB = {};
			fw.write(chB);
			//fw.close();//������Դ�رղ��ܷ����⣬��Ϊ���fw.write()����ִ��ʧ�ܵĻ���fw.close()�Ͳ���ִ�С�
		} catch (IOException e) {
			// TODO: handle exception
			System.out.println(e);
		}finally {
			try {
				fw.close();//�����fw.close���Ǳ�����Ϊ�����еı����ڶ���ʱ���Բ���ֵ��������ʹ�õ�ʱ����븳ֵ;
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} //ֱ��дfw.close,����ʾfw.closeδ���塣�鿴ǰ��֪����fw������try������ж���ģ���ô������Ч��Χ�ͽ��ڴ�����У�
		}
	}
}
