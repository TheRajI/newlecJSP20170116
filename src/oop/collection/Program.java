package oop.collection;

import java.util.ArrayList;

public class Program {

	public static void main(String[] args) {
		/*Object x = 3; 	// ������ �ȵǴµ� , Object x = new Integer(3); --> auto-boxing �۾��� ���� ������  //
		// ������ ������ ������ ���ؼ� boxing���ִ� Ŭ������ �ʿ� -> ����Ŭ���� */
		ArrayList list = new ArrayList();   	 // <>�� �ȳ־��ָ� �⺻ �������� Object�� �־����� ���� -> ����
		list.add(3);								 // <> �ȿ� Ưȭ�� �ڷ��� �־��ָ� �� �ܿ��� ������ ����	
		list.add(new Exam());

		int x = (int)list.get(0);
		//Exam ex = list.get(1);
		
		System.out.println("done");
		
	
		
	}

}
