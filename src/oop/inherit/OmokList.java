package oop.inherit;									//���������� �÷������� ������ ���̺귯��

public class OmokList {
	private Omok[] omoks;
	private int index; 
	private int capacity;
	
	public OmokList() {
		omoks = new Omok[3];
		
	}

	public void add(Omok Omok) {
		if (index >= capacity)						 	// �迭 ������ �����ϴٸ�
		{
			Omok[] temp = new Omok[capacity + 5]; 		// �ӽ� �迭 temp ����
			for (int i = 0; i < index; i++) 			// ���� Exam ��ü���� temp������
														// �����Ѵ�.
				temp[i] = omoks[i];

			capacity += 5; 								// â���� ũ�⸦ ���� ����
			omoks = temp; 								// exams�� �����ϴ� �迭�� temp�� �迭�� ����.
		}

		omoks[index] = Omok;

		index++; 										// ��� ���� ����
		
	}

	public int size() {
		
		return index;
	}
	public Omok get(int i){
		return omoks[i];
	}
	
	
}
