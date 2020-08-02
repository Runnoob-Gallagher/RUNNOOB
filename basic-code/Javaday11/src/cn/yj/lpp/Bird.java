package cn.yj.lpp;

public class Bird extends Animal {
    public Bird(){
        super();
        System.out.println("鸟类");
    }

    @Override
    public void run() {
        // TODO Auto-generated method stub
        super.run(); // 通过super可以用父类方法和属性
        System.out.println("鸟是飞飞飞飞飞飞");
        System.out.println("鸟类有"+super.eye+"只眼睛");
    }
}
