package 匿名内部类;

 public  class Test {
	 public void method() {
		 System.out.println("我是父类方法");
	 }
	 public static void main(String[] args) {
		Test t = new Test();
		t.method();
		TestZi tz = new TestZi();
		tz.method();
		tz.run();
		
	}
}