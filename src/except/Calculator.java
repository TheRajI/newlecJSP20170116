package except;

public class Calculator {
	public static int add(int x, int y) throws Overhund  {

		int result = x + y;
		
		// 예외 상황 1 : 절대로 합의 결과가 100은 넘어서는 안된다.
		if(result > 100)
			//예외 오류 발생 -> 내가 조치? ㄴㄴ응용프로그램이 결정하게 해야함
			throw new Overhund(); 
			
		return result;
	}

	public static int sub(int x, int y) {

		int result = x - y;
		return result;
	}
}
