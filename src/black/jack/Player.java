package black.jack;
/**
 *
 * @author Navjot Singh
 * @author Gurminder Singh
 * @author Harman Sandhu
 */
public class Player {

	protected String name;
	protected Hand hand;
	private Bet bet;
	private Points points;
	private Moves moves;
	private Status bust;
	private boolean isDealer;


	/**
	 *
	 * @param name
         * @param points
         * @param bust
         * @param isDealer
	 */
	public Player(String name,Points points,Status bust,boolean isDealer) {
		this.name = name;
		this.points = points;
		this.isDealer = isDealer;
		this.bust = bust;

	}

	public String getName() {
		return this.name;
	}

	/**
	 *
	 * @param name
	 */
	public void setName(String name) {
		this.name = name;
	}


	public Bet getBet() {
		return this.bet;
	}

	/**
	 *
	 * @param bet
	 */
	public void setBet(Bet bet) {
		this.bet = bet;
	}

	public Points getPoints() {
		return this.points;
	}
	/**
	 *
	 * @param points
	 */
	public void setPoints(Points points) {
		this.points = points;
	}

	/**
	 *
	 * @param name
	 * @param hand
	 */
	public Player(String name, Hand hand) {

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

	public Moves getMoves() {
		return this.moves;
	}

	/**
	 *
	 * @param moves
	 */
	public void setMoves(Moves moves) {
		this.moves = moves;
	}

	/**
	 *
	 * @param bust
	 */

	public void setBust(Status bust) {
		this.bust = bust;
	}
	public Status getBust() {
		return bust;
	}
	/**
	 *
	 * @param isDealer
	 */
	public void setIsDealer(boolean isDealer) {
		this.isDealer = isDealer;
	}
	public boolean getIsDealer() {
		return isDealer;
	}

	public void showCards() {
		hand.getCards();
	}
	public void giveOneCard(){

}
	/**
	 *
	 * @param turn
	 */
public void setTurn(int turn) {

}

}