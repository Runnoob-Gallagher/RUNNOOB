package cn.zi.cq02;

/*
 * public class Demo02FanXin { public static void main(String[] args) 
 * {
 * Demo02FanXinClass dc = new Demo02FanXinClass();
 * dc.setName("因为name的类型时String，所以这里只能是String类型"); } 
 * }
 */
public class Demo02FanXin { 
	public static void main(String[] args) {
		Demo02FanXinClass<String> dc = new Demo02FanXinClass<String>();
		dc.setName("杨洁");//看dc.后面带出来的类型
		System.out.println(dc.getName());
		
		System.out.println("================");
		Demo02FanXinClass<Integer> dx = new Demo02FanXinClass<Integer>();
		dx.setName(999);//看dx.后面带出来的类型
		System.out.println(dx.getName());
}
	
}