package cn.zj.cq;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

//���demo�ǽ����쳣��
/*java.lang.Throwable:����java���������д�����쳣�ĳ���
	Exception:�������쳣�����б���(д����)java������ֵ�����
		RuntimeException���������쳣��java�������й����г��ֵ�����
		�쳣���൱��һ��Сë�������쳣���������Ϳ��Լ���ִ����
	Error����
		������൱�ڳ������һ���޷�������ë���������޸�Դ���룬��������޷���������*/
public class Demo01Exception {
	/*   ����һ��ʹ��throws�׳��쳣
	 * public static void main(String[] args) throws ParseException {
	 * SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd"); Date date =
	 * sdf.parse("1999-11-11"); System.out.println(date); }
	 */
	public static void main(String[] args) throws ArrayIndexOutOfBoundsException {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		Date date = null;
		try {
			date = sdf.parse("1999-1111");
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			System.out.println("ת���������һ����ĸ�ʽ");
			e.printStackTrace();
		}
		System.out.println(date);
		System.out.println("try catch ����ִ�к�������");
		
		
		int[] arrA = {1,2,3,4};
		int i =4 ;
		/*
		 * try { System.out.println(arrA[i]); }catch(ArrayIndexOutOfBoundsException e) {
		 * System.out.println("�������Խ����"); } System.out.println("try catch ����ִ�к�������");
		 */
		System.out.println(arrA[i]);//���ֱ�����ֱ��throws??????
		
	}
}
