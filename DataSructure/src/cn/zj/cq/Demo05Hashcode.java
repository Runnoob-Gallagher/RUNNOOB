package cn.zj.cq;
//��demo��һ����ϤHashcode
/*�ص㣺
��ϣֵ-->��һ��ʮ������������ϵͳ�������(���Ƕ���ĵ�ֵַ����һ���߼���ַ������ʵ�ʴ洢�������ַ)
��Object������һ���������Ի�ö����hashֵ--> int hashCode() ���ظö���Ĺ�ϣ��ֵ
Դ��--> public native int hashCode();  native������õ��Ǳ��ز���ϵͳ�ķ���*/
public class Demo05Hashcode {
	public static void main(String[] args) {
		Demo04Class dcA = new Demo04Class();
		System.out.println(dcA.hashCode());//1190654826
		Demo04Class dcB = new Demo04Class();
		System.out.println(dcB.hashCode());//1109371569
		
		/*
		 * toString������Դ��: return getClass().getName() + "@" + Integer.toHexString(hashCode());
		 */
		System.out.println(dcA);//cn.zj.cq.Demo04Class@46f7f36a
		System.out.println(dcB);//cn.zj.cq.Demo04Class@421faab1  //@���ź������hashcode��16����ֵ
		
		String strA = "abc";
		String strB = "abc";
		System.out.println(strA.hashCode());
		System.out.println(strB.hashCode());
	}
}
