package cn.yj.lpp;

public class Zi extends Fu{
    public static void main(String[] args) {
        Zi z = new Zi();
        String name = "潘玮柏";
        System.out.println(name);
        System.out.println(z.name);
        z.method();
    }
    public void method(){
        System.out.println(new Zi().name);
        System.out.println(this.name);
    }
}
