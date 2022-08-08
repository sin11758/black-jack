package black.jack;

/**
 *
 * @author Navjot Singh
 * @author Gurminder Singh
 * @author Harman Sandhu
 */
public enum Move {
	HIT("hit"),
	STAY("stay"),
	SURRENDER("surrender");

	private String move;
		/**
		 *
		 * @param move
	 */
	private Move(String move){
		this.move = move;
	}

	public String getMove() {
		return move;
	}
}