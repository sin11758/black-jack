
package black.jack;

/**
 *
 * @author Navjot Singh
 * @author Gurminder Singh
 * @author Harman Sandhu
 */

public enum Suit {
    HEARTS("hearts"),
    DIAMONDS("diamonds"),
    CLUBS("clubs"),
    SPADES("spades");

    private String suit;

    	/**
		 *
		 * @param suit
	 */
    private Suit(String suit){
        this.suit = suit;
    }
    public String getSuit() {
        return suit;
    }
}
