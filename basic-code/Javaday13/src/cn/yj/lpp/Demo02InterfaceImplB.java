package cn.yj.lpp;

public class Demo02InterfaceImplB implements Demo02Interfac {

    @Override
    public void jump() {
        System.out.println("你哟本身再跳");
    }

    @Override
    public void run() {
        System.out.println("rangni10秒");
    }
    //这里在实现类中再次重写接口中的默认方法，看着两个的区别

    @Override
    public void eat() {
        System.out.println("这里是实现类中的方法重写");
    }
}
