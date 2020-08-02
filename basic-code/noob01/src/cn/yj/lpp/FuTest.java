package cn.yj.lpp;

public class FuTest {
    public FuTest() {
        System.out.println("我是父类构造方法");
    }

    static {
        System.out.println("我是父类静态代码块");
    }
    public void nomalzimethod(){
        System.out.println("我是父类普通方法，会被子类覆盖");
    }
    {
        System.out.println("我是父类非静态代码块");
    }

    {
        System.out.println("插一嘴，父类普通和父类静态没差");
    }
}
