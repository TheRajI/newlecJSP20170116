package oop.array;

import java.util.Scanner;

public class ExamProgram {

	public static void main(String[] args) {

		
		
		Exam[] exams = new Exam[3];
		
		int index=0;	// ����� ����
		int menu;
		int capacity=3;

		while (true) {
			menu = Exam.inputMenu();

			switch (menu) {
			case 1:
				Scanner scan = new Scanner(System.in);
				String isContinue = "no";
				System.out.println("��������������������������������������������������������������������������������");
				System.out.println("��                �����Է�                                      |");
				System.out.println("��������������������������������������������������������������������������������");

				
				do{
					if(index >= capacity) 							// �迭 ������ �����ϴٸ�
					{
						Exam[] temp= new Exam[capacity+5];   		// �ӽ� �迭  temp ����
						for(int i=0;i<index;i++)	  				// ���� Exam ��ü���� temp������ �����Ѵ�.
							temp[i] = exams[i];
							
						capacity += 5;								// â���� ũ�⸦ ���� ����
						exams= temp;								// exams�� �����ϴ� �迭�� temp�� �迭�� ����.
					}
					
					exams[index] = new Exam();
					exams[index].input();
					
				
					index++; 										// ��� ���� ����
					
					System.out.print("continue (yes or no):");
					isContinue = scan.nextLine();
					
					
				}while(!isContinue.equals("no"));
				break;
				
			case 2:
				
				System.out.println("��������������������������������������������������������������������������������");
				System.out.println("��                �������                                     |");
				System.out.println("��������������������������������������������������������������������������������");

				for (int i = 0; i < index; i++)   					// ��°�����ŭ for������ ���
					exams[i].print();
				break;
			case 3:
				break;
			}
		}
	}

}