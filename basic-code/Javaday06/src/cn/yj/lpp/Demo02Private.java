package cn.yj.lpp;
//防止不合理的数据被设置，这里将age使用private修饰，这样这个age变量只能在本类中使用；
//如果要遭其他类中使用的话，就必须为其提供set和get方法；
public class Demo02Private {
    public static void main(String[] args) {
        Student stu = new Student();
        stu.setAge(20);
        stu.setName("杨洁");
        stu.setMale(true);
        System.out.println("姓名是：" + stu.getName());
        System.out.println("年龄是：" + stu.getAge());
        System.out.println("他是：" + stu.isMale());
    }
}