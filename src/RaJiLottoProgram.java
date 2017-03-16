import java.io.FileInputStream;
import java.io.IOException;
import java.util.Random;
import java.util.Scanner;

public class RaJiLottoProgram {

	public static void main(String[] args) throws IOException {

		FileInputStream fis = new FileInputStream("res/data.khw");
		Scanner scan = new Scanner(fis);
		
		Random rand = new Random();
		// 정수 배열 선언/생성
		int[] num = new int[6];

		// 정수 배열에 로또 번호를 로드
		
		for(int i=0;i<num.length;i++){
			num[i] = rand.nextInt(10)+1;
			//num[i] = scan.nextInt();
		}
		fis.close();
		scan.close();
		
		//출력
		//32 6 20 12 39 26 19
		for (int i = 0; i < num.length; i++) {
			num[i] = rand.nextInt(45) + 1;

			for (int j = 0; j < i; j++) {

				if (num[i] == num[j]) {

					num[i] = rand.nextInt(45) + 1;
					i--;
				}
			}
		}		
		//정렬
	/*	for (int i = 0; i < num.length; i++) 
			for(int j=0;j<i;j++)
			
	*/			
			for(int j=0;j<5;j++)
				for(int i=0;i<5-j;i++)
					if (num[i] > num[i+1]) {
						int temp;
						temp = num[i];
						num[i] = num[i+1];
						num[i+1] = temp;
					}	
		// 출력
		for(int i=0;i<6;i++)
			System.out.printf("%-4d", num[i]);
		/*
		 * FileOutputStream fos = new
		 * FileOutputStream("C:\\Users\\lee\\Desktop\\2017-01-16 라지현\\workspace\\data.khw"
		 * ); PrintStream fout = new PrintStream(fos);
		 * 
		 * fout.println("안녕하셍요요요요요"); fout.close();
		 */

	}

}
