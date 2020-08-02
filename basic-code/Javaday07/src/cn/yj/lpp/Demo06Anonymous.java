package cn.yj.lpp;
/*匿名对象：
创建方法是直接new，没有左边的名字和赋值运算符，只有右边的对象：new 类名称();

注意事项：匿名对象只能使用一次，使用后就失效*/
public class Demo06Anonymous {
    public static void main(String[] args) {
        //创建对象的普通形式，先创建对象然后在调用
        Demo05Person per = new Demo05Person();
        per.name = "高圆圆";
        per.shownamw();
        System.out.println("==========");
        //匿名内部类创建对象在调用
        new Demo05Person().name = "杨洁";
        new Demo05Person().shownamw(); //这里的结果输出为null，因为匿名对象只能使用唯一的一次，上面的给name赋值之后就不能在使用了
    }
}
