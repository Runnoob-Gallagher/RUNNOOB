package cn.yj.lpp;

public class Demo01Muty {
    public static void main(String[] args) {
        Demo01Fu de = new Demo01Zi();
            de.run();  //这里是子类进行的调用
            de.fly();  //这里就是进行父类的调用：派生类的功能可以被基类的方法或引用变量所调用，这叫向后兼容，可以提高可扩充性和可维护性
    }
}
