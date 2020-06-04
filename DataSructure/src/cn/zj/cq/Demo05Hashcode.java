package cn.zj.cq;
//该demo是一个熟悉Hashcode
/*特点：
哈希值-->是一个十进制整数。由系统随机给出(就是对象的地址值，是一个逻辑地址，不是实际存储的物理地址)
在Object类中有一个方法可以获得对象的hash值--> int hashCode() 返回该对象的哈希码值
源码--> public native int hashCode();  native代表调用的是本地操作系统的方法*/
public class Demo05Hashcode {
	public static void main(String[] args) {
		Demo04Class dcA = new Demo04Class();
		System.out.println(dcA.hashCode());//1190654826
		Demo04Class dcB = new Demo04Class();
		System.out.println(dcB.hashCode());//1109371569
		
		/*
		 * toString方法的源码: return getClass().getName() + "@" + Integer.toHexString(hashCode());
		 */
		System.out.println(dcA);//cn.zj.cq.Demo04Class@46f7f36a
		System.out.println(dcB);//cn.zj.cq.Demo04Class@421faab1  //@符号后面就是hashcode的16进制值
		
		String strA = "abc";
		String strB = "abc";
		System.out.println(strA.hashCode());
		System.out.println(strB.hashCode());
	}
}
