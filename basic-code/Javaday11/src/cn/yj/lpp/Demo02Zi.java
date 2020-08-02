package cn.yj.lpp;

public class Demo02Zi extends Demo02Fu {
    int num = 30;

    public Demo02Zi(){
        super();//调用父类无参构造器
        System.out.println("子类无参构造器");
    }
   public Demo02Zi(int num){
        super(20); //调用父类有参构造器
        System.out.println("子类有参构造器");
    }
    public void nomalmethod(){
        super.nomalmethod();
        System.out.println("子类普通方法");
        System.out.println(super.num);
    }

}
