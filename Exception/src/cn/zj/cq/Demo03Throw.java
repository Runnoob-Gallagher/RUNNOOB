package cn.zj.cq;
//throw�ؼ���

/*����---> ʹ��throw�ؼ�����ָ���ķ������׳��쳣
��ʽ--->throw new xxxException("�쳣������ԭ��");
zhuyi :
	1.throw�ؼ��ֱ���д�ڷ������ڲ�
	2.throw�ؼ��ֺ��new�Ķ��������Exception�������������
	3.throw�ؼ����׳����쳣�������Ǿͱ��봦������쳣����
		throw�ؼ��ֺ�ߴ�������RuntimeException����RuntimeException�����࣬���ǿ��Բ�����Ĭ�Ͻ���JVM������ӡ�쳣�����жϳ���)
		throw�ؼ��ֺ�ߴ������Ǳ������쳣(д�����ʱ�򱨴�)�����Ǿͱ��봦������쳣��ҪôthrowsҪôtry catch
		*/
//NullPointerException ��һ���������쳣������Ҫ�����Լ���������JVM
public class Demo03Throw {
	public static void main(String[] args) {
		int[] arrA = {1,2,3,4,5};
	//	int[] arrA = null;
		methodA(arrA, 5);//�ٸ��������ݲ�����ʱ����Ҫ���кϷ���У��---->����������ݵ���һ���յ���
	}
	public static int methodA(int[] arr,int index) {
		if(arr == null) {
			throw new NullPointerException("�㴫�ݵĲ����ǿյ�");//����Demo02WhyException�Ĵ����쳣�ò��裬JVM�ᴴ�������쳣�Ķ���������ǣ�
		}
		if(index < 0 ||index > arr.length-1) {
			throw new ArrayIndexOutOfBoundsException("����Խ���쳣");
		}
		int result = arr[index];
		return result;
	}
}
