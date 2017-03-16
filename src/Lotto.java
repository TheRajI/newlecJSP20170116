import java.util.Random;
import java.util.Scanner;

public class Lotto {

	public static void main(String[] args) {

		int[] number = new int[6];
		int[] firstNum = new int[6];
		int cnt = 0;
		int tmp = 0;
		Random rand = new Random();

		Scanner lotto = new Scanner(System.in);

		while (firstNum[tmp] > 45 || firstNum[tmp] <= 0) {
			System.out.print("번호 6개 입력 : ");
			for (int i = 0; i < number.length; i++) {

				firstNum[i] = lotto.nextInt();

				// System.out.printf("%d ", firstNum[i]);
				if (firstNum[i] > 45 || firstNum[i] <= 0) {
					System.out.println("잘못된 번호를 입력하였습니다.");
					tmp = i;
					break;
				}
			}
		}
		
			System.out.println();

			for (int i = 0; i < number.length; i++) {
				number[i] = rand.nextInt(45) + 1;

				for (int j = 0; j < i; j++) {

					if (number[i] == number[j]) {

						number[i] = rand.nextInt(45) + 1;
						i--;
					}
				}
			}
			int temp;
			for (int i = 0; i < number.length; i++) {
				for (int j = 0; j < i; j++) {
					if (number[i] < number[j]) {
						temp = number[j];
						number[j] = number[i];
						number[i] = temp;
					}
				}
			}
			for (int i = 0; i < number.length; i++)
				System.out.printf("%d ", number[i]);

			for (int i = 0; i < number.length; i++) {

				for (int j = 0; j < number.length; j++) {
					if (firstNum[i] == number[j])
						cnt++;
				}

			}
		

		System.out.println();
		System.out.println("당첨 개수 : " + cnt);
		switch (cnt) {
		case 0:
			System.out.println("꽝! 다음기회에 ");
			break;
		case 1:
			System.out.println("꽝! 다음기회에 ");
			break;
		case 2:
			System.out.println("꽝! 다음기회에 ");
			break;
		case 3:
			System.out.println("4등 축하합니다. ");
			break;
		case 4:
			System.out.println("3등 축하합니다. ");
			break;
		case 5:
			System.out.println("2등 축하합니다. ");
			break;
		case 6:
			System.out.println("1등 인생역전 축하합니다. ");
			break;
		}
		lotto.close();
	}
}
/*
 * 
 *
 * int score[] = {92, 85, 73, 95}; int count1 =0; int count2 =0; int count3 =0;
 * for(int i=0;i<4;i++) {
 * 
 * if(score[i] > 90) { System.out.println("A"); count1++; }
 * 
 * else if(score[i]<= 90 && score[i] > 80) { System.out.println("B"); count2++;
 * } else { System.out.println("C"); count3++; } }
 * System.out.println("A받은 사람 수는 "+ count1 +"명");
 * System.out.println("B받은 사람 수는 "+ count2 +"명");
 * System.out.println("C받은 사람 수는 "+ count3 +"명");
 */
