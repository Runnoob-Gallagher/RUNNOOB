package 匿名内部类;
//着这个People类中，有内部类run和Game分别继承Excersise和Entertainment。重写了父类的方法
//然后在外部类之外创建内部类对象，用以访问两个内部类，从而达到“多继承的效果”;
public class People {
	private class run extends Excersise{
		@Override
		public void exec() {
			// TODO Auto-generated method stub
			System.out.println("我运动的方法是跑");
		}
 
	}
	private class Game extends Entertainment{
		@Override
		public void Happy() {
			// TODO Auto-generated method stub
			System.out.println("我娱乐的方式是打游戏");
		}
	}
	public static void main(String[] args) {
		People pp = new People();
		pp.new run().exec();
		pp.new Game().Happy();
		
	}
}
