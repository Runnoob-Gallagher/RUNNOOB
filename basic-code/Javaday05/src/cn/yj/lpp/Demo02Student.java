package cn.yj.lpp;


import Demo01Student.Student;
//import cn.yj.lpp.Demo09Teacher.Tacher;
public class Demo02Student {
    public static void main(String[] args) {
        Student stu = new Student();  //当你写出Student的时候，它会自动导包
       // Teacher tea = new Teacher();  //这里的teacher是不同的模块下的，不能自动导包,手动好像也是不行；
       // stu.name = 'yangjie';
        stu.eat();
        stu.sleep();
       // Demo02Student.study      //这里注意一下如果使用继承或者接口能不能调用呢？
    }
}
