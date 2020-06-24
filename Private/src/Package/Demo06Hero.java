package Package;

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
		super();
		this.name = name;
		this.skill = skill;
	}
	
}
