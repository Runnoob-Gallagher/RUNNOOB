package Package;

public class Demo06Game {
	public static void main(String[] args) {
		Demo06Hero dh = new Demo06Hero();
		dh.setName("压缩");
		/*
		 * dh.setSkill(new Demo06SkillImp());//传入接口的实现类 相当于Demo06Skill skill = new
		 * Demo06SkillImp(); dh.attack()
		 */;
		 Demo06Skill ds = new Demo06Skill() {

			@Override
			public void use() {
				// TODO Auto-generated method stub
				System.out.println("利用匿名内部类的方法");
			}
		};
//		dh.setSkill(ds);
//		dh.attack();
		//也可以使用匿名对象加上匿名内部类的方式
		dh.setSkill(new Demo06Skill() {

			@Override
			public void use() {
				// TODO Auto-generated method stub
				System.out.println("这个更简单了");
			}
		});
		dh.attack();
	}
}
