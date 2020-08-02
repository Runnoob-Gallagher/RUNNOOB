package cn.yj.lpp;

//   整数类型 byte(1) short(2) int(4) long(8)
//   字符类型 char(2)
//   浮点类型 float(4) double(8)
//   布尔类型 boolean

    /*  48 - '0'
        65 - 'A'
        97 - 'a'   */

public class datatype01 {
    public static void main(String[] args) {
        /*当数据类型不一样时会进行数据类型转换，转换分为两种：
        1.自动类型转换
        特点：代码自动完成；数据范围是从小到大，比如从int转换为double；
        */
        System.out.println(300);//直接打印时，取括号中的类型
        System.out.println(3.14);
        long num1 = 100; //左边是long类型，右边是int类型。通过=将右边的值赋给左边。将数据范围小的赋给大的，将进行自动类型转换；
        System.out.println(num1);

        /*2.强制类型转换
            特点：必须手动进行；数据范围是从大到小；*/
        int num2 = (int)200L;//左边是int类型，右边是Long类型，通过强制类型转换将long类型数据赋给int类型；

        //注意超出范围会造成精度缺失
        int num3 = (int)3.14159; //这里的小数点都会被舍弃，肯定不会是四舍五入
        System.out.println(num3);

        //byte/short/char在发生数据运算时会自动提升为int类型在进行计算
        byte num4 = 3;
        byte num5 = 4;
        int num6 = num4 + num5;
        System.out.println(num6); //这里的num4和num5在算式中已经提升为了int类型；

        char A = 'a';
        int num7 = A + num4;
        System.out.println(num7);//这里是将char类型和byte类型进行了自动提升；

        short num8 = 6;
        int num9 = num8 + A;
        System.out.println(num9);
    }
}
