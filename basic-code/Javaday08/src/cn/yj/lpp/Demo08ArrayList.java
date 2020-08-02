package cn.yj.lpp;

import java.util.ArrayList;

/*ArrayList中泛型中的类型只能是基本类型对应的包装类：
int         Integer     4
byte        Byte        1
float       Float       4
double      Double      8
char        Character   2
boolean     Boolean     1
long        Long        8
short       Short       2
String  //注意String是引用类型，不是基本类型*/
public class Demo08ArrayList {
    public static void main(String[] args) {
        Demo08ArrayList demo = new Demo08ArrayList();
        System.out.println(demo.arrayA());

    }
        public static ArrayList<Integer> arrayA () {    //注意这里的返回值类型也是ArrayList<Integer>
            ArrayList<Integer> list = new ArrayList<>();
            list.add(1);
            list.add(2);
            list.add(3);
            System.out.println(list);
            return  list;
        }
    }

