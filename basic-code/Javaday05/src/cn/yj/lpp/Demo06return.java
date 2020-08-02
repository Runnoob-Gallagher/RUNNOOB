package cn.yj.lpp;

//从这里我们来解释一波：后面创建一个getPhone方法，往里面赋值，然后返回pho。即把地址返回去；
//前面的Phone pho2 = getPhone();用这个对象地址pho2来接收返回来的地址，即pho2 = pho！！
//谁调用我。我就把值返回给谁。返回值就是对象的地址值
public class Demo06return {
    public static void main(String[] args) {
        Phone pho2 = getPhone();
        System.out.println(pho2.color);
        System.out.println(pho2.money);
        System.out.println(pho2.name);

    }
    public static Phone getPhone(){    //成员方法存放的是地址值，
        Phone pho = new Phone();
        pho.color = "绿色";
        pho.money = 4999;
        pho.name = "HuaWei";
        System.out.println("haha");
        return pho;       //这里是main方法调用这个，就会把这个地址值返回给main方法中的getPhone()。然后将这个地址赋值给pho2；
    }
}
