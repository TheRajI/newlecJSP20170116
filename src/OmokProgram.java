import java.util.Scanner;

public class OmokProgram {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		// 오목판 생성
		// char[] board = new char[15 * 20];
		char[][] board = new char[30][30];
		// 오목판 초기화
		for (int y = 0; y < 15; y++) {
			for (int x = 0; x < 20; x++)
				board[y][x] = '┼';
		}
		board[0][0] = '┌';
		board[0][19] = '┐';
		board[14][0] = '└';
		board[14][19] = '┘';

		// 상단 경계선
		for (int n = 1; n <= 18; n++)
			board[0][n] = '┬';

		// 좌측 경계선
		for (int n = 1; n <= 13; n++)
			board[n][0] = '├';

		// 우측 경계선
		for (int n = 1; n <= 13; n++)
			board[n][19] = '┤';

		// 하단 경계선
		for (int n = 1; n <= 18; n++)
			board[14][n] = '┴';
		// 행 열
		for (int y = 0; y < 15; y++) {
			for (int x = 0; x < 20; x++) {
				 System.out.printf("%c", board[y][x]);
			}
			 System.out.println();
		}

		// 오목판에 오목두기
		int turn = 1;

		game: while (true) {

			System.out.printf("오목 입력 (x sp y) : ");

			int posx = scan.nextInt();
			int posy = scan.nextInt();

			if ((posx < 1 || posx > 20) || (posy < 1 || posy > 15)) {

				System.out.println("좌표 범위 밖의 수를 두었습니다.");
				continue;
			}

			if ((board[posy - 1][posx - 1] == '●' || board[posy - 1][posx - 1] == '○')) {
				System.out.println("이미 둔 곳입니다.");
				continue;
			}
			if (turn % 2 == 0)
				board[posy - 1][posx - 1] = '○';
			else
				board[posy - 1][posx - 1] = '●';

			for (int y = 0; y < 15; y++) {
				for (int x = 0; x < 20; x++) {
					System.out.printf("%c", board[y][x]);
				}
				System.out.println();
			}
			turn++;
			System.out.println();

			char white = '○', black = '●';

			for (int y = 0; y < 15; y++) {
				for (int x = 0; x < 20; x++) {
					if ((x >= 2 && x <= 17) && (y >= 2 && y <= 12)) {
						if ((board[y][x - 2] == white && board[y][x - 1] == white && board[y][x] == white
								&& board[y][x + 1] == white && board[y][x + 2] == white)
								|| (board[y - 2][x] == white && board[y - 1][x] == white && board[y][x] == white
										&& board[y + 1][x] == white && board[y + 2][x] == white)
								|| (board[y - 2][x - 2] == white && board[y - 1][x - 1] == white && board[y][x] == white
										&& board[y + 1][x + 1] == white && board[y + 2][x + 2] == white)
								|| (board[y + 2][x - 2] == white && board[y + 1][x - 1] == white && board[y][x] == white
										&& board[y - 1][x + 1] == white && board[y - 2][x + 2] == white)) {
							System.out.println("백의 승리입니다.");
							break game;
						} else if ((board[y][x - 2] == black && board[y][x - 1] == black && board[y][x] == black
								&& board[y][x + 1] == black && board[y][x + 2] == black)
								|| (board[y - 2][x] == black && board[y - 1][x] == black && board[y][x] == black
										&& board[y + 1][x] == black && board[y + 2][x] == black)
								|| (board[y - 2][x - 2] == black && board[y - 1][x - 1] == black && board[y][x] == black
										&& board[y + 1][x + 1] == black && board[y + 2][x + 2] == black)
								|| (board[y + 2][x - 2] == black && board[y + 1][x - 1] == black && board[y][x] == black
										&& board[y - 1][x + 1] == black && board[y - 2][x + 2] == black)) {

							System.out.println("흑의 승리입니다.");
							break game;
						}

						else if ((x >= 0 && x <= 1) && y >= 2) {
							if (board[y - 2][x] == white && board[y - 1][x] == white && board[y][x] == white
									&& board[y + 1][x] == white && board[y + 2][x] == white) {
								System.out.println("백의 승리입니다.");
								break game;
							} else if (board[y - 2][x] == black && board[y - 1][x] == black && board[y][x] == black
									&& board[y + 1][x] == black && board[y + 2][x] == black) {
								System.out.println("흑의 승리입니다.");
								break game;
							} else if ((y >= 0 && y <= 1) && x >= 2) {
								if (board[y][x - 2] == white && board[y][x - 1] == white && board[y][x] == white
										&& board[y][x + 1] == white && board[y][x + 2] == white) {
									System.out.println("백의 승리입니다.");
									break game;
								} else if (board[y][x - 2] == black && board[y][x - 1] == black && board[y][x] == black
										&& board[y][x + 1] == black && board[y][x + 2] == black) {
									System.out.println("흑의 승리입니다.");
									break game;
								}
							}
						}
					}
				}
			}
		}
	}
}