package oop.collection;

import java.util.Scanner;

public class Omok {

	private int x;
	private int y;
	
	
	public int getX() {
		return x;
	}



	public int getY() {
		return y;
	}



	public void input() {
		Scanner scan = new Scanner(System.in);

		System.out.printf("���� �Է� (x sp y) : ");

		x = scan.nextInt();
		y = scan.nextInt();

		scan.close();
		
	

	}

}
