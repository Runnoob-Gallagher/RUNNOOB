package cn.yj.lpp;
//在student类中才能写这个student的属性，然后将其封装，然后在另外一个类中创建该类的对象，然后利用get/set方法调用
//注意boolean类型的get方法是ismale
public class Student {
   private String name;
   private int age;
   private boolean male;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean isMale() {
        return male;
    }

    public void setMale(boolean male) {
        this.male = male;
    }
}

