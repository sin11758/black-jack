package black.jack;
/**
 *
 * @author Navjot Singh
 * @author Gurminder Singh
 * @author Harman Sandhu
 */
public class Dealer extends Player{
	private Player[] players;
	private  Deck deck;
	private int cardNumber;
	private int turn;

/**
	 * @param cardNumber
         * @param name
         * @param points
         * @param bust
         * @param players
         * @param deck
	 */
	public Dealer(String name, Points points,Status bust, Player[] players, Deck deck, int cardNumber) {
		super(name + " (Dealer)",points,bust,true);
		this.players = players;
		this.deck = deck;
		this.cardNumber = cardNumber;
	}
	/**
	 *
	 * @param turn
	 */
	public void setTurn(int turn) {
		this.turn = turn;
	}
	public int getTurn() {
		return turn;
	}

	public void giveTwoCard(){
		for (int i = 0; i < players.length; i++) {
            players[i].setHand(new Hand(deck.getCards().get(cardNumber),deck.getCards().get(cardNumber +1)));

            if(players[i].getIsDealer()){
                deck.getCards().get(cardNumber +1).flipCard();
            }
            cardNumber += 2;
        }
	}
	public void giveOneCard(){



			players[turn].getHand().addCardsInHand(deck.getCards().get(cardNumber));

            cardNumber += 1;

	}

	public void showCards() {
		hand.getCards();
	}


}