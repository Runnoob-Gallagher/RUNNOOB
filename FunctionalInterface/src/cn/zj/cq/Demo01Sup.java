package cn.zj.cq;

import java.util.function.Supplier;

/*	������Ԫ�ص����ֵ
	ʹ��Supplier�ӿ���Ϊ�����������ͣ�ͨ��Lambda���ʽ���int��������ֵ
	*/
public class Demo01Sup {
	public static int GetMax(Supplier<Integer> sup) {
		return sup.get();
	}
	public static void main(String[] args) {
		int[] arryA = {11,33,22,55,77,66};
		int answer = GetMax(() -> {
			int Max= arryA[0] ; 
		for(int i=0;i<arryA.length;i++) {//����Ҳ����ʹ��foreach
			if(arryA[i] > Max ) {
				Max = arryA[i];
			}
		}
		return Max; //����ΪʲôҪ��return�أ���ΪSupplier��һ������ʽ�ӿڣ����ط����е����͡��ⲿ�ֶ�����GetMax�����еġ�
		});
		System.out.println(answer);
	}
	
} 
