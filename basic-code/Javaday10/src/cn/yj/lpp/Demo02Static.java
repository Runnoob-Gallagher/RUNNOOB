package cn.yj.lpp;

public class Demo02Static {
    public static void main(String[] args) {
        Demo01Student stu1 = new Demo01Student("杨洁",23);
        Demo01Student stu2 = new Demo01Student("刘佩佩",25);
        System.out.println("我的名字是：" + stu1.getName() + "你的名字是：" + stu2.getName() +
                "我们都住在:" + stu1.getRoom());
        stu1.run();
     //  method();//这里的静态方法不能访问非静态方法，会出现报错的
    }
    public void method(){
        Demo01Student stu3 = new Demo01Student("hh",34);
        stu3.run();
        System.out.println(stu3.getRoom());
        System.out.println( stu3.getName());
    }
}
