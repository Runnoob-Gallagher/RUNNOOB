package cn.yj.lpp;
//后人（非静态内容）能知道前人（静态内容）但是前人是不会知道后人的
public class Demo03Static {
    public static int age = 12;
     String name = "yj";

    public static void staticmethod(){
        System.out.println("这是静态方法");
        System.out.println(age);//这里的静态方法可以访问静态变量
       // System.out.println(name); 这里会出现报错，静态方法不可以访问非静态变量
        //因为程序会先执行静态方法，这个时候还没有非静态内容，就不能访问
    }
    public void method(){
        System.out.println("这是非静态方法");
        System.out.println(age);
        System.out.println(name);//这里非静态方法可以访问静态变量和非静态变量
    }
}
