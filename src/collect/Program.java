package collect;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Program {

	public static void main(String[] args) {
		//컬렉션 3가지
		
		//Set형 컬렉션						//식별자가 중복되는 등 식별에 문제가되면 덮어쓰여지거나 의미가없어짐. 따라서 3개만 저장
		Set s = new HashSet();
		s.add(1);
		s.add(2);
		
		for(Object o : s)				//컬렉션을 순회하는데 필요한 문 for each 문 - 컬렉션만 쓸수있다.
			System.out.println(o);
				
		//List형 컬렉션
		List list = new ArrayList();	// 5개 저장
		list.add(1);
		list.add(2);
		for(Object o : list)
			System.out.println(o);
				
		
		//Map형 컬렉션
		Map map = new HashMap();		// 3개 저장, 좀더 직관적임
		map.put("나이",1);
		map.put("키",123);
		
		for(Object k : map.keySet())
			System.out.println(map.get(k));
		
		
		
	}

}
