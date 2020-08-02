package cn.yj.lpp;

public class Demo02InterfaceImplA implements Demo02Interfac{
    @Override
    public void run() {
        System.out.println("奔跑吧菜狗子");
    }

    @Override
    public void jump() {
        System.out.println("jump");
    }

}
