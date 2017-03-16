import java.util.Scanner;

class ExamProgram {
	public static void main(String[] args) {

		// 기본값
		int kor = 0;
		int eng = 0;
		int math = 0;
		int menu = 0;

		// 입력 도구 준비
		Scanner scan = new Scanner(System.in);

		end:while (true) {

			System.out.println("┌──────────────────────────────────────┐");
			System.out.println("│                메인 메뉴                            	   │");
			System.out.println("└──────────────────────────────────────┘");

			System.out.println(" 1.성적 입력 ");
			System.out.println(" 2.성적 출력 ");
			System.out.println(" 3.종료 ");
			System.out.print(" 선택 >  ");
			menu = scan.nextInt();

			switch (menu) {

			case 1: {
				System.out.println("┌──────────────────────────────────────┐");
				System.out.println("│                성적입력            	           │");
				System.out.println("└──────────────────────────────────────┘");

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
				break;
			}
			case 2: {

				for(int i=0;i<3;i++)
				{
					int total = kor + eng + math;
					float avg = total / 3;
	
					System.out.println("┌──────────────────────────────────────┐");
					System.out.println("│                성적출력                                 │");
					System.out.println("└──────────────────────────────────────┘");
	
					System.out.printf(" 국어 :%d\n", kor);
					System.out.printf(" \t영어 : %d\n", eng);
					System.out.printf(" \t\t수학 : %d\n", math);
					System.out.printf(" \t\t\t총점 : %d\n", total);
					System.out.printf(" \t\t\t\t평균 : %.2f\n", avg);
					System.out.println(" ───────────────────────────────────────");
					
				}
				break;
			}
			case 3: 
			{
				System.out.println("Bye ~~");
				break end;
			}
			
			default:
				System.out.println("메뉴 범위는 1~3까지입니다.");

			}
			
		}
		scan.close();
	}

}