package oop.inherit.ui;

import oop.inherit.entity.Exam;

public class Program {

		
	public static void main(String[] args) {
		
		Exam exam = new Exam();							//		종속 객체 :Dependency - 부품 
		ExamConsole console = new ExamConsole(exam);	//   	주입 : Injection	  - 조립
		console.setExam(exam);							//   	꽂음
		
		console.input();
		console.print();
		
		//1.Composition(일체형) Has a Inheritance.
		//2.Association(조립형) Has a Inheritance.		// setter
		//3.Aggregation(집합형) Has a Inheritance.

	}

}
