package cn.zj.cq;
//在接口中使用泛型：1.直接在接口中确定泛型类型，然后让实现类自己去匹配他
public interface Demo05FanxinJiekou<String> {
	public abstract void jump(String str);
}
