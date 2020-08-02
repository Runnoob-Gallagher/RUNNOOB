package cn.zj.cq;
// SimpleDateFormat中的Format和Parse互为相反方法
/*import java.text.DateFormat;DateFormat是一个抽象类，不能使用其创建对象使用，可以使用DateFormat的子类SimpleDateFormat
public class SimpleDateFormat extends DateFormat
        SimpleDateFormat 是一个以与语言环境有关的方式来格式化和解析日期的具体类。
        它允许进行格式化（日期 -> 文本）、解析（文本 -> 日期）和规范化。
        SimpleDateFormat(String pattern)
        用给定的模式和默认语言环境的日期格式符号构造 SimpleDateFormat。----->即根据模式将日期转发为指定的格式---->yyyy-MM-dd或者
        yyyy年MM月dd日,得出一个字符串文本*/

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Demo03DateFormat {
    public static void main(String[] args) throws ParseException {
       //dateformat();
       dateparse();
    }
    public static void dateformat(){
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH-mm-ss");
        Date dd = new Date();
        sdf.format(dd);
        String txt = sdf.format(dd);
        System.out.println(txt); //按指定格式打印   输出：2020-05-20 07-06-44
        System.out.println(dd);  //默认格式         输出：Wed May 20 07:06:44 CST 2020
    }
    /*使用SimpleDateFormat中parse方法，将字符串文本转化为指定格式的日期：
    步骤：
        还是要创建SimpleDateFormat的对象，这样才能调用方法嘛；
        然后使用SimpleDateFormat的parse方法进行转换
        public Date parse(String text,
                  ParsePosition pos)解析字符串的文本，生成 Date。*/
    public static void dateparse() throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH-mm-ss");  //注：这里始终都要用到这个构造器
        Date dd = sdf.parse("2020-05-20 07-06-44");   //public Date parse(String source) throws ParseException 这个方法自己会抛出异常
                                                    //该异常作用：构造器中给出的模式和parse方法中不一致，就抛出解析异常
                                                    //如果我们使用了一个抛出异常的方法，就必须在我们自己的方法上处理这个异常！！
        System.out.println(dd); //输出Wed May 20 07:06:44 CST 2020
    }
}
