package cn.zj.cq;
//���demo�ǽ����쳣ִ�еù���
public class Demo02WhyException {
	public static void main(String[] args) {
		int[] arrA = {1,2,3};
		int re = methodA(arrA , 3);
		System.out.println(re);
	}
	public static int methodA(int[] arr,int index) {
		int result = arr[index];
		return result;
	}
}
/*
 * 1.��JVM�������������Խ���쳣��JVM����������
 *  ��JVM������쳣������ԭ�򴴽�һ���쳣��������쳣�����쳣������ԭ�����ݡ�λ��
 * ���ڳ����쳣�ķ����У�û���ܹ������쳣���߼�-->try catch ��ôJVM�ͻὫ�쳣�׸������ĵ����� main����
 * 2.��main�������յ�����쳣֮�󣬷����Լ�Ҳû�а취�������쳣���ͼ���������쳣�׸���һ��-->JVM
 * 3.JVM���յ�����쳣֮��
 * 	�ٽ��쳣������λ�á�ԭ����������������̨��
 * 	����ֹ�������Ľ���
 */