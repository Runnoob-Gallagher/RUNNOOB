package Package;
//���demo�ǽ���Ա��������Ϊ�ӿ�����
/*1.���ȴ���get/set������
2.�����set����setSkill(Demo06Skill skill)���������洫����һ���ӿڵ�ʵ����    �൱��Demo06Skill skill = new Demo06SkillImp(); 
3.������ӿڵ�ʵ���ഫ�ݸ���skill��
4.Ȼ��Ϳ�����skill.use������ʵ�����еķ�����*/
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
		System.out.println(name + "��ʼ����");
		skill.use();//��������ڵ��ýӿ��еĳ��󷽷�   �úÿ��������ܿ����������skill���Ǵ���new Demo06SkillImp
		System.out.println("�����ͷ����");
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
