import java.awt.Color;
import java.awt.Graphics;

public class monster {

	/**
	 * private variables
	 */
	private double x;
	private double y;
	private int pixelSize;
	private double xSpeed;
	private double ySpeed;
	private double hpPercent;
	private int direction;
	
	/**
	 * constructor for monster
	 * @param pixelSize the size of each individual pixel of the monster
	 * @param x the x-coordinate of the upper-left of the monster
	 * @param y the y-coordinate of the upper-left of the monster
	 * @param xSpeed the speed of the monster in the x-direction
	 * @param ySpeed the speed of the monster in the y-direction
	 */
	public monster(int pixelSize, double x, double y, double xSpeed, double ySpeed) {
		this.pixelSize = pixelSize;
		this.x = x;
		this.y = y;
		this.xSpeed = xSpeed;
		this.ySpeed = ySpeed;
	}
	
	/**
	 * gets the pixelSize for the monster
	 * @return returns the pixelSize of the monster
	 */
	public double getPixelSize() {
		return pixelSize;
	}
	
	/**
	 * sets the pixelSize of the monster
	 * @param pixelSize the size of each pixel
	 */
	public void setPixelSize(int pixelSize) {
		this.pixelSize = pixelSize;
	}
	
	/**
	 * gets the x-coordinate of the upper-left of the monster
	 * @return returns the x-coordinate of the upper-left of the monster
	 */
	public double getX() {
		return x;
	}
	
	/**
	 * sets the x-coordinate of the upper-left of the monster
	 * @param x
	 */
	public void setX(double x) {
		this.x = x;
	}
	
	/**
	 * gets the y-coordinate of the upper-left of the monster
	 * @return returns the y-coordinate of the upper-left of the monster
	 */
	public double getY() {
		return y;
	}
	
	/**
	 * sets the y-coordinate of the upper-left of the monster
	 * @param y the y-coordinate of the upper-left of the monster
	 */
	public void setY(double y) {
		this.y = y;
	}
	
	/**
	 * gets the xSpeed of the monster
	 * @return returns the xSpeed of the monster
	 */
	public double getXSpeed() {
		return xSpeed;
	}
	
	/**
	 * sets the xSpeed of the monster
	 * @param xSpeed the xSpeed of the monster
	 */
	public void setXSpeed(double xSpeed) {
		this.xSpeed = xSpeed;
	}
	
	/**
	 * gets the ySpeed of the monster
	 * @return returns the ySpeed of the monster
	 */
	public double getYSpeed() {
		return ySpeed;
	}
	
	/**
	 * sets the ySpeed of the monster
	 * @param ySpeed the ySpeed of the monster
	 */
	public void setYSpeed(double ySpeed) {
		this.ySpeed = ySpeed;
	}
	
	/**
	 * gets the hpPercent of the monster
	 * @return returns the hpPercent of the monster
	 */
	public double gethpPercent() {
		return hpPercent;
	}
	
	/**
	 * sets the hpPercent of the monster
	 * @param hpPercent the percentage of health that the monster has remaining
	 */
	public void sethpPercent(double hpPercent) {
		this.hpPercent = hpPercent;
	}
	
	/**
	 * gets the direction which of the monster is facing
	 * @return returns the direction which the monster is facing
	 */
	public int getDirection() {
		return direction;
	}
	
	/**
	 * sets the direction of the monster
	 * @param direction the direction which the monster is facing
	 */
	public void setDirection(int direction) {
		this.direction = direction;
	}
	
	/**
	 * sets the Location of the monster from the upper-left coordinate
	 * @param x the x-coordinate of the upper-left of the monster
	 * @param y the y-coordinate of the upper-left of the monster
	 */
	public void setLocation(double x, double y) {
		setX(x);
		setY(y);
	}
	
	/**
	 * the monster moves up, increase in y-position
	 */
	public void moveUp() {
		setY(getY() - getYSpeed());
	}
	
	/**
	 * the monster moves down, decrease in y-position
	 */
	public void moveDown() {
		setY(getY() + getYSpeed());
	}
	
	/**
	 * the monster moves to the right, increase in x-position
	 */
	public void moveRight() { 
		setX(getX() + getXSpeed());
	}
	
	/**
	 * the monster moves left, decrease in the x-position
	 */
	public void moveLeft() { 
		setX(getX() - getXSpeed());
	}
	
	/**
	 * Draws the monster facing the bottome of the screen, 34 x 48 pixels
	 * @param g the Graphics object
	 */
	public void drawMonster(Graphics g) {
		//outline
		g.setColor(Color.BLACK);
		g.fillRect((int)getX(), (int)getY() + pixelSize*24, pixelSize, pixelSize*15);
		g.fillRect((int)getX() + pixelSize, (int)getY() + pixelSize*19, pixelSize, pixelSize*5);
		g.fillRect((int)getX() + pixelSize, (int)getY() + pixelSize*31, pixelSize, pixelSize);
		g.fillRect((int)getX() + pixelSize, (int)getY() + pixelSize*39, pixelSize, pixelSize);
		g.fillRect((int)getX() + pixelSize*2, (int)getY() + pixelSize*17, pixelSize, pixelSize*2);
		g.fillRect((int)getX() + pixelSize*2, (int)getY() + pixelSize*32, pixelSize, pixelSize*8);
		g.fillRect((int)getX() + pixelSize*3, (int)getY() + pixelSize*16, pixelSize, pixelSize);
		g.fillRect((int)getX() + pixelSize*3, (int)getY() + pixelSize*33, pixelSize, pixelSize);
		g.fillRect((int)getX() + pixelSize*4, (int)getY() + pixelSize*15, pixelSize, pixelSize);
		g.fillRect((int)getX() + pixelSize*4, (int)getY() + pixelSize*32, pixelSize, pixelSize*7);
		g.fillRect((int)getX() + pixelSize*5, (int)getY() + pixelSize*14, pixelSize, pixelSize);
		g.fillRect((int)getX() + pixelSize*5, (int)getY() + pixelSize*21, pixelSize, pixelSize*3);
		g.fillRect((int)getX() + pixelSize*5, (int)getY() + pixelSize*31, pixelSize, pixelSize);
		g.fillRect((int)getX() + pixelSize*5, (int)getY() + pixelSize*39, pixelSize, pixelSize);
		g.fillRect((int)getX() + pixelSize*6, (int)getY() + pixelSize*12, pixelSize, pixelSize*2);
		g.fillRect((int)getX() + pixelSize*6, (int)getY() + pixelSize*18, pixelSize, pixelSize*3);
		g.fillRect((int)getX() + pixelSize*6, (int)getY() + pixelSize*24, pixelSize, pixelSize*3);
		g.fillRect((int)getX() + pixelSize*6, (int)getY() + pixelSize*31, pixelSize, pixelSize*9);
		g.fillRect((int)getX() + pixelSize*7, (int)getY() + pixelSize*10, pixelSize, pixelSize*2);
		g.fillRect((int)getX() + pixelSize*7, (int)getY() + pixelSize*16, pixelSize, pixelSize*2);
		g.fillRect((int)getX() + pixelSize*7, (int)getY() + pixelSize*27, pixelSize, pixelSize*4);
		g.fillRect((int)getX() + pixelSize*7, (int)getY() + pixelSize*46, pixelSize, pixelSize*2);
		g.fillRect((int)getX() + pixelSize*8, (int)getY() + pixelSize*9, pixelSize, pixelSize);
		g.fillRect((int)getX() + pixelSize*8, (int)getY() + pixelSize*14, pixelSize, pixelSize*2);
		g.fillRect((int)getX() + pixelSize*8, (int)getY() + pixelSize*35, pixelSize, pixelSize*5);
		g.fillRect((int)getX() + pixelSize*8, (int)getY() + pixelSize*42, pixelSize, pixelSize*2);
		g.fillRect((int)getX() + pixelSize*8, (int)getY() + pixelSize*42, pixelSize*7, pixelSize);
		g.fillRect((int)getX() + pixelSize*8, (int)getY() + pixelSize*45, pixelSize*2, pixelSize);
		g.fillRect((int)getX() + pixelSize*8, (int)getY() + pixelSize*47, pixelSize*6, pixelSize);
		g.fillRect((int)getX() + pixelSize*9, (int)getY() + pixelSize*8, pixelSize*2, pixelSize);
		g.fillRect((int)getX() + pixelSize*9, (int)getY() + pixelSize*8, pixelSize, pixelSize*6);
		g.fillRect((int)getX() + pixelSize*9, (int)getY() + pixelSize*32, pixelSize, pixelSize*3);
		g.fillRect((int)getX() + pixelSize*9, (int)getY() + pixelSize*40, pixelSize*6, pixelSize);
		g.fillRect((int)getX() + pixelSize*9, (int)getY() + pixelSize*44, pixelSize, pixelSize);
		g.fillRect((int)getX() + pixelSize*10, (int)getY() + pixelSize*14, pixelSize, pixelSize*6);
		g.fillRect((int)getX() + pixelSize*10, (int)getY() + pixelSize*24, pixelSize, pixelSize*2);
		g.fillRect((int)getX() + pixelSize*10, (int)getY() + pixelSize*29, pixelSize, pixelSize*3);
		g.fillRect((int)getX() + pixelSize*10, (int)getY() + pixelSize*41, pixelSize, pixelSize);
		g.fillRect((int)getX() + pixelSize*11, (int)getY() + pixelSize*7, pixelSize, pixelSize);
		g.fillRect((int)getX() + pixelSize*11, (int)getY() + pixelSize*20, pixelSize, pixelSize*4);
		g.fillRect((int)getX() + pixelSize*11, (int)getY() + pixelSize*25, pixelSize, pixelSize*4);
		g.fillRect((int)getX() + pixelSize*11, (int)getY() + pixelSize*25, pixelSize*2, pixelSize);
		g.fillRect((int)getX() + pixelSize*12, (int)getY() + pixelSize*3, pixelSize, pixelSize*5);
		g.fillRect((int)getX() + pixelSize*12, (int)getY() + pixelSize*41, pixelSize, pixelSize);
		g.fillRect((int)getX() + pixelSize*13, (int)getY() + pixelSize*2, pixelSize, pixelSize);
		g.fillRect((int)getX() + pixelSize*13, (int)getY() + pixelSize*26, pixelSize*3, pixelSize);
		g.fillRect((int)getX() + pixelSize*13, (int)getY() + pixelSize*44, pixelSize, pixelSize*4);
		g.fillRect((int)getX() + pixelSize*14, (int)getY() + pixelSize, pixelSize, pixelSize);
		g.fillRect((int)getX() + pixelSize*14, (int)getY() + pixelSize*39, pixelSize, pixelSize);
		g.fillRect((int)getX() + pixelSize*14, (int)getY() + pixelSize*42, pixelSize, pixelSize*2);
		g.fillRect((int)getX() + pixelSize*15, (int)getY(), pixelSize*4, pixelSize);
		g.fillRect((int)getX() + pixelSize*15, (int)getY() + pixelSize*29, pixelSize, pixelSize*10);
		g.fillRect((int)getX() + pixelSize*16, (int)getY() + pixelSize*25, pixelSize*2, pixelSize);
		g.fillRect((int)getX() + pixelSize*16, (int)getY() + pixelSize*28, pixelSize*2, pixelSize);
		g.fillRect((int)getX() + pixelSize*18, (int)getY() + pixelSize*26, pixelSize*3, pixelSize);
		g.fillRect((int)getX() + pixelSize*18, (int)getY() + pixelSize*29, pixelSize, pixelSize*10);
		g.fillRect((int)getX() + pixelSize*19, (int)getY() + pixelSize, pixelSize, pixelSize);
		g.fillRect((int)getX() + pixelSize*19, (int)getY() + pixelSize*39, pixelSize, pixelSize);
		g.fillRect((int)getX() + pixelSize*19, (int)getY() + pixelSize*40, pixelSize*6, pixelSize);
		g.fillRect((int)getX() + pixelSize*19, (int)getY() + pixelSize*42, pixelSize*7, pixelSize);
		g.fillRect((int)getX() + pixelSize*19, (int)getY() + pixelSize*43, pixelSize, pixelSize);
		g.fillRect((int)getX() + pixelSize*20, (int)getY() + pixelSize*44, pixelSize, pixelSize*4);
		g.fillRect((int)getX() + pixelSize*20, (int)getY() + pixelSize*47, pixelSize*7, pixelSize);
		g.fillRect((int)getX() + pixelSize*20, (int)getY() + pixelSize*2, pixelSize, pixelSize);
		g.fillRect((int)getX() + pixelSize*21, (int)getY() + pixelSize*3, pixelSize, pixelSize*5);
		g.fillRect((int)getX() + pixelSize*21, (int)getY() + pixelSize*25, pixelSize*3, pixelSize);
		g.fillRect((int)getX() + pixelSize*21, (int)getY() + pixelSize*41, pixelSize, pixelSize);
		g.fillRect((int)getX() + pixelSize*22, (int)getY() + pixelSize*7, pixelSize, pixelSize);
		g.fillRect((int)getX() + pixelSize*22, (int)getY() + pixelSize*20, pixelSize, pixelSize*4);
		g.fillRect((int)getX() + pixelSize*22, (int)getY() + pixelSize*25, pixelSize, pixelSize*4);
		g.fillRect((int)getX() + pixelSize*23, (int)getY() + pixelSize*8, pixelSize*2, pixelSize);
		g.fillRect((int)getX() + pixelSize*23, (int)getY() + pixelSize*14, pixelSize, pixelSize*6);
		g.fillRect((int)getX() + pixelSize*23, (int)getY() + pixelSize*24, pixelSize, pixelSize*2);
		g.fillRect((int)getX() + pixelSize*23, (int)getY() + pixelSize*29, pixelSize, pixelSize*3);
		g.fillRect((int)getX() + pixelSize*23, (int)getY() + pixelSize*41, pixelSize, pixelSize);
		g.fillRect((int)getX() + pixelSize*24, (int)getY() + pixelSize*8, pixelSize, pixelSize*6);
		g.fillRect((int)getX() + pixelSize*24, (int)getY() + pixelSize*32, pixelSize, pixelSize*3);
		g.fillRect((int)getX() + pixelSize*24, (int)getY() + pixelSize*44, pixelSize, pixelSize*2);
		g.fillRect((int)getX() + pixelSize*24, (int)getY() + pixelSize*45, pixelSize*2, pixelSize);
		g.fillRect((int)getX() + pixelSize*25, (int)getY() + pixelSize*9, pixelSize, pixelSize);
		g.fillRect((int)getX() + pixelSize*25, (int)getY() + pixelSize*14, pixelSize, pixelSize*2);
		g.fillRect((int)getX() + pixelSize*25, (int)getY() + pixelSize*35, pixelSize, pixelSize*5);
		g.fillRect((int)getX() + pixelSize*25, (int)getY() + pixelSize*43, pixelSize, pixelSize);
		g.fillRect((int)getX() + pixelSize*26, (int)getY() + pixelSize*10, pixelSize, pixelSize*2);
		g.fillRect((int)getX() + pixelSize*26, (int)getY() + pixelSize*16, pixelSize, pixelSize*2);
		g.fillRect((int)getX() + pixelSize*26, (int)getY() + pixelSize*27, pixelSize, pixelSize*4);
		g.fillRect((int)getX() + pixelSize*26, (int)getY() + pixelSize*46, pixelSize, pixelSize);
		g.fillRect((int)getX() + pixelSize*27, (int)getY() + pixelSize*12, pixelSize, pixelSize*2);
		g.fillRect((int)getX() + pixelSize*27, (int)getY() + pixelSize*18, pixelSize, pixelSize*3);
		g.fillRect((int)getX() + pixelSize*27, (int)getY() + pixelSize*24, pixelSize, pixelSize*3);
		g.fillRect((int)getX() + pixelSize*27, (int)getY() + pixelSize*31, pixelSize*2, pixelSize);
		g.fillRect((int)getX() + pixelSize*27, (int)getY() + pixelSize*31, pixelSize, pixelSize*9);
		g.fillRect((int)getX() + pixelSize*27, (int)getY() + pixelSize*39, pixelSize*2, pixelSize);
		g.fillRect((int)getX() + pixelSize*28, (int)getY() + pixelSize*21, pixelSize, pixelSize*3);
		g.fillRect((int)getX() + pixelSize*28, (int)getY() + pixelSize*14, pixelSize, pixelSize);
		g.fillRect((int)getX() + pixelSize*29, (int)getY() + pixelSize*15, pixelSize, pixelSize);
		g.fillRect((int)getX() + pixelSize*29, (int)getY() + pixelSize*32, pixelSize, pixelSize*7);
		g.fillRect((int)getX() + pixelSize*30, (int)getY() + pixelSize*16, pixelSize, pixelSize);
		g.fillRect((int)getX() + pixelSize*30, (int)getY() + pixelSize*33, pixelSize, pixelSize);
		g.fillRect((int)getX() + pixelSize*31, (int)getY() + pixelSize*17, pixelSize, pixelSize*2);
		g.fillRect((int)getX() + pixelSize*31, (int)getY() + pixelSize*32, pixelSize, pixelSize*8);
		g.fillRect((int)getX() + pixelSize*32, (int)getY() + pixelSize*19, pixelSize, pixelSize*5);
		g.fillRect((int)getX() + pixelSize*32, (int)getY() + pixelSize*31, pixelSize, pixelSize);
		g.fillRect((int)getX() + pixelSize*32, (int)getY() + pixelSize*39, pixelSize, pixelSize);
		g.fillRect((int)getX() + pixelSize*33, (int)getY() + pixelSize*24, pixelSize, pixelSize*15);
		g.fillRect((int)getX() + pixelSize*12, (int)getY() + pixelSize*7, pixelSize, pixelSize*3);
		g.fillRect((int)getX() + pixelSize*11, (int)getY() + pixelSize*10, pixelSize, pixelSize*3);
		g.fillRect((int)getX() + pixelSize*12, (int)getY() + pixelSize*13, pixelSize, pixelSize);
		g.fillRect((int)getX() + pixelSize*13, (int)getY() + pixelSize*14, pixelSize, pixelSize*2);
		g.fillRect((int)getX() + pixelSize*14, (int)getY() + pixelSize*16, pixelSize*6, pixelSize);
		g.fillRect((int)getX() + pixelSize*15, (int)getY() + pixelSize*15, pixelSize, pixelSize);
		g.fillRect((int)getX() + pixelSize*18, (int)getY() + pixelSize*15, pixelSize, pixelSize);
		g.fillRect((int)getX() + pixelSize*20, (int)getY() + pixelSize*14, pixelSize, pixelSize*2);
		g.fillRect((int)getX() + pixelSize*21, (int)getY() + pixelSize*13, pixelSize, pixelSize);
		g.fillRect((int)getX() + pixelSize*21, (int)getY() + pixelSize*7, pixelSize, pixelSize*3);
		g.fillRect((int)getX() + pixelSize*22, (int)getY() + pixelSize*10, pixelSize, pixelSize*3);
		g.fillRect((int)getX() + pixelSize*14, (int)getY() + pixelSize*9, pixelSize, pixelSize*3);
		g.fillRect((int)getX() + pixelSize*15, (int)getY() + pixelSize*8, pixelSize, pixelSize*3);
		g.fillRect((int)getX() + pixelSize*19, (int)getY() + pixelSize*9, pixelSize, pixelSize*3);
		g.fillRect((int)getX() + pixelSize*18, (int)getY() + pixelSize*8, pixelSize, pixelSize*3);
		g.fillRect((int)getX() + pixelSize*16, (int)getY() + pixelSize*12, pixelSize*2, pixelSize);
		
		//skin color
		g.setColor(new Color(199, 218, 216));
		g.setColor(new Color(199, 218, 216));
		g.fillRect((int)getX() + pixelSize, (int)getY() + pixelSize*24, pixelSize*5, pixelSize*7);
		g.fillRect((int)getX() + pixelSize*2, (int)getY() + pixelSize*31, pixelSize*3, pixelSize);
		g.fillRect((int)getX() + pixelSize*3, (int)getY() + pixelSize*32, pixelSize, pixelSize);
		g.fillRect((int)getX() + pixelSize*6, (int)getY() + pixelSize*27, pixelSize, pixelSize*4);
		g.fillRect((int)getX() + pixelSize*2, (int)getY() + pixelSize*19, pixelSize*3, pixelSize*5);
		g.fillRect((int)getX() + pixelSize*3, (int)getY() + pixelSize*17, pixelSize*3, pixelSize*4);
		g.fillRect((int)getX() + pixelSize*4, (int)getY() + pixelSize*16, pixelSize*3, pixelSize*2);
		g.fillRect((int)getX() + pixelSize*5, (int)getY() + pixelSize*15, pixelSize*3, pixelSize);
		g.fillRect((int)getX() + pixelSize*6, (int)getY() + pixelSize*14, pixelSize*2, pixelSize);
		g.fillRect((int)getX() + pixelSize*7, (int)getY() + pixelSize*12, pixelSize*2, pixelSize*2);
		g.fillRect((int)getX() + pixelSize*8, (int)getY() + pixelSize*10, pixelSize, pixelSize*2);
		g.fillRect((int)getX() + pixelSize*25, (int)getY() + pixelSize*10, pixelSize, pixelSize*2);
		g.fillRect((int)getX() + pixelSize*25, (int)getY() + pixelSize*12, pixelSize*2, pixelSize*2);
		g.fillRect((int)getX() + pixelSize*26, (int)getY() + pixelSize*14, pixelSize*2, pixelSize*2);
		g.fillRect((int)getX() + pixelSize*27, (int)getY() + pixelSize*15, pixelSize*2, pixelSize*3);
		g.fillRect((int)getX() + pixelSize*28, (int)getY() + pixelSize*16, pixelSize*2, pixelSize*5);
		g.fillRect((int)getX() + pixelSize*29, (int)getY() + pixelSize*17, pixelSize*2, pixelSize*7);
		g.fillRect((int)getX() + pixelSize*29, (int)getY() + pixelSize*19, pixelSize*3, pixelSize*5);
		g.fillRect((int)getX() + pixelSize*28, (int)getY() + pixelSize*24, pixelSize*5, pixelSize*7);
		g.fillRect((int)getX() + pixelSize*27, (int)getY() + pixelSize*27, pixelSize, pixelSize*4);
		g.fillRect((int)getX() + pixelSize*29, (int)getY() + pixelSize*31, pixelSize*3, pixelSize);
		g.fillRect((int)getX() + pixelSize*30, (int)getY() + pixelSize*32, pixelSize, pixelSize);
		g.fillRect((int)getX() + pixelSize*15, (int)getY() + pixelSize, pixelSize*4, pixelSize);
		g.fillRect((int)getX() + pixelSize*14, (int)getY() + pixelSize*2, pixelSize*6, pixelSize);
		g.fillRect((int)getX() + pixelSize*13, (int)getY() + pixelSize*3, pixelSize*8, pixelSize*5);
		
		//Pants color
		g.setColor(new Color(85, 28, 34));
		g.setColor(new Color(85, 28, 34));
		g.fillRect((int)getX() + pixelSize*12, (int)getY() + pixelSize*26, pixelSize, pixelSize);
		g.fillRect((int)getX() + pixelSize*16, (int)getY() + pixelSize*26, pixelSize*2, pixelSize);
		g.fillRect((int)getX() + pixelSize*21, (int)getY() + pixelSize*26, pixelSize, pixelSize);
		g.fillRect((int)getX() + pixelSize*12, (int)getY() + pixelSize*27, pixelSize*10, pixelSize);
		g.fillRect((int)getX() + pixelSize*12, (int)getY() + pixelSize*28, pixelSize*4, pixelSize);
		g.fillRect((int)getX() + pixelSize*18, (int)getY() + pixelSize*28, pixelSize*4, pixelSize);
		g.fillRect((int)getX() + pixelSize*11, (int)getY() + pixelSize*29, pixelSize*4, pixelSize*10);
		g.fillRect((int)getX() + pixelSize*19, (int)getY() + pixelSize*29, pixelSize*4, pixelSize*10);
		g.fillRect((int)getX() + pixelSize*10, (int)getY() + pixelSize*32, pixelSize*4, pixelSize*8);
		g.fillRect((int)getX() + pixelSize*20, (int)getY() + pixelSize*32, pixelSize*4, pixelSize*8);
		g.fillRect((int)getX() + pixelSize*9, (int)getY() + pixelSize*35, pixelSize, pixelSize*5);
		g.fillRect((int)getX() + pixelSize*24, (int)getY() + pixelSize*35, pixelSize, pixelSize*5);
		
		//Shirt color
		g.setColor(new Color(113, 128, 105));
		g.fillRect((int)getX() + pixelSize*11, (int)getY() + pixelSize*8, pixelSize, pixelSize*2);
		g.fillRect((int)getX() + pixelSize*10, (int)getY() + pixelSize*9, pixelSize, pixelSize*5);
		g.fillRect((int)getX() + pixelSize*11, (int)getY() + pixelSize*13, pixelSize, pixelSize*7);
		g.fillRect((int)getX() + pixelSize*11, (int)getY() + pixelSize*24, pixelSize*12, pixelSize);
		g.fillRect((int)getX() + pixelSize*13, (int)getY() + pixelSize*25, pixelSize*3, pixelSize);
		g.fillRect((int)getX() + pixelSize*18, (int)getY() + pixelSize*25, pixelSize*3, pixelSize);
		g.fillRect((int)getX() + pixelSize*12, (int)getY() + pixelSize*17, pixelSize*10, pixelSize*7);
		g.fillRect((int)getX() + pixelSize*12, (int)getY() + pixelSize*14, pixelSize, pixelSize*3);
		g.fillRect((int)getX() + pixelSize*13, (int)getY() + pixelSize*16, pixelSize, pixelSize);
		g.fillRect((int)getX() + pixelSize*20, (int)getY() + pixelSize*16, pixelSize*3, pixelSize*4);
		g.fillRect((int)getX() + pixelSize*21, (int)getY() + pixelSize*14, pixelSize*2, pixelSize*3);
		g.fillRect((int)getX() + pixelSize*22, (int)getY() + pixelSize*13, pixelSize*2, pixelSize);
		g.fillRect((int)getX() + pixelSize*22, (int)getY() + pixelSize*8, pixelSize, pixelSize*2);
		g.fillRect((int)getX() + pixelSize*23, (int)getY() + pixelSize*9, pixelSize, pixelSize*5);
		
		//Shoe color
		g.setColor(new Color(74, 89, 66));
		g.fillRect((int)getX() + pixelSize*8, (int)getY() + pixelSize*46, pixelSize*5, pixelSize);
		g.fillRect((int)getX() + pixelSize*9, (int)getY() + pixelSize*43, pixelSize*5, pixelSize);
		g.fillRect((int)getX() + pixelSize*10, (int)getY() + pixelSize*44, pixelSize*3, pixelSize*2);
		g.fillRect((int)getX() + pixelSize*20, (int)getY() + pixelSize*43, pixelSize*5, pixelSize);
		g.fillRect((int)getX() + pixelSize*21, (int)getY() + pixelSize*44, pixelSize*3, pixelSize*2);
		g.fillRect((int)getX() + pixelSize*21, (int)getY() + pixelSize*46, pixelSize*5, pixelSize);
		
		//talon color
		g.setColor(new Color(195, 184, 169));
		g.fillRect((int)getX() + pixelSize, (int)getY() + pixelSize*32, pixelSize, pixelSize*7);
		g.fillRect((int)getX() + pixelSize*5, (int)getY() + pixelSize*32, pixelSize, pixelSize*7);
		g.fillRect((int)getX() + pixelSize*28, (int)getY() + pixelSize*32, pixelSize, pixelSize*7);
		g.fillRect((int)getX() + pixelSize*32, (int)getY() + pixelSize*32, pixelSize, pixelSize*7);
	}
	
		/**
		 * Draws the monster while facing left
		 * @param g the Graphics object
		 */
		public void drawLeftMonster(Graphics g) {
			//outline
			g.setColor(Color.BLACK);
			g.fillRect((int)getX(), (int)getY() + pixelSize*24, pixelSize, pixelSize*15);
			g.fillRect((int)getX() + pixelSize, (int)getY() + pixelSize*19, pixelSize, pixelSize*5);
			g.fillRect((int)getX() + pixelSize, (int)getY() + pixelSize*31, pixelSize, pixelSize);
			g.fillRect((int)getX() + pixelSize, (int)getY() + pixelSize*39, pixelSize, pixelSize);
			g.fillRect((int)getX() + pixelSize*2, (int)getY() + pixelSize*17, pixelSize, pixelSize*2);
			g.fillRect((int)getX() + pixelSize*2, (int)getY() + pixelSize*32, pixelSize, pixelSize*8);
			g.fillRect((int)getX() + pixelSize*3, (int)getY() + pixelSize*16, pixelSize, pixelSize);
			g.fillRect((int)getX() + pixelSize*3, (int)getY() + pixelSize*33, pixelSize, pixelSize);
			g.fillRect((int)getX() + pixelSize*4, (int)getY() + pixelSize*15, pixelSize, pixelSize);
			g.fillRect((int)getX() + pixelSize*4, (int)getY() + pixelSize*32, pixelSize, pixelSize*7);
			g.fillRect((int)getX() + pixelSize*5, (int)getY() + pixelSize*14, pixelSize, pixelSize);
			g.fillRect((int)getX() + pixelSize*5, (int)getY() + pixelSize*21, pixelSize, pixelSize*3);
			g.fillRect((int)getX() + pixelSize*5, (int)getY() + pixelSize*31, pixelSize, pixelSize);
			g.fillRect((int)getX() + pixelSize*5, (int)getY() + pixelSize*39, pixelSize, pixelSize);
			g.fillRect((int)getX() + pixelSize*6, (int)getY() + pixelSize*12, pixelSize, pixelSize*2);
			g.fillRect((int)getX() + pixelSize*6, (int)getY() + pixelSize*18, pixelSize, pixelSize*3);
			g.fillRect((int)getX() + pixelSize*6, (int)getY() + pixelSize*24, pixelSize, pixelSize*3);
			g.fillRect((int)getX() + pixelSize*6, (int)getY() + pixelSize*31, pixelSize, pixelSize*9);
			g.fillRect((int)getX() + pixelSize*7, (int)getY() + pixelSize*10, pixelSize, pixelSize*2);
			g.fillRect((int)getX() + pixelSize*7, (int)getY() + pixelSize*16, pixelSize, pixelSize*2);
			g.fillRect((int)getX() + pixelSize*7, (int)getY() + pixelSize*27, pixelSize, pixelSize*4);
			g.fillRect((int)getX() + pixelSize*7, (int)getY() + pixelSize*46, pixelSize, pixelSize*2);
			g.fillRect((int)getX() + pixelSize*8, (int)getY() + pixelSize*9, pixelSize, pixelSize);
			g.fillRect((int)getX() + pixelSize*8, (int)getY() + pixelSize*14, pixelSize, pixelSize*2);
			g.fillRect((int)getX() + pixelSize*8, (int)getY() + pixelSize*35, pixelSize, pixelSize*5);
			g.fillRect((int)getX() + pixelSize*8, (int)getY() + pixelSize*42, pixelSize, pixelSize*2);
			g.fillRect((int)getX() + pixelSize*8, (int)getY() + pixelSize*42, pixelSize*7, pixelSize);
			g.fillRect((int)getX() + pixelSize*8, (int)getY() + pixelSize*45, pixelSize*2, pixelSize);
			g.fillRect((int)getX() + pixelSize*8, (int)getY() + pixelSize*47, pixelSize*6, pixelSize);
			g.fillRect((int)getX() + pixelSize*9, (int)getY() + pixelSize*8, pixelSize*2, pixelSize);
			g.fillRect((int)getX() + pixelSize*9, (int)getY() + pixelSize*8, pixelSize, pixelSize*6);
			g.fillRect((int)getX() + pixelSize*9, (int)getY() + pixelSize*32, pixelSize, pixelSize*3);
			g.fillRect((int)getX() + pixelSize*9, (int)getY() + pixelSize*40, pixelSize*6, pixelSize);
			g.fillRect((int)getX() + pixelSize*9, (int)getY() + pixelSize*44, pixelSize, pixelSize);
			g.fillRect((int)getX() + pixelSize*10, (int)getY() + pixelSize*14, pixelSize, pixelSize*6);
			g.fillRect((int)getX() + pixelSize*10, (int)getY() + pixelSize*24, pixelSize, pixelSize*2);
			g.fillRect((int)getX() + pixelSize*10, (int)getY() + pixelSize*29, pixelSize, pixelSize*3);
			g.fillRect((int)getX() + pixelSize*10, (int)getY() + pixelSize*41, pixelSize, pixelSize);
			g.fillRect((int)getX() + pixelSize*11, (int)getY() + pixelSize*7, pixelSize, pixelSize);
			g.fillRect((int)getX() + pixelSize*11, (int)getY() + pixelSize*20, pixelSize, pixelSize*4);
			g.fillRect((int)getX() + pixelSize*11, (int)getY() + pixelSize*25, pixelSize, pixelSize*4);
			g.fillRect((int)getX() + pixelSize*11, (int)getY() + pixelSize*25, pixelSize*2, pixelSize);
			g.fillRect((int)getX() + pixelSize*12, (int)getY() + pixelSize*3, pixelSize, pixelSize*5);
			g.fillRect((int)getX() + pixelSize*12, (int)getY() + pixelSize*41, pixelSize, pixelSize);
			g.fillRect((int)getX() + pixelSize*13, (int)getY() + pixelSize*2, pixelSize, pixelSize);
			g.fillRect((int)getX() + pixelSize*13, (int)getY() + pixelSize*26, pixelSize*3, pixelSize);
			g.fillRect((int)getX() + pixelSize*13, (int)getY() + pixelSize*44, pixelSize, pixelSize*4);
			g.fillRect((int)getX() + pixelSize*14, (int)getY() + pixelSize, pixelSize, pixelSize);
			g.fillRect((int)getX() + pixelSize*14, (int)getY() + pixelSize*39, pixelSize, pixelSize);
			g.fillRect((int)getX() + pixelSize*14, (int)getY() + pixelSize*42, pixelSize, pixelSize*2);
			g.fillRect((int)getX() + pixelSize*15, (int)getY(), pixelSize*4, pixelSize);
			g.fillRect((int)getX() + pixelSize*15, (int)getY() + pixelSize*29, pixelSize, pixelSize*10);
			g.fillRect((int)getX() + pixelSize*16, (int)getY() + pixelSize*25, pixelSize*2, pixelSize);
			g.fillRect((int)getX() + pixelSize*16, (int)getY() + pixelSize*28, pixelSize*2, pixelSize);
			g.fillRect((int)getX() + pixelSize*18, (int)getY() + pixelSize*26, pixelSize*3, pixelSize);
			g.fillRect((int)getX() + pixelSize*18, (int)getY() + pixelSize*29, pixelSize, pixelSize*10);
			g.fillRect((int)getX() + pixelSize*19, (int)getY() + pixelSize, pixelSize, pixelSize);
			g.fillRect((int)getX() + pixelSize*19, (int)getY() + pixelSize*39, pixelSize, pixelSize);
			g.fillRect((int)getX() + pixelSize*19, (int)getY() + pixelSize*40, pixelSize*6, pixelSize);
			g.fillRect((int)getX() + pixelSize*19, (int)getY() + pixelSize*42, pixelSize*7, pixelSize);
			g.fillRect((int)getX() + pixelSize*19, (int)getY() + pixelSize*43, pixelSize, pixelSize);
			g.fillRect((int)getX() + pixelSize*20, (int)getY() + pixelSize*44, pixelSize, pixelSize*4);
			g.fillRect((int)getX() + pixelSize*20, (int)getY() + pixelSize*47, pixelSize*7, pixelSize);
			g.fillRect((int)getX() + pixelSize*20, (int)getY() + pixelSize*2, pixelSize, pixelSize);
			g.fillRect((int)getX() + pixelSize*21, (int)getY() + pixelSize*3, pixelSize, pixelSize*5);
			g.fillRect((int)getX() + pixelSize*21, (int)getY() + pixelSize*25, pixelSize*3, pixelSize);
			g.fillRect((int)getX() + pixelSize*21, (int)getY() + pixelSize*41, pixelSize, pixelSize);
			g.fillRect((int)getX() + pixelSize*22, (int)getY() + pixelSize*7, pixelSize, pixelSize);
			g.fillRect((int)getX() + pixelSize*22, (int)getY() + pixelSize*20, pixelSize, pixelSize*4);
			g.fillRect((int)getX() + pixelSize*22, (int)getY() + pixelSize*25, pixelSize, pixelSize*4);
			g.fillRect((int)getX() + pixelSize*23, (int)getY() + pixelSize*8, pixelSize*2, pixelSize);
			g.fillRect((int)getX() + pixelSize*23, (int)getY() + pixelSize*14, pixelSize, pixelSize*6);
			g.fillRect((int)getX() + pixelSize*23, (int)getY() + pixelSize*24, pixelSize, pixelSize*2);
			g.fillRect((int)getX() + pixelSize*23, (int)getY() + pixelSize*29, pixelSize, pixelSize*3);
			g.fillRect((int)getX() + pixelSize*23, (int)getY() + pixelSize*41, pixelSize, pixelSize);
			g.fillRect((int)getX() + pixelSize*24, (int)getY() + pixelSize*8, pixelSize, pixelSize*6);
			g.fillRect((int)getX() + pixelSize*24, (int)getY() + pixelSize*32, pixelSize, pixelSize*3);
			g.fillRect((int)getX() + pixelSize*24, (int)getY() + pixelSize*44, pixelSize, pixelSize*2);
			g.fillRect((int)getX() + pixelSize*24, (int)getY() + pixelSize*45, pixelSize*2, pixelSize);
			g.fillRect((int)getX() + pixelSize*25, (int)getY() + pixelSize*9, pixelSize, pixelSize);
			g.fillRect((int)getX() + pixelSize*25, (int)getY() + pixelSize*14, pixelSize, pixelSize*2);
			g.fillRect((int)getX() + pixelSize*25, (int)getY() + pixelSize*35, pixelSize, pixelSize*5);
			g.fillRect((int)getX() + pixelSize*25, (int)getY() + pixelSize*43, pixelSize, pixelSize);
			g.fillRect((int)getX() + pixelSize*26, (int)getY() + pixelSize*10, pixelSize, pixelSize*2);
			g.fillRect((int)getX() + pixelSize*26, (int)getY() + pixelSize*16, pixelSize, pixelSize*2);
			g.fillRect((int)getX() + pixelSize*26, (int)getY() + pixelSize*27, pixelSize, pixelSize*4);
			g.fillRect((int)getX() + pixelSize*26, (int)getY() + pixelSize*46, pixelSize, pixelSize);
			g.fillRect((int)getX() + pixelSize*27, (int)getY() + pixelSize*12, pixelSize, pixelSize*2);
			g.fillRect((int)getX() + pixelSize*27, (int)getY() + pixelSize*18, pixelSize, pixelSize*3);
			g.fillRect((int)getX() + pixelSize*27, (int)getY() + pixelSize*24, pixelSize, pixelSize*3);
			g.fillRect((int)getX() + pixelSize*27, (int)getY() + pixelSize*31, pixelSize*2, pixelSize);
			g.fillRect((int)getX() + pixelSize*27, (int)getY() + pixelSize*31, pixelSize, pixelSize*9);
			g.fillRect((int)getX() + pixelSize*27, (int)getY() + pixelSize*39, pixelSize*2, pixelSize);
			g.fillRect((int)getX() + pixelSize*28, (int)getY() + pixelSize*21, pixelSize, pixelSize*3);
			g.fillRect((int)getX() + pixelSize*28, (int)getY() + pixelSize*14, pixelSize, pixelSize);
			g.fillRect((int)getX() + pixelSize*29, (int)getY() + pixelSize*15, pixelSize, pixelSize);
			g.fillRect((int)getX() + pixelSize*29, (int)getY() + pixelSize*32, pixelSize, pixelSize*7);
			g.fillRect((int)getX() + pixelSize*30, (int)getY() + pixelSize*16, pixelSize, pixelSize);
			g.fillRect((int)getX() + pixelSize*30, (int)getY() + pixelSize*33, pixelSize, pixelSize);
			g.fillRect((int)getX() + pixelSize*31, (int)getY() + pixelSize*17, pixelSize, pixelSize*2);
			g.fillRect((int)getX() + pixelSize*31, (int)getY() + pixelSize*32, pixelSize, pixelSize*8);
			g.fillRect((int)getX() + pixelSize*32, (int)getY() + pixelSize*19, pixelSize, pixelSize*5);
			g.fillRect((int)getX() + pixelSize*32, (int)getY() + pixelSize*31, pixelSize, pixelSize);
			g.fillRect((int)getX() + pixelSize*32, (int)getY() + pixelSize*39, pixelSize, pixelSize);
			g.fillRect((int)getX() + pixelSize*33, (int)getY() + pixelSize*24, pixelSize, pixelSize*15);
			g.fillRect((int)getX() + pixelSize*12, (int)getY() + pixelSize*7, pixelSize, pixelSize*3);
			g.fillRect((int)getX() + pixelSize*11, (int)getY() + pixelSize*10, pixelSize, pixelSize*3);
			g.fillRect((int)getX() + pixelSize*12, (int)getY() + pixelSize*13, pixelSize, pixelSize);
			g.fillRect((int)getX() + pixelSize*13, (int)getY() + pixelSize*14, pixelSize, pixelSize*2);
			g.fillRect((int)getX() + pixelSize*14, (int)getY() + pixelSize*16, pixelSize*6, pixelSize);
			g.fillRect((int)getX() + pixelSize*15, (int)getY() + pixelSize*15, pixelSize, pixelSize);
			g.fillRect((int)getX() + pixelSize*18, (int)getY() + pixelSize*15, pixelSize, pixelSize);
			g.fillRect((int)getX() + pixelSize*20, (int)getY() + pixelSize*14, pixelSize, pixelSize*2);
			g.fillRect((int)getX() + pixelSize*21, (int)getY() + pixelSize*13, pixelSize, pixelSize);
			g.fillRect((int)getX() + pixelSize*21, (int)getY() + pixelSize*7, pixelSize, pixelSize*3);
			g.fillRect((int)getX() + pixelSize*22, (int)getY() + pixelSize*10, pixelSize, pixelSize*3);
			g.fillRect((int)getX() + pixelSize*13, (int)getY() + pixelSize*9, pixelSize, pixelSize*3);
			g.fillRect((int)getX() + pixelSize*14, (int)getY() + pixelSize*8, pixelSize, pixelSize*3);
			g.fillRect((int)getX() + pixelSize*18, (int)getY() + pixelSize*9, pixelSize, pixelSize*3);
			g.fillRect((int)getX() + pixelSize*17, (int)getY() + pixelSize*8, pixelSize, pixelSize*3);
			g.fillRect((int)getX() + pixelSize*15, (int)getY() + pixelSize*12, pixelSize*2, pixelSize);
			
			//skin color
			g.setColor(new Color(199, 218, 216));
			g.setColor(new Color(199, 218, 216));
			g.fillRect((int)getX() + pixelSize, (int)getY() + pixelSize*24, pixelSize*5, pixelSize*7);
			g.fillRect((int)getX() + pixelSize*2, (int)getY() + pixelSize*31, pixelSize*3, pixelSize);
			g.fillRect((int)getX() + pixelSize*3, (int)getY() + pixelSize*32, pixelSize, pixelSize);
			g.fillRect((int)getX() + pixelSize*6, (int)getY() + pixelSize*27, pixelSize, pixelSize*4);
			g.fillRect((int)getX() + pixelSize*2, (int)getY() + pixelSize*19, pixelSize*3, pixelSize*5);
			g.fillRect((int)getX() + pixelSize*3, (int)getY() + pixelSize*17, pixelSize*3, pixelSize*4);
			g.fillRect((int)getX() + pixelSize*4, (int)getY() + pixelSize*16, pixelSize*3, pixelSize*2);
			g.fillRect((int)getX() + pixelSize*5, (int)getY() + pixelSize*15, pixelSize*3, pixelSize);
			g.fillRect((int)getX() + pixelSize*6, (int)getY() + pixelSize*14, pixelSize*2, pixelSize);
			g.fillRect((int)getX() + pixelSize*7, (int)getY() + pixelSize*12, pixelSize*2, pixelSize*2);
			g.fillRect((int)getX() + pixelSize*8, (int)getY() + pixelSize*10, pixelSize, pixelSize*2);
			g.fillRect((int)getX() + pixelSize*25, (int)getY() + pixelSize*10, pixelSize, pixelSize*2);
			g.fillRect((int)getX() + pixelSize*25, (int)getY() + pixelSize*12, pixelSize*2, pixelSize*2);
			g.fillRect((int)getX() + pixelSize*26, (int)getY() + pixelSize*14, pixelSize*2, pixelSize*2);
			g.fillRect((int)getX() + pixelSize*27, (int)getY() + pixelSize*15, pixelSize*2, pixelSize*3);
			g.fillRect((int)getX() + pixelSize*28, (int)getY() + pixelSize*16, pixelSize*2, pixelSize*5);
			g.fillRect((int)getX() + pixelSize*29, (int)getY() + pixelSize*17, pixelSize*2, pixelSize*7);
			g.fillRect((int)getX() + pixelSize*29, (int)getY() + pixelSize*19, pixelSize*3, pixelSize*5);
			g.fillRect((int)getX() + pixelSize*28, (int)getY() + pixelSize*24, pixelSize*5, pixelSize*7);
			g.fillRect((int)getX() + pixelSize*27, (int)getY() + pixelSize*27, pixelSize, pixelSize*4);
			g.fillRect((int)getX() + pixelSize*29, (int)getY() + pixelSize*31, pixelSize*3, pixelSize);
			g.fillRect((int)getX() + pixelSize*30, (int)getY() + pixelSize*32, pixelSize, pixelSize);
			g.fillRect((int)getX() + pixelSize*15, (int)getY() + pixelSize, pixelSize*4, pixelSize);
			g.fillRect((int)getX() + pixelSize*14, (int)getY() + pixelSize*2, pixelSize*6, pixelSize);
			g.fillRect((int)getX() + pixelSize*13, (int)getY() + pixelSize*3, pixelSize*8, pixelSize*5);
			g.fillRect((int)getX() + pixelSize*13, (int)getY() + pixelSize*8, pixelSize, pixelSize);
			g.fillRect((int)getX() + pixelSize*12, (int)getY() + pixelSize*10, pixelSize, pixelSize*3);
			g.fillRect((int)getX() + pixelSize*13, (int)getY() + pixelSize*12, pixelSize*2, pixelSize*2);
			g.fillRect((int)getX() + pixelSize*14, (int)getY() + pixelSize*11, pixelSize, pixelSize*5);
			g.fillRect((int)getX() + pixelSize*14, (int)getY() + pixelSize*11, pixelSize*4, pixelSize);
			g.fillRect((int)getX() + pixelSize*15, (int)getY() + pixelSize*8, pixelSize*2, pixelSize*3);
			g.fillRect((int)getX() + pixelSize*18, (int)getY() + pixelSize*8, pixelSize*3, pixelSize);
			g.fillRect((int)getX() + pixelSize*19, (int)getY() + pixelSize*9, pixelSize*2, pixelSize*5);
			g.fillRect((int)getX() + pixelSize*15, (int)getY() + pixelSize*13, pixelSize*5, pixelSize*2);
			g.fillRect((int)getX() + pixelSize*16, (int)getY() + pixelSize*15, pixelSize*2, pixelSize);
			g.fillRect((int)getX() + pixelSize*19, (int)getY() + pixelSize*15, pixelSize, pixelSize);
			g.fillRect((int)getX() + pixelSize*17, (int)getY() + pixelSize*12, pixelSize*2, pixelSize);
			g.fillRect((int)getX() + pixelSize*21, (int)getY() + pixelSize*10, pixelSize, pixelSize*3);
			
			//Pants color
			g.setColor(new Color(85, 28, 34));
			g.setColor(new Color(85, 28, 34));
			g.fillRect((int)getX() + pixelSize*12, (int)getY() + pixelSize*26, pixelSize, pixelSize);
			g.fillRect((int)getX() + pixelSize*16, (int)getY() + pixelSize*26, pixelSize*2, pixelSize);
			g.fillRect((int)getX() + pixelSize*21, (int)getY() + pixelSize*26, pixelSize, pixelSize);
			g.fillRect((int)getX() + pixelSize*12, (int)getY() + pixelSize*27, pixelSize*10, pixelSize);
			g.fillRect((int)getX() + pixelSize*12, (int)getY() + pixelSize*28, pixelSize*4, pixelSize);
			g.fillRect((int)getX() + pixelSize*18, (int)getY() + pixelSize*28, pixelSize*4, pixelSize);
			g.fillRect((int)getX() + pixelSize*11, (int)getY() + pixelSize*29, pixelSize*4, pixelSize*10);
			g.fillRect((int)getX() + pixelSize*19, (int)getY() + pixelSize*29, pixelSize*4, pixelSize*10);
			g.fillRect((int)getX() + pixelSize*10, (int)getY() + pixelSize*32, pixelSize*4, pixelSize*8);
			g.fillRect((int)getX() + pixelSize*20, (int)getY() + pixelSize*32, pixelSize*4, pixelSize*8);
			g.fillRect((int)getX() + pixelSize*9, (int)getY() + pixelSize*35, pixelSize, pixelSize*5);
			g.fillRect((int)getX() + pixelSize*24, (int)getY() + pixelSize*35, pixelSize, pixelSize*5);
			
			//Shirt color
			g.setColor(new Color(113, 128, 105));
			g.fillRect((int)getX() + pixelSize*11, (int)getY() + pixelSize*8, pixelSize, pixelSize*2);
			g.fillRect((int)getX() + pixelSize*10, (int)getY() + pixelSize*9, pixelSize, pixelSize*5);
			g.fillRect((int)getX() + pixelSize*11, (int)getY() + pixelSize*13, pixelSize, pixelSize*7);
			g.fillRect((int)getX() + pixelSize*11, (int)getY() + pixelSize*24, pixelSize*12, pixelSize);
			g.fillRect((int)getX() + pixelSize*13, (int)getY() + pixelSize*25, pixelSize*3, pixelSize);
			g.fillRect((int)getX() + pixelSize*18, (int)getY() + pixelSize*25, pixelSize*3, pixelSize);
			g.fillRect((int)getX() + pixelSize*12, (int)getY() + pixelSize*17, pixelSize*10, pixelSize*7);
			g.fillRect((int)getX() + pixelSize*12, (int)getY() + pixelSize*14, pixelSize, pixelSize*3);
			g.fillRect((int)getX() + pixelSize*13, (int)getY() + pixelSize*16, pixelSize, pixelSize);
			g.fillRect((int)getX() + pixelSize*20, (int)getY() + pixelSize*16, pixelSize*3, pixelSize*4);
			g.fillRect((int)getX() + pixelSize*21, (int)getY() + pixelSize*14, pixelSize*2, pixelSize*3);
			g.fillRect((int)getX() + pixelSize*22, (int)getY() + pixelSize*13, pixelSize*2, pixelSize);
			g.fillRect((int)getX() + pixelSize*22, (int)getY() + pixelSize*8, pixelSize, pixelSize*2);
			g.fillRect((int)getX() + pixelSize*23, (int)getY() + pixelSize*9, pixelSize, pixelSize*5);
			
			//Shoe color
			g.setColor(new Color(74, 89, 66));
			g.fillRect((int)getX() + pixelSize*8, (int)getY() + pixelSize*46, pixelSize*5, pixelSize);
			g.fillRect((int)getX() + pixelSize*9, (int)getY() + pixelSize*43, pixelSize*5, pixelSize);
			g.fillRect((int)getX() + pixelSize*10, (int)getY() + pixelSize*44, pixelSize*3, pixelSize*2);
			g.fillRect((int)getX() + pixelSize*20, (int)getY() + pixelSize*43, pixelSize*5, pixelSize);
			g.fillRect((int)getX() + pixelSize*21, (int)getY() + pixelSize*44, pixelSize*3, pixelSize*2);
			g.fillRect((int)getX() + pixelSize*21, (int)getY() + pixelSize*46, pixelSize*5, pixelSize);
			
			//talon color
			g.setColor(new Color(195, 184, 169));
			g.fillRect((int)getX() + pixelSize, (int)getY() + pixelSize*32, pixelSize, pixelSize*7);
			g.fillRect((int)getX() + pixelSize*5, (int)getY() + pixelSize*32, pixelSize, pixelSize*7);
			g.fillRect((int)getX() + pixelSize*28, (int)getY() + pixelSize*32, pixelSize, pixelSize*7);
			g.fillRect((int)getX() + pixelSize*32, (int)getY() + pixelSize*32, pixelSize, pixelSize*7);
		}
		
		/**
		 * Draws the monster while facing right
		 * @param g the Graphics object
		 */
		public void drawRightMonster(Graphics g) {
			//outline
			g.setColor(Color.BLACK);
			g.fillRect((int)getX(), (int)getY() + pixelSize*24, pixelSize, pixelSize*15);
			g.fillRect((int)getX() + pixelSize, (int)getY() + pixelSize*19, pixelSize, pixelSize*5);
			g.fillRect((int)getX() + pixelSize, (int)getY() + pixelSize*31, pixelSize, pixelSize);
			g.fillRect((int)getX() + pixelSize, (int)getY() + pixelSize*39, pixelSize, pixelSize);
			g.fillRect((int)getX() + pixelSize*2, (int)getY() + pixelSize*17, pixelSize, pixelSize*2);
			g.fillRect((int)getX() + pixelSize*2, (int)getY() + pixelSize*32, pixelSize, pixelSize*8);
			g.fillRect((int)getX() + pixelSize*3, (int)getY() + pixelSize*16, pixelSize, pixelSize);
			g.fillRect((int)getX() + pixelSize*3, (int)getY() + pixelSize*33, pixelSize, pixelSize);
			g.fillRect((int)getX() + pixelSize*4, (int)getY() + pixelSize*15, pixelSize, pixelSize);
			g.fillRect((int)getX() + pixelSize*4, (int)getY() + pixelSize*32, pixelSize, pixelSize*7);
			g.fillRect((int)getX() + pixelSize*5, (int)getY() + pixelSize*14, pixelSize, pixelSize);
			g.fillRect((int)getX() + pixelSize*5, (int)getY() + pixelSize*21, pixelSize, pixelSize*3);
			g.fillRect((int)getX() + pixelSize*5, (int)getY() + pixelSize*31, pixelSize, pixelSize);
			g.fillRect((int)getX() + pixelSize*5, (int)getY() + pixelSize*39, pixelSize, pixelSize);
			g.fillRect((int)getX() + pixelSize*6, (int)getY() + pixelSize*12, pixelSize, pixelSize*2);
			g.fillRect((int)getX() + pixelSize*6, (int)getY() + pixelSize*18, pixelSize, pixelSize*3);
			g.fillRect((int)getX() + pixelSize*6, (int)getY() + pixelSize*24, pixelSize, pixelSize*3);
			g.fillRect((int)getX() + pixelSize*6, (int)getY() + pixelSize*31, pixelSize, pixelSize*9);
			g.fillRect((int)getX() + pixelSize*7, (int)getY() + pixelSize*10, pixelSize, pixelSize*2);
			g.fillRect((int)getX() + pixelSize*7, (int)getY() + pixelSize*16, pixelSize, pixelSize*2);
			g.fillRect((int)getX() + pixelSize*7, (int)getY() + pixelSize*27, pixelSize, pixelSize*4);
			g.fillRect((int)getX() + pixelSize*7, (int)getY() + pixelSize*46, pixelSize, pixelSize*2);
			g.fillRect((int)getX() + pixelSize*8, (int)getY() + pixelSize*9, pixelSize, pixelSize);
			g.fillRect((int)getX() + pixelSize*8, (int)getY() + pixelSize*14, pixelSize, pixelSize*2);
			g.fillRect((int)getX() + pixelSize*8, (int)getY() + pixelSize*35, pixelSize, pixelSize*5);
			g.fillRect((int)getX() + pixelSize*8, (int)getY() + pixelSize*42, pixelSize, pixelSize*2);
			g.fillRect((int)getX() + pixelSize*8, (int)getY() + pixelSize*42, pixelSize*7, pixelSize);
			g.fillRect((int)getX() + pixelSize*8, (int)getY() + pixelSize*45, pixelSize*2, pixelSize);
			g.fillRect((int)getX() + pixelSize*8, (int)getY() + pixelSize*47, pixelSize*6, pixelSize);
			g.fillRect((int)getX() + pixelSize*9, (int)getY() + pixelSize*8, pixelSize*2, pixelSize);
			g.fillRect((int)getX() + pixelSize*9, (int)getY() + pixelSize*8, pixelSize, pixelSize*6);
			g.fillRect((int)getX() + pixelSize*9, (int)getY() + pixelSize*32, pixelSize, pixelSize*3);
			g.fillRect((int)getX() + pixelSize*9, (int)getY() + pixelSize*40, pixelSize*6, pixelSize);
			g.fillRect((int)getX() + pixelSize*9, (int)getY() + pixelSize*44, pixelSize, pixelSize);
			g.fillRect((int)getX() + pixelSize*10, (int)getY() + pixelSize*14, pixelSize, pixelSize*6);
			g.fillRect((int)getX() + pixelSize*10, (int)getY() + pixelSize*24, pixelSize, pixelSize*2);
			g.fillRect((int)getX() + pixelSize*10, (int)getY() + pixelSize*29, pixelSize, pixelSize*3);
			g.fillRect((int)getX() + pixelSize*10, (int)getY() + pixelSize*41, pixelSize, pixelSize);
			g.fillRect((int)getX() + pixelSize*11, (int)getY() + pixelSize*7, pixelSize, pixelSize);
			g.fillRect((int)getX() + pixelSize*11, (int)getY() + pixelSize*20, pixelSize, pixelSize*4);
			g.fillRect((int)getX() + pixelSize*11, (int)getY() + pixelSize*25, pixelSize, pixelSize*4);
			g.fillRect((int)getX() + pixelSize*11, (int)getY() + pixelSize*25, pixelSize*2, pixelSize);
			g.fillRect((int)getX() + pixelSize*12, (int)getY() + pixelSize*3, pixelSize, pixelSize*5);
			g.fillRect((int)getX() + pixelSize*12, (int)getY() + pixelSize*41, pixelSize, pixelSize);
			g.fillRect((int)getX() + pixelSize*13, (int)getY() + pixelSize*2, pixelSize, pixelSize);
			g.fillRect((int)getX() + pixelSize*13, (int)getY() + pixelSize*26, pixelSize*3, pixelSize);
			g.fillRect((int)getX() + pixelSize*13, (int)getY() + pixelSize*44, pixelSize, pixelSize*4);
			g.fillRect((int)getX() + pixelSize*14, (int)getY() + pixelSize, pixelSize, pixelSize);
			g.fillRect((int)getX() + pixelSize*14, (int)getY() + pixelSize*39, pixelSize, pixelSize);
			g.fillRect((int)getX() + pixelSize*14, (int)getY() + pixelSize*42, pixelSize, pixelSize*2);
			g.fillRect((int)getX() + pixelSize*15, (int)getY(), pixelSize*4, pixelSize);
			g.fillRect((int)getX() + pixelSize*15, (int)getY() + pixelSize*29, pixelSize, pixelSize*10);
			g.fillRect((int)getX() + pixelSize*16, (int)getY() + pixelSize*25, pixelSize*2, pixelSize);
			g.fillRect((int)getX() + pixelSize*16, (int)getY() + pixelSize*28, pixelSize*2, pixelSize);
			g.fillRect((int)getX() + pixelSize*18, (int)getY() + pixelSize*26, pixelSize*3, pixelSize);
			g.fillRect((int)getX() + pixelSize*18, (int)getY() + pixelSize*29, pixelSize, pixelSize*10);
			g.fillRect((int)getX() + pixelSize*19, (int)getY() + pixelSize, pixelSize, pixelSize);
			g.fillRect((int)getX() + pixelSize*19, (int)getY() + pixelSize*39, pixelSize, pixelSize);
			g.fillRect((int)getX() + pixelSize*19, (int)getY() + pixelSize*40, pixelSize*6, pixelSize);
			g.fillRect((int)getX() + pixelSize*19, (int)getY() + pixelSize*42, pixelSize*7, pixelSize);
			g.fillRect((int)getX() + pixelSize*19, (int)getY() + pixelSize*43, pixelSize, pixelSize);
			g.fillRect((int)getX() + pixelSize*20, (int)getY() + pixelSize*44, pixelSize, pixelSize*4);
			g.fillRect((int)getX() + pixelSize*20, (int)getY() + pixelSize*47, pixelSize*7, pixelSize);
			g.fillRect((int)getX() + pixelSize*20, (int)getY() + pixelSize*2, pixelSize, pixelSize);
			g.fillRect((int)getX() + pixelSize*21, (int)getY() + pixelSize*3, pixelSize, pixelSize*5);
			g.fillRect((int)getX() + pixelSize*21, (int)getY() + pixelSize*25, pixelSize*3, pixelSize);
			g.fillRect((int)getX() + pixelSize*21, (int)getY() + pixelSize*41, pixelSize, pixelSize);
			g.fillRect((int)getX() + pixelSize*22, (int)getY() + pixelSize*7, pixelSize, pixelSize);
			g.fillRect((int)getX() + pixelSize*22, (int)getY() + pixelSize*20, pixelSize, pixelSize*4);
			g.fillRect((int)getX() + pixelSize*22, (int)getY() + pixelSize*25, pixelSize, pixelSize*4);
			g.fillRect((int)getX() + pixelSize*23, (int)getY() + pixelSize*8, pixelSize*2, pixelSize);
			g.fillRect((int)getX() + pixelSize*23, (int)getY() + pixelSize*14, pixelSize, pixelSize*6);
			g.fillRect((int)getX() + pixelSize*23, (int)getY() + pixelSize*24, pixelSize, pixelSize*2);
			g.fillRect((int)getX() + pixelSize*23, (int)getY() + pixelSize*29, pixelSize, pixelSize*3);
			g.fillRect((int)getX() + pixelSize*23, (int)getY() + pixelSize*41, pixelSize, pixelSize);
			g.fillRect((int)getX() + pixelSize*24, (int)getY() + pixelSize*8, pixelSize, pixelSize*6);
			g.fillRect((int)getX() + pixelSize*24, (int)getY() + pixelSize*32, pixelSize, pixelSize*3);
			g.fillRect((int)getX() + pixelSize*24, (int)getY() + pixelSize*44, pixelSize, pixelSize*2);
			g.fillRect((int)getX() + pixelSize*24, (int)getY() + pixelSize*45, pixelSize*2, pixelSize);
			g.fillRect((int)getX() + pixelSize*25, (int)getY() + pixelSize*9, pixelSize, pixelSize);
			g.fillRect((int)getX() + pixelSize*25, (int)getY() + pixelSize*14, pixelSize, pixelSize*2);
			g.fillRect((int)getX() + pixelSize*25, (int)getY() + pixelSize*35, pixelSize, pixelSize*5);
			g.fillRect((int)getX() + pixelSize*25, (int)getY() + pixelSize*43, pixelSize, pixelSize);
			g.fillRect((int)getX() + pixelSize*26, (int)getY() + pixelSize*10, pixelSize, pixelSize*2);
			g.fillRect((int)getX() + pixelSize*26, (int)getY() + pixelSize*16, pixelSize, pixelSize*2);
			g.fillRect((int)getX() + pixelSize*26, (int)getY() + pixelSize*27, pixelSize, pixelSize*4);
			g.fillRect((int)getX() + pixelSize*26, (int)getY() + pixelSize*46, pixelSize, pixelSize);
			g.fillRect((int)getX() + pixelSize*27, (int)getY() + pixelSize*12, pixelSize, pixelSize*2);
			g.fillRect((int)getX() + pixelSize*27, (int)getY() + pixelSize*18, pixelSize, pixelSize*3);
			g.fillRect((int)getX() + pixelSize*27, (int)getY() + pixelSize*24, pixelSize, pixelSize*3);
			g.fillRect((int)getX() + pixelSize*27, (int)getY() + pixelSize*31, pixelSize*2, pixelSize);
			g.fillRect((int)getX() + pixelSize*27, (int)getY() + pixelSize*31, pixelSize, pixelSize*9);
			g.fillRect((int)getX() + pixelSize*27, (int)getY() + pixelSize*39, pixelSize*2, pixelSize);
			g.fillRect((int)getX() + pixelSize*28, (int)getY() + pixelSize*21, pixelSize, pixelSize*3);
			g.fillRect((int)getX() + pixelSize*28, (int)getY() + pixelSize*14, pixelSize, pixelSize);
			g.fillRect((int)getX() + pixelSize*29, (int)getY() + pixelSize*15, pixelSize, pixelSize);
			g.fillRect((int)getX() + pixelSize*29, (int)getY() + pixelSize*32, pixelSize, pixelSize*7);
			g.fillRect((int)getX() + pixelSize*30, (int)getY() + pixelSize*16, pixelSize, pixelSize);
			g.fillRect((int)getX() + pixelSize*30, (int)getY() + pixelSize*33, pixelSize, pixelSize);
			g.fillRect((int)getX() + pixelSize*31, (int)getY() + pixelSize*17, pixelSize, pixelSize*2);
			g.fillRect((int)getX() + pixelSize*31, (int)getY() + pixelSize*32, pixelSize, pixelSize*8);
			g.fillRect((int)getX() + pixelSize*32, (int)getY() + pixelSize*19, pixelSize, pixelSize*5);
			g.fillRect((int)getX() + pixelSize*32, (int)getY() + pixelSize*31, pixelSize, pixelSize);
			g.fillRect((int)getX() + pixelSize*32, (int)getY() + pixelSize*39, pixelSize, pixelSize);
			g.fillRect((int)getX() + pixelSize*33, (int)getY() + pixelSize*24, pixelSize, pixelSize*15);
			g.fillRect((int)getX() + pixelSize*12, (int)getY() + pixelSize*7, pixelSize, pixelSize*3);
			g.fillRect((int)getX() + pixelSize*11, (int)getY() + pixelSize*10, pixelSize, pixelSize*3);
			g.fillRect((int)getX() + pixelSize*12, (int)getY() + pixelSize*13, pixelSize, pixelSize);
			g.fillRect((int)getX() + pixelSize*13, (int)getY() + pixelSize*14, pixelSize, pixelSize*2);
			g.fillRect((int)getX() + pixelSize*14, (int)getY() + pixelSize*16, pixelSize*6, pixelSize);
			g.fillRect((int)getX() + pixelSize*15, (int)getY() + pixelSize*15, pixelSize, pixelSize);
			g.fillRect((int)getX() + pixelSize*18, (int)getY() + pixelSize*15, pixelSize, pixelSize);
			g.fillRect((int)getX() + pixelSize*20, (int)getY() + pixelSize*14, pixelSize, pixelSize*2);
			g.fillRect((int)getX() + pixelSize*21, (int)getY() + pixelSize*13, pixelSize, pixelSize);
			g.fillRect((int)getX() + pixelSize*21, (int)getY() + pixelSize*7, pixelSize, pixelSize*3);
			g.fillRect((int)getX() + pixelSize*22, (int)getY() + pixelSize*10, pixelSize, pixelSize*3);
			g.fillRect((int)getX() + pixelSize*15, (int)getY() + pixelSize*9, pixelSize, pixelSize*3);
			g.fillRect((int)getX() + pixelSize*16, (int)getY() + pixelSize*8, pixelSize, pixelSize*3);
			g.fillRect((int)getX() + pixelSize*20, (int)getY() + pixelSize*9, pixelSize, pixelSize*3);
			g.fillRect((int)getX() + pixelSize*19, (int)getY() + pixelSize*8, pixelSize, pixelSize*3);
			g.fillRect((int)getX() + pixelSize*17, (int)getY() + pixelSize*12, pixelSize*2, pixelSize);
		
			//skin color
			g.setColor(new Color(199, 218, 216));
			g.fillRect((int)getX() + pixelSize, (int)getY() + pixelSize*24, pixelSize*5, pixelSize*7);
			g.fillRect((int)getX() + pixelSize*2, (int)getY() + pixelSize*31, pixelSize*3, pixelSize);
			g.fillRect((int)getX() + pixelSize*3, (int)getY() + pixelSize*32, pixelSize, pixelSize);
			g.fillRect((int)getX() + pixelSize*6, (int)getY() + pixelSize*27, pixelSize, pixelSize*4);
			g.fillRect((int)getX() + pixelSize*2, (int)getY() + pixelSize*19, pixelSize*3, pixelSize*5);
			g.fillRect((int)getX() + pixelSize*3, (int)getY() + pixelSize*17, pixelSize*3, pixelSize*4);
			g.fillRect((int)getX() + pixelSize*4, (int)getY() + pixelSize*16, pixelSize*3, pixelSize*2);
			g.fillRect((int)getX() + pixelSize*5, (int)getY() + pixelSize*15, pixelSize*3, pixelSize);
			g.fillRect((int)getX() + pixelSize*6, (int)getY() + pixelSize*14, pixelSize*2, pixelSize);
			g.fillRect((int)getX() + pixelSize*7, (int)getY() + pixelSize*12, pixelSize*2, pixelSize*2);
			g.fillRect((int)getX() + pixelSize*8, (int)getY() + pixelSize*10, pixelSize, pixelSize*2);
			g.fillRect((int)getX() + pixelSize*25, (int)getY() + pixelSize*10, pixelSize, pixelSize*2);
			g.fillRect((int)getX() + pixelSize*25, (int)getY() + pixelSize*12, pixelSize*2, pixelSize*2);
			g.fillRect((int)getX() + pixelSize*26, (int)getY() + pixelSize*14, pixelSize*2, pixelSize*2);
			g.fillRect((int)getX() + pixelSize*27, (int)getY() + pixelSize*15, pixelSize*2, pixelSize*3);
			g.fillRect((int)getX() + pixelSize*28, (int)getY() + pixelSize*16, pixelSize*2, pixelSize*5);
			g.fillRect((int)getX() + pixelSize*29, (int)getY() + pixelSize*17, pixelSize*2, pixelSize*7);
			g.fillRect((int)getX() + pixelSize*29, (int)getY() + pixelSize*19, pixelSize*3, pixelSize*5);
			g.fillRect((int)getX() + pixelSize*28, (int)getY() + pixelSize*24, pixelSize*5, pixelSize*7);
			g.fillRect((int)getX() + pixelSize*27, (int)getY() + pixelSize*27, pixelSize, pixelSize*4);
			g.fillRect((int)getX() + pixelSize*29, (int)getY() + pixelSize*31, pixelSize*3, pixelSize);
			g.fillRect((int)getX() + pixelSize*30, (int)getY() + pixelSize*32, pixelSize, pixelSize);
			g.fillRect((int)getX() + pixelSize*15, (int)getY() + pixelSize, pixelSize*4, pixelSize);
			g.fillRect((int)getX() + pixelSize*14, (int)getY() + pixelSize*2, pixelSize*6, pixelSize);
			g.fillRect((int)getX() + pixelSize*13, (int)getY() + pixelSize*3, pixelSize*8, pixelSize*5);
			g.fillRect((int)getX() + pixelSize*13, (int)getY() + pixelSize*8, pixelSize*3, pixelSize);
			g.fillRect((int)getX() + pixelSize*13, (int)getY() + pixelSize*8, pixelSize*2, pixelSize*6);
			g.fillRect((int)getX() + pixelSize*12, (int)getY() + pixelSize*10, pixelSize, pixelSize*3);
			g.fillRect((int)getX() + pixelSize*17, (int)getY() + pixelSize*8, pixelSize*2, pixelSize*4);
			g.fillRect((int)getX() + pixelSize*20, (int)getY() + pixelSize*8, pixelSize, pixelSize);
			g.fillRect((int)getX() + pixelSize*21, (int)getY() + pixelSize*10, pixelSize, pixelSize*3);
			g.fillRect((int)getX() + pixelSize*14, (int)getY() + pixelSize*14, pixelSize, pixelSize*2);
			g.fillRect((int)getX() + pixelSize*14, (int)getY() + pixelSize*12, pixelSize*3, pixelSize*3);
			g.fillRect((int)getX() + pixelSize*16, (int)getY() + pixelSize*11, pixelSize, pixelSize);
			g.fillRect((int)getX() + pixelSize*16, (int)getY() + pixelSize*15, pixelSize*2, pixelSize);
			g.fillRect((int)getX() + pixelSize*17, (int)getY() + pixelSize*13, pixelSize*3, pixelSize*2);
			g.fillRect((int)getX() + pixelSize*19, (int)getY() + pixelSize*11, pixelSize, pixelSize*5);
			g.fillRect((int)getX() + pixelSize*20, (int)getY() + pixelSize*12, pixelSize, pixelSize*2);
			
			//Pants color
			g.setColor(new Color(85, 28, 34));
			g.fillRect((int)getX() + pixelSize*12, (int)getY() + pixelSize*26, pixelSize, pixelSize);
			g.fillRect((int)getX() + pixelSize*16, (int)getY() + pixelSize*26, pixelSize*2, pixelSize);
			g.fillRect((int)getX() + pixelSize*21, (int)getY() + pixelSize*26, pixelSize, pixelSize);
			g.fillRect((int)getX() + pixelSize*12, (int)getY() + pixelSize*27, pixelSize*10, pixelSize);
			g.fillRect((int)getX() + pixelSize*12, (int)getY() + pixelSize*28, pixelSize*4, pixelSize);
			g.fillRect((int)getX() + pixelSize*18, (int)getY() + pixelSize*28, pixelSize*4, pixelSize);
			g.fillRect((int)getX() + pixelSize*11, (int)getY() + pixelSize*29, pixelSize*4, pixelSize*10);
			g.fillRect((int)getX() + pixelSize*19, (int)getY() + pixelSize*29, pixelSize*4, pixelSize*10);
			g.fillRect((int)getX() + pixelSize*10, (int)getY() + pixelSize*32, pixelSize*4, pixelSize*8);
			g.fillRect((int)getX() + pixelSize*20, (int)getY() + pixelSize*32, pixelSize*4, pixelSize*8);
			g.fillRect((int)getX() + pixelSize*9, (int)getY() + pixelSize*35, pixelSize, pixelSize*5);
			g.fillRect((int)getX() + pixelSize*24, (int)getY() + pixelSize*35, pixelSize, pixelSize*5);
			
			//Shirt color
			g.setColor(new Color(113, 128, 105));
			g.fillRect((int)getX() + pixelSize*11, (int)getY() + pixelSize*8, pixelSize, pixelSize*2);
			g.fillRect((int)getX() + pixelSize*10, (int)getY() + pixelSize*9, pixelSize, pixelSize*5);
			g.fillRect((int)getX() + pixelSize*11, (int)getY() + pixelSize*13, pixelSize, pixelSize*7);
			g.fillRect((int)getX() + pixelSize*11, (int)getY() + pixelSize*24, pixelSize*12, pixelSize);
			g.fillRect((int)getX() + pixelSize*13, (int)getY() + pixelSize*25, pixelSize*3, pixelSize);
			g.fillRect((int)getX() + pixelSize*18, (int)getY() + pixelSize*25, pixelSize*3, pixelSize);
			g.fillRect((int)getX() + pixelSize*12, (int)getY() + pixelSize*17, pixelSize*10, pixelSize*7);
			g.fillRect((int)getX() + pixelSize*12, (int)getY() + pixelSize*14, pixelSize, pixelSize*3);
			g.fillRect((int)getX() + pixelSize*13, (int)getY() + pixelSize*16, pixelSize, pixelSize);
			g.fillRect((int)getX() + pixelSize*20, (int)getY() + pixelSize*16, pixelSize*3, pixelSize*4);
			g.fillRect((int)getX() + pixelSize*21, (int)getY() + pixelSize*14, pixelSize*2, pixelSize*3);
			g.fillRect((int)getX() + pixelSize*22, (int)getY() + pixelSize*13, pixelSize*2, pixelSize);
			g.fillRect((int)getX() + pixelSize*22, (int)getY() + pixelSize*8, pixelSize, pixelSize*2);
			g.fillRect((int)getX() + pixelSize*23, (int)getY() + pixelSize*9, pixelSize, pixelSize*5);
			
			//Shoe color
			g.setColor(new Color(74, 89, 66));
			g.fillRect((int)getX() + pixelSize*8, (int)getY() + pixelSize*46, pixelSize*5, pixelSize);
			g.fillRect((int)getX() + pixelSize*9, (int)getY() + pixelSize*43, pixelSize*5, pixelSize);
			g.fillRect((int)getX() + pixelSize*10, (int)getY() + pixelSize*44, pixelSize*3, pixelSize*2);
			g.fillRect((int)getX() + pixelSize*20, (int)getY() + pixelSize*43, pixelSize*5, pixelSize);
			g.fillRect((int)getX() + pixelSize*21, (int)getY() + pixelSize*44, pixelSize*3, pixelSize*2);
			g.fillRect((int)getX() + pixelSize*21, (int)getY() + pixelSize*46, pixelSize*5, pixelSize);
			
			//talon color
			g.setColor(new Color(195, 184, 169));
			g.fillRect((int)getX() + pixelSize, (int)getY() + pixelSize*32, pixelSize, pixelSize*7);
			g.fillRect((int)getX() + pixelSize*5, (int)getY() + pixelSize*32, pixelSize, pixelSize*7);
			g.fillRect((int)getX() + pixelSize*28, (int)getY() + pixelSize*32, pixelSize, pixelSize*7);
			g.fillRect((int)getX() + pixelSize*32, (int)getY() + pixelSize*32, pixelSize, pixelSize*7);
		}
	
		/**
		 * Draws monster while facing left but in white
		 * @param g the Graphics object
		 */
		public void drawLeftWhite(Graphics g) {
			g.setColor(Color.WHITE);
			g.fillRect((int)getX(), (int)getY() + pixelSize*24, pixelSize, pixelSize*15);
			g.fillRect((int)getX() + pixelSize, (int)getY() + pixelSize*19, pixelSize, pixelSize*5);
			g.fillRect((int)getX() + pixelSize, (int)getY() + pixelSize*31, pixelSize, pixelSize);
			g.fillRect((int)getX() + pixelSize, (int)getY() + pixelSize*39, pixelSize, pixelSize);
			g.fillRect((int)getX() + pixelSize*2, (int)getY() + pixelSize*17, pixelSize, pixelSize*2);
			g.fillRect((int)getX() + pixelSize*2, (int)getY() + pixelSize*32, pixelSize, pixelSize*8);
			g.fillRect((int)getX() + pixelSize*3, (int)getY() + pixelSize*16, pixelSize, pixelSize);
			g.fillRect((int)getX() + pixelSize*3, (int)getY() + pixelSize*33, pixelSize, pixelSize);
			g.fillRect((int)getX() + pixelSize*4, (int)getY() + pixelSize*15, pixelSize, pixelSize);
			g.fillRect((int)getX() + pixelSize*4, (int)getY() + pixelSize*32, pixelSize, pixelSize*7);
			g.fillRect((int)getX() + pixelSize*5, (int)getY() + pixelSize*14, pixelSize, pixelSize);
			g.fillRect((int)getX() + pixelSize*5, (int)getY() + pixelSize*21, pixelSize, pixelSize*3);
			g.fillRect((int)getX() + pixelSize*5, (int)getY() + pixelSize*31, pixelSize, pixelSize);
			g.fillRect((int)getX() + pixelSize*5, (int)getY() + pixelSize*39, pixelSize, pixelSize);
			g.fillRect((int)getX() + pixelSize*6, (int)getY() + pixelSize*12, pixelSize, pixelSize*2);
			g.fillRect((int)getX() + pixelSize*6, (int)getY() + pixelSize*18, pixelSize, pixelSize*3);
			g.fillRect((int)getX() + pixelSize*6, (int)getY() + pixelSize*24, pixelSize, pixelSize*3);
			g.fillRect((int)getX() + pixelSize*6, (int)getY() + pixelSize*31, pixelSize, pixelSize*9);
			g.fillRect((int)getX() + pixelSize*7, (int)getY() + pixelSize*10, pixelSize, pixelSize*2);
			g.fillRect((int)getX() + pixelSize*7, (int)getY() + pixelSize*16, pixelSize, pixelSize*2);
			g.fillRect((int)getX() + pixelSize*7, (int)getY() + pixelSize*27, pixelSize, pixelSize*4);
			g.fillRect((int)getX() + pixelSize*7, (int)getY() + pixelSize*46, pixelSize, pixelSize*2);
			g.fillRect((int)getX() + pixelSize*8, (int)getY() + pixelSize*9, pixelSize, pixelSize);
			g.fillRect((int)getX() + pixelSize*8, (int)getY() + pixelSize*14, pixelSize, pixelSize*2);
			g.fillRect((int)getX() + pixelSize*8, (int)getY() + pixelSize*35, pixelSize, pixelSize*5);
			g.fillRect((int)getX() + pixelSize*8, (int)getY() + pixelSize*42, pixelSize, pixelSize*2);
			g.fillRect((int)getX() + pixelSize*8, (int)getY() + pixelSize*42, pixelSize*7, pixelSize);
			g.fillRect((int)getX() + pixelSize*8, (int)getY() + pixelSize*45, pixelSize*2, pixelSize);
			g.fillRect((int)getX() + pixelSize*8, (int)getY() + pixelSize*47, pixelSize*6, pixelSize);
			g.fillRect((int)getX() + pixelSize*9, (int)getY() + pixelSize*8, pixelSize*2, pixelSize);
			g.fillRect((int)getX() + pixelSize*9, (int)getY() + pixelSize*8, pixelSize, pixelSize*6);
			g.fillRect((int)getX() + pixelSize*9, (int)getY() + pixelSize*32, pixelSize, pixelSize*3);
			g.fillRect((int)getX() + pixelSize*9, (int)getY() + pixelSize*40, pixelSize*6, pixelSize);
			g.fillRect((int)getX() + pixelSize*9, (int)getY() + pixelSize*44, pixelSize, pixelSize);
			g.fillRect((int)getX() + pixelSize*10, (int)getY() + pixelSize*14, pixelSize, pixelSize*6);
			g.fillRect((int)getX() + pixelSize*10, (int)getY() + pixelSize*24, pixelSize, pixelSize*2);
			g.fillRect((int)getX() + pixelSize*10, (int)getY() + pixelSize*29, pixelSize, pixelSize*3);
			g.fillRect((int)getX() + pixelSize*10, (int)getY() + pixelSize*41, pixelSize, pixelSize);
			g.fillRect((int)getX() + pixelSize*11, (int)getY() + pixelSize*7, pixelSize, pixelSize);
			g.fillRect((int)getX() + pixelSize*11, (int)getY() + pixelSize*20, pixelSize, pixelSize*4);
			g.fillRect((int)getX() + pixelSize*11, (int)getY() + pixelSize*25, pixelSize, pixelSize*4);
			g.fillRect((int)getX() + pixelSize*11, (int)getY() + pixelSize*25, pixelSize*2, pixelSize);
			g.fillRect((int)getX() + pixelSize*12, (int)getY() + pixelSize*3, pixelSize, pixelSize*5);
			g.fillRect((int)getX() + pixelSize*12, (int)getY() + pixelSize*41, pixelSize, pixelSize);
			g.fillRect((int)getX() + pixelSize*13, (int)getY() + pixelSize*2, pixelSize, pixelSize);
			g.fillRect((int)getX() + pixelSize*13, (int)getY() + pixelSize*26, pixelSize*3, pixelSize);
			g.fillRect((int)getX() + pixelSize*13, (int)getY() + pixelSize*44, pixelSize, pixelSize*4);
			g.fillRect((int)getX() + pixelSize*14, (int)getY() + pixelSize, pixelSize, pixelSize);
			g.fillRect((int)getX() + pixelSize*14, (int)getY() + pixelSize*39, pixelSize, pixelSize);
			g.fillRect((int)getX() + pixelSize*14, (int)getY() + pixelSize*42, pixelSize, pixelSize*2);
			g.fillRect((int)getX() + pixelSize*15, (int)getY(), pixelSize*4, pixelSize);
			g.fillRect((int)getX() + pixelSize*15, (int)getY() + pixelSize*29, pixelSize, pixelSize*10);
			g.fillRect((int)getX() + pixelSize*16, (int)getY() + pixelSize*25, pixelSize*2, pixelSize);
			g.fillRect((int)getX() + pixelSize*16, (int)getY() + pixelSize*28, pixelSize*2, pixelSize);
			g.fillRect((int)getX() + pixelSize*18, (int)getY() + pixelSize*26, pixelSize*3, pixelSize);
			g.fillRect((int)getX() + pixelSize*18, (int)getY() + pixelSize*29, pixelSize, pixelSize*10);
			g.fillRect((int)getX() + pixelSize*19, (int)getY() + pixelSize, pixelSize, pixelSize);
			g.fillRect((int)getX() + pixelSize*19, (int)getY() + pixelSize*39, pixelSize, pixelSize);
			g.fillRect((int)getX() + pixelSize*19, (int)getY() + pixelSize*40, pixelSize*6, pixelSize);
			g.fillRect((int)getX() + pixelSize*19, (int)getY() + pixelSize*42, pixelSize*7, pixelSize);
			g.fillRect((int)getX() + pixelSize*19, (int)getY() + pixelSize*43, pixelSize, pixelSize);
			g.fillRect((int)getX() + pixelSize*20, (int)getY() + pixelSize*44, pixelSize, pixelSize*4);
			g.fillRect((int)getX() + pixelSize*20, (int)getY() + pixelSize*47, pixelSize*7, pixelSize);
			g.fillRect((int)getX() + pixelSize*20, (int)getY() + pixelSize*2, pixelSize, pixelSize);
			g.fillRect((int)getX() + pixelSize*21, (int)getY() + pixelSize*3, pixelSize, pixelSize*5);
			g.fillRect((int)getX() + pixelSize*21, (int)getY() + pixelSize*25, pixelSize*3, pixelSize);
			g.fillRect((int)getX() + pixelSize*21, (int)getY() + pixelSize*41, pixelSize, pixelSize);
			g.fillRect((int)getX() + pixelSize*22, (int)getY() + pixelSize*7, pixelSize, pixelSize);
			g.fillRect((int)getX() + pixelSize*22, (int)getY() + pixelSize*20, pixelSize, pixelSize*4);
			g.fillRect((int)getX() + pixelSize*22, (int)getY() + pixelSize*25, pixelSize, pixelSize*4);
			g.fillRect((int)getX() + pixelSize*23, (int)getY() + pixelSize*8, pixelSize*2, pixelSize);
			g.fillRect((int)getX() + pixelSize*23, (int)getY() + pixelSize*14, pixelSize, pixelSize*6);
			g.fillRect((int)getX() + pixelSize*23, (int)getY() + pixelSize*24, pixelSize, pixelSize*2);
			g.fillRect((int)getX() + pixelSize*23, (int)getY() + pixelSize*29, pixelSize, pixelSize*3);
			g.fillRect((int)getX() + pixelSize*23, (int)getY() + pixelSize*41, pixelSize, pixelSize);
			g.fillRect((int)getX() + pixelSize*24, (int)getY() + pixelSize*8, pixelSize, pixelSize*6);
			g.fillRect((int)getX() + pixelSize*24, (int)getY() + pixelSize*32, pixelSize, pixelSize*3);
			g.fillRect((int)getX() + pixelSize*24, (int)getY() + pixelSize*44, pixelSize, pixelSize*2);
			g.fillRect((int)getX() + pixelSize*24, (int)getY() + pixelSize*45, pixelSize*2, pixelSize);
			g.fillRect((int)getX() + pixelSize*25, (int)getY() + pixelSize*9, pixelSize, pixelSize);
			g.fillRect((int)getX() + pixelSize*25, (int)getY() + pixelSize*14, pixelSize, pixelSize*2);
			g.fillRect((int)getX() + pixelSize*25, (int)getY() + pixelSize*35, pixelSize, pixelSize*5);
			g.fillRect((int)getX() + pixelSize*25, (int)getY() + pixelSize*43, pixelSize, pixelSize);
			g.fillRect((int)getX() + pixelSize*26, (int)getY() + pixelSize*10, pixelSize, pixelSize*2);
			g.fillRect((int)getX() + pixelSize*26, (int)getY() + pixelSize*16, pixelSize, pixelSize*2);
			g.fillRect((int)getX() + pixelSize*26, (int)getY() + pixelSize*27, pixelSize, pixelSize*4);
			g.fillRect((int)getX() + pixelSize*26, (int)getY() + pixelSize*46, pixelSize, pixelSize);
			g.fillRect((int)getX() + pixelSize*27, (int)getY() + pixelSize*12, pixelSize, pixelSize*2);
			g.fillRect((int)getX() + pixelSize*27, (int)getY() + pixelSize*18, pixelSize, pixelSize*3);
			g.fillRect((int)getX() + pixelSize*27, (int)getY() + pixelSize*24, pixelSize, pixelSize*3);
			g.fillRect((int)getX() + pixelSize*27, (int)getY() + pixelSize*31, pixelSize*2, pixelSize);
			g.fillRect((int)getX() + pixelSize*27, (int)getY() + pixelSize*31, pixelSize, pixelSize*9);
			g.fillRect((int)getX() + pixelSize*27, (int)getY() + pixelSize*39, pixelSize*2, pixelSize);
			g.fillRect((int)getX() + pixelSize*28, (int)getY() + pixelSize*21, pixelSize, pixelSize*3);
			g.fillRect((int)getX() + pixelSize*28, (int)getY() + pixelSize*14, pixelSize, pixelSize);
			g.fillRect((int)getX() + pixelSize*29, (int)getY() + pixelSize*15, pixelSize, pixelSize);
			g.fillRect((int)getX() + pixelSize*29, (int)getY() + pixelSize*32, pixelSize, pixelSize*7);
			g.fillRect((int)getX() + pixelSize*30, (int)getY() + pixelSize*16, pixelSize, pixelSize);
			g.fillRect((int)getX() + pixelSize*30, (int)getY() + pixelSize*33, pixelSize, pixelSize);
			g.fillRect((int)getX() + pixelSize*31, (int)getY() + pixelSize*17, pixelSize, pixelSize*2);
			g.fillRect((int)getX() + pixelSize*31, (int)getY() + pixelSize*32, pixelSize, pixelSize*8);
			g.fillRect((int)getX() + pixelSize*32, (int)getY() + pixelSize*19, pixelSize, pixelSize*5);
			g.fillRect((int)getX() + pixelSize*32, (int)getY() + pixelSize*31, pixelSize, pixelSize);
			g.fillRect((int)getX() + pixelSize*32, (int)getY() + pixelSize*39, pixelSize, pixelSize);
			g.fillRect((int)getX() + pixelSize*33, (int)getY() + pixelSize*24, pixelSize, pixelSize*15);
			g.fillRect((int)getX() + pixelSize*12, (int)getY() + pixelSize*7, pixelSize, pixelSize*3);
			g.fillRect((int)getX() + pixelSize*11, (int)getY() + pixelSize*10, pixelSize, pixelSize*3);
			g.fillRect((int)getX() + pixelSize*12, (int)getY() + pixelSize*13, pixelSize, pixelSize);
			g.fillRect((int)getX() + pixelSize*13, (int)getY() + pixelSize*14, pixelSize, pixelSize*2);
			g.fillRect((int)getX() + pixelSize*14, (int)getY() + pixelSize*16, pixelSize*6, pixelSize);
			g.fillRect((int)getX() + pixelSize*15, (int)getY() + pixelSize*15, pixelSize, pixelSize);
			g.fillRect((int)getX() + pixelSize*18, (int)getY() + pixelSize*15, pixelSize, pixelSize);
			g.fillRect((int)getX() + pixelSize*20, (int)getY() + pixelSize*14, pixelSize, pixelSize*2);
			g.fillRect((int)getX() + pixelSize*21, (int)getY() + pixelSize*13, pixelSize, pixelSize);
			g.fillRect((int)getX() + pixelSize*21, (int)getY() + pixelSize*7, pixelSize, pixelSize*3);
			g.fillRect((int)getX() + pixelSize*22, (int)getY() + pixelSize*10, pixelSize, pixelSize*3);
			g.fillRect((int)getX() + pixelSize*13, (int)getY() + pixelSize*9, pixelSize, pixelSize*3);
			g.fillRect((int)getX() + pixelSize*14, (int)getY() + pixelSize*8, pixelSize, pixelSize*3);
			g.fillRect((int)getX() + pixelSize*18, (int)getY() + pixelSize*9, pixelSize, pixelSize*3);
			g.fillRect((int)getX() + pixelSize*17, (int)getY() + pixelSize*8, pixelSize, pixelSize*3);
			g.fillRect((int)getX() + pixelSize*15, (int)getY() + pixelSize*12, pixelSize*2, pixelSize);
			g.fillRect((int)getX() + pixelSize, (int)getY() + pixelSize*24, pixelSize*5, pixelSize*7);
			g.fillRect((int)getX() + pixelSize*2, (int)getY() + pixelSize*31, pixelSize*3, pixelSize);
			g.fillRect((int)getX() + pixelSize*3, (int)getY() + pixelSize*32, pixelSize, pixelSize);
			g.fillRect((int)getX() + pixelSize*6, (int)getY() + pixelSize*27, pixelSize, pixelSize*4);
			g.fillRect((int)getX() + pixelSize*2, (int)getY() + pixelSize*19, pixelSize*3, pixelSize*5);
			g.fillRect((int)getX() + pixelSize*3, (int)getY() + pixelSize*17, pixelSize*3, pixelSize*4);
			g.fillRect((int)getX() + pixelSize*4, (int)getY() + pixelSize*16, pixelSize*3, pixelSize*2);
			g.fillRect((int)getX() + pixelSize*5, (int)getY() + pixelSize*15, pixelSize*3, pixelSize);
			g.fillRect((int)getX() + pixelSize*6, (int)getY() + pixelSize*14, pixelSize*2, pixelSize);
			g.fillRect((int)getX() + pixelSize*7, (int)getY() + pixelSize*12, pixelSize*2, pixelSize*2);
			g.fillRect((int)getX() + pixelSize*8, (int)getY() + pixelSize*10, pixelSize, pixelSize*2);
			g.fillRect((int)getX() + pixelSize*25, (int)getY() + pixelSize*10, pixelSize, pixelSize*2);
			g.fillRect((int)getX() + pixelSize*25, (int)getY() + pixelSize*12, pixelSize*2, pixelSize*2);
			g.fillRect((int)getX() + pixelSize*26, (int)getY() + pixelSize*14, pixelSize*2, pixelSize*2);
			g.fillRect((int)getX() + pixelSize*27, (int)getY() + pixelSize*15, pixelSize*2, pixelSize*3);
			g.fillRect((int)getX() + pixelSize*28, (int)getY() + pixelSize*16, pixelSize*2, pixelSize*5);
			g.fillRect((int)getX() + pixelSize*29, (int)getY() + pixelSize*17, pixelSize*2, pixelSize*7);
			g.fillRect((int)getX() + pixelSize*29, (int)getY() + pixelSize*19, pixelSize*3, pixelSize*5);
			g.fillRect((int)getX() + pixelSize*28, (int)getY() + pixelSize*24, pixelSize*5, pixelSize*7);
			g.fillRect((int)getX() + pixelSize*27, (int)getY() + pixelSize*27, pixelSize, pixelSize*4);
			g.fillRect((int)getX() + pixelSize*29, (int)getY() + pixelSize*31, pixelSize*3, pixelSize);
			g.fillRect((int)getX() + pixelSize*30, (int)getY() + pixelSize*32, pixelSize, pixelSize);
			g.fillRect((int)getX() + pixelSize*15, (int)getY() + pixelSize, pixelSize*4, pixelSize);
			g.fillRect((int)getX() + pixelSize*14, (int)getY() + pixelSize*2, pixelSize*6, pixelSize);
			g.fillRect((int)getX() + pixelSize*13, (int)getY() + pixelSize*3, pixelSize*8, pixelSize*5);
			g.fillRect((int)getX() + pixelSize*13, (int)getY() + pixelSize*8, pixelSize, pixelSize);
			g.fillRect((int)getX() + pixelSize*12, (int)getY() + pixelSize*10, pixelSize, pixelSize*3);
			g.fillRect((int)getX() + pixelSize*13, (int)getY() + pixelSize*12, pixelSize*2, pixelSize*2);
			g.fillRect((int)getX() + pixelSize*14, (int)getY() + pixelSize*11, pixelSize, pixelSize*5);
			g.fillRect((int)getX() + pixelSize*14, (int)getY() + pixelSize*11, pixelSize*4, pixelSize);
			g.fillRect((int)getX() + pixelSize*15, (int)getY() + pixelSize*8, pixelSize*2, pixelSize*3);
			g.fillRect((int)getX() + pixelSize*18, (int)getY() + pixelSize*8, pixelSize*3, pixelSize);
			g.fillRect((int)getX() + pixelSize*19, (int)getY() + pixelSize*9, pixelSize*2, pixelSize*5);
			g.fillRect((int)getX() + pixelSize*15, (int)getY() + pixelSize*13, pixelSize*5, pixelSize*2);
			g.fillRect((int)getX() + pixelSize*16, (int)getY() + pixelSize*15, pixelSize*2, pixelSize);
			g.fillRect((int)getX() + pixelSize*19, (int)getY() + pixelSize*15, pixelSize, pixelSize);
			g.fillRect((int)getX() + pixelSize*17, (int)getY() + pixelSize*12, pixelSize*2, pixelSize);
			g.fillRect((int)getX() + pixelSize*21, (int)getY() + pixelSize*10, pixelSize, pixelSize*3);
			g.fillRect((int)getX() + pixelSize*12, (int)getY() + pixelSize*26, pixelSize, pixelSize);
			g.fillRect((int)getX() + pixelSize*16, (int)getY() + pixelSize*26, pixelSize*2, pixelSize);
			g.fillRect((int)getX() + pixelSize*21, (int)getY() + pixelSize*26, pixelSize, pixelSize);
			g.fillRect((int)getX() + pixelSize*12, (int)getY() + pixelSize*27, pixelSize*10, pixelSize);
			g.fillRect((int)getX() + pixelSize*12, (int)getY() + pixelSize*28, pixelSize*4, pixelSize);
			g.fillRect((int)getX() + pixelSize*18, (int)getY() + pixelSize*28, pixelSize*4, pixelSize);
			g.fillRect((int)getX() + pixelSize*11, (int)getY() + pixelSize*29, pixelSize*4, pixelSize*10);
			g.fillRect((int)getX() + pixelSize*19, (int)getY() + pixelSize*29, pixelSize*4, pixelSize*10);
			g.fillRect((int)getX() + pixelSize*10, (int)getY() + pixelSize*32, pixelSize*4, pixelSize*8);
			g.fillRect((int)getX() + pixelSize*20, (int)getY() + pixelSize*32, pixelSize*4, pixelSize*8);
			g.fillRect((int)getX() + pixelSize*9, (int)getY() + pixelSize*35, pixelSize, pixelSize*5);
			g.fillRect((int)getX() + pixelSize*24, (int)getY() + pixelSize*35, pixelSize, pixelSize*5);
			g.fillRect((int)getX() + pixelSize*11, (int)getY() + pixelSize*8, pixelSize, pixelSize*2);
			g.fillRect((int)getX() + pixelSize*10, (int)getY() + pixelSize*9, pixelSize, pixelSize*5);
			g.fillRect((int)getX() + pixelSize*11, (int)getY() + pixelSize*13, pixelSize, pixelSize*7);
			g.fillRect((int)getX() + pixelSize*11, (int)getY() + pixelSize*24, pixelSize*12, pixelSize);
			g.fillRect((int)getX() + pixelSize*13, (int)getY() + pixelSize*25, pixelSize*3, pixelSize);
			g.fillRect((int)getX() + pixelSize*18, (int)getY() + pixelSize*25, pixelSize*3, pixelSize);
			g.fillRect((int)getX() + pixelSize*12, (int)getY() + pixelSize*17, pixelSize*10, pixelSize*7);
			g.fillRect((int)getX() + pixelSize*12, (int)getY() + pixelSize*14, pixelSize, pixelSize*3);
			g.fillRect((int)getX() + pixelSize*13, (int)getY() + pixelSize*16, pixelSize, pixelSize);
			g.fillRect((int)getX() + pixelSize*20, (int)getY() + pixelSize*16, pixelSize*3, pixelSize*4);
			g.fillRect((int)getX() + pixelSize*21, (int)getY() + pixelSize*14, pixelSize*2, pixelSize*3);
			g.fillRect((int)getX() + pixelSize*22, (int)getY() + pixelSize*13, pixelSize*2, pixelSize);
			g.fillRect((int)getX() + pixelSize*22, (int)getY() + pixelSize*8, pixelSize, pixelSize*2);
			g.fillRect((int)getX() + pixelSize*23, (int)getY() + pixelSize*9, pixelSize, pixelSize*5);
			g.fillRect((int)getX() + pixelSize*8, (int)getY() + pixelSize*46, pixelSize*5, pixelSize);
			g.fillRect((int)getX() + pixelSize*9, (int)getY() + pixelSize*43, pixelSize*5, pixelSize);
			g.fillRect((int)getX() + pixelSize*10, (int)getY() + pixelSize*44, pixelSize*3, pixelSize*2);
			g.fillRect((int)getX() + pixelSize*20, (int)getY() + pixelSize*43, pixelSize*5, pixelSize);
			g.fillRect((int)getX() + pixelSize*21, (int)getY() + pixelSize*44, pixelSize*3, pixelSize*2);
			g.fillRect((int)getX() + pixelSize*21, (int)getY() + pixelSize*46, pixelSize*5, pixelSize);
			g.fillRect((int)getX() + pixelSize, (int)getY() + pixelSize*32, pixelSize, pixelSize*7);
			g.fillRect((int)getX() + pixelSize*5, (int)getY() + pixelSize*32, pixelSize, pixelSize*7);
			g.fillRect((int)getX() + pixelSize*28, (int)getY() + pixelSize*32, pixelSize, pixelSize*7);
			g.fillRect((int)getX() + pixelSize*32, (int)getY() + pixelSize*32, pixelSize, pixelSize*7);
		}
		
		/**
		 * Draws monster while facing right but in white
		 * @param g the Graphics object
		 */
		public void drawRightWhite(Graphics g) {
			g.setColor(Color.WHITE);
			g.fillRect((int)getX(), (int)getY() + pixelSize*24, pixelSize, pixelSize*15);
			g.fillRect((int)getX() + pixelSize, (int)getY() + pixelSize*19, pixelSize, pixelSize*5);
			g.fillRect((int)getX() + pixelSize, (int)getY() + pixelSize*31, pixelSize, pixelSize);
			g.fillRect((int)getX() + pixelSize, (int)getY() + pixelSize*39, pixelSize, pixelSize);
			g.fillRect((int)getX() + pixelSize*2, (int)getY() + pixelSize*17, pixelSize, pixelSize*2);
			g.fillRect((int)getX() + pixelSize*2, (int)getY() + pixelSize*32, pixelSize, pixelSize*8);
			g.fillRect((int)getX() + pixelSize*3, (int)getY() + pixelSize*16, pixelSize, pixelSize);
			g.fillRect((int)getX() + pixelSize*3, (int)getY() + pixelSize*33, pixelSize, pixelSize);
			g.fillRect((int)getX() + pixelSize*4, (int)getY() + pixelSize*15, pixelSize, pixelSize);
			g.fillRect((int)getX() + pixelSize*4, (int)getY() + pixelSize*32, pixelSize, pixelSize*7);
			g.fillRect((int)getX() + pixelSize*5, (int)getY() + pixelSize*14, pixelSize, pixelSize);
			g.fillRect((int)getX() + pixelSize*5, (int)getY() + pixelSize*21, pixelSize, pixelSize*3);
			g.fillRect((int)getX() + pixelSize*5, (int)getY() + pixelSize*31, pixelSize, pixelSize);
			g.fillRect((int)getX() + pixelSize*5, (int)getY() + pixelSize*39, pixelSize, pixelSize);
			g.fillRect((int)getX() + pixelSize*6, (int)getY() + pixelSize*12, pixelSize, pixelSize*2);
			g.fillRect((int)getX() + pixelSize*6, (int)getY() + pixelSize*18, pixelSize, pixelSize*3);
			g.fillRect((int)getX() + pixelSize*6, (int)getY() + pixelSize*24, pixelSize, pixelSize*3);
			g.fillRect((int)getX() + pixelSize*6, (int)getY() + pixelSize*31, pixelSize, pixelSize*9);
			g.fillRect((int)getX() + pixelSize*7, (int)getY() + pixelSize*10, pixelSize, pixelSize*2);
			g.fillRect((int)getX() + pixelSize*7, (int)getY() + pixelSize*16, pixelSize, pixelSize*2);
			g.fillRect((int)getX() + pixelSize*7, (int)getY() + pixelSize*27, pixelSize, pixelSize*4);
			g.fillRect((int)getX() + pixelSize*7, (int)getY() + pixelSize*46, pixelSize, pixelSize*2);
			g.fillRect((int)getX() + pixelSize*8, (int)getY() + pixelSize*9, pixelSize, pixelSize);
			g.fillRect((int)getX() + pixelSize*8, (int)getY() + pixelSize*14, pixelSize, pixelSize*2);
			g.fillRect((int)getX() + pixelSize*8, (int)getY() + pixelSize*35, pixelSize, pixelSize*5);
			g.fillRect((int)getX() + pixelSize*8, (int)getY() + pixelSize*42, pixelSize, pixelSize*2);
			g.fillRect((int)getX() + pixelSize*8, (int)getY() + pixelSize*42, pixelSize*7, pixelSize);
			g.fillRect((int)getX() + pixelSize*8, (int)getY() + pixelSize*45, pixelSize*2, pixelSize);
			g.fillRect((int)getX() + pixelSize*8, (int)getY() + pixelSize*47, pixelSize*6, pixelSize);
			g.fillRect((int)getX() + pixelSize*9, (int)getY() + pixelSize*8, pixelSize*2, pixelSize);
			g.fillRect((int)getX() + pixelSize*9, (int)getY() + pixelSize*8, pixelSize, pixelSize*6);
			g.fillRect((int)getX() + pixelSize*9, (int)getY() + pixelSize*32, pixelSize, pixelSize*3);
			g.fillRect((int)getX() + pixelSize*9, (int)getY() + pixelSize*40, pixelSize*6, pixelSize);
			g.fillRect((int)getX() + pixelSize*9, (int)getY() + pixelSize*44, pixelSize, pixelSize);
			g.fillRect((int)getX() + pixelSize*10, (int)getY() + pixelSize*14, pixelSize, pixelSize*6);
			g.fillRect((int)getX() + pixelSize*10, (int)getY() + pixelSize*24, pixelSize, pixelSize*2);
			g.fillRect((int)getX() + pixelSize*10, (int)getY() + pixelSize*29, pixelSize, pixelSize*3);
			g.fillRect((int)getX() + pixelSize*10, (int)getY() + pixelSize*41, pixelSize, pixelSize);
			g.fillRect((int)getX() + pixelSize*11, (int)getY() + pixelSize*7, pixelSize, pixelSize);
			g.fillRect((int)getX() + pixelSize*11, (int)getY() + pixelSize*20, pixelSize, pixelSize*4);
			g.fillRect((int)getX() + pixelSize*11, (int)getY() + pixelSize*25, pixelSize, pixelSize*4);
			g.fillRect((int)getX() + pixelSize*11, (int)getY() + pixelSize*25, pixelSize*2, pixelSize);
			g.fillRect((int)getX() + pixelSize*12, (int)getY() + pixelSize*3, pixelSize, pixelSize*5);
			g.fillRect((int)getX() + pixelSize*12, (int)getY() + pixelSize*41, pixelSize, pixelSize);
			g.fillRect((int)getX() + pixelSize*13, (int)getY() + pixelSize*2, pixelSize, pixelSize);
			g.fillRect((int)getX() + pixelSize*13, (int)getY() + pixelSize*26, pixelSize*3, pixelSize);
			g.fillRect((int)getX() + pixelSize*13, (int)getY() + pixelSize*44, pixelSize, pixelSize*4);
			g.fillRect((int)getX() + pixelSize*14, (int)getY() + pixelSize, pixelSize, pixelSize);
			g.fillRect((int)getX() + pixelSize*14, (int)getY() + pixelSize*39, pixelSize, pixelSize);
			g.fillRect((int)getX() + pixelSize*14, (int)getY() + pixelSize*42, pixelSize, pixelSize*2);
			g.fillRect((int)getX() + pixelSize*15, (int)getY(), pixelSize*4, pixelSize);
			g.fillRect((int)getX() + pixelSize*15, (int)getY() + pixelSize*29, pixelSize, pixelSize*10);
			g.fillRect((int)getX() + pixelSize*16, (int)getY() + pixelSize*25, pixelSize*2, pixelSize);
			g.fillRect((int)getX() + pixelSize*16, (int)getY() + pixelSize*28, pixelSize*2, pixelSize);
			g.fillRect((int)getX() + pixelSize*18, (int)getY() + pixelSize*26, pixelSize*3, pixelSize);
			g.fillRect((int)getX() + pixelSize*18, (int)getY() + pixelSize*29, pixelSize, pixelSize*10);
			g.fillRect((int)getX() + pixelSize*19, (int)getY() + pixelSize, pixelSize, pixelSize);
			g.fillRect((int)getX() + pixelSize*19, (int)getY() + pixelSize*39, pixelSize, pixelSize);
			g.fillRect((int)getX() + pixelSize*19, (int)getY() + pixelSize*40, pixelSize*6, pixelSize);
			g.fillRect((int)getX() + pixelSize*19, (int)getY() + pixelSize*42, pixelSize*7, pixelSize);
			g.fillRect((int)getX() + pixelSize*19, (int)getY() + pixelSize*43, pixelSize, pixelSize);
			g.fillRect((int)getX() + pixelSize*20, (int)getY() + pixelSize*44, pixelSize, pixelSize*4);
			g.fillRect((int)getX() + pixelSize*20, (int)getY() + pixelSize*47, pixelSize*7, pixelSize);
			g.fillRect((int)getX() + pixelSize*20, (int)getY() + pixelSize*2, pixelSize, pixelSize);
			g.fillRect((int)getX() + pixelSize*21, (int)getY() + pixelSize*3, pixelSize, pixelSize*5);
			g.fillRect((int)getX() + pixelSize*21, (int)getY() + pixelSize*25, pixelSize*3, pixelSize);
			g.fillRect((int)getX() + pixelSize*21, (int)getY() + pixelSize*41, pixelSize, pixelSize);
			g.fillRect((int)getX() + pixelSize*22, (int)getY() + pixelSize*7, pixelSize, pixelSize);
			g.fillRect((int)getX() + pixelSize*22, (int)getY() + pixelSize*20, pixelSize, pixelSize*4);
			g.fillRect((int)getX() + pixelSize*22, (int)getY() + pixelSize*25, pixelSize, pixelSize*4);
			g.fillRect((int)getX() + pixelSize*23, (int)getY() + pixelSize*8, pixelSize*2, pixelSize);
			g.fillRect((int)getX() + pixelSize*23, (int)getY() + pixelSize*14, pixelSize, pixelSize*6);
			g.fillRect((int)getX() + pixelSize*23, (int)getY() + pixelSize*24, pixelSize, pixelSize*2);
			g.fillRect((int)getX() + pixelSize*23, (int)getY() + pixelSize*29, pixelSize, pixelSize*3);
			g.fillRect((int)getX() + pixelSize*23, (int)getY() + pixelSize*41, pixelSize, pixelSize);
			g.fillRect((int)getX() + pixelSize*24, (int)getY() + pixelSize*8, pixelSize, pixelSize*6);
			g.fillRect((int)getX() + pixelSize*24, (int)getY() + pixelSize*32, pixelSize, pixelSize*3);
			g.fillRect((int)getX() + pixelSize*24, (int)getY() + pixelSize*44, pixelSize, pixelSize*2);
			g.fillRect((int)getX() + pixelSize*24, (int)getY() + pixelSize*45, pixelSize*2, pixelSize);
			g.fillRect((int)getX() + pixelSize*25, (int)getY() + pixelSize*9, pixelSize, pixelSize);
			g.fillRect((int)getX() + pixelSize*25, (int)getY() + pixelSize*14, pixelSize, pixelSize*2);
			g.fillRect((int)getX() + pixelSize*25, (int)getY() + pixelSize*35, pixelSize, pixelSize*5);
			g.fillRect((int)getX() + pixelSize*25, (int)getY() + pixelSize*43, pixelSize, pixelSize);
			g.fillRect((int)getX() + pixelSize*26, (int)getY() + pixelSize*10, pixelSize, pixelSize*2);
			g.fillRect((int)getX() + pixelSize*26, (int)getY() + pixelSize*16, pixelSize, pixelSize*2);
			g.fillRect((int)getX() + pixelSize*26, (int)getY() + pixelSize*27, pixelSize, pixelSize*4);
			g.fillRect((int)getX() + pixelSize*26, (int)getY() + pixelSize*46, pixelSize, pixelSize);
			g.fillRect((int)getX() + pixelSize*27, (int)getY() + pixelSize*12, pixelSize, pixelSize*2);
			g.fillRect((int)getX() + pixelSize*27, (int)getY() + pixelSize*18, pixelSize, pixelSize*3);
			g.fillRect((int)getX() + pixelSize*27, (int)getY() + pixelSize*24, pixelSize, pixelSize*3);
			g.fillRect((int)getX() + pixelSize*27, (int)getY() + pixelSize*31, pixelSize*2, pixelSize);
			g.fillRect((int)getX() + pixelSize*27, (int)getY() + pixelSize*31, pixelSize, pixelSize*9);
			g.fillRect((int)getX() + pixelSize*27, (int)getY() + pixelSize*39, pixelSize*2, pixelSize);
			g.fillRect((int)getX() + pixelSize*28, (int)getY() + pixelSize*21, pixelSize, pixelSize*3);
			g.fillRect((int)getX() + pixelSize*28, (int)getY() + pixelSize*14, pixelSize, pixelSize);
			g.fillRect((int)getX() + pixelSize*29, (int)getY() + pixelSize*15, pixelSize, pixelSize);
			g.fillRect((int)getX() + pixelSize*29, (int)getY() + pixelSize*32, pixelSize, pixelSize*7);
			g.fillRect((int)getX() + pixelSize*30, (int)getY() + pixelSize*16, pixelSize, pixelSize);
			g.fillRect((int)getX() + pixelSize*30, (int)getY() + pixelSize*33, pixelSize, pixelSize);
			g.fillRect((int)getX() + pixelSize*31, (int)getY() + pixelSize*17, pixelSize, pixelSize*2);
			g.fillRect((int)getX() + pixelSize*31, (int)getY() + pixelSize*32, pixelSize, pixelSize*8);
			g.fillRect((int)getX() + pixelSize*32, (int)getY() + pixelSize*19, pixelSize, pixelSize*5);
			g.fillRect((int)getX() + pixelSize*32, (int)getY() + pixelSize*31, pixelSize, pixelSize);
			g.fillRect((int)getX() + pixelSize*32, (int)getY() + pixelSize*39, pixelSize, pixelSize);
			g.fillRect((int)getX() + pixelSize*33, (int)getY() + pixelSize*24, pixelSize, pixelSize*15);
			g.fillRect((int)getX() + pixelSize*12, (int)getY() + pixelSize*7, pixelSize, pixelSize*3);
			g.fillRect((int)getX() + pixelSize*11, (int)getY() + pixelSize*10, pixelSize, pixelSize*3);
			g.fillRect((int)getX() + pixelSize*12, (int)getY() + pixelSize*13, pixelSize, pixelSize);
			g.fillRect((int)getX() + pixelSize*13, (int)getY() + pixelSize*14, pixelSize, pixelSize*2);
			g.fillRect((int)getX() + pixelSize*14, (int)getY() + pixelSize*16, pixelSize*6, pixelSize);
			g.fillRect((int)getX() + pixelSize*15, (int)getY() + pixelSize*15, pixelSize, pixelSize);
			g.fillRect((int)getX() + pixelSize*18, (int)getY() + pixelSize*15, pixelSize, pixelSize);
			g.fillRect((int)getX() + pixelSize*20, (int)getY() + pixelSize*14, pixelSize, pixelSize*2);
			g.fillRect((int)getX() + pixelSize*21, (int)getY() + pixelSize*13, pixelSize, pixelSize);
			g.fillRect((int)getX() + pixelSize*21, (int)getY() + pixelSize*7, pixelSize, pixelSize*3);
			g.fillRect((int)getX() + pixelSize*22, (int)getY() + pixelSize*10, pixelSize, pixelSize*3);
			g.fillRect((int)getX() + pixelSize*15, (int)getY() + pixelSize*9, pixelSize, pixelSize*3);
			g.fillRect((int)getX() + pixelSize*16, (int)getY() + pixelSize*8, pixelSize, pixelSize*3);
			g.fillRect((int)getX() + pixelSize*20, (int)getY() + pixelSize*9, pixelSize, pixelSize*3);
			g.fillRect((int)getX() + pixelSize*19, (int)getY() + pixelSize*8, pixelSize, pixelSize*3);
			g.fillRect((int)getX() + pixelSize*17, (int)getY() + pixelSize*12, pixelSize*2, pixelSize);
			g.fillRect((int)getX() + pixelSize, (int)getY() + pixelSize*24, pixelSize*5, pixelSize*7);
			g.fillRect((int)getX() + pixelSize*2, (int)getY() + pixelSize*31, pixelSize*3, pixelSize);
			g.fillRect((int)getX() + pixelSize*3, (int)getY() + pixelSize*32, pixelSize, pixelSize);
			g.fillRect((int)getX() + pixelSize*6, (int)getY() + pixelSize*27, pixelSize, pixelSize*4);
			g.fillRect((int)getX() + pixelSize*2, (int)getY() + pixelSize*19, pixelSize*3, pixelSize*5);
			g.fillRect((int)getX() + pixelSize*3, (int)getY() + pixelSize*17, pixelSize*3, pixelSize*4);
			g.fillRect((int)getX() + pixelSize*4, (int)getY() + pixelSize*16, pixelSize*3, pixelSize*2);
			g.fillRect((int)getX() + pixelSize*5, (int)getY() + pixelSize*15, pixelSize*3, pixelSize);
			g.fillRect((int)getX() + pixelSize*6, (int)getY() + pixelSize*14, pixelSize*2, pixelSize);
			g.fillRect((int)getX() + pixelSize*7, (int)getY() + pixelSize*12, pixelSize*2, pixelSize*2);
			g.fillRect((int)getX() + pixelSize*8, (int)getY() + pixelSize*10, pixelSize, pixelSize*2);
			g.fillRect((int)getX() + pixelSize*25, (int)getY() + pixelSize*10, pixelSize, pixelSize*2);
			g.fillRect((int)getX() + pixelSize*25, (int)getY() + pixelSize*12, pixelSize*2, pixelSize*2);
			g.fillRect((int)getX() + pixelSize*26, (int)getY() + pixelSize*14, pixelSize*2, pixelSize*2);
			g.fillRect((int)getX() + pixelSize*27, (int)getY() + pixelSize*15, pixelSize*2, pixelSize*3);
			g.fillRect((int)getX() + pixelSize*28, (int)getY() + pixelSize*16, pixelSize*2, pixelSize*5);
			g.fillRect((int)getX() + pixelSize*29, (int)getY() + pixelSize*17, pixelSize*2, pixelSize*7);
			g.fillRect((int)getX() + pixelSize*29, (int)getY() + pixelSize*19, pixelSize*3, pixelSize*5);
			g.fillRect((int)getX() + pixelSize*28, (int)getY() + pixelSize*24, pixelSize*5, pixelSize*7);
			g.fillRect((int)getX() + pixelSize*27, (int)getY() + pixelSize*27, pixelSize, pixelSize*4);
			g.fillRect((int)getX() + pixelSize*29, (int)getY() + pixelSize*31, pixelSize*3, pixelSize);
			g.fillRect((int)getX() + pixelSize*30, (int)getY() + pixelSize*32, pixelSize, pixelSize);
			g.fillRect((int)getX() + pixelSize*15, (int)getY() + pixelSize, pixelSize*4, pixelSize);
			g.fillRect((int)getX() + pixelSize*14, (int)getY() + pixelSize*2, pixelSize*6, pixelSize);
			g.fillRect((int)getX() + pixelSize*13, (int)getY() + pixelSize*3, pixelSize*8, pixelSize*5);
			g.fillRect((int)getX() + pixelSize*13, (int)getY() + pixelSize*8, pixelSize*3, pixelSize);
			g.fillRect((int)getX() + pixelSize*13, (int)getY() + pixelSize*8, pixelSize*2, pixelSize*6);
			g.fillRect((int)getX() + pixelSize*12, (int)getY() + pixelSize*10, pixelSize, pixelSize*3);
			g.fillRect((int)getX() + pixelSize*17, (int)getY() + pixelSize*8, pixelSize*2, pixelSize*4);
			g.fillRect((int)getX() + pixelSize*20, (int)getY() + pixelSize*8, pixelSize, pixelSize);
			g.fillRect((int)getX() + pixelSize*21, (int)getY() + pixelSize*10, pixelSize, pixelSize*3);
			g.fillRect((int)getX() + pixelSize*14, (int)getY() + pixelSize*14, pixelSize, pixelSize*2);
			g.fillRect((int)getX() + pixelSize*14, (int)getY() + pixelSize*12, pixelSize*3, pixelSize*3);
			g.fillRect((int)getX() + pixelSize*16, (int)getY() + pixelSize*11, pixelSize, pixelSize);
			g.fillRect((int)getX() + pixelSize*16, (int)getY() + pixelSize*15, pixelSize*2, pixelSize);
			g.fillRect((int)getX() + pixelSize*17, (int)getY() + pixelSize*13, pixelSize*3, pixelSize*2);
			g.fillRect((int)getX() + pixelSize*19, (int)getY() + pixelSize*11, pixelSize, pixelSize*5);
			g.fillRect((int)getX() + pixelSize*20, (int)getY() + pixelSize*12, pixelSize, pixelSize*2);
			g.fillRect((int)getX() + pixelSize*12, (int)getY() + pixelSize*26, pixelSize, pixelSize);
			g.fillRect((int)getX() + pixelSize*16, (int)getY() + pixelSize*26, pixelSize*2, pixelSize);
			g.fillRect((int)getX() + pixelSize*21, (int)getY() + pixelSize*26, pixelSize, pixelSize);
			g.fillRect((int)getX() + pixelSize*12, (int)getY() + pixelSize*27, pixelSize*10, pixelSize);
			g.fillRect((int)getX() + pixelSize*12, (int)getY() + pixelSize*28, pixelSize*4, pixelSize);
			g.fillRect((int)getX() + pixelSize*18, (int)getY() + pixelSize*28, pixelSize*4, pixelSize);
			g.fillRect((int)getX() + pixelSize*11, (int)getY() + pixelSize*29, pixelSize*4, pixelSize*10);
			g.fillRect((int)getX() + pixelSize*19, (int)getY() + pixelSize*29, pixelSize*4, pixelSize*10);
			g.fillRect((int)getX() + pixelSize*10, (int)getY() + pixelSize*32, pixelSize*4, pixelSize*8);
			g.fillRect((int)getX() + pixelSize*20, (int)getY() + pixelSize*32, pixelSize*4, pixelSize*8);
			g.fillRect((int)getX() + pixelSize*9, (int)getY() + pixelSize*35, pixelSize, pixelSize*5);
			g.fillRect((int)getX() + pixelSize*24, (int)getY() + pixelSize*35, pixelSize, pixelSize*5);
			g.fillRect((int)getX() + pixelSize*11, (int)getY() + pixelSize*8, pixelSize, pixelSize*2);
			g.fillRect((int)getX() + pixelSize*10, (int)getY() + pixelSize*9, pixelSize, pixelSize*5);
			g.fillRect((int)getX() + pixelSize*11, (int)getY() + pixelSize*13, pixelSize, pixelSize*7);
			g.fillRect((int)getX() + pixelSize*11, (int)getY() + pixelSize*24, pixelSize*12, pixelSize);
			g.fillRect((int)getX() + pixelSize*13, (int)getY() + pixelSize*25, pixelSize*3, pixelSize);
			g.fillRect((int)getX() + pixelSize*18, (int)getY() + pixelSize*25, pixelSize*3, pixelSize);
			g.fillRect((int)getX() + pixelSize*12, (int)getY() + pixelSize*17, pixelSize*10, pixelSize*7);
			g.fillRect((int)getX() + pixelSize*12, (int)getY() + pixelSize*14, pixelSize, pixelSize*3);
			g.fillRect((int)getX() + pixelSize*13, (int)getY() + pixelSize*16, pixelSize, pixelSize);
			g.fillRect((int)getX() + pixelSize*20, (int)getY() + pixelSize*16, pixelSize*3, pixelSize*4);
			g.fillRect((int)getX() + pixelSize*21, (int)getY() + pixelSize*14, pixelSize*2, pixelSize*3);
			g.fillRect((int)getX() + pixelSize*22, (int)getY() + pixelSize*13, pixelSize*2, pixelSize);
			g.fillRect((int)getX() + pixelSize*22, (int)getY() + pixelSize*8, pixelSize, pixelSize*2);
			g.fillRect((int)getX() + pixelSize*23, (int)getY() + pixelSize*9, pixelSize, pixelSize*5);
			g.fillRect((int)getX() + pixelSize*8, (int)getY() + pixelSize*46, pixelSize*5, pixelSize);
			g.fillRect((int)getX() + pixelSize*9, (int)getY() + pixelSize*43, pixelSize*5, pixelSize);
			g.fillRect((int)getX() + pixelSize*10, (int)getY() + pixelSize*44, pixelSize*3, pixelSize*2);
			g.fillRect((int)getX() + pixelSize*20, (int)getY() + pixelSize*43, pixelSize*5, pixelSize);
			g.fillRect((int)getX() + pixelSize*21, (int)getY() + pixelSize*44, pixelSize*3, pixelSize*2);
			g.fillRect((int)getX() + pixelSize*21, (int)getY() + pixelSize*46, pixelSize*5, pixelSize);
			g.fillRect((int)getX() + pixelSize, (int)getY() + pixelSize*32, pixelSize, pixelSize*7);
			g.fillRect((int)getX() + pixelSize*5, (int)getY() + pixelSize*32, pixelSize, pixelSize*7);
			g.fillRect((int)getX() + pixelSize*28, (int)getY() + pixelSize*32, pixelSize, pixelSize*7);
			g.fillRect((int)getX() + pixelSize*32, (int)getY() + pixelSize*32, pixelSize, pixelSize*7);
		}
		
	/**
	 * detects whether a FireBall intersects with monster, returns true or false
	 * @param fireball the FireBall which hits intersects with the monster
	 * @return returns true or false
	 */
	public boolean fireBallHits(FireBall fireball) {
		if(fireball.getX() + fireball.getPixelSize()*10 > getX() && fireball.getX() + fireball.getPixelSize()*10 < getX() + getPixelSize()*33 && fireball.getY() + fireball.getPixelSize()*12 > getY() && fireball.getY() + getPixelSize()*12 < getY() + getPixelSize()*47) {
			return true;
		}
		
		else if(fireball.getX() > getX() && fireball.getX() < getX() + getPixelSize()*33 && fireball.getY() > getY() && fireball.getY() < getY() + getPixelSize()*47) {
			return true;
		}
		
		if(fireball.getX() + fireball.getPixelSize()*20 > getX() && fireball.getX() + fireball.getPixelSize()*20 < getX() + getPixelSize()*33 && fireball.getY() + fireball.getPixelSize()*24 > getY() && fireball.getY() + getPixelSize()*24 < getY() + getPixelSize()*47) {
			return true;
		}
		
		else {
			return false;
		}
	}
	
	/**
	 * Draws monster based off direction
	 * @param g the Graphics object
	 * @param monsterdirection the direction of which the monster is facing/moving in
	 */
	public void drawMonster(Graphics g, int monsterdirection) {
		if(monsterdirection == 1) {
			drawMonster(g);
		}
		if(monsterdirection == 2) {
			drawMonster(g);
		}
		if(monsterdirection == 3) {
			drawLeftMonster(g);
		}
		if(monsterdirection == 4) {
			drawRightMonster(g);
		}
	}
	
	/**
	 * monster moves based off a direction
	 * @param monsterdirection the direction of which the monster is facing/moving in
	 */
	public void moveMonster(int monsterdirection) {
		if(monsterdirection == 1) {
			moveDown();
		}
		if(monsterdirection == 2) {
			moveUp();
		}
		if(monsterdirection == 3) {
			moveLeft();
		}
		if(monsterdirection == 4) {
			moveRight();
		}
	}
	
	/**
	 * Detects whether warrior intersects with monster
	 * @param warrior the object which intersection is being checked with
	 * @return returns true if intersection is true, false if not intersecting 
	 */
	public boolean intersectsWith(Warrior warrior) {
		if(warrior.getX() + warrior.getPixelSize()*7 > getX() && warrior.getX() + warrior.getPixelSize()*7 < getX() + getPixelSize()*33 && warrior.getY() + warrior.getPixelSize()*11 > getY() && warrior.getY() + getPixelSize()*11 < getY() + getPixelSize()*47) {
			return true;
		}
		
		else if(warrior.getX() > getX() && warrior.getX() < getX() + getPixelSize()*33 && warrior.getY() > getY() && warrior.getY() < getY() + getPixelSize()*47) {
			return true;
		}
		
		else if(warrior.getX() + warrior.getPixelSize()*14 > getX() && warrior.getX() + warrior.getPixelSize()*14 < getX() + getPixelSize()*33 && warrior.getY() + warrior.getPixelSize()*23 > getY() && warrior.getY() + getPixelSize()*23 < getY() + getPixelSize()*47) {
			return true;
		}
		
		else {
			return false;
		}
	}
	/**
	 * gets the distance from warrior
	 * @param warrior2 the object which the distance is being calculated from
	 * @return returns the distance from the center of the warrior object to the center of the monster 
	 */
	public double getDistanceFrom(Warrior warrior2) {
		return Math.sqrt(Math.pow(warrior2.getX() + warrior2.getPixelSize()*7 - (getX() + getPixelSize()*17), 2) + Math.pow(warrior2.getY() + warrior2.getPixelSize()*12 - (getY() + getPixelSize()*24), 2));
	}
}
