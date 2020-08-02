package cn.yj.lpp;
//子类继承作为抽象类的父类，必须将父类中的所有抽象方法全部重写，不写如下，编译报错。否则将子类也设置为抽象类
//
public abstract class  Demo01AbstractFu {
    public abstract void run();
    public static void jump(){
        System.out.println("我能跳");
    }
}
class teacher extends Demo01AbstractFu{
    public void run(){
        System.out.println("如果将这个实现的run方法去掉，这个teacher类就会报错：Class 'teacher' must either be declare " +
        "abstract or implement abstract method 'run()' in 'Demo01AbstractFu'");
    }
}

abstract class student extends Demo01AbstractFu{
    public void eat(){
        System.out.println("你看我，作为一个抽象类的子类，继承抽象类的父类的时候就可以不用重写父类的抽象方法");
    }
}