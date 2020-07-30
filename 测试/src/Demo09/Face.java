package Demo09;
//JDK8 接口中可定义的方法
public interface Face {
	public abstract void abstra();//接口中定义的抽象方法
	public default void defaul() {
		System.out.println("接口中定义的默认方法");
	}
	public static void  stat() {
		System.out.println("接口中定义的静态方法");
	}
	Face f = new Face() {//匿名内部类-->为什么称为匿名，因为这个是接口的实现类，没有定义名字。前面的Face f只是给他的引用。
		
		@Override 
		public void abstra() {
			// TODO Auto-generated method stub
			System.out.println("匿名内部类");
		}
	};
	public static void main(String[] args) {
		Face.stat(); //接口中的静态方法可以直接用接口名调用
		f.defaul();//接口中的默认方法必须使用实现类去调用
		f.abstra();//调用实现类中的方法
		Face.f.abstra();//调用实现类的方法
		System.out.println(f.getClass());
		System.out.println(Face.f.getClass()); //根据这两个的输出，可以知道调用的都是实现类
	}
}
