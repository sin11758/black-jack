package black.jack;
/**
 *
 * @author Navjot Singh
 * @author Gurminder Singh
 * @author Harman Sandhu
 */
public class Moves {

	private Move move;
	private int dealer;
	private Player[] players;
	private int i;

	        /**
	         *
	         * @param players
	         * @param dealer
	         * @param i
	         */

	public Moves(Player[] players,int dealer,int i) {
		this.players = players;
		this.dealer = dealer;
		this.i = i;
	}

	public String getMove() {
		return this.move.getMove();
	}

	/**
	 *
	 * @param move
	 */
	public void setMove(Move move) {
		this.move = move;
	}

	public void play() {
		if (move == Move.HIT) {
			(players[dealer]).giveOneCard();
		} else if (move == Move.STAY){
			players[i].getBust().setIsStay(true);
		}else if(move == Move.SURRENDER){
			players[i].getBust().setIsBust(true);
		}
	}
	public void showMoves() {
		System.out.println("\n"+players[i].getName()+" play a Move from: \n\t\t" +Move.HIT + "\n\t\t" +Move.STAY +"\n\t\t"+Move.SURRENDER);
	}

}