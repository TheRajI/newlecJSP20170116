package struct;

import java.util.Scanner;

public class ExamProgram {

	public static void main(String[] args) {
		
		int kor = 0;
		int math = 0;
		int eng = 0;
		
		Exam exam;
		
		int menu = 0;
		
		while (true) {
			menu = inputMenu(menu);

			switch (menu) {
			case 1:
				inputExam(kor, eng, math);
				break;
			case 2:
				printExam(kor, eng, math);
				break;
			case 3:
				break;
			}
		}
	}

	public static int inputMenu(int menu) {
		
		
		System.out.println("┌──────────────────────────────────────┐");
		System.out.println("│                메인 메뉴                            	   │");
		System.out.println("└──────────────────────────────────────┘");

		System.out.println(" 1.성적 입력 ");
		System.out.println(" 2.성적 출력 ");
		System.out.println(" 3.종료 ");
		System.out.print(" 선택 >  ");
		
		Scanner scan = new Scanner(System.in);
		
		menu = scan.nextInt();
		
		return menu;
	}

	public static void inputExam(int kor, int eng, int math) {
		System.out.println("┌──────────────────────────────────────┐");
		System.out.println("│                성적입력            	           │");
		System.out.println("└──────────────────────────────────────┘");
		
		Scanner scan = new Scanner(System.in);
		do {
			System.out.print(" 국어 : ");
			kor = scan.nextInt();
			
			if (kor < 0 || kor > 100)
				System.out.println("성적의 범위는 0~100까지입니다.");
		} while (kor < 0 || kor > 100);

		do {
			System.out.print(" 영어 : ");
			eng = scan.nextInt();
			if (eng < 0 || eng > 100)
				System.out.println("성적의 범위는 0~100까지입니다.");
		} while (eng < 0 || eng > 100);

		do {
			System.out.print(" 수학 : ");
			math = scan.nextInt();
			if (math < 0 || math > 100)
				System.out.println("성적의 범위는 0~100까지입니다.");
		} while (math < 0 || math > 100);
		System.out.println(" ───────────────────────────────────────");
		
	}

	public static void printExam(int kor, int eng, int math) {
		
		
			int total = kor + eng + math;
			float avg = total / 3;

			System.out.println("┌──────────────────────────────────────┐");
			System.out.println("│                성적출력                             	   |");
			System.out.println("└──────────────────────────────────────┘");

			System.out.printf(" 국어 :%d\n", kor);
			System.out.printf(" \t영어 : %d\n", eng);
			System.out.printf(" \t\t수학 : %d\n", math);
			System.out.printf(" \t\t\t총점 : %d\n", total);
			System.out.printf(" \t\t\t\t평균 : %.2f\n", avg);
			System.out.println(" ───────────────────────────────────────");
			
			
		
	}

	
	

}

	