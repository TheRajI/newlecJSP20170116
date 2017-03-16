package oop;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		
		
		
		Exam exam = new Exam();
	 // ��ü    ��ü�̸�	     ��ü
		int menu = 0;
		
		while (true) {
			menu = inputMenu(menu);

			switch (menu) {
			case 1:
				input(exam);
				break;
			case 2:
				print(exam);
				break;
			case 3:
				break;
			}
		}
	}
	
	public static int inputMenu(int menu) {
		
		
		System.out.println("��������������������������������������������������������������������������������");
		System.out.println("��                ���� �޴�                            	   ��");
		System.out.println("��������������������������������������������������������������������������������");

		System.out.println(" 1.���� �Է� ");
		System.out.println(" 2.���� ��� ");
		System.out.println(" 3.���� ");
		System.out.print(" ���� >  ");
		
		Scanner scan = new Scanner(System.in);
		
		menu = scan.nextInt();
		
		return menu;
	}

	public static void input(Exam exam) {
		
		int kor = exam.kor;
		int eng = exam.eng;
		int math = exam.math;
		
		System.out.println("��������������������������������������������������������������������������������");
		System.out.println("��                �����Է�            	           ��");
		System.out.println("��������������������������������������������������������������������������������");
		
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
		
		exam.kor = kor;
		exam.eng = eng;
		exam.math = math;
	}

	public static void print(Exam exam) {
		
			int kor = exam.kor;
			int eng = exam.eng;
			int math = exam.math;
		
			int total = kor + eng + math;
			float avg = total / 3;

			System.out.println("��������������������������������������������������������������������������������");
			System.out.println("��                �������                             	   |");
			System.out.println("��������������������������������������������������������������������������������");

			System.out.printf(" ���� :%d\n", kor);
			System.out.printf(" \t���� : %d\n", eng);
			System.out.printf(" \t\t���� : %d\n", math);
			System.out.printf(" \t\t\t���� : %d\n", total);
			System.out.printf(" \t\t\t\t��� : %.2f\n", avg);
			System.out.println(" ������������������������������������������������������������������������������");
			
			
		
	}

	
	

}

	