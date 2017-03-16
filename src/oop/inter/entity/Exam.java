package oop.inter.entity;


public abstract class Exam { 		// 구조화 : 계층단위로 개념단위로 그룹화

	// 은닉화
	private int kor; 		// 클래스안에서는 선언 X(공간이 만들어지는게 아니라 정의하는거(청사진)) , 함수 안에서만 가능
	private int eng;
	private int math;

	
	
	public Exam() {			// 기본값을 10으로 가진 생성자를 만듬 
		/*kor=10;
		eng=10;
		math=10;*/
		this(10, 10, 10);	// 밑에 생성자를 호출 (둘 중 하나를 사용한다하면 매게변수 값이 많은 쪽을 선택)
	}
	
	public Exam(int kor, int eng, int math) {			
		this.kor=kor;
		this.eng=eng;
		this.math=math;
	}
	
	public int getKor() {
		return kor;
	}



	public void setKor(int kor) {
		this.kor = kor;
	}



	public void setEng(int eng) {
		this.eng = eng;
	}



	public void setMath(int math) {
		this.math = math;
	}



	public int getEng() {
		return eng;
	}

	

	public int getMath() {
		return math;
	}



	public int total() {

		return kor + eng + math;
	}

/*	public float avg() {

		return total() / 3.0f;                     --> 추상화 과정에서 필요없음 but 함수는 존재하되 구현기능이 없는것임
	}*/
	public abstract float avg();					// 너가 재정의해서 사용해라
		
	
}