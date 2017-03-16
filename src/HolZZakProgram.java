import java.util.Scanner;

public class HolZZakProgram {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		while(true){
		System.out.println("─── 홀수, 짝수를 맞춰라 게임 ───");
		System.out.print("숫자를 입력하세요 : ");
		int num = scan.nextInt();
		
		if(num % 2 == 0)
			System.out.println("짝수임");
		else
			System.out.println("홀수임");
		
		System.out.print("더 한다 -- 1 , 안한다 -- 2  : ");
		num = scan.nextInt();
		if(num == 1)
		{
			continue;
		}
		else 
			break;
		}
		
		scan.close();
	}
	
}
