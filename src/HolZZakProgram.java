import java.util.Scanner;

public class HolZZakProgram {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		while(true){
		System.out.println("������ Ȧ��, ¦���� ����� ���� ������");
		System.out.print("���ڸ� �Է��ϼ��� : ");
		int num = scan.nextInt();
		
		if(num % 2 == 0)
			System.out.println("¦����");
		else
			System.out.println("Ȧ����");
		
		System.out.print("�� �Ѵ� -- 1 , ���Ѵ� -- 2  : ");
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
