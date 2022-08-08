package black.jack;
/**
 *
 * @author Navjot Singh
 * @author Gurminder Singh
 * @author Harman Sandhu
 */
public class Status {
	private boolean isBust= false;
	private boolean isWin= false;
	private boolean isStay= false;
	private boolean isAllBust= false;
	private int sum;
	private Player[] players;

	/**
	 *
	 * @param players
	 */
	public Status(Player[] players) {
		this.players = players;
	}
	public Status() {
		this.isBust = false;
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

	public boolean getIsWin() {
		return this.isWin;
	}

	/**
	 *
	 * @param isWin
	 */
	public void setIsWin(boolean isWin) {
		this.isWin = isWin;
	}

	public boolean getIsStay() {
		return this.isStay;
	}

	/**
	 *
	 * @param isAllBust
	 */
	public void setIsAllBust(boolean isAllBust) {
		this.isAllBust = isAllBust;
	}

	public boolean getIsAllBust() {
		return this.isAllBust;
	}


	/**
	 *
	 * @param isStay
	 */
	public void setIsStay(boolean isStay) {
		this.isStay = isStay;
	}

	public void isBust() {
		if (sum > 20) {
			isBust = true;
		} else if(sum == 21){
			isWin = true;
		}
	}
	public void isAllBust() {
		int j = 0;
		for (int i = 0; i < players.length; i++) {
			if ( isBust==true ||isStay==true||isStay==true) {
				j++;
			}
		}
		if (j == players.length) {
			isAllBust = true;
		}
	}
}