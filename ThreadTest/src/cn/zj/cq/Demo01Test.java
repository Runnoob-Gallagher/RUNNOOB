package cn.zj.cq;

/*测试类，用main函数启动程序
创建包子对象
创建包子铺线程
创建顾客线程，吃包子*/
public class Demo01Test {
	public static void main(String[] args) {
		Demo01BaoZi dpz = new Demo01BaoZi();
		//创建包子铺线程生产包子
		new Demo01BaoZiPu(dpz).start();
		//创建吃货线程吃包子
		new Demo01Guke(dpz).start();
	}
}
