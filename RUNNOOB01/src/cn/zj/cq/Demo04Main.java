package cn.zj.cq;

public class Demo04Main {
	public static void main(String[] args) {
		Demo04FanxinMethod df = new Demo04FanxinMethod();
		//浣犱紶閫掍粈涔堢被鍨嬩粬灏辨槸浠�涔堢被鍨�
		df.method("杩欐槸String绫诲瀷");
		df.method('A');
		df.method(5);
		df.method(true);
		System.out.print("999");
		Demo04FanxinMethod.jump("浼犻�扴tring");
	}
}
