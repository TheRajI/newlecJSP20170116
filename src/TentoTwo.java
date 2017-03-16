import java.util.Scanner;

public class TentoTwo {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
	
		System.out.print("10진수 숫자를 입력하세요 : ");

		int num = scan.nextInt();
		
		
		int twonum[] = new int[100];
		int i=0;
		
		while(num != 1)
		{
			twonum[i] = num % 2;
			num = num/2;
			i++;
		}
		twonum[i]=num;
		
		for(int j=i;j>=0;j--)
		{
			String str = String.valueOf(twonum[j]);
			System.out.print(str);
		}
		
	}

}
