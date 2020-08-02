package cn.yj.lpp;

public class Demo01TestReturn {
    public static void main(String[] args) {
     //   Person P = new Person();  这里创建对象要和类名一致
        Demo01TestReturn demo = new Demo01TestReturn();
       System.out.println(demo.test()); //这里打印test方法中两句话
       String a ;
       a = demo.test();
       System.out.println(a); //这同上
    }
    public static String test(){
        System.out.println("测试返回值的");
        return "这里对不对呢？";
    }
}
