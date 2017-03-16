package oop.lottoex;

import java.util.Random;

public class Lotto {

	private int[] nums;                // 가상의 존재 , 청사진, 실체 X

	public Lotto(){
		nums = new int[6];             // 생성자, 초기화를 담당하는 함수, 오로지 1번 객체를 생성할때 사용
	
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