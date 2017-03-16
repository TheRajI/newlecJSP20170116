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
			System.out.print("��ȣ 6�� �Է� : ");
			for (int i = 0; i < number.length; i++) {

				firstNum[i] = lotto.nextInt();

				// System.out.printf("%d ", firstNum[i]);
				if (firstNum[i] > 45 || firstNum[i] <= 0) {
					System.out.println("�߸��� ��ȣ�� �Է��Ͽ����ϴ�.");
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
		System.out.println("��÷ ���� : " + cnt);
		switch (cnt) {
		case 0:
			System.out.println("��! ������ȸ�� ");
			break;
		case 1:
			System.out.println("��! ������ȸ�� ");
			break;
		case 2:
			System.out.println("��! ������ȸ�� ");
			break;
		case 3:
			System.out.println("4�� �����մϴ�. ");
			break;
		case 4:
			System.out.println("3�� �����մϴ�. ");
			break;
		case 5:
			System.out.println("2�� �����մϴ�. ");
			break;
		case 6:
			System.out.println("1�� �λ����� �����մϴ�. ");
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
 * System.out.println("A���� ��� ���� "+ count1 +"��");
 * System.out.println("B���� ��� ���� "+ count2 +"��");
 * System.out.println("C���� ��� ���� "+ count3 +"��");
 */
