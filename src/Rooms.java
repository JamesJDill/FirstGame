import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;

public class Rooms {
	
	//private variables
	private int width;
	private int height;
	private int wallThickness;
	
	/**
	 * Constructor for Rooms
	 * @param width the width of the room
	 * @param height the height of the room
	 * @param wallThickness the thickness of the walls
	 */
	public Rooms(int width, int height, int wallThickness) {
		this.width = width;
		this.height = height;
		this.wallThickness = wallThickness;
	}
	
	/**
	 * gets the width of the room
	 * @return returns the width of the room
	 */
	public int getWidth() {
		return width;
	}
	
	/**
	 * sets the width of the room
	 * @param width the width of the room
	 */
	public void setWidth(int width) {
		this.width = width;
	}

	/**
	 * gets the height of the room
	 * @return returns the height of the room
	 */
	public int getHeight() { 
		return height;
	}
	
	/**
	 * sets the height of the room
	 * @param height the height of the room
	 */
	public void setHeight(int height) { 
		this.height = height;
	}
	
	/**
	 * gets the wallThickness of the walls
	 * @return returns the wallThickness of the walls
	 */
	public int getWallThickness() {
		return wallThickness;
	}
	
	/**
	 * sets the wallThickness of the walls
	 * @param wallThickness the wallThickness of the walls
	 */
	public void setWallThickness(int wallThickness) {
		this.wallThickness = wallThickness;
	}
	
	/**
	 * draws room depending on the number
	 * @param g the Graphics object
	 * @param number the number of the room to draw
	 */
	public void drawRoom(Graphics g, int number) {
		if(number == 1) {
			drawRoom1(g);
		}
		if(number == 2) {
			drawRoom2(g);
		}
		if(number == 3) {
			drawRoom3(g);
		}
		if(number == 4) {
			drawRoom4(g);
		}
		if(number == 5) {
			drawRoom5(g);
		}
		if(number == 6) {
			drawRoom6(g);
		}
		if(number == 7) {
			drawRoom7(g);
		}
		if(number == 8) {
			drawRoom8(g);
		}
		if(number == 9) {
			drawRoom9(g);
		}
	}
	
	/**
	 * Draws room #1
	 * @param g the Graphics object
	 */
	public void drawRoom1(Graphics g) {
		g.setColor(Color.BLACK);
		g.fillRect(0, 0, getWidth()/2-175, getWallThickness());
		g.fillRect(getWidth()/2+175, 0, getWidth()/2-175, getWallThickness());
		g.fillRect(0, 0, getWallThickness(), getHeight());
		g.fillRect(0, getHeight() - getWallThickness(), getWidth(), getWallThickness());
		g.fillRect(getWidth() - getWallThickness(), 0, getWallThickness(), getHeight());
		}
	
	
	/**
	 * Draws room #2
	 * @param g the Graphics object
	 */
	public void drawRoom2(Graphics g) {
		g.setColor(Color.BLACK);
		g.fillRect(0, 0, getWidth()/2-175, getWallThickness());
		g.fillRect(getWidth()/2+175, 0, getWidth()/2-125, getWallThickness());
		g.fillRect(0, 0, getWallThickness(), getHeight());
		g.fillRect(getWidth() - getWallThickness(), 0, getWallThickness(), getHeight());
		g.fillRect(0, getHeight()-getWallThickness(), getWidth()/2-175, getWallThickness());
		g.fillRect(getWidth()/2+175, getHeight()-getWallThickness(), getWidth()/2-125, getWallThickness());
	}
	
	/**
	 * Draws room #3
	 * @param g the Graphics object
	 */
	public void drawRoom3(Graphics g) {
		g.setColor(Color.BLACK);
		g.fillRect(0, 0, getWallThickness(), getHeight());
		g.fillRect(getWidth() - getWallThickness(), 0, getWallThickness(), getHeight());
		g.fillRect(0, 0, getWidth() - getWallThickness() - 340, getWallThickness());
		g.fillRect(getWallThickness() + 250, getHeight() - getWallThickness(), getWidth() - 250, getWallThickness());
		g.fillRect(getWallThickness() + 250, getWallThickness() + 250, getWallThickness(), getHeight() - getWallThickness() - 250);
		g.fillRect(getWallThickness()*2 + 500, getWallThickness(), getWallThickness(), getHeight() - getWallThickness() - 250 - 100);
		g.fillRect(getWallThickness()*3 + 750, getWallThickness() + 250, getWallThickness() , getHeight() - getWallThickness() - 250);
		g.fillRect(getWallThickness()*4 + 1000, getWallThickness(), getWallThickness(), getHeight() - getWallThickness() - 250 - 100);
	}
	
	/**
	 * Draws room #4
	 * @param g the Graphics object
	 */
	public void drawRoom4(Graphics g) {
		g.setColor(Color.BLACK);
		g.fillRect(0, 0, getWidth(), getWallThickness()*2);
		g.fillRect(0, 0, getWallThickness()*2, getHeight());
		g.fillRect(getWallThickness()*2 + 250, getHeight() - getWallThickness()*2, getWidth(), getWallThickness()*2);
		g.fillRect(getWidth() - getWallThickness()*2, getWallThickness()*2 + 250, getWallThickness()*2, getHeight() - getWallThickness()*2 - 250);
	}
	
	/**
	 * Draws room #5
	 * @param g the Graphics object
	 */
	public void drawRoom5(Graphics g) {
		g.setColor(Color.BLACK);
		g.fillRect(0, 0, getWidth(), getWallThickness());
		g.fillRect(0, getHeight() - getWallThickness(), getWidth(), getWallThickness());
		g.fillRect(0, 0, getWallThickness(), getHeight()/2 - 125);
		g.fillRect(0, getHeight()/2 + 125, getWallThickness(), getHeight() - getWallThickness()*2 - 250);
		g.fillRect(getWidth() - getWallThickness(), 0, getWallThickness(), getHeight()/2 - 125);
		g.fillRect(getWidth() - getWallThickness(), getHeight()/2 + 125, getWallThickness(), getHeight() - getWallThickness()*2 - 250);
	}
	
	/**
	 * Draws room #6
	 * @param g the Graphics object
	 */
	public void drawRoom6(Graphics g) {
		g.setColor(Color.BLACK);
		g.fillRect(0, 0, getWidth(), getHeight()/2 - 125);
		g.fillRect(0, getHeight()/2 + 125, getWidth(), getHeight()/2 - 125);
	}
	
	/** 
	 * Draws room #7
	 * @param g the Graphics object
	 */
	public void drawRoom7(Graphics g) {
		g.setColor(Color.BLACK);
		g.fillRect(0, 0, getWallThickness(), getHeight()/2 - 125);
		g.fillRect(0, getHeight()/2 + 125, getWallThickness(), getHeight()/2 - 125);
		g.fillRect(getWidth() - getWallThickness(), 0, getWallThickness(), getHeight()/2 - 125);
		g.fillRect(getWidth() - getWallThickness(), getHeight()/2 + 125, getWallThickness(), getHeight()/2 - 125);
		g.fillRect(0, 0, getWidth(), getWallThickness()*2);
		g.fillRect(0, getHeight() - getWallThickness()*2, getWidth(), getWallThickness()*2);
		g.fillRect(getWallThickness(), 0, (getWidth() - getWallThickness()*2)/3, getHeight()/2 - 125);
		g.fillRect(((getWidth() - getWallThickness()*2)/3)*2 + getWallThickness(), 0, (getWidth() - getWallThickness()*2)/3, getHeight()/2 - 125);
		g.fillRect(getWallThickness(), getHeight()/2 + 125, (getWidth() - getWallThickness()*2)/3, getHeight()/2 - 125);
		g.fillRect(((getWidth() - getWallThickness()*2)/3)*2 + getWallThickness(), getHeight()/2 + 125, (getWidth() - getWallThickness()*2)/3, getHeight()/2 - 125);
	
	}
	
	/**
	 * Draws room #8
	 * @param g the Graphics object
	 */
	public void drawRoom8(Graphics g) {
		g.setColor(Color.BLACK);
		g.fillRect(0, 0, getWidth(), getWallThickness());
		g.fillRect(0, getHeight() - getWallThickness(), getWidth(), getWallThickness());
		g.fillRect(0, 0, getWallThickness(), getHeight()/2 - 125);
		g.fillRect(0, getHeight()/2 + 125, getWallThickness(), getHeight() - getWallThickness()*2 - 250);
		g.fillRect(getWidth() - getWallThickness(), 0, getWallThickness(), getHeight()/2 - 125);
		g.fillRect(getWidth() - getWallThickness(), getHeight()/2 + 125, getWallThickness(), getHeight() - getWallThickness()*2 - 250);
	}
	
	/**
	 * Draws room #9
	 * @param g the Graphics object
	 */
	public void drawRoom9(Graphics g) {
		g.setColor(Color.BLACK);
		g.fillRect(0, 0, getWidth(), getWallThickness());
		g.fillRect(0, getHeight() - getWallThickness(), getWidth(), getWallThickness());
		g.fillRect(0, 0, getWallThickness(), getHeight()/2 - 125);
		g.fillRect(0, getHeight()/2 + 125, getWallThickness(), getHeight() - getWallThickness()*2 - 250);
		g.fillRect(getWidth() - getWallThickness(), 0, getWallThickness(), getHeight());
		g.setColor(Color.WHITE);
		g.setFont(new Font("Times New Roman", 50, 50));
		g.drawString("You win game", getWidth()/2 - 200, getHeight()/2 - 100);
	}
}
