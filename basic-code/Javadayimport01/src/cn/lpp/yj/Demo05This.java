package cn.lpp.yj;

public class Demo05This {
    private String name = "Gallagher";
    private int age = 24;
    //System.out.println(Demo05This.name);//这里的sout中的out是静态方法哦！


    public static void main(String[] args) {
        String name = "lpp";
        System.out.println(name);//当方法的局部变量和类的成员变量重名的时候，根据“就近原则”，优先使用局部变量。输出刘佩佩
        /*this.name = "范冰冰"; //这里也是错的，因为你现在在一个静态方法中，静态方法不能调用非静态方法中的成员。除非自己创建对象
        使用对象名来调用*/

        int age = 25;
        System.out.println(new Demo05This().age);//这里使用对象调用静态方法中的成员变量；输出24
        new Demo05This().run();
    }

    public void run() {
        String name = "jack马";
        System.out.println(name);//这里还是jack马，如上就近原则
        System.out.println(this.name);//这里就输出GAllagher了;
    }
}
