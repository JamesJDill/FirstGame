import java.awt.Color;
import java.awt.Graphics;

public class Laser {

	/**
	 * private variables
	 */
	private int horizontalLength;
	private int verticalLength;
	private int thickness;
	private int x;
	private int y;
	
	/**
	 * 5 parameter constructor for Laser
	 */
	public Laser(int x, int y, int horizontalLength, int verticalLength, int thickness) {
		this.horizontalLength = horizontalLength;
		this.verticalLength = verticalLength;
		this.thickness = thickness;
		this.y = y;
		this.x = x;
	}
	
	/**
	 * sets the length of the laser
	 * @param thickness the thickness of the laser
	 */
	public void setThickness(int thickness) {
		this.thickness = thickness;
	}
	
	/**
	 * gets the thickness
	 * @return returns the thickness of the laser
	 */
	public int getThickness() {
		return thickness;
	}
	
	/**
	 * gets the length of the laser
	 * @return returns the length of the laser
	 */
	public int getHorizontalLength() {
		return horizontalLength;
	}
	
	/**
	 * sets the horizontal Length
	 * @param horizontalLength the length of the laser horizontally
	 */
	public void setHorizontalLength(int horizontalLength) {
		this.horizontalLength = horizontalLength;
	}
	
	/**
	 * gets the length of the laser vertically
	 * @return returns the length of the laser vertically
	 */
	public int getVerticalLength() {
		return verticalLength;
	}
	
	/**
	 * sets the length of the laser
	 * @param width the length of the laser
	 */
	public void setVerticalLength(int verticalLength) {
		this.verticalLength = verticalLength;
	}
	
	/**
	 * gets the length of the laser
	 * @return returns the length of the laser
	 */
	public int getWidth() {
		return verticalLength;
	}
	
	/**
	 * sets the x-coordinate of the laser
	 * @param x the x-coordinate of the laser
	 */
	public void setX(int x) {
		this.x = x;
	}
	
	/**
	 * sets the x-coordinate of the laser
	 * @return returns the x-coordinate of the laser
	 */
	public int getX() {
		return x;
	}
	
	/**
	 * sets the y-coordinate
	 * @param y the y-coordinate of the upper-left of the laser
	 */
	public void setY(int y) {
		this.y = y;
	}
	
	/**
	 * gets the y-coordinate
	 * @return returns the y-coordinate
	 */
	public int getY() {
		return y;
	}
	
	/**
	 * moves the laser left
	 */
	public void moveLeft() {
		setX(getX() - 2);
	}
	
	/**
	 * moves the laser right
	 */
	public void moveRight() {
		setX(getX() + 2);
	}
	
	/**
	 * moves the laser down
	 */
	public void moveDown() {
		setY(getY() + 1);
	}
	
	/**
	 * moves the laser upwards
	 */
	public void moveUp() {
		setY(getY() - 1);
	}
	
	/**
	 * Draws the laser
	 * @param g the Graphics object
	 */
	public void drawVertical(Graphics g) {
		//Colors arranged inside to outside
		g.setColor(Color.WHITE);
		g.fillRect(getX() + 3*getThickness()/8 - 1, getY(), 2*getThickness()/8, getVerticalLength());
		
		g.setColor(new Color(249, 199, 123));
		g.fillRect(getX() + 2*getThickness()/8 - 1, getY(), getThickness()/8, getVerticalLength());
		g.fillRect(getX() + 5*getThickness()/8, getY(), getThickness()/8, getVerticalLength());
		
		g.setColor(new Color(234, 99, 70));
		g.fillRect(getX() + getThickness()/8, getY(), getThickness()/8, getVerticalLength());
		g.fillRect(getX() + 6*getThickness()/8 - 1, getY(), getThickness()/8, getVerticalLength());
		
		g.setColor(new Color(225, 2, 1));
		g.fillRect(getX(), getY(), getThickness()/8, getVerticalLength());
		g.fillRect(getX() + 7*getThickness()/8 - 1, getY(), getThickness()/8, getVerticalLength());
	}
	
	/**
	 * Draws the laser as white before it is about to shoot
	 * @param g the Graphics object
	 */
	public void drawWhiteVertical(Graphics g) {
		g.setColor(Color.WHITE);
		g.fillRect(getX(), getY(), getThickness(), getVerticalLength());
	}
	
	/**
	 * draws the laser horizontally
	 * @param g the Graphics object
	 */
	public void drawHorizontal(Graphics g) {
		//Colors arranged inside to outside
		g.setColor(Color.WHITE);
		g.fillRect(getX(), getY() + 3*getThickness()/8 - 1, getHorizontalLength(), getThickness()/8*2 + 1);
		
		g.setColor(new Color(249, 199, 123));
		g.fillRect(getX(), getY() + 2*getThickness()/8 - 1, getHorizontalLength(), getThickness()/8 + 1);
		g.fillRect(getX(), getY() + 5*getThickness()/8 - 1, getHorizontalLength(), getThickness()/8 + 1);
		
		g.setColor(new Color(234, 99, 70));
		g.fillRect(getX(), getY() + getThickness()/8, getHorizontalLength(), getThickness()/8);
		g.fillRect(getX(), getY() + 6*getThickness()/8 - 1, getHorizontalLength(), getThickness()/8 + 1);
		
		g.setColor(new Color(225, 2, 1));
		g.fillRect(getX(), getY(), getHorizontalLength(), getThickness()/8);
		g.fillRect(getX(), getY() + 7*getThickness()/8 - 1, getHorizontalLength(), getThickness()/8 + 1);
	}
	
	/**
	 * draws the laser white horizontally
	 * @param g the Graphics object
	 */
	public void drawWhiteHorizontal(Graphics g) {
		g.setColor(Color.WHITE);
		g.fillRect(getX(), getY(), getHorizontalLength(), getThickness());
	}
	
	/**
	 * draws a small white line in the place of where the laser will be
	 * @param g
	 */
	public void drawSmallWhiteVertical(Graphics g) {
		g.setColor(Color.WHITE); 
		g.fillRect(getX() + 3*getThickness()/8, getY(), 2*getThickness()/8, getVerticalLength());
	}
	
	/**
	 * draws a small white line in the place of where the laser will be
	 * @param g the Graphics object
	 */
	public void drawSmallWhiteHorizontal(Graphics g) {
		g.fillRect(getX(), getY() + 3*getThickness()/8, getHorizontalLength(), 2*getThickness()/8);
	}
	
	/**
	 * detects whether warrior intersects with a vertical laser
	 * @param warrior Warrior object
	 * @return returns true if there is an intersection with warrior, and false otherwise
	 */
	public boolean intersectsWithVertical(Warrior warrior) {
		if(warrior.getX() < getX() + getThickness() && warrior.getX() > getX() && warrior.getY() < getY() + getVerticalLength() && warrior.getY() > getY()) {
			return true;
		}
		else if(warrior.getX() + warrior.getPixelSize()*7 < getX() + getThickness() && warrior.getX() + warrior.getPixelSize()*7 > getX() && warrior.getY() + warrior.getPixelSize()*12 < getY() + getVerticalLength() && warrior.getY() + warrior.getPixelSize()*12 > getY()) {
			return true;
		}
		else if(warrior.getX() + warrior.getPixelSize()*14 < getX() + getThickness() && warrior.getX() + warrior.getPixelSize()*14 > getX() && warrior.getY() + warrior.getPixelSize()*23 < getY() + getVerticalLength() && warrior.getY() + warrior.getPixelSize()*23 > getY()) {
			return true;
		}
		else {
			return false;
		}
	}
	
	/**
	 * detects whether warrior intersects with a horizontal laser
	 * @param warrior Warrior object
	 * @return returns true if there is an intersection with warrior, and false otherwise
	 */
	public boolean intersectsWithHorizontal(Warrior warrior) {
		if(warrior.getX() < getX() + getHorizontalLength() && warrior.getX() > getX() && warrior.getY() < getY() + getThickness() && warrior.getY() > getY()) {
			return true;
		}
		else if(warrior.getX() + warrior.getPixelSize()*7 < getX() + getHorizontalLength() && warrior.getX() + warrior.getPixelSize()*7 > getX() && warrior.getY() + warrior.getPixelSize()*12 < getY() + getThickness() && warrior.getY() + warrior.getPixelSize()*12 > getY()) {
			return true;
		}
		else if(warrior.getX() + warrior.getPixelSize()*14 < getX() + getHorizontalLength() && warrior.getX() + warrior.getPixelSize()*14 > getX() && warrior.getY() + warrior.getPixelSize()*23 < getY() + getThickness() && warrior.getY() + warrior.getPixelSize()*23 > getY()) {
			return true;
		}
		else {
			return false;
		}
	}
}
