package cn.yj.lpp;

public class Demo04StringMethod {
    public static void main(String[] args) {
        String str1 = "adsdsadasdascsds";
        int num = str1.length();
        System.out.println(num); //返回字符串中字符个数
        String str2 = "ggsmd";
        String str3 = str1.concat(str2);  //字符组合，相当于在后面加上
        System.out.println(str3);
        char str4 = str3.charAt(5);   //查找索引位置为5的字符是什么
        System.out.println(str4);
        int index = str3.indexOf("gg"); //查找gg第一次在字符串中出现的位置，找到就返回索引值。找不到就返回-1
        System.out.println(index);
        int indexA = str3.indexOf("abdsd");
        System.out.println(indexA); //找不到，返回-1
        System.out.println(str1 + str2);
    }
}
