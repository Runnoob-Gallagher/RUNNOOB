package cn.yj.lpp;

public class ZiextendsFu {
    public static void main(String[] args) {
        Zi z = new Zi();
        System.out.println(z.num);   //30
        System.out.println(z.Funum);  //60
        System.out.println("====上面创建了子类对象====");
        Fu F = new Fu();
        System.out.println(F.num);   //20
        System.out.println(F.Funum);  //40
        System.out.println("===上面创建了父类对象====");
        z.Zimethod(); //30
        F.Fumethod();  //20
        z.Fumethod();  //20
       // F.Zimethod();  这里父类调用子类方法肯定是错的，可以这样想，java是单继承，每一个子类有一个直接父类，他肯定知道他的父亲是谁；
        //所以子类调用父类中的方法或者变量都是可以的。但是父类可以有多个子类，他不知道你指的谁；
    }
}
