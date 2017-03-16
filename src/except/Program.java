package except;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Program {

	public static void main(String[] args) {
		// ����ó�� : ����
		// ���� : 1.�������� 2.������ 3.���ܿ���
		// ���� ->2�� ����
		// �������� ��������, �������ε� �������� -> ����ڰ� ������ �ִٰ� ���ϴ� ��
		// ���Ϻ��� ���α׷� -> �������� ��Ȳ: ��ũ�� ����, ���� �뷮�� ���� ��
		// APP --> API
		// API�� �����ϴ� �ý���, APP�� �װ��� ó���ϱ����� ���
		FileOutputStream fis=null;
		try {
			
			Calculator.add(20, 10);
			
			fis = new FileOutputStream("aa.txt");
			fis.write(52);
			
			
			
		} catch (FileNotFoundException e) {
			
			System.out.println("�˼��մϴ�. �Է��Ͻ� ������ ã�� ���� �����ϴ�.");
			
		} catch (Exception e) {											// ���������� ���ܸ� ����, ������ �߿��� ���ΰ��� �� �ؿ��κ��� �ƿ� ó��X
																		// ������ ���� ���ܸ� ���� �Ʒ��� ��ġ
			System.out.println("�˼��մϴ�. ��¿� ������ �߻��߽��ϴ�.");
			
		} finally{
			// �����۾�, ��� ���ܵ� �ݵ�� finally�� ��ȴ� ��
			System.out.println("�����մϴ�.");
			try {
				fis.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}

}
