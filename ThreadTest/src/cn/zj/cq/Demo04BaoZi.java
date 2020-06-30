package cn.zj.cq;
//创建包子对象---->包子对象作为锁对象；因为生产包子和吃包子都是围绕包子进行的；而且是互斥的，不会同时执行
public class Demo04BaoZi {
	//对对象的属性进行设置
	String P;
	String X;
	//设置一个boolean值来判断是否存在包子
	boolean flag = false;
}
