package collect;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Program {

	public static void main(String[] args) {
		//�÷��� 3����
		
		//Set�� �÷���						//�ĺ��ڰ� �ߺ��Ǵ� �� �ĺ��� �������Ǹ� ��������ų� �ǹ̰�������. ���� 3���� ����
		Set s = new HashSet();
		s.add(1);
		s.add(2);
		
		for(Object o : s)				//�÷����� ��ȸ�ϴµ� �ʿ��� �� for each �� - �÷��Ǹ� �����ִ�.
			System.out.println(o);
				
		//List�� �÷���
		List list = new ArrayList();	// 5�� ����
		list.add(1);
		list.add(2);
		for(Object o : list)
			System.out.println(o);
				
		
		//Map�� �÷���
		Map map = new HashMap();		// 3�� ����, ���� ��������
		map.put("����",1);
		map.put("Ű",123);
		
		for(Object k : map.keySet())
			System.out.println(map.get(k));
		
		
		
	}

}
