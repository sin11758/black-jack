package black.jack;

public class Card {

	private Number number;
	private boolean isFaceUp;
	private Move suit;

	/**
	 * 
	 * @param number
	 * @param suit
	 * @param isFaceUp
	 */
	public Card(Number number, Suit suit, boolean isFaceUp) {
		// TODO - implement Card.Card
		throw new UnsupportedOperationException();
	}

	public Number getNumber() {
		return this.number;
	}

	/**
	 * 
	 * @param number
	 */
	public void setNumber(Number number) {
		this.number = number;
	}

	public boolean getIsFaceUp() {
		return this.isFaceUp;
	}

	/**
	 * 
	 * @param isFaceUp
	 */
	public void setIsFaceUp(boolean isFaceUp) {
		this.isFaceUp = isFaceUp;
	}

	public void flipCard() {
		// TODO - implement Card.flipCard
		throw new UnsupportedOperationException();
	}

}