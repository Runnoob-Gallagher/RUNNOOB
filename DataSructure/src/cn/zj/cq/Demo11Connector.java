package cn.zj.cq;
//��ȥд�ܽ�
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.stream.Collectors;

//���demo��  Comparator�ӿ�λ��java.util���£���Ҫ��дint compare(T o1, T o2);
public class Demo11Connector {
	public static void main(String[] args) {
		ArrayList<Demo11ConnectorPerson> ad = new ArrayList<Demo11ConnectorPerson>();
		ad.add(new Demo11ConnectorPerson("���",0));
		ad.add(new Demo11ConnectorPerson("���",0)); 
		ad.add(new Demo11ConnectorPerson("��ţ��",58));
		ad.add(new Demo11ConnectorPerson("����ʦ",20));
		Collections.sort(ad, new Comparator<Demo11ConnectorPerson>() {

			@Override
			public int compare(Demo11ConnectorPerson o1, Demo11ConnectorPerson o2) {
				// TODO Auto-generated method stub
				int result = o1.getAge()-o2.getAge();
				if(result == 0 ) {
					result = o1.getName().charAt(1) - o2.getName().charAt(1);
				}
				return result;
			}
			
		});
		System.out.println(ad);
				}
	
}

