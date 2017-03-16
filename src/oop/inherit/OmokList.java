package oop.inherit;									//점진적으로 늘려나가는 관리형 라이브러리

public class OmokList {
	private Omok[] omoks;
	private int index; 
	private int capacity;
	
	public OmokList() {
		omoks = new Omok[3];
		
	}

	public void add(Omok Omok) {
		if (index >= capacity)						 	// 배열 공간이 부족하다면
		{
			Omok[] temp = new Omok[capacity + 5]; 		// 임시 배열 temp 생성
			for (int i = 0; i < index; i++) 			// 기존 Exam 객체들을 temp방으로
														// 이전한다.
				temp[i] = omoks[i];

			capacity += 5; 								// 창고의 크기를 새로 지정
			omoks = temp; 								// exams가 참조하는 배열을 temp의 배열로 변경.
		}

		omoks[index] = Omok;

		index++; 										// 출력 개수 증가
		
	}

	public int size() {
		
		return index;
	}
	public Omok get(int i){
		return omoks[i];
	}
	
	
}
