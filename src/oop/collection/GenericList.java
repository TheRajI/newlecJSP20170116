package oop.collection;									//���������� �÷������� ������ ���̺귯��

public class GenericList<����> {
	private ����[] objects;
	private int index; 
	private int capacity;
	
	public GenericList() {
		objects = (����[])new Object[3];    				// ����ȯ (�����迭 ������)
		index = 0;
		capacity = 3;
	}

	public void add(���� obj) {
		if (index >= capacity)						 	// �迭 ������ �����ϴٸ�
		{
			����[] temp = (����[])new Object[capacity + 5]; 			// �ӽ� �迭 temp ����
			for (int i = 0; i < index; i++) 			// ���� Exam ��ü���� temp������
														// �����Ѵ�.
				temp[i] = objects[i];

			capacity += 5; 								// â���� ũ�⸦ ���� ����
			objects = temp; 							// exams�� �����ϴ� �迭�� temp�� �迭�� ����.
		}

		objects[index] = obj;

		index++; 										// ��� ���� ����
		
	}

	public int size() {
		
		return index;
	}
	public ���� get(int i){
		return objects[i];
	}
	
	
}
