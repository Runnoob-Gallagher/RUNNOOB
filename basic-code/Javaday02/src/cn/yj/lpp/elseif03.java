package cn.yj.lpp;

public class elseif03 {
    public static void main(String[] args) {
        //注意哦：if else 语句把范围小的写在前面   好像感觉if else 没啥问题  下一个例子看一下else if
        int age = 40;
        if(age > 60){
            System.out.println("老年人");
        }
        if(age > 40 && age < 60){
            System.out.println("中年人");
        }
        if(age >= 20 && age <= 40){
            System.out.println("青年人");
        }
       elseif03.ag();

    }
    public static void ag(){
        int num = 67;
        if (num > 20 && num < 40){
            System.out.println("小数字");
        }
        if(num > 40 && num < 60){
            System.out.println("中数字");
        }
        if(num > 60 && num < 90){
            System.out.println("大数字");
        }
    }
}

