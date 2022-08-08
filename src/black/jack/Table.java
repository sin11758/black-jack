package black.jack;
/**
 *
 * @author Navjot Singh
 * @author Gurminder Singh
 * @author Harman Sandhu
 */
public class Table {

	private int numberOfPlayers;
	private Player[] player;
	private Positions positions;


	/**
	 *
	 * @param numberOfPlayers
	 * @param players
	 */
	public Table(int numberOfPlayers, Player[] player) {
		this.numberOfPlayers = numberOfPlayers;
		this.player = player;
	}

	public int getNumberOfPlayers() {
		return this.numberOfPlayers;
	}

	/**
	 *
	 * @param numberOfPlayers
	 */
	public void setNumberOfPlayers(int numberOfPlayers) {
		this.numberOfPlayers = numberOfPlayers;
	}

	public Player[] getPlayer() {
		return this.player;
	}

	/**
	 *
	 * @param player
	 */
	public void setPlayer(Player[] player) {
		this.player = player;
	}

	public Positions getPositions() {
		return this.positions;
	}

	/**
	 *
	 * @param positions
	 */
	public void setPositions(Positions positions) {
		this.positions = positions;
	}

	public void showTable() {
		for (int i = 0; i < player.length; i++) {
			System.out.println("\nPlayer"+(i + 1));
			System.out.println("\tName: "+ player[i].name);
			System.out.println("\tPoints: "+ player[i].getPoints().getPoints());
			if (player[i].getBet() == null && player[i].getIsDealer() != true ) {
				System.out.println("\tBet: 0");
			}else if(player[i].getIsDealer() != true) {
				System.out.println("\tBet: "+ player[i].getBet().getBet());

			}
			System.out.println("\tCards in hand: " );
			if (player[i].getHand() == null) {
				System.out.println("\t\tEmpty");
			}else{
				player[i].getHand().getCards();
			}

			if (player[i].getHand() == null) {
				System.out.println("\tSum = 0");
			}else{
				System.out.print("\t\tSum = ");
				player[i].getHand().sumOfCards();
			}
			if (player[i].getHand()!= null && player[i].getBust()!= null ) {
			System.out.print("\tIs Bust: " );
				if (player[i].getBust().getIsBust() == true) {
					System.out.println("Yes");
				}else{
					System.out.print("No");
				}

			}

		}
	}



}