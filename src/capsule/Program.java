package capsule;

import oop.array.Exam;

public class Program {

	public static void main(String[] args) {
		Exam exam = new Exam();
		int menu;
		menu = Exam.inputMenu();
		exam.input();
		
		exam.print();  
	}

}
