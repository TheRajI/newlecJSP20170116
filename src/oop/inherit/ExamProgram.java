package oop.inherit;

import java.util.Scanner;

public class ExamProgram {

	public static void main(String[] args) {

		ExamList list = new ExamList();

		int menu;

		while (true) {
			menu = Exam.inputMenu();

			switch (menu) {
			case 1:
				Scanner scan = new Scanner(System.in);
				String isContinue = "no";
				System.out.println("┌──────────────────────────────────────┐");
				System.out.println("│                성적입력                                      |");
				System.out.println("└──────────────────────────────────────┘");

				do {
					
					Exam exam = new Exam();
					exam.input();
					
					list.add(exam);

					System.out.print("continue (yes or no):");
					isContinue = scan.nextLine();

				} while (!isContinue.equals("no"));
				break;

			case 2:

				System.out.println("┌──────────────────────────────────────┐");
				System.out.println("│                성적출력                                     |");
				System.out.println("└──────────────────────────────────────┘");

				for (int i = 0; i < list.size(); i++){ // 출력개수만큼 for문돌려 출력
					Exam exam = list.get(i);
					exam.print();
				}
				break;
			case 3:
				break;
			}
		}
	}

}