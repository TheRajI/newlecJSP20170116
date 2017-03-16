package oop.inherit.ui;

import java.util.Scanner;

import oop.inherit.entity.Exam;

public class ExamConsole { // 구조화 : 계층단위로 개념단위로 그룹화

	private Exam exam; // has a 상속

	public void setExam(Exam exam) {
		this.exam = exam;
	}

	public ExamConsole(Exam exam) {
		this.exam = exam;
		/* exam = new Exam(); */
	}

	public void print() {

		int kor = exam.getKor();
		int eng = exam.getEng();
		int math = exam.getMath();

		int total = exam.total();
		float avg = exam.avg();

		System.out.printf(" 국어 :%d\n", kor);
		System.out.printf(" \t영어 : %d\n", eng);
		System.out.printf(" \t\t수학 : %d\n", math);
		System.out.printf(" \t\t\t총점 : %d\n", total);
		System.out.printf(" \t\t\t\t평균 : %.2f\n", avg);
		System.out.println(" ───────────────────────────────────────");

	}

	public void input() {

		int kor, eng, math;

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
		exam.setKor(kor);
		exam.setEng(eng);
		exam.setMath(math);
	}

	public static int inputMenu() {

		int menu;

		System.out.println("┌──────────────────────────────────────┐");
		System.out.println("│                메인 메뉴                          	 │");
		System.out.println("└──────────────────────────────────────┘");

		System.out.println(" 1.성적 입력 ");
		System.out.println(" 2.성적 출력 ");
		System.out.println(" 3.종료 ");
		System.out.print(" 선택 >  ");

		Scanner scan = new Scanner(System.in);

		menu = scan.nextInt();

		return menu;
	}
}
