package cn.yj.lpp;

public class Demo05Sendpara {
    public static void main(String[] args) {
        Phone pp = new Phone();   //根据类创建对象
        pp.name = "苹果";
        pp.money = 8888;   //这里使用类的对象去调用类中的成员变量或者成员方法
        pp.color = "red";
        method(pp);
    }
    public static void method(Phone me){  //将地址值传递过去，就相当于me = pp

        System.out.println(me.name);
        System.out.println(me.money);
        System.out.println(me.color);
    }
}
