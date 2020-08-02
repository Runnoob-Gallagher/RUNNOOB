package cn.yj.lpp;

public class Demo01Extends {
    public static void main(String[] args) {
        Demo01Zi z = new Demo01Zi();
        z.Fumethod(); //父类方法执行
        z.Zimethod(); //子类方法执行
        z.method();  // 父类method方法
        Demo01Fu f = new Demo01Fu();
        f.Fumethod(); //父类方法执行
        f.method();  //父类method方法
    }
}
