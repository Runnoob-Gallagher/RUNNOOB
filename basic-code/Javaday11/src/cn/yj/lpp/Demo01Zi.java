package cn.yj.lpp;

public class Demo01Zi extends Demo01Fu {
    public void Zimethod(){
        System.out.println("子类方法执行");
    }
   /* public void method(){
        System.out.println("子类重写父类方法");  //这里我把子类方法隐藏之后，他就会向上去找父类方法，打印父类method方法；
                                                //如果没有隐藏的话，因为创建的是子类对象，就会去执行子类方法；
                                                //谁的对象被创建就先用谁；

    }*/
}
