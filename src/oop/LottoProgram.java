package oop;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Random;
import java.util.Scanner;

public class LottoProgram {

	public static void main(String[] args) throws IOException {

		// FileInputStream fis = new FileInputStream("../res/data.khw");
		// Scanner scan = new Scanner(fis);

	
		// �ζ� ����
		int[] lotto = new int[6];

		// �ζ� ��ȣ ����
		genLotto(lotto);

		// �ζ� ��ȣ ���
		printLotto(lotto);

		// �ζ� ��ȣ ����
		sortLotto(lotto);

		// �ζ� ��ȣ ���
		printLotto(lotto);
	}


	public static void genLotto(int[] lotto) {
		Random rand = new Random();

		for (int i = 0; i < 6; i++) {
			lotto[i] = rand.nextInt(45) + 1;
		}

	}

	public static void sortLotto(int[] lotto) {
		for (int i = 0; i < lotto.length; i++)
			for (int j = 0; j < i; j++)
				if (lotto[i] < lotto[j]) {
					int temp;
					temp = lotto[i];
					lotto[i] = lotto[j];
					lotto[j] = temp;
				}

	}

	public static void printLotto(int[] lotto) {
		for (int i = 0; i < 6; i++)
			System.out.printf("%-4d", lotto[i]);
		System.out.println();
	}
}