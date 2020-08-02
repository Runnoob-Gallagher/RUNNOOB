package cn.yj.lpp;
//该类目的是学习成员方法会自配创建地址及默认值，为后面服务的，后面几个代码都有Phone对象
public class Phone {
    String name;
    int money;
    String color;
    public void call(){
        System.out.println("打电话");
    }
    public void send(){
        System.out.println("邮寄");
    }
}
