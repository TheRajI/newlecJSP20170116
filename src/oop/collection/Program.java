package oop.collection;

import java.util.ArrayList;

public class Program {

	public static void main(String[] args) {
		/*Object x = 3; 	// 원래는 안되는데 , Object x = new Integer(3); --> auto-boxing 작업을 통해 가능함  //
		// 단일한 데이터 관리를 위해서 boxing해주는 클래스가 필요 -> 래퍼클래스 */
		ArrayList list = new ArrayList();   	 // <>을 안넣어주면 기본 데이터형 Object가 넣어졌다 생각 -> 범용
		list.add(3);								 // <> 안에 특화된 자료형 넣어주면 그 외에는 컴파일 오류	
		list.add(new Exam());

		int x = (int)list.get(0);
		//Exam ex = list.get(1);
		
		System.out.println("done");
		
	
		
	}

}
