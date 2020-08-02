package cn.yj.lpp;

/*这个demo体现了，接口的多实现（类似多继承，你懂的吧，就是那个意思）；
在Demo02InterfaceImplB中，对eat方法进行了重写，但是不是之前的那个接口向上转型，直接调用接口中的方法。因为在实现类中都已经找到了，
就不用向上找借口去实现了*/
public class Demo02InterFace {
    public static void main(String[] args) {
        Demo02InterfaceImplA impl = new Demo02InterfaceImplA();
        impl.jump();
        impl.run();
        impl.eat();// 这里不是
        // 调用实现类里面的方法，是接口中的。体现了在接口中没找到就像上往接口里找；----->接口升级

        System.out.println("++++++++");
        Demo02InterfaceImplB imp2 = new Demo02InterfaceImplB();
        imp2.jump();
        imp2.run();
        imp2.eat();
    }
}
