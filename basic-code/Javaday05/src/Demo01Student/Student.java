package Demo01Student;

//这里的调用非静态方法应先创建对象，在调用方法
//调用静态方法可以直接使用类名调用
public class Student {
    public static void main(String[] args) {
        Student stu = new Student();
        study();
        stu.eat();//这里是不行的，静态方法中不能调用非静态方法。要先创建对象去调用
    }
    String name;
    int age;

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
    // 成员方法
    public void eat() {
        System.out.println("吃饭饭！");
    }

    public void sleep() {
        System.out.println("睡觉觉！");
    }

    public static void study() {
        System.out.println("学习！");
    }

}
