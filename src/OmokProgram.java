import java.util.Scanner;

public class OmokProgram {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		// ������ ����
		// char[] board = new char[15 * 20];
		char[][] board = new char[30][30];
		// ������ �ʱ�ȭ
		for (int y = 0; y < 15; y++) {
			for (int x = 0; x < 20; x++)
				board[y][x] = '��';
		}
		board[0][0] = '��';
		board[0][19] = '��';
		board[14][0] = '��';
		board[14][19] = '��';

		// ��� ��輱
		for (int n = 1; n <= 18; n++)
			board[0][n] = '��';

		// ���� ��輱
		for (int n = 1; n <= 13; n++)
			board[n][0] = '��';

		// ���� ��輱
		for (int n = 1; n <= 13; n++)
			board[n][19] = '��';

		// �ϴ� ��輱
		for (int n = 1; n <= 18; n++)
			board[14][n] = '��';
		// �� ��
		for (int y = 0; y < 15; y++) {
			for (int x = 0; x < 20; x++) {
				 System.out.printf("%c", board[y][x]);
			}
			 System.out.println();
		}

		// �����ǿ� ����α�
		int turn = 1;

		game: while (true) {

			System.out.printf("���� �Է� (x sp y) : ");

			int posx = scan.nextInt();
			int posy = scan.nextInt();

			if ((posx < 1 || posx > 20) || (posy < 1 || posy > 15)) {

				System.out.println("��ǥ ���� ���� ���� �ξ����ϴ�.");
				continue;
			}

			if ((board[posy - 1][posx - 1] == '��' || board[posy - 1][posx - 1] == '��')) {
				System.out.println("�̹� �� ���Դϴ�.");
				continue;
			}
			if (turn % 2 == 0)
				board[posy - 1][posx - 1] = '��';
			else
				board[posy - 1][posx - 1] = '��';

			for (int y = 0; y < 15; y++) {
				for (int x = 0; x < 20; x++) {
					System.out.printf("%c", board[y][x]);
				}
				System.out.println();
			}
			turn++;
			System.out.println();

			char white = '��', black = '��';

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
							System.out.println("���� �¸��Դϴ�.");
							break game;
						} else if ((board[y][x - 2] == black && board[y][x - 1] == black && board[y][x] == black
								&& board[y][x + 1] == black && board[y][x + 2] == black)
								|| (board[y - 2][x] == black && board[y - 1][x] == black && board[y][x] == black
										&& board[y + 1][x] == black && board[y + 2][x] == black)
								|| (board[y - 2][x - 2] == black && board[y - 1][x - 1] == black && board[y][x] == black
										&& board[y + 1][x + 1] == black && board[y + 2][x + 2] == black)
								|| (board[y + 2][x - 2] == black && board[y + 1][x - 1] == black && board[y][x] == black
										&& board[y - 1][x + 1] == black && board[y - 2][x + 2] == black)) {

							System.out.println("���� �¸��Դϴ�.");
							break game;
						}

						else if ((x >= 0 && x <= 1) && y >= 2) {
							if (board[y - 2][x] == white && board[y - 1][x] == white && board[y][x] == white
									&& board[y + 1][x] == white && board[y + 2][x] == white) {
								System.out.println("���� �¸��Դϴ�.");
								break game;
							} else if (board[y - 2][x] == black && board[y - 1][x] == black && board[y][x] == black
									&& board[y + 1][x] == black && board[y + 2][x] == black) {
								System.out.println("���� �¸��Դϴ�.");
								break game;
							} else if ((y >= 0 && y <= 1) && x >= 2) {
								if (board[y][x - 2] == white && board[y][x - 1] == white && board[y][x] == white
										&& board[y][x + 1] == white && board[y][x + 2] == white) {
									System.out.println("���� �¸��Դϴ�.");
									break game;
								} else if (board[y][x - 2] == black && board[y][x - 1] == black && board[y][x] == black
										&& board[y][x + 1] == black && board[y][x + 2] == black) {
									System.out.println("���� �¸��Դϴ�.");
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