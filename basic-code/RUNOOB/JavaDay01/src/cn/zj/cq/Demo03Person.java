package cn.zj.cq;

public class  Demo03Person {
       private String name ;
       private int age;

    public Demo03Person() {
    }

    public Demo03Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

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
    //@Override
    public boolean equals(Object obj){  //这里的Object就是Object；不是指其他的任意类型，就是祖宗类，就是用到了多态！！！
        //就是子类用到了父类的equals方法---->  Object obj = demB----> new Demo03Person("qq",34);
        //但是重写的Object类的equals方法不能访问到子类的属性，所以要向下转型；
        Demo03Person dem = (Demo03Person)obj;
        boolean b = this.name.equals(dem.name) && this.age == dem.age;
        return b;
    }
}
