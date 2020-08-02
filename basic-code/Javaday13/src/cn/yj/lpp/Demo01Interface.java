package cn.yj.lpp;
/*不同JDK版本的接口区别
JAVA7：
1.常量
2.抽象方法
JAVA8：
1.默认方法 ????
2.静态方法
JAVA9：
私有方法*/

/*步骤一：
public class 实现类名称 implements 接口名称(){
        //重写接口中的抽象方法；
        }
        步骤二：
        实现接口中所有的抽象方法
        步骤三：
        创建实现类的对象去使用*/ //这个demo的作用就是创建实现类的对象去调用方法
public class Demo01Interface {
    //先尝试一下创建接口的对象，最然肯定是报错的
    //Demo01InterfaceAbstract demo = new Demo01InterfaceAbstract() ;//接口中不能new接口！！
      /*  Demo01InterfaceImpl imp = new Demo01InterfaceImpl();
        imp.*/   //你看这里我没有在main方法中创建对象就不能调用实现类的对象，这里是不是可以用程序执行的先后顺序来解释呢？？存疑！！
    public static void main(String[] args) {
        Demo01InterfaceImpl imp = new Demo01InterfaceImpl();
        imp.methodA();
        imp.methodB();
    }
}
