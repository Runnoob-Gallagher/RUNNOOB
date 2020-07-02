package cn.zj.cq;

public class Main {
	public static void main(String[] args) {
		Electric e = new Electric();
		new Sunshine(e).start();
		new Computer(e).start();
}
}
