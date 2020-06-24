package Package;
//这个demo是将成员变量设置为接口类型
/*1.首先创建get/set方法；
2.这里的set方法setSkill(Demo06Skill skill)，但是里面传的是一个接口的实现类    相当于Demo06Skill skill = new Demo06SkillImp(); 
3.将这个接口的实现类传递给了skill。
4.然后就可以用skill.use。调用实现类中的方法了*/
public class Demo06Hero {
	private String name;
	private Demo06Skill skill;
	public String getName() {
		return name;
	} 
	public void setName(String name) {
		this.name = name;
	}
	public void  attack() {
		System.out.println(name + "开始攻击");
		skill.use();//这个就是在调用接口中的抽象方法   好好看，还是能看懂，这里的skill就是代表new Demo06SkillImp
		System.out.println("技能释放完成");
	}
	public Demo06Skill getSkill() {
		return skill;
	}
	public void setSkill(Demo06Skill skill) {
		this.skill = skill;
	}
	/**
	 * 
	 */
	public Demo06Hero() {
		
	}
	/**
	 * @param name
	 * @param skill
	 */
	public Demo06Hero(String name, Demo06Skill skill) {
		
		this.name = name;
		this.skill = skill;
	}
	
}
