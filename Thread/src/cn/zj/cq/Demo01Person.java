package cn.zj.cq;

public class Demo01Person {
	private  String name;
	public  void run() {
		for(int i = 1; i<10; i++) {
			System.out.println(name +" = " + i);
		}
	}
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @param name
	 */
	public Demo01Person(String name) {
		this.name = name;
	}

	/**
	 * 
	 */
	public Demo01Person() {

	}
	
}
