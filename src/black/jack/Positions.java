package black.jack;
/**
 *
 * @author Navjot Singh
 * @author Gurminder Singh
 * @author Harman Sandhu
 */
import java.util.Arrays;

public class Positions {

	private Table table;
	/**
	 *
	 * @param table
	 */
	public Positions(Table table) {
		this.table = table;
	}

	public Table getTable() {
		return this.table;
	}

	/**
	 *
	 * @param table
	 */
	public void setTable(Table table) {
		this.table = table;
	}


	public void ShowPositions() {
		String[] positions = new String[table.getPlayer().length];
		for (int i = 0; i < table.getPlayer().length; i++) {
			String name =  table.getPlayer()[i].getName();
			int points = table.getPlayer()[i].getPoints().getPoints();
			positions[i] =name + " has "+points +" points.";
		}
		Arrays.sort(positions);
		System.out.println("\n\nResult");
		for (int i = 0; i < table.getPlayer().length; i++) {
			System.out.println("\t"+positions[i]);
		}
	}

}