package oop.nested;

public class AA {

	public static int a1;			// 전역변수 아무리 만들어도 1개생성
	public int a2;					// 만드는 만큼 개수 증가되서 생성

	public void f2() {
		a1 = 4;
		
		BB b = new BB();
	}
	static{
		a1 = 10;
	}
	public AA(){
		a1=3;
	}

	public static void f3(){
		BB b = new AA().new BB();  
	}
	
	class BB {
		private int a1 = 5;

		public void f1() {
			int a1 = 7;

			System.out.printf("a1 : %d\n", AA.this.a1);
			System.out.printf("a1 : %d\n", this.a1);
			System.out.printf("a1 : %d\n", a1);
		}
		
	}
	
	static class C{
		int a1=30;
		
		public void f4(){
			BB b = new AA().new BB();
		}
	}
}
