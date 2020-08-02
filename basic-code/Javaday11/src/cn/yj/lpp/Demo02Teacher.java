package cn.yj.lpp;

public class Demo02Teacher extends Demo01Employee {
    public static void main(String[] args) {
        Demo01Employee.run();
        Demo01Employee tea = new Demo01Employee();
        tea.run();
    }
}
