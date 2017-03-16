package oop.array;

import java.util.Scanner;

public class ExamProgram {

	public static void main(String[] args) {

		
		
		Exam[] exams = new Exam[3];
		
		int index=0;	// 출력할 개수
		int menu;
		int capacity=3;

		while (true) {
			menu = Exam.inputMenu();

			switch (menu) {
			case 1:
				Scanner scan = new Scanner(System.in);
				String isContinue = "no";
				System.out.println("┌──────────────────────────────────────┐");
				System.out.println("│                성적입력                                      |");
				System.out.println("└──────────────────────────────────────┘");

				
				do{
					if(index >= capacity) 							// 배열 공간이 부족하다면
					{
						Exam[] temp= new Exam[capacity+5];   		// 임시 배열  temp 생성
						for(int i=0;i<index;i++)	  				// 기존 Exam 객체들을 temp방으로 이전한다.
							temp[i] = exams[i];
							
						capacity += 5;								// 창고의 크기를 새로 지정
						exams= temp;								// exams가 참조하는 배열을 temp의 배열로 변경.
					}
					
					exams[index] = new Exam();
					exams[index].input();
					
				
					index++; 										// 출력 개수 증가
					
					System.out.print("continue (yes or no):");
					isContinue = scan.nextLine();
					
					
				}while(!isContinue.equals("no"));
				break;
				
			case 2:
				
				System.out.println("┌──────────────────────────────────────┐");
				System.out.println("│                성적출력                                     |");
				System.out.println("└──────────────────────────────────────┘");

				for (int i = 0; i < index; i++)   					// 출력개수만큼 for문돌려 출력
					exams[i].print();
				break;
			case 3:
				break;
			}
		}
	}

}