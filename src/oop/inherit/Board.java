package oop.inherit;

public class Board {

	
	private char[][] buf;
	
	public Board() {
		buf = new char[15][20];
		
		for (int y = 0; y < 15; y++) {
			for (int x = 0; x < 20; x++)
				buf[y][x] = '┼';
		}
		buf[0][0] = '┌';
		buf[0][19] = '┐';
		buf[14][0] = '└';
		buf[14][19] = '┘';
		
		for (int n = 1; n <= 18; n++)
			buf[0][n] = '┬';

		// 좌측 경계선
		for (int n = 1; n <= 13; n++)
			buf[n][0] = '├';

		// 우측 경계선
		for (int n = 1; n <= 13; n++)
			buf[n][19] = '┤';

		// 하단 경계선
		for (int n = 1; n <= 18; n++)
			buf[14][n] = '┴';
	}
	
	
	public void print() {
		
		for (int y = 0; y < 15; y++) {
			for (int x = 0; x < 20; x++) {
				System.out.printf("%c", buf[y][x]);
			}
			System.out.println();
		}
		System.out.println();

	}

	public void put(Omok omok) {
		int x=omok.getX();
		int y=omok.getY();
		
		buf[y][x]='●';
		
	}

}
