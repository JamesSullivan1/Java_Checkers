package main;

/**
 * A Location Class. Holds X,Y Coordinates on the board.
 * 
 * @param xCoordinate
 *            the X-position
 * @param yCoordinate
 *            the Y-position
 * @author James Sullivan
 */

public class Location {
	public static final int ROWS = Board.BOARD_ROWS;
	public static final int COLUMNS = Board.BOARD_COLUMNS;
	private int xCoordinate;
	private int yCoordinate;

	/**
	 * Constructor from integer x,y coordinates
	 * <p>
	 * Pre-Condition: 0 <= x < 8; 0 <= y < 8
	 */
	public Location(int x, int y) {
		xCoordinate = x;
		yCoordinate = y;
	}

	/**
	 * Accessor method for X-position.
	 * 
	 * @return X-Coordinate
	 */
	public int getX() { return this.xCoordinate; }

	/**
	 * Accessor method for Y-position.
	 * 
	 * @return Y-Coordinate
	 */
	public int getY() { return this.yCoordinate; }
	
	/**
	 * Accessor method to determine if a Location is in boundaries of the Board.
	 * @return True if the Location is within the board's bounds.
	 */
	public boolean inBounds() {
		if (xCoordinate >= 0 && xCoordinate < ROWS && yCoordinate >= 0 && yCoordinate < COLUMNS) {
			return true;
		} return false;
	}

	public String toString() {
		return xCoordinate + "," + yCoordinate;
	}

}
