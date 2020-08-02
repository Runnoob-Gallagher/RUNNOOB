package cn.yj.lpp;

public class Demo03Class {
    public static void main(String[] args) {
        // Student stu = new Student(); //这里是错的，创建对象时一定要跟类名；
        Demo03Class demo = new Demo03Class();
        demo.test();  //这里要用对象取调用
        demo.test("Hello");
        Demo03Class.jin();//静态方法可以用类名调用，因为静态方法会随着类的加载而加载
        demo.jin();//静态方法也可以用对象名取调用
    }
        public void test(){
            System.out.println("没有参数");
        }
        public void test(String str){
            System.out.println("重载的方法" + str);
        }
        public static void jin(){
            System.out.println("静态方法");
        }


}