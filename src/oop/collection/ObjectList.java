package oop.collection;									//���������� �÷������� ������ ���̺귯��

public class ObjectList {
	private Object[] objects;
	private int index; 
	private int capacity;
	
	public ObjectList() {
		objects = new Object[3];
		
	}

	public void add(Object Omok) {
		if (index >= capacity)						 	// �迭 ������ �����ϴٸ�
		{
			Object[] temp = new Object[capacity + 5]; 	// �ӽ� �迭 temp ����
			for (int i = 0; i < index; i++) 			// ���� Exam ��ü���� temp������
														// �����Ѵ�.
				temp[i] = objects[i];

			capacity += 5; 								// â���� ũ�⸦ ���� ����
			objects = temp; 							// exams�� �����ϴ� �迭�� temp�� �迭�� ����.
		}

		objects[index] = Omok;

		index++; 										// ��� ���� ����
		
	}

	public int size() {
		
		return index;
	}
	public Object get(int i){
		return objects[i];
	}
	
	
}
