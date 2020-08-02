package cn.yj.lpp;

public class Demo07MethodReload {
    public static void main(String[] args) {
    //这里来开始调用方法-----》方法重载
//        1.参数类型不同；
//        2.参数个数不同；
//        3.参数多类型顺序不同；
       // System.out.println(sum());//当为void方法时不能使用打印调用，感觉涉及到传值？？是的，如果含有void只能单独调用，不能使用后打印调用和赋值调用；
        sum();
        System.out.println(sum(32.2,3));
        return;

    }
    public static void  sum(){
        System.out.println("我是空的");
      //  return sum();

    }
    public static int sum (int a,int b){
        System.out.println(a + b);
        return (a + b);
    }
   // public static void int sum (int c,int d,int e){ //有了void就说明没有返回值，就不需要定义了，不需要写int
        public static double sum(double a,int b){
            System.out.println("两个变量"+ a + b);
            return(a+b);
    }
    public static int sum(int a){
        System.out.println("就一个a");
        return a;
    }
    public static void sum(String str){
        System.out.println("下面这个return代表结束方法，最后的sout都不会执行");
        return;
       // System.out.println("我要报错"); //这里写上就会报错
    }
}


