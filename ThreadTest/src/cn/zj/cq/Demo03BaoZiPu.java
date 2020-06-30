package cn.zj.cq;
/*包子铺线程和吃包子线程 必须互斥，意味着不能同时执行。那么就要在同一锁对象中执行
那这个对象应该选择什么呢？？   因为他们是根据包子的状态去做的。那么就应该为包子对象*/
public class Demo03BaoZiPu extends Thread {
	//先创建一个包子变量
	private Demo03BaoZi BaoZi;
	//使用带参数构造方法，为包子变量赋值
	public Demo03BaoZiPu(Demo03BaoZi pu){
		this.BaoZi = pu;
	}
	//重写run方法，生产包子
	@Override
	public void run() {
		int count = 0;
		while(true) {
		// TODO Auto-generated method stub
		synchronized (BaoZi) {
			if(BaoZi.flag) {
				try {
					BaoZi.wait();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			//当不存在包子时,生产包子
			if(count%2==0) {
				BaoZi.Pi="薄屁";
				BaoZi.Xian="韭菜";
			}else {
				BaoZi.Pi="厚皮";
				BaoZi.Xian="蘑菇";
			}
			count++;
			System.out.println("包子铺开始生产包子"+BaoZi.Pi+BaoZi.Xian+"的包子");
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}//到这里包子铺已经生产好包子了
			BaoZi.flag=true;
			BaoZi.notify();
			System.out.println("包子铺已经做好包子了"+BaoZi.Pi+BaoZi.Xian+"的包子");
		}
	}
	}
}
