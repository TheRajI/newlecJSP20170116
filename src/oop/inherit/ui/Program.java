package oop.inherit.ui;

import oop.inherit.entity.Exam;

public class Program {

		
	public static void main(String[] args) {
		
		Exam exam = new Exam();							//		���� ��ü :Dependency - ��ǰ 
		ExamConsole console = new ExamConsole(exam);	//   	���� : Injection	  - ����
		console.setExam(exam);							//   	����
		
		console.input();
		console.print();
		
		//1.Composition(��ü��) Has a Inheritance.
		//2.Association(������) Has a Inheritance.		// setter
		//3.Aggregation(������) Has a Inheritance.

	}

}
