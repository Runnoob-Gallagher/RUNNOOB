package cn.zj.cq;
//���demo������˵���ɱ�����ģ�
/*�ص㣺
1.�������Ĳ����б�����������Ѿ�ȷ�������ǲ�������������---->ʹ�ÿɱ����
2.��ʽ��
���η� ����ֵ���� ������(��������...������) {}
3.ԭ��
�ɱ�����ײ����һ�����飬���ݴ��ݲ��������Ĳ�ͬ��������ͬ���ȵ��������洢��Щ����*/
public class Demo09Variable {
		public static void main(String[] args) {
			System.out.println(methodA(99, 99));
			System.out.println(methodB(1,2,3,4,5,6,7,8,9,10));
		}
		public static int methodA(int a,int b) {//�������Ĳ��������ܶ�Ļ����ǾͲ������ˡ�ʹ�ÿɱ���������
			return a+b;
		}
		public static int methodB(int...var) {
			int sum = 0;
			for(int i:var) {
				sum += i;
			}
			return sum;
		}
}
