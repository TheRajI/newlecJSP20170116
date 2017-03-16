import java.util.Scanner;

public class CharOrInt {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("입력하시오 : ");

		String text = input.next();

	
		int cnt=0;
		for (int i = 0; i < text.length(); i++) {
			int b = text.charAt(i);
			if (b >= 48 && b <= 57) {
				cnt++;
			}
			
		}
		if(cnt == text.length())
			System.out.println("숫자입니다.");
		else
			System.out.println("문자입니다.");
		
		input.close();
	}
	

}
