package cn.zj.cq;

public class Demo05ImplA implements Demo05FanxinJiekou<String> {

	@Override
	public void jump(String str) {
		// TODO Auto-generated method stub
		System.out.println(str);
	}
	public static void main(String[] args) {
		Demo05ImplA dm = new Demo05ImplA();
		dm.jump("���ǵ�һ�֣����ݽӿ�ֱ��ȷ������");
	}
}
