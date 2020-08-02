package cn.yj.lpp;

public class Demo02Fu {
    int num = 20;
    public  Demo02Fu(){
        System.out.println("执行父类无参构造器");
    }
    public Demo02Fu(int num){
        System.out.println("执行父类有参构造器");
    }
    public void nomalmethod(){
        System.out.println("父类成员方法");
    }
}
