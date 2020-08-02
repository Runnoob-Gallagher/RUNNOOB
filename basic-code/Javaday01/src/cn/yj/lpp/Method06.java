package cn.yj.lpp;

public class Method06 {
   /*   1 将属性或者方法修饰为该类的共享成员，即这个属性或方法是该类实例化的所有对象之间共享的，不为某个实例对象所有，
            static属性或方法是存储在内存的公共区，一个类中，一个static变量只会有一个内存空间，虽然有多个类实例，但这些类实例中的这个static变量会共享同一个内存空间。
            用static修饰方法，这个方法就属于类，调用的时候阔以使用类名.方法名去调用。就可以不用新建对象去调用；
        2 main方法是static方法，但是为什么非要是static,原因就是:如果一个类她定义了main方法的话，那么她的main方法会在这个类的构造函数运行之前被调用。
            由于main方法运行的时候尚未在JVM里生成相应对象(构造函数未被执行)，所以要声明为static。
        3 static方法是类方法，是被指向到所属的类而不是类的实例。*/
    public static void main(String[] args) {
        //方法的定义不能产生嵌套

        run();
        jump();
        System.out.println(jump());
    }
    public static void run(){
        System.out.println("跑步");
        System.out.println("哈哈哈");
    }
    public static int jump(){
        int a = 1;
        int b = 2;
        return(a+b);
    }
    public void go(){

        System.out.println("去上学");
    }
    //方法中定义方法是错误的,不能产生嵌套
   /* public static void swme(){
        public static int plus(){
            int a = 2;
            int b = 4;
            int c = a + b;
            return c;
        }
    }*/

}
