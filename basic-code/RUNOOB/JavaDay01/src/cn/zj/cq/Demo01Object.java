package cn.zj.cq;
//类 Object 是类层次结构的根类。每个类都使用 Object 作为超类。所有对象（包括数组）都实现这个类的方法。
/*看一下里面的方法 String toString()   //Object超类中的方法都可以被使用
                返回该对象的字符串表示。默认返回对象的地址值，如果不想返回对象的地址值，那就进行重写*/
public class Demo01Object {
    public static void main(String[] args) {
        Demo01Person demA = new Demo01Person("yangjie" , 24);
        Demo01Person demB = new Demo01Person("liupeipei" , 34);
        Demo01Person demC = new Demo01Person("yanghzi" , 74);
        System.out.println(demA.toString());   //cn.zj.cq.Demo01Person@1b6d3586
        //如果没有重写toString方法，那么就直接调用超类Object中的方法，直接打印对象的地址值
        System.out.println(demB.toString());   //cn.zj.cq.Demo01Person@4554617c
        //如果重写了就按照重写的方法进行；对应输出值
    }
}
