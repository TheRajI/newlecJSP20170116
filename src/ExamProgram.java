import java.util.Scanner;

class ExamProgram {
	public static void main(String[] args) {

		// �⺻��
		int kor = 0;
		int eng = 0;
		int math = 0;
		int menu = 0;

		// �Է� ���� �غ�
		Scanner scan = new Scanner(System.in);

		end:while (true) {

			System.out.println("��������������������������������������������������������������������������������");
			System.out.println("��                ���� �޴�                            	   ��");
			System.out.println("��������������������������������������������������������������������������������");

			System.out.println(" 1.���� �Է� ");
			System.out.println(" 2.���� ��� ");
			System.out.println(" 3.���� ");
			System.out.print(" ���� >  ");
			menu = scan.nextInt();

			switch (menu) {

			case 1: {
				System.out.println("��������������������������������������������������������������������������������");
				System.out.println("��                �����Է�            	           ��");
				System.out.println("��������������������������������������������������������������������������������");

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
				break;
			}
			case 2: {

				for(int i=0;i<3;i++)
				{
					int total = kor + eng + math;
					float avg = total / 3;
	
					System.out.println("��������������������������������������������������������������������������������");
					System.out.println("��                �������                                 ��");
					System.out.println("��������������������������������������������������������������������������������");
	
					System.out.printf(" ���� :%d\n", kor);
					System.out.printf(" \t���� : %d\n", eng);
					System.out.printf(" \t\t���� : %d\n", math);
					System.out.printf(" \t\t\t���� : %d\n", total);
					System.out.printf(" \t\t\t\t��� : %.2f\n", avg);
					System.out.println(" ������������������������������������������������������������������������������");
					
				}
				break;
			}
			case 3: 
			{
				System.out.println("Bye ~~");
				break end;
			}
			
			default:
				System.out.println("�޴� ������ 1~3�����Դϴ�.");

			}
			
		}
		scan.close();
	}

}