package cn.yj.lpp;
/*当我们还需要在接口中新增方法时，实现类也要相应的重写方法。但是当实现类中的方法已经在使用时，不能更改；这个时候，可以用到JDK8中的
实现类的默认方法；
格式:
public default void eat(){    //因为这是存在方法体，那么就不是抽象方法了；

}

后面的Demo02InterfaceImplA，Demo02InterfaceImplB体现了接口的多实现；有么？？？？？
*/
public interface Demo02Interfac {
    public abstract void run();
    public abstract void jump();
    public default void eat(){
        System.out.println("I can eat shit,can you bitch?");
    }
}
