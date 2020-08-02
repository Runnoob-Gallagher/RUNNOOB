package cn.yj.lpp;

public class HelloWord {
    public static void main(String[] args) {
        String mylover = "刘佩佩";
        System.out.println(mylover);


        //字符常量标识为单引号，并且单引号里面有且只有一个字符，且必须有一个字符
        /*System.out.println('lpp');*/    //这里就是错误的，因为不是一个字符
        /*System.out.println('');*/    //这里也是错误的，因为里面没有字符存在


        //空常量不能直接用于打印输出
        /*System.out.println(null);*/
    }
}
