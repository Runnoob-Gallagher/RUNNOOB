package cn.yj.lpp;

public class Demo02Muty {
    public static void main(String[] args) {
        Demo02Fu dem = new Demo02Zi();
        System.out.println(dem.name);
        System.out.println("==========");
        // dem.run();   这里会报错，等号左边是父类，但是父类中没有run()方法，就像上找，再向上就是找Object了。Object肯定没这个方法：报错
        dem.fly();  //这里我重写了父类方法，然后先去访问子类的方法，如果没有就再去父类哪里找!
        // System.out.println(dem.grade); //同上
    }
}
