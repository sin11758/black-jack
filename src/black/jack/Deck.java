package black.jack;
/**
 *
 * @author Navjot Singh
 * @author Gurminder Singh
 * @author Harman Sandhu
 */
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Deck {
	private List<Card> cards = new ArrayList<Card>();

	public Deck() {
		for (int i = 0; i < 13; i++) {
			for (int j = 0; j < 4; j++) {
				this.cards.add(new Card(Number.values()[i], Suit.values()[j], true));
			}
		}
	}

	public List<Card> getCards() {
		return this.cards;
	}

	/**
	 *
	 * @param cards
	 */
	public void setCard(Card cards) {
		this.cards.add(cards);
	}

	public void suffelDeck() {
		Collections.shuffle(cards);
	}

}