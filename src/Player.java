import java.util.ArrayList;
import java.util.List;

public class Player {
	private List<Card> hand;
	private String name;
	private int score;

	public Player(String name) {
		this.name = name;
		this.hand = new ArrayList<Card>();
		this.score = 0;

	}

	public List<Card> getCardValue() {
		return hand;
	}

	public void setCardValue(List<Card> hand) {
		this.hand = hand;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}

	public void describe() {
		System.out.println("Player name - " + name);
	}

	public Card flip() {
		return hand.remove(0);
	}

	public void draw(Deck deck) {
		Card cardValue = deck.draw();
		hand.add(cardValue);
	}

	public void incrementScore() {
		score += 1;
	}
}
