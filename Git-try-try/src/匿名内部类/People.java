package �����ڲ���;
//�����People���У����ڲ���run��Game�ֱ�̳�Excersise��Entertainment����д�˸���ķ���
//Ȼ�����ⲿ��֮�ⴴ���ڲ���������Է��������ڲ��࣬�Ӷ��ﵽ����̳е�Ч����;
public class People {
	private class run extends Excersise{
		@Override
		public void exec() {
			// TODO Auto-generated method stub
			System.out.println("���˶��ķ�������");
		}
 
	}
	private class Game extends Entertainment{
		@Override
		public void Happy() {
			// TODO Auto-generated method stub
			System.out.println("�����ֵķ�ʽ�Ǵ���Ϸ");
		}
	}
	public static void main(String[] args) {
		People pp = new People();
		pp.new run().exec();
		pp.new Game().Happy();
		
	}
}
