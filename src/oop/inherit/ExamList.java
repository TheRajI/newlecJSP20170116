package oop.inherit;									//���������� �÷������� ������ ���̺귯��

public class ExamList {
	private Exam[] exams;
	private int index; 
	private int capacity;
	
	public ExamList() {
		exams = new Exam[3];
		index = 0; 
		capacity = 3;
	}

	public void add(Exam exam) {
		if (index >= capacity)						 	// �迭 ������ �����ϴٸ�
		{
			Exam[] temp = new Exam[capacity + 5]; 		// �ӽ� �迭 temp ����
			for (int i = 0; i < index; i++) 			// ���� Exam ��ü���� temp������
														// �����Ѵ�.
				temp[i] = exams[i];

			capacity += 5; 								// â���� ũ�⸦ ���� ����
			exams = temp; 								// exams�� �����ϴ� �迭�� temp�� �迭�� ����.
		}

		exams[index] = exam;

		index++; 										// ��� ���� ����
		
	}

	public int size() {
		
		return index;
	}
	public Exam get(int i){
		return exams[i];
	}
	
	
}
