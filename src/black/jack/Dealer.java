package black.jack;

public class Dealer extends Player{

	/**
	 * 
	 * @param name
	 * @param hand
	 * @param points
	 */
	public Dealer(String name, Hand hand, Points points) {
		// TODO - implement Dealer.Dealer
		throw new UnsupportedOperationException();
	}

	public Deck getDeck() {
		return this.deck;
	}

	/**
	 * 
	 * @param deck
	 */
	public void setDeck(Deck deck) {
		this.deck = deck;
	}

	public void giveCard() {
		// TODO - implement Dealer.giveCard
		throw new UnsupportedOperationException();
	}

	public void showCards() {
		// TODO - implement Dealer.showCards
		throw new UnsupportedOperationException();
	}

	private Deck deck;

}