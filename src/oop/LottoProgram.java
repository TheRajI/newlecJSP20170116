package oop;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Random;
import java.util.Scanner;

public class LottoProgram {

	public static void main(String[] args) throws IOException {

		// FileInputStream fis = new FileInputStream("../res/data.khw");
		// Scanner scan = new Scanner(fis);

	
		// 로또 생성
		int[] lotto = new int[6];

		// 로또 번호 생성
		genLotto(lotto);

		// 로또 번호 출력
		printLotto(lotto);

		// 로또 번호 정렬
		sortLotto(lotto);

		// 로또 번호 출력
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