package cn.yj.lpp;

import java.util.Random;
import java.util.Scanner;

public class Demo04RandomGuess {
    public static void main(String[] args) {

        int Randomnum = Ran();
        while (true){
            System.out.println("请输入数字：");
            Scanner sc = new Scanner(System.in);
            int guessnum = sc.nextInt();
            if(guessnum > Randomnum){
                System.out.println("你猜的数大了");
            }else if(guessnum < Randomnum){
                System.out.println("你猜的数小了");
            }else{
                System.out.println("Bingo");
                break;
            }
        }
    }
    public static int Ran(){
        Random ran = new Random();
        int num = ran.nextInt(9) + 1;
        return num;
    }
}
