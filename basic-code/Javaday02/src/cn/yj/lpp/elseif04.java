package cn.yj.lpp;
//这个写的太复杂了，想表达的意思时else都有对之前条件取反
public class elseif04 {
    public static void main(String[] args) {
        int score = 88;
        if(score < 40){
            System.out.println("有的教");
                    }else if(score >= 60 && !(score > 40)){
            System.out.println("勉强");
        }else if(80 <= score && !(score >= 60 && !(score > 40))){
            System.out.println("阔以");
        }else{
            System.out.println("满意");
        }
    }
}
