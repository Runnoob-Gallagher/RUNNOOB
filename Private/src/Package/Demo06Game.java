package Package;

public class Demo06Game {
	public static void main(String[] args) {
		Demo06Hero dh = new Demo06Hero();
		dh.setName("ѹ��");
		/*
		 * dh.setSkill(new Demo06SkillImp());//����ӿڵ�ʵ���� �൱��Demo06Skill skill = new
		 * Demo06SkillImp(); dh.attack()
		 */;
		 Demo06Skill ds = new Demo06Skill() {

			@Override
			public void use() {
				// TODO Auto-generated method stub
				System.out.println("���������ڲ���ķ���");
			}
		};
//		dh.setSkill(ds);
//		dh.attack();
		//Ҳ����ʹ������������������ڲ���ķ�ʽ
		dh.setSkill(new Demo06Skill() {

			@Override
			public void use() {
				// TODO Auto-generated method stub
				System.out.println("���������");
			}
		});
		dh.attack();
	}
}
