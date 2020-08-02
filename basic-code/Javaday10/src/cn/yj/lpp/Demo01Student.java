package cn.yj.lpp;

public class Demo01Student {
    public static String room = "垫江";
    private static int age;
    private String name;
    public static void run(){
        System.out.println("跑的飞快");
    }

    public Demo01Student(String name,int age) {
        this.name = name;
    }
    public Demo01Student(){

    }

    public static String getRoom() {
        return room;
    }

    public static void setRoom(String room) {
        Demo01Student.room = room;
    }

    public static int getAge() {
        return age;
    }

    public static void setAge(int age) {
        Demo01Student.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
