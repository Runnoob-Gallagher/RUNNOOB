package cn.zj.cq;
//这份demo是用以熟悉自定义类型键值
/*Map集合中的key是唯一的，value可以是重复的
	作为key的元素，必须重写hashCode方法和equals方法，以保证key唯一*/
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Demo04HashMap {
	public static void main(String[] args) {
		//Map<String, Integer> mapA = new HashMap<String, Integer>();
		
		//methodA();
		methodB();
	}
	/* methodB方法----》
	 * HashMap存储自定义类型键值 
	 * key：Person类型
	 * 			 String类型必须重写HashCode方法和Equals方法，可以保证key唯一
	 * value：String类型 
	 * 			value可以重复（同名同年龄视为同一个人）
	 */
	
	private static void methodB() {
		// TODO Auto-generated method stub
		Map<Demo04Person, String> mapB = new HashMap<Demo04Person, String>();
		mapB.put( new Demo04Person("杨洁", 24),"杭州");
		mapB.put( new Demo04Person("杨路", 26),"重庆");
		mapB.put( new Demo04Person("杨小薇", 30),"北京");
		mapB.put( new Demo04Person("杨香", 24),"贵州");
		mapB.put( new Demo04Person("杨香", 24),"州");
		Set<Demo04Person> set = mapB.keySet();
		Iterator<Demo04Person> it = set.iterator();
		while(it.hasNext()) {
			System.out.println(mapB.get(it.next()));
		}
	}
	
	
	/* methodA方法----》
	 * HashMap存储自定义类型键值 
	 * key：String类型
	 * 			 String类型重写HashCode方法和Equals方法，可以保证key唯一
	 * value：Person类型 
	 * 			value可以重复（同名同年龄视为同一个人）
	 */
	private static void methodA(){
		Map<String, Demo04Person> mapA = new HashMap<String, Demo04Person>();
		mapA.put("杭州",new Demo04Person("杨洁", 24));
		mapA.put("重庆", new Demo04Person("杨路", 26));
		mapA.put("北京", new Demo04Person("杨小薇", 30));
		mapA.put("贵州", new Demo04Person("杨香", 24));
		mapA.put("州", new Demo04Person("杨香", 24)); 
		Set<String> set = mapA.keySet();
		Iterator<String> it = set.iterator();
		while(it.hasNext()) {
			System.out.println(mapA.get(it.next()));
		}
		
}
	}
