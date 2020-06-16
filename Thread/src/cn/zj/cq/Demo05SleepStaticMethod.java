package cn.zj.cq;

public class Demo05SleepStaticMethod {
	public static void main(String[] args) throws InterruptedException {
		for(int i = 0; i < 5; i++) {
			/*
			 * try { Thread.sleep(1000); } 
			 * catch (InterruptedException e) { // TODO
			 * Auto-generated catch block e.printStackTrace(); }
			 */
			Thread.sleep(1000); //或者使用try catch
			System.out.println(i);
		}
}
}
 