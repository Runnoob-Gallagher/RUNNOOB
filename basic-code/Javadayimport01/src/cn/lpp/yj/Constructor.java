package cn.lpp.yj;
//this总是引用构造器中正在初始化的对象
public class Constructor {
  // 1 public static int year = 6;
    public int year = 8;
    public Constructor(){
        //在构造器定义一个year
        int year = 2;
        //this 代表该构造器正在初始化的对象
        //下面的语句将构造器正在初始化的对象的year成员变量设置为2；
        this.year = 4;
    }

    public static void main(String[] args) {
       // 1 System.out.println(year);  这里再静态方法中直接访问year成员变量，必须也将其设置为static否则如小创造对象去调用。
        System.out.println(new Constructor().year);
    }
    //在构造器中使用this引用时，this总是引用该构造器正在初始化的对象。this.year将正在执行初始化的Constructor对象的year成员
    //变量设置为4，这意味着该构造器中返回的所有对象的year成员变量都等于4；
}
