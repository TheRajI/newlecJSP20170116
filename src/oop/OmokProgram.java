package oop;

import java.util.Scanner;

public class OmokProgram {

	public static void main(String[] args) {

		// ������ ����
		char[][] board = createBoard();

		// ������ �׸���
		drawBoard(board);
		// ������ ���
		printBoard(board);
		
	}

	public static char[][] createBoard() {
		char[][] board = new char[15][20];
		return board;
	}

	private static void drawBoard(char[][] board) {

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
				// System.out.printf("%c", board[y][x]);
			}
			// System.out.println();
		}

	}

	private static void printBoard(char[][] board) {

		for (int y = 0; y < 15; y++) {
			for (int x = 0; x < 20; x++) {
				System.out.printf("%c", board[y][x]);
			}
			System.out.println();
		}
		System.out.println();

	}

}
