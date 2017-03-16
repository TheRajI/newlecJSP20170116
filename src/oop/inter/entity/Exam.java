package oop.inter.entity;


public abstract class Exam { 		// ����ȭ : ���������� ��������� �׷�ȭ

	// ����ȭ
	private int kor; 		// Ŭ�����ȿ����� ���� X(������ ��������°� �ƴ϶� �����ϴ°�(û����)) , �Լ� �ȿ����� ����
	private int eng;
	private int math;

	
	
	public Exam() {			// �⺻���� 10���� ���� �����ڸ� ���� 
		/*kor=10;
		eng=10;
		math=10;*/
		this(10, 10, 10);	// �ؿ� �����ڸ� ȣ�� (�� �� �ϳ��� ����Ѵ��ϸ� �ŰԺ��� ���� ���� ���� ����)
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

		return total() / 3.0f;                     --> �߻�ȭ �������� �ʿ���� but �Լ��� �����ϵ� ��������� ���°���
	}*/
	public abstract float avg();					// �ʰ� �������ؼ� ����ض�
		
	
}