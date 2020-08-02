package cn.yj.lpp;

public class ZiTest extends FuTest {
    public ZiTest(){
        System.out.println("我是子类构造方法");
    }
    static {
        System.out.println("我是子类静态代码块");
    }
    public static void staticzimethod(){
        System.out.println("我是子类静态方法");
    }
    {System.out.println("我是子类非静态代码块");}
    public void nomalzimethod(){
        System.out.println("我是子类普通方法，需要对象调用");
    }

    public static void main(String[] args) {
        System.out.println("我是子类main方法");
        ZiTest zi = new ZiTest();
        zi.nomalzimethod();
    }
}
