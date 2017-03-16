package oop.abstrac.ui;

import java.util.Scanner;

import oop.abstrac.entity.Exam;

public class ExamConsole { // ����ȭ : ���������� ��������� �׷�ȭ

	private Exam exam; // has a ���

	public void setExam(Exam exam) {
		this.exam = exam;
	}

	public ExamConsole(Exam exam) {
		this.exam = exam;
		/* exam = new Exam(); */
	}

	public Exam getExam() {
		return exam;
	}

	public void print() {

		int kor = exam.getKor();
		int eng = exam.getEng();
		int math = exam.getMath();

		int total = exam.total();
		float avg = exam.avg();
		
		System.out.println("��������������������������������������������������������������������������������");
		System.out.println("��                ���� ���                                    ��");
		System.out.println("��������������������������������������������������������������������������������");


		System.out.printf(" ���� : %d\n", kor);
		System.out.printf(" ���� : %d\n", eng);
		System.out.printf(" ���� : %d\n", math);
		
		
		
		System.out.printf(" ���� : %d\n", total);
		System.out.printf(" ��� : %.2f\n", avg);
		System.out.println(" ������������������������������������������������������������������������������");

	}

	
	public void input() {

		System.out.println("��������������������������������������������������������������������������������");
		System.out.println("��                �����Է�                                     ��");
		System.out.println("��������������������������������������������������������������������������������");

		
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

		exam.setKor(kor);
		exam.setEng(eng);
		exam.setMath(math);
		
		// �� �κп� ���� ������ �˴ϴ�.
		
	}

	public static int inputMenu() {

		int menu;

		System.out.println("��������������������������������������������������������������������������������");
		System.out.println("��                ���� �޴�                                     ��");
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
