package cn.zj.cq;

public class Demo01 {
    public static void main(String[] args) {
        Fu f = new Zi();
        System.out.println(f.name);
        f.methodFu();
        f.fly();
        Zi z = (Zi)f;
        z.methodZi();
        z.methodFu();
        ((Zi) f).gousi
    }
}
