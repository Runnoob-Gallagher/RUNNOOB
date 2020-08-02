package cn.yj.lpp;
//记住一点类实现接口   接口不能直接使用，必须有一个实现类去实现它
/*格式：
步骤一：
public class 实现类名称 implements 接口名称(){
    //重写接口中的抽象方法；
        }
 步骤二：
实现接口中所有的抽象方法
步骤三：
创建实现类的对象去使用*/
public class Demo01InterfaceImpl implements Demo01InterfaceAbstract {
    @Override
    public void methodA() {
        System.out.println("yi");
    }
    @Override
    public void methodB() {
        System.out.println("er");
    }
    }

