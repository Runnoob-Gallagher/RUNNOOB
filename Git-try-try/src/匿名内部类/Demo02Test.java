package �����ڲ���;

class Demo02Test{
	private String MZ = "A";
	private void methodOuter() {
	 String MZ = "B";  //ǰ��Ĭ�ϼ���final
         //String MZ = "DD";  //ǰ������Ȼû��дfinal��jdk8Ĭ�ϼ�����final�����������޸ģ�����ʾ�����
	  class Inner{       //������������public��private��static���Σ���ô����ʾ��Remove invalid modifiers
			private String name = "C"; 
			private void methodInner() { 
				String name ="D";
				System.out.println("����ֲ��ڲ��෽���е�����"+ name);
				System.out.println("����ֲ��ڲ��ඨ���е�����" + this.name);
				System.out.println("����ⲿ�ඨ������֣�" + MZ); 
				System.out.println("��������ڲ���ķ����ж��������" + Demo02Test.this.MZ);
			}  
		} 
	  //�����ķ����д����ڲ������
	  Inner in = new Inner();
	  in.methodInner();
	  System.out.println("��Ҫ���ʰ����ڲ���ķ����е�����ֵ��" + Demo02Test.this.MZ);
	  System.out.println("��Ҫ�����ⲿ�������ֵ��" + new Demo02Test().MZ);
	  	}
	  //���������ⲿ���д����ڲ����ʵ��,�ǻ���ʾ�����
	/*
	 * Inner in = new Inner();
	 * System.out.println(name);
	 */
	  public static void main(String[] args) {
		Demo02Test dt = new Demo02Test();
		dt.methodOuter();
	}
}