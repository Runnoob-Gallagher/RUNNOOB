package Quote;

public class Fu {
	public static void methodB(ZiFuInterface zfi) {
		zfi.methodA();
		System.out.println("���Ǹ���ľ�̬�������ҵĲ�����һ���ӿ�");
	}
	public void methodC(ZiFuInterface zfi) {
		zfi.methodA();
		System.out.println("���Ǹ������ͨ�������ҵĲ�����һ���ӿ�");
	}
	public /*static*/ void say() {  //�������static�Ͳ�����д�ˣ���Ϊ����������ġ������������Demo13
		System.out.println("˵�㶫���ɣ�����FU");
	}

}
