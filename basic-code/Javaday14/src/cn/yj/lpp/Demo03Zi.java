package cn.yj.lpp;

public class Demo03Zi extends Demo03Fu {
    public void method(){          //当把该方法注释之后，打印的就是Fu公共了
        System.out.println("zi公共");
    }
    public void methodZ(){
        System.out.println("子类方法");
    }
         }
