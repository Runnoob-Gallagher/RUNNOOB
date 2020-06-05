package cn.zj.cq;

public class Demo10ConnectionsPerson implements Comparable<Demo10ConnectionsPerson>{//这里实现这个接口就要重写compareTo方法
	private String name;
	private int age;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	/**
	 * 
	 */
	public Demo10ConnectionsPerson() {
		
	}
	/**
	 * @param name
	 * @param age 
	 */
	public Demo10ConnectionsPerson(String name, int age) {
		this.name = name;
		this.age = age;
	} 
	@Override
	public String toString() {
		return "Demo10ConnectionsPerson [name=" + name + ", age=" + age + "]";
	}
	@Override
	public int compareTo(Demo10ConnectionsPerson o) { //这个我理解了---->
		// TODO Auto-generated method stub
		if(this.getAge() < o.getAge()) {
			return 1;
		} 
		if(this.getAge() > o.getAge()) {
			return -1;
		}
		return 0;
	 
	}
	@Override
	public int hashCode() { 
		final int prime = 31;
		int result = 1;
		result = prime * result + age;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Demo10ConnectionsPerson other = (Demo10ConnectionsPerson) obj;
		if (age != other.age)
			return false; 
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}
	
}
