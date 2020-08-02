package cn.yj.lpp;

public class Demo04Static {
    public static void main(String[] args) {
        Person p = new Person();
        Person p2 = new Person();//看这！  创建两次对象就是调用了两次构造方法，你懂的吧
        p.method();

    }
}
