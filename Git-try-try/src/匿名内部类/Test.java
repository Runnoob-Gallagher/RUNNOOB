package �����ڲ���;

 public  class Test {
	 ===
			 void A() {
				class B{ 
					void C(){ 
						class D{
							//    d.E();��ʼ����д������ģ������ر�����Ϊ����E()��û�ж����أ�����ô����
								void E() {
								System.out.println("��ô�����أ���Ϊ�ֲ��ڲ����ڷ����У�ֻ��ͨ�����������ʣ��ʹ�������һ��һ�����");
							}
						}
						D d = new D();
						d.E();
					}
				}
				B b = new B();
				b.C();
			}