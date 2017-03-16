package oop.collection;

public class OmokProgram {

	public static void main(String[] args) {
		//객체들 준비하기
		Board board = new Board();
		OmokList list = new OmokList();
		
		board.print();
		
		while(true){
		
		Omok omok = new Omok();
		list.add(omok);
		
		omok.input();
		
		board.put(omok);
		
		board.print();
		}
		
	}

}
