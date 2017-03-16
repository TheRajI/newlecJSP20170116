package oop.collection;									//점진적으로 늘려나가는 관리형 라이브러리

public class GenericList<세은> {
	private 세은[] objects;
	private int index; 
	private int capacity;
	
	public GenericList() {
		objects = (세은[])new Object[3];    				// 형변환 (세은배열 형으로)
		index = 0;
		capacity = 3;
	}

	public void add(세은 obj) {
		if (index >= capacity)						 	// 배열 공간이 부족하다면
		{
			세은[] temp = (세은[])new Object[capacity + 5]; 			// 임시 배열 temp 생성
			for (int i = 0; i < index; i++) 			// 기존 Exam 객체들을 temp방으로
														// 이전한다.
				temp[i] = objects[i];

			capacity += 5; 								// 창고의 크기를 새로 지정
			objects = temp; 							// exams가 참조하는 배열을 temp의 배열로 변경.
		}

		objects[index] = obj;

		index++; 										// 출력 개수 증가
		
	}

	public int size() {
		
		return index;
	}
	public 세은 get(int i){
		return objects[i];
	}
	
	
}
