package oop.inherit.ui;

import java.util.Scanner;

import oop.inherit.entity.Exam;

public class ExamConsole { // ����ȭ : ���������� ��������� �׷�ȭ

	private Exam exam; // has a ���

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

		System.out.printf(" ���� :%d\n", kor);
		System.out.printf(" \t���� : %d\n", eng);
		System.out.printf(" \t\t���� : %d\n", math);
		System.out.printf(" \t\t\t���� : %d\n", total);
		System.out.printf(" \t\t\t\t��� : %.2f\n", avg);
		System.out.println(" ������������������������������������������������������������������������������");

	}

	public void input() {

		int kor, eng, math;

		Scanner scan = new Scanner(System.in);

		do {
			System.out.print(" ���� : ");
			kor = scan.nextInt();

			if (kor < 0 || kor > 100)
				System.out.println("������ ������ 0~100�����Դϴ�.");
		} while (kor < 0 || kor > 100);

		do {
			System.out.print(" ���� : ");
			eng = scan.nextInt();
			if (eng < 0 || eng > 100)
				System.out.println("������ ������ 0~100�����Դϴ�.");
		} while (eng < 0 || eng > 100);

		do {
			System.out.print(" ���� : ");
			math = scan.nextInt();
			if (math < 0 || math > 100)
				System.out.println("������ ������ 0~100�����Դϴ�.");
		} while (math < 0 || math > 100);

		System.out.println(" ������������������������������������������������������������������������������");
		exam.setKor(kor);
		exam.setEng(eng);
		exam.setMath(math);
	}

	public static int inputMenu() {

		int menu;

		System.out.println("��������������������������������������������������������������������������������");
		System.out.println("��                ���� �޴�                          	 ��");
		System.out.println("��������������������������������������������������������������������������������");

		System.out.println(" 1.���� �Է� ");
		System.out.println(" 2.���� ��� ");
		System.out.println(" 3.���� ");
		System.out.print(" ���� >  ");

		Scanner scan = new Scanner(System.in);

		menu = scan.nextInt();

		return menu;
	}
}
