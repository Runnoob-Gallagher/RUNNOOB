package Demo09;
//JDK8 �ӿ��пɶ���ķ���
public interface Face {
	public abstract void abstra();//�ӿ��ж���ĳ��󷽷�
	public default void defaul() {
		System.out.println("�ӿ��ж����Ĭ�Ϸ���");
	}
	public static void  stat() {
		System.out.println("�ӿ��ж���ľ�̬����");
	}
	Face f = new Face() {//�����ڲ���-->Ϊʲô��Ϊ��������Ϊ����ǽӿڵ�ʵ���࣬û�ж������֡�ǰ���Face fֻ�Ǹ��������á�
		
		@Override 
		public void abstra() {
			// TODO Auto-generated method stub
			System.out.println("�����ڲ���");
		}
	};
	public static void main(String[] args) {
		Face.stat(); //�ӿ��еľ�̬��������ֱ���ýӿ�������
		f.defaul();//�ӿ��е�Ĭ�Ϸ�������ʹ��ʵ����ȥ����
		f.abstra();//����ʵ�����еķ���
		Face.f.abstra();//����ʵ����ķ���
		System.out.println(f.getClass());
		System.out.println(Face.f.getClass()); //���������������������֪�����õĶ���ʵ����
	}
}
