package cn.yj.lpp;

public class Demo07Math {
    public static void main(String[] args) {
        double numa = -10.9;
        double numb = 5.9;
        int count = 0;
        for (int i = (int)numa; i < (int)numb; i++) {
            int abs = Math.abs(i);
            if(abs > 6 || abs < 2.1){
                System.out.println(i);
                count++;
            }
        }
        System.out.println(count++);
    }
}
