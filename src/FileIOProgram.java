import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;

public class FileIOProgram {

	public static void main(String[] args) throws IOException {

		FileInputStream fis = new FileInputStream("res/data.khw");
		Scanner scan = new Scanner(fis);

		int num;
		int sum = 0;
		int cnt = 0;
		
		int a;
		
		a=scan.nextInt();

		while (scan.hasNext()) {
			num = scan.nextInt();
			while (cnt < a)
			{
				
				System.out.printf("num : %d\n", num);
				sum += num;
				num = scan.nextInt();
				cnt++;
												
			}
			
		}
		System.out.println("총 합은 : " + sum + " 입니다");
		fis.close();
		scan.close();

		/*
		 * FileOutputStream fos = new
		 * FileOutputStream("C:\\Users\\lee\\Desktop\\2017-01-16 라지현\\workspace\\data.khw"
		 * ); PrintStream fout = new PrintStream(fos);
		 * 
		 * fout.println("안녕하셍요요요요요"); fout.close();
		 */
		System.out.println("작업 종료");

	}

}
