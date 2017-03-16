package oop.lottoex;

import java.util.Random;

public class Lotto {

	private int[] nums;                // ������ ���� , û����, ��ü X

	public Lotto(){
		nums = new int[6];             // ������, �ʱ�ȭ�� ����ϴ� �Լ�, ������ 1�� ��ü�� �����Ҷ� ���
	
	}
	
	public void gen() {
		Random rand = new Random();
		
		for (int i = 0; i < 6; i++) {
			nums[i] = rand.nextInt(45) + 1;
			
		}
		
	}
	public void sort() {
		for (int i = 0; i < 6; i++)
			for (int j = 0; j < i; j++)
				if (nums[i] < nums[j]) {
					int temp;
					temp = nums[i];
					nums[i] = nums[j];
					nums[j] = temp;
				}

	}
	
	public void print() {
		
		for (int i = 0; i < 6; i++)			
			System.out.print(nums[i]+" ");
	}
}