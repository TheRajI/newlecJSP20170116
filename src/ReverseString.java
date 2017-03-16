
import java.io.CharArrayReader;
import java.util.Scanner;

public class ReverseString {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.print("입력할 단어 : ");
		String text = input.next();

		char[] s = new char[text.length()];
		for (int i = 0; i < text.length(); i++)
			s[i] = text.charAt(i);

		for (int i = 1; i <= text.length(); i++) {
			System.out.print(s[text.length() - i]);
		}

		/*
		 * char[] a = text.toCharArray(); 
		 * 	for(int i=text.length()-1;i>=0;i--){
		 * 		System.out.print(a[i]); }
		 */

	}

}
