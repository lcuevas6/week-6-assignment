import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Deck {
	private List<Card> cards = new ArrayList<>();

	private static final String[] suits = { "Clubs", "Diamonds", "Hearts", "Spades" };

	private static final String[] faceValues = { "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine", "Ten",
			"Jack", "Queen", "King", "Ace" };

	public Deck() {

		for (int suitIndex = 0; suitIndex < suits.length; suitIndex++) {
			String suit = suits[suitIndex];

			for (int faceValueIndex = 0; faceValueIndex < faceValues.length; faceValueIndex++) {
				String faceValue = faceValues[faceValueIndex];
				String cardName = faceValue + " of " + suit;
				int value = faceValueIndex + 2;

				cards.add(new Card(cardName, value));
			}

		}

	}

	public List<Card> getCards() {
		return cards;
	}

	public void setCards(List<Card> cards) {
		this.cards = cards;
	}

	public void shuffle() {
		Random random = new Random();
		for (int i = cards.size() - 1; i > 0; i--) {
			int j = random.nextInt(i + 1);

			Card cardAtIndexI = cards.get(i);
			Card cardAtIndexJ = cards.get(j);

			cards.set(i, cardAtIndexJ);
			cards.set(j, cardAtIndexI);
		}
	}

	public Card draw() {
		return cards.remove(0);
	}

}
