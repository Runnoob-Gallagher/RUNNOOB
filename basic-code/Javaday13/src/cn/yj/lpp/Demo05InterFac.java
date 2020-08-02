package cn.yj.lpp;

public interface Demo05InterFac extends Demo05InterFaceB,Demo05InterFaceA {

    @Override
    default void method() {
        System.out.println("没什么东西开始理解错了");
    }
}
