package �����ڲ���;

class Demo02Test{
	 void A() {
		class B{ 
			B b = new B();
			b.C();
			void C() { 
				class D{
					D d = new D();
					d.E();
					void E() {
						System.out.println("��ô�����أ���Ϊ�ֲ��ڲ����ڷ����У�ֻ��ͨ�����������ʣ��ʹ�������һ��һ�����");
					}
				}
			}
		}
	}
	 public static void main(String[] args) {
		Demo02Test dt = new Demo02Test();
		dt.A();//������A������Ҫ��������͵���A�����д��������������
	}
}