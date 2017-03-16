import java.util.Random;

public class CardProgram {

	public static void main(String[] args) {
		
		

		int[] cards = createrCards();
		
		suffleCards(cards);
		
		printCards(cards);
		
	}
	public static int[] createrCards() {
		int[] cards = new int[52];
		Random rand = new Random();
		for (int i = 0; i < cards.length; i++) {
			cards[i] = i + 1;
		}
		return cards;
		
	}

	public static void suffleCards(int[] cards) {
		Random rand = new Random();
		for (int i = 0; i < 100; i++) {
				
			int temp;
			int a = rand.nextInt(52);
			int b = rand.nextInt(52);

			temp = cards[a];
			cards[a] = cards[b];
			cards[b] = temp;

			//System.out.printf("%d, %d\n", cards[a], cards[b]);

		}
		
	}
	
	public static void printCards(int[] cards) {
		
		for (int i = 0; i < 52; i++)
			System.out.printf("%-3d ", cards[i]);
	}
	
}
