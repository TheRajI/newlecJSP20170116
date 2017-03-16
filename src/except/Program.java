package except;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Program {

	public static void main(String[] args) {
		// 예외처리 : 예외
		// 오류 : 1.구문오류 2.논리오류 3.예외오류
		// 버그 ->2번 오류
		// 구문에는 문제없음, 논리적으로도 문제없음 -> 사용자가 오류가 있다고 말하는 것
		// 파일복사 프로그램 -> 예외적인 상황: 디스크가 베드, 파일 용량이 없는 것
		// APP --> API
		// API가 전달하는 시스템, APP은 그것을 처리하기위한 방법
		FileOutputStream fis=null;
		try {
			
			Calculator.add(20, 10);
			
			fis = new FileOutputStream("aa.txt");
			fis.write(52);
			
			
			
		} catch (FileNotFoundException e) {
			
			System.out.println("죄송합니다. 입력하신 파일을 찾을 수가 없습니다.");
			
		} catch (Exception e) {											// 범용적으로 예외를 포함, 순서가 중요함 위로가면 그 밑에부분은 아예 처리X
																		// 범위가 높은 예외를 가장 아래로 배치
			System.out.println("죄송합니다. 출력에 문제가 발생했습니다.");
			
		} finally{
			// 정리작업, 어떠한 예외도 반드시 finally를 들렸다 감
			System.out.println("정리합니다.");
			try {
				fis.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}

}
