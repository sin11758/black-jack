package black.jack;

public class Bust {
	private Hand hand;
	private boolean isBust;

	/**
	 * 
	 * @param hand
	 */
	public Bust(Hand hand) {
		// TODO - implement Bust.Bust
		throw new UnsupportedOperationException();
	}

	public Hand getHand() {
		return this.hand;
	}

	/**
	 * 
	 * @param hand
	 */
	public void setHand(Hand hand) {
		this.hand = hand;
	}

	public boolean getIsBust() {
		return this.isBust;
	}

	/**
	 * 
	 * @param isBust
	 */
	public void setIsBust(boolean isBust) {
		this.isBust = isBust;
	}

}