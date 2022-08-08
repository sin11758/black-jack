package black.jack;
/**
 *
 * @author Navjot Singh
 * @author Gurminder Singh
 * @author Harman Sandhu
 */
public class Card {

	private Number number;
	private boolean isFaceUp;
	private Suit suit;

	/**
	 *
	 * @param number
	 * @param suit
	 * @param isFaceUp
	 */
	public Card(Number number, Suit suit, boolean isFaceUp) {
		this.number = number;
		this.suit = suit;
		this.isFaceUp = isFaceUp;
	}

	public int getIntNumber() {
		return number.getNumber();
	}
	public Number getNumber() {
		return number;
	}

	/**
	 *
	 * @param number
	 */
	public void setNumber(Number number) {
		this.number = number;
	}
/**
	 *
	 * @param suit
	 */
	public void setSuit(Suit suit) {
		this.suit = suit;
	}
	public Suit getSuit() {
		return suit;
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
		if (isFaceUp) {
			isFaceUp = false;
		} else {
			isFaceUp = true;
		}
	}

	public void showCard(){
		if (isFaceUp) {
			System.out.println(number+" of "+ suit);
		} else {
			System.out.println("Face down");
		}
	}

}