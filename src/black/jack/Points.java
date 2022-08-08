package black.jack;
/**
 *
 * @author Navjot Singh
 * @author Gurminder Singh
 * @author Harman Sandhu
 */
public class Points {

	private int points;
	/**
	 *
	 * @param points
	 */
	public Points(int points) {
		this.points = points;
	}

	public int getPoints() {
		return this.points;
	}

	/**
	 *
	 * @param points
	 */
	public void setPoints(int points) {
		this.points = points;
	}
	/**
	 *
	 * @param times
	 */
	public void addPoints(int times) {
		this.points += times*10;
	}
	/**
	 *
	 * @param points
	 */
	public void minusPoints(int points) {
		this.points += points;
	}

}