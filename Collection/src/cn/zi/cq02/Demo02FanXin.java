package cn.zi.cq02;

/*
 * public class Demo02FanXin { public static void main(String[] args) 
 * {
 * Demo02FanXinClass dc = new Demo02FanXinClass();
 * dc.setName("��Ϊname������ʱString����������ֻ����String����"); } 
 * }
 */
public class Demo02FanXin { 
	public static void main(String[] args) {
		Demo02FanXinClass<String> dc = new Demo02FanXinClass<String>();
		dc.setName("���");//��dc.���������������
		System.out.println(dc.getName());
		
		System.out.println("================");
		Demo02FanXinClass<Integer> dx = new Demo02FanXinClass<Integer>();
		dx.setName(999);//��dx.���������������
		System.out.println(dx.getName());
}
	
}