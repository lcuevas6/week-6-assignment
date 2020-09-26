
public class App {

	public static void main(String[] args) {
		
		Deck deck = new Deck();
		Player lucas = new Player("Lucas");
		Player luis = new Player("Luis");
		
		deck.shuffle();
		
		for(int i = 1; i < 52; i++) {
			if (i % 2 == 0) {
				lucas.draw(deck);
			}else {
				luis.draw(deck);
			}
		}
		
		for (int i = 1; i < 26; i++) {
			Card lucasCardValue = lucas.flip();
			Card luisCardValue = luis.flip();
			
			if (lucasCardValue.getValue() > luisCardValue.getValue()) {
				lucas.incrementScore();
				
			}else if (lucasCardValue.getValue() < luisCardValue.getValue()) {
				luis.incrementScore();
				
			}else {
				lucas.incrementScore();
				luis.incrementScore();
			}
		}
		
		int lucasScore = lucas.getScore();
		int luisScore = luis.getScore();
		
		if (lucasScore == luisScore) {
			System.out.println("The score was a draw between " + lucas.getName() + "-" + lucas.getScore() + " and " + 
		    luis.getName() + "-" + luis.getScore());
			
		}else if (lucasScore > luisScore) {
			System.out.println(lucas.getName() + "-" + lucas.getScore() + " beat " + luis.getName() + "-" + luis.getScore());
			
		}else {
			System.out.println(luis.getName() + "-" + luis.getScore() + " beat " + lucas.getName() + "-" + lucas.getScore());
		}

	}

}
