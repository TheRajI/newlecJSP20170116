import java.util.Scanner;

public class CharOrInt {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("�Է��Ͻÿ� : ");

		String text = input.next();

	
		int cnt=0;
		for (int i = 0; i < text.length(); i++) {
			int b = text.charAt(i);
			if (b >= 48 && b <= 57) {
				cnt++;
			}
			
		}
		if(cnt == text.length())
			System.out.println("�����Դϴ�.");
		else
			System.out.println("�����Դϴ�.");
		
		input.close();
	}
	

}
