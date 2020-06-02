package cn.zj.cq;

public class Demo01Main {
	public static void main(String[] args) {
		Demo01ArrayImp da = new Demo01ArrayImp();
		da.fly();
		da.jump();
		Demo01Link dI = new Demo01LinkImp(); 
		dI.jump();
		dI.LinkFly();
		Demo01LinkImp II = new Demo01LinkImp();
		II.jump();
		II.LinkFly();
		II.ImpFly();
		System.out.println("try try");
	}
}

