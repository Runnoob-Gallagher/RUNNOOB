package cn.zj.cq;

public class Demo03ReEquals extends Object {
    public static void main(String[] args) {
        Demo03Person demA = new Demo03Person("hh",34);
        Demo03Person demB = new Demo03Person("hh",34);
        Demo03Person demC = new Demo03Person("qq",34);
        boolean as = demA.equals(demB); //这里我们传递过去的是demB的引用类型，而那边是Object，用到了多态
        System.out.println(as);
    }
}
