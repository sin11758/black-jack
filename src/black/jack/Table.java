package black.jack;

public class Table {

	private int numberOfPlayers;
	private Player[] player;
	private Positions positions;

	/**
	 * 
	 * @param numberOfPlayers
	 * @param players
	 * @param deck
	 */
	public Table(int numberOfPlayers, Player[] players) {
		// TODO - implement Table.Table
		throw new UnsupportedOperationException();
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
		// TODO - implement Table.showTable
		throw new UnsupportedOperationException();
	}

}