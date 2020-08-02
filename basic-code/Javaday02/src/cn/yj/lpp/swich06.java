package cn.yj.lpp;

public class swich06 {
    public static void main(String[] args) {
        int a = 4;
        // swich语句中 小括号中的选项可以是 byte/short/int    string类型/enum枚举  阔以不用顺序执行，可以遇到break就会停止
        switch(a){
            case 1:
                System.out.println("等于1");

            case 2:
                System.out.println("等于2");

            case 3:
                System.out.println("等于3");

            case 4:
                System.out.println("等于4");
            default:
                System.out.println("you are a bpl");
        }
    }
}
