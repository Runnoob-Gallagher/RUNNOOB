package cn.yj.lpp;

public class Demo03InterfaceImpClass extends Object implements Demo03InterFaceA,Demo03InterFaceB{
    @Override
    public void methodA() {
        System.out.println("实现接口A中的方法");
    }

    @Override
    public void methodB() {
        System.out.println("实现接口B中的方法");
    }

    public static void main(String[] args) {
        Demo03InterfaceImpClass impl = new Demo03InterfaceImpClass();
        impl.methodA();
        impl.methodB();
    }
}
