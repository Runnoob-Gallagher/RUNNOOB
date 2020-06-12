package cn.zj.cq;
//这个demo是验证return在异常中的影响,如果finally里面存在return，那么这个肯定是要执行的；  最好避免
public class Demo08Return {
	public static void main(String[] args) {
	System.out.println(methodA(0));
	System.out.println(methodA(4));//在这里就算你输入正常的数字，但是在finally中执行了return，值就会被更新为return中的
	}
	public static int methodA(int b) {
		int a = 6;
		try{
			int result = a/b;
		}catch(Exception e) { 
			e.printStackTrace();
		}finally {
			return 6;
		}
		
	}
} 
