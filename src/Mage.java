import java.awt.Color;
import java.awt.Graphics;

public class Mage {

	/**
	 * Private variables
	 */
	private int pixelSize;
	private int direction;
	private double x;
	private double y;
	private double xSpeed;
	private double ySpeed;	
	private double hpPercent;
	
	/**
	 * 5 parameter constructor for Mage
	 * @param pixelSize the size of each pixel
	 * @param x the x-coordinate of the upper-left of the Mage
	 * @param y the y-coordinate of the upper-left of the Mage
	 * @param xSpeed the xSpeed of the Warrior
	 * @param ySpeed the ySpeed of the Warrior
	 */
	public Mage(int pixelSize, double x, double y, double xSpeed, double ySpeed) {
		this.pixelSize = pixelSize;
		this.x = x;
		this.y = y;
		this.xSpeed = xSpeed;
		this.ySpeed = ySpeed;
		this.hpPercent = 1;
		this.direction = 1;
	}
	
	/**
	 * gets the pixelSize of the Mage
	 * @return returns the pixelSize of the Mage
	 */
	public double getPixelSize() {
		return pixelSize;
	}
	
	/**
	 * sets the pixelSize of the Mage
	 * @param pixelSize the size of the pixels of the Mage
	 */
	public void setPixelSize(int pixelSize) {
		this.pixelSize = pixelSize;
	}
	
	/**
	 * gets the x-coordinate of the upper-left of the Mage
	 * @return returns the x-coordinate of the upper-left of the Mage
	 */
	public double getX() {
		return x;
	}
	
	/**
	 * sets the x-coordinate of the upper-left of the Mage
	 * @param x the x-coordinate of the upper-left of the Mage
	 */
	public void setX(double x) {
		this.x = x;
	}
	
	/**
	 * gets the y-coordinate of the upper-left of the Mage
	 * @return returns the y-coordinate of the upper-left of the Mage
	 */
	public double getY() {
		return y;
	}
	
	/**
	 * sets the y-coordinate of the upper-left of the Mage
	 * @param y the y-coordinate of the upper-left of the Mage
	 */
	public void setY(double y) {
		this.y = y;
	}
	
	/**
	 * gets the xSpeed of the Mage
	 * @return returns the xSpeed of the Mage
	 */
	public double getXSpeed() {
		return xSpeed;
	}
	
	/**
	 * sets the xSpeed of the Mage
	 * @param xSpeed the xSpeed of the Mage
	 */
	public void setXSpeed(double xSpeed) {
		this.xSpeed = xSpeed;
	}
	
	/**
	 * gets the ySpeed of the Mage
	 * @return returns the ySpeed of the Mage
	 */
	public double getYSpeed() {
		return ySpeed;
	}
	
	/**
	 * sets the ySpeed of the Mage
	 * @param ySpeed the ySpeed of the Mage
	 */
	public void setYSpeed(double ySpeed) {
		this.ySpeed = ySpeed;
	}
	
	/**
	 * sets the location of the Mage
	 * @param x the x-coordinate of the upper-left of the Mage
	 * @param y the y-coordinate of the upper-left of the Mage
	 */
	public void setLocation(double x, double y) {
		setX(x);
		setY(y);
	}
	
	/**
	 * gets the hpPercent of the Mage
	 * @return returns the hpPercent
	 */
	public double gethpPercent() {
		return hpPercent;
	}
	
	/**
	 * sets the hpPercent of the Mage
	 * @param hpPercent the hpPercent of the mage
	 */
	public void sethpPercent(double hpPercent) {
		this.hpPercent = hpPercent;
	}
	
	/**
	 * decreases the y-coordinate of the Mage
	 */
	public void moveUp() {
		setY(getY() - getYSpeed());
	}
	
	/**
	 * increases the y-coordinate of the Mage
	 */
	public void moveDown() {
		setY(getY() + getYSpeed());
	}
	
	/**
	 * increases the x-coordinate of the Mage
	 */
	public void moveRight() { 
		setX(getX() + getXSpeed());
	}
	
	/**
	 * decreases the x-coordinate of the Mage
	 */
	public void moveLeft() { 
		setX(getX() - getXSpeed());
	}
	
	/**
	 * gets the direction of the Mage
	 * @return returns the direction of the Mage
	 */
	public int getDirection() {
		return direction;
	}
	
	/**
	 * sets the direction of the Mage
	 * @param direction the direction of the Mage
	 */
	public void setDirection(int direction) {
		this.direction = direction;
	}
	
	/**
	 * Draws the Mage depending on direction
	 * @param g the Graphics object
	 * @param direction the direction of which the Mage is facing
	 */
	public void drawMage(Graphics g, int direction) {
		if(direction == 1) {
			drawLeftMage(g);
		}
		if(direction == 2) {
			drawRightMage(g);
		}
	}
	/**
	 * Draws the mage while facing left, 17x24
	 * @param g the Graphics object
	 */
	public void drawLeftMage(Graphics g) {
		g.setColor(Color.BLACK);
		g.fillRect((int)getX() + pixelSize*6, (int)getY(), pixelSize*6, pixelSize);
		g.fillRect((int)getX() + pixelSize*4, (int)getY() + pixelSize, pixelSize*2, pixelSize);
		g.fillRect((int)getX() + pixelSize*12, (int)getY() + pixelSize, pixelSize*2, pixelSize);
		g.fillRect((int)getX() + pixelSize*3, (int)getY() + pixelSize*2, pixelSize, pixelSize);
		g.fillRect((int)getX() + pixelSize*14, (int)getY() + pixelSize*2, pixelSize, pixelSize);
		g.fillRect((int)getX() + pixelSize*2, (int)getY() + pixelSize*3, pixelSize, pixelSize*2);
		g.fillRect((int)getX() + pixelSize*15, (int)getY() + pixelSize*3, pixelSize, pixelSize*2);
		g.fillRect((int)getX() + pixelSize, (int)getY() + pixelSize*5, pixelSize, pixelSize*3);
		g.fillRect((int)getX() + pixelSize*16, (int)getY() + pixelSize*5, pixelSize, pixelSize*6);
		g.fillRect((int)getX() + pixelSize, (int)getY() + pixelSize*11, pixelSize, pixelSize*3);
		g.fillRect((int)getX() + pixelSize*2, (int)getY() + pixelSize*8, pixelSize, pixelSize);
		g.fillRect((int)getX() + pixelSize*2, (int)getY() + pixelSize*10, pixelSize, pixelSize);
		g.fillRect((int)getX() + pixelSize*3, (int)getY() + pixelSize*7, pixelSize*5, pixelSize);
		g.fillRect((int)getX() + pixelSize*3, (int)getY() + pixelSize*7, pixelSize, pixelSize*6);
		g.fillRect((int)getX() + pixelSize*3, (int)getY() + pixelSize*11, pixelSize*6, pixelSize*2);
		g.fillRect((int)getX() + pixelSize*3, (int)getY() + pixelSize*9, pixelSize*7, pixelSize);
		g.fillRect((int)getX() + pixelSize*5, (int)getY() + pixelSize*8, pixelSize*2, pixelSize*3);
		g.fillRect((int)getX() + pixelSize*8, (int)getY() + pixelSize*8, pixelSize, pixelSize);
		g.fillRect((int)getX() + pixelSize*8, (int)getY() + pixelSize*9, pixelSize*2, pixelSize*3);
		g.fillRect((int)getX() + pixelSize, (int)getY() + pixelSize*13, pixelSize*2, pixelSize);
		g.fillRect((int)getX() + pixelSize*2, (int)getY() + pixelSize*14, pixelSize*3, pixelSize);
		g.fillRect((int)getX() + pixelSize, (int)getY() + pixelSize*15, pixelSize, pixelSize*2);
		g.fillRect((int)getX(), (int)getY() + pixelSize*17, pixelSize, pixelSize*5);
		g.fillRect((int)getX() + pixelSize, (int)getY() + pixelSize*22, pixelSize, pixelSize);
		g.fillRect((int)getX() + pixelSize*2, (int)getY() + pixelSize*23, pixelSize*4, pixelSize);
		g.fillRect((int)getX() + pixelSize*5, (int)getY() + pixelSize*21, pixelSize*2, pixelSize*2);
		g.fillRect((int)getX() + pixelSize*5, (int)getY() + pixelSize*22, pixelSize*3, pixelSize);
		g.fillRect((int)getX() + pixelSize*8, (int)getY() + pixelSize*23, pixelSize*8, pixelSize);
		g.fillRect((int)getX() + pixelSize*16, (int)getY() + pixelSize*17, pixelSize, pixelSize*6);
		g.fillRect((int)getX() + pixelSize*5, (int)getY() + pixelSize*15, pixelSize*2, pixelSize);
		g.fillRect((int)getX() + pixelSize*6, (int)getY() + pixelSize*14, pixelSize*5, pixelSize);
		g.fillRect((int)getX() + pixelSize*11, (int)getY() + pixelSize*13, pixelSize*3, pixelSize);
		g.fillRect((int)getX() + pixelSize*12, (int)getY() + pixelSize*12, pixelSize, pixelSize);
		g.fillRect((int)getX() + pixelSize*14, (int)getY() + pixelSize*14, pixelSize, pixelSize);
		g.fillRect((int)getX() + pixelSize*15, (int)getY() + pixelSize*11, pixelSize, pixelSize*6);
		
		//Lightest Green
		g.setColor(new Color(55, 145, 89));
		g.fillRect((int)getX() + pixelSize*2, (int)getY() + pixelSize*6, pixelSize*8, pixelSize);
		g.fillRect((int)getX() + pixelSize*9, (int)getY() + pixelSize*6, pixelSize, pixelSize*2);
		g.fillRect((int)getX() + pixelSize*10, (int)getY() + pixelSize*7, pixelSize, pixelSize*2);
		g.fillRect((int)getX() + pixelSize*3, (int)getY() + pixelSize*3, pixelSize*11, pixelSize*2);
		g.fillRect((int)getX() + pixelSize*4, (int)getY() + pixelSize*5, pixelSize*2, pixelSize);
		g.fillRect((int)getX() + pixelSize*10, (int)getY() + pixelSize*5, pixelSize*4, pixelSize);
		g.fillRect((int)getX() + pixelSize*11, (int)getY() + pixelSize*6, pixelSize*2, pixelSize);
		g.fillRect((int)getX() + pixelSize*4, (int)getY() + pixelSize*2, pixelSize*9, pixelSize);
		g.fillRect((int)getX() + pixelSize*6, (int)getY() + pixelSize, pixelSize*5, pixelSize);
		g.fillRect((int)getX() + pixelSize*6, (int)getY() + pixelSize*16, pixelSize, pixelSize*4);
		g.fillRect((int)getX() + pixelSize*7, (int)getY() + pixelSize*18, pixelSize, pixelSize*4);
		g.fillRect((int)getX() + pixelSize*8, (int)getY() + pixelSize*16, pixelSize*3, pixelSize*2);
		g.fillRect((int)getX() + pixelSize*8, (int)getY() + pixelSize*22, pixelSize*3, pixelSize);
		g.fillRect((int)getX() + pixelSize*8, (int)getY() + pixelSize*19, pixelSize*2, pixelSize*3);
		g.fillRect((int)getX() + pixelSize*9, (int)getY() + pixelSize*18, pixelSize*2, pixelSize*3);
		g.fillRect((int)getX() + pixelSize*11, (int)getY() + pixelSize*20, pixelSize, pixelSize);
		g.fillRect((int)getX() + pixelSize*11, (int)getY() + pixelSize*21, pixelSize*2, pixelSize);
		
		//Middle Green
		g.setColor(new Color(51, 116, 86));
		g.fillRect((int)getX() + pixelSize*2, (int)getY() + pixelSize*5, pixelSize*2, pixelSize);
		g.fillRect((int)getX() + pixelSize*2, (int)getY() + pixelSize*7, pixelSize, pixelSize);
		g.fillRect((int)getX() + pixelSize*6, (int)getY() + pixelSize*5, pixelSize*4, pixelSize);
		g.fillRect((int)getX() + pixelSize*8, (int)getY() + pixelSize*7, pixelSize, pixelSize);
		g.fillRect((int)getX() + pixelSize*9, (int)getY() + pixelSize*8, pixelSize, pixelSize);
		g.fillRect((int)getX() + pixelSize*10, (int)getY() + pixelSize*6, pixelSize, pixelSize);
		g.fillRect((int)getX() + pixelSize*11, (int)getY() + pixelSize, pixelSize, pixelSize);
		g.fillRect((int)getX() + pixelSize*13, (int)getY() + pixelSize*2, pixelSize, pixelSize);
		g.fillRect((int)getX() + pixelSize*14, (int)getY() + pixelSize*3, pixelSize, pixelSize*2);
		g.fillRect((int)getX() + pixelSize*14, (int)getY() + pixelSize*5, pixelSize*2, pixelSize*5);
		g.fillRect((int)getX() + pixelSize*13, (int)getY() + pixelSize*6, pixelSize*2, pixelSize*6);
		g.fillRect((int)getX() + pixelSize*14, (int)getY() + pixelSize*12, pixelSize, pixelSize);
		g.fillRect((int)getX() + pixelSize*12, (int)getY() + pixelSize*10, pixelSize, pixelSize);
		g.fillRect((int)getX() + pixelSize*11, (int)getY() + pixelSize*8, pixelSize, pixelSize*5);
		g.fillRect((int)getX() + pixelSize*10, (int)getY() + pixelSize*9, pixelSize, pixelSize*4);
		g.fillRect((int)getX() + pixelSize*2, (int)getY() + pixelSize*11, pixelSize, pixelSize*2);
		g.fillRect((int)getX() + pixelSize*3, (int)getY() + pixelSize*13, pixelSize, pixelSize);
		g.fillRect((int)getX() + pixelSize*6, (int)getY() + pixelSize*13, pixelSize*4, pixelSize);
		g.fillRect((int)getX() + pixelSize*12, (int)getY() + pixelSize*14, pixelSize, pixelSize);
		g.fillRect((int)getX() + pixelSize*3, (int)getY() + pixelSize*15, pixelSize*2, pixelSize*8);
		g.fillRect((int)getX() + pixelSize*2, (int)getY() + pixelSize*16, pixelSize, pixelSize*7);
		g.fillRect((int)getX() + pixelSize, (int)getY() + pixelSize*17, pixelSize, pixelSize*5);
		g.fillRect((int)getX() + pixelSize*6, (int)getY() + pixelSize*20, pixelSize, pixelSize);
		g.fillRect((int)getX() + pixelSize*7, (int)getY() + pixelSize*17, pixelSize, pixelSize);
		g.fillRect((int)getX() + pixelSize*8, (int)getY() + pixelSize*18, pixelSize, pixelSize);
		g.fillRect((int)getX() + pixelSize*9, (int)getY() + pixelSize*15, pixelSize*5, pixelSize);
		g.fillRect((int)getX() + pixelSize*11, (int)getY() + pixelSize*16, pixelSize*3, pixelSize);
		g.fillRect((int)getX() + pixelSize*11, (int)getY() + pixelSize*17, pixelSize*2, pixelSize);
		g.fillRect((int)getX() + pixelSize*14, (int)getY() + pixelSize*17, pixelSize*2, pixelSize);
		g.fillRect((int)getX() + pixelSize*11, (int)getY() + pixelSize*18, pixelSize*5, pixelSize*2);
		g.fillRect((int)getX() + pixelSize*12, (int)getY() + pixelSize*20, pixelSize*4, pixelSize);
		g.fillRect((int)getX() + pixelSize*13, (int)getY() + pixelSize*21, pixelSize*3, pixelSize);
		g.fillRect((int)getX() + pixelSize*11, (int)getY() + pixelSize*22, pixelSize*4, pixelSize);
		g.fillRect((int)getX() + pixelSize*10, (int)getY() + pixelSize*21, pixelSize, pixelSize);
		g.fillRect((int)getX() + pixelSize*12, (int)getY() + pixelSize*7, pixelSize, pixelSize);
		
		//Darkest Green
		g.setColor(new Color(34, 75, 60));
		g.fillRect((int)getX() + pixelSize, (int)getY() + pixelSize*21, pixelSize, pixelSize);
		g.fillRect((int)getX() + pixelSize*2, (int)getY() + pixelSize*22, pixelSize, pixelSize);
		g.fillRect((int)getX() + pixelSize*2, (int)getY() + pixelSize*15, pixelSize, pixelSize);
		g.fillRect((int)getX() + pixelSize*7, (int)getY() + pixelSize*15, pixelSize, pixelSize*2);
		g.fillRect((int)getX() + pixelSize*7, (int)getY() + pixelSize*15, pixelSize*2, pixelSize);
		g.fillRect((int)getX() + pixelSize*14, (int)getY() + pixelSize*15, pixelSize, pixelSize*2);
		g.fillRect((int)getX() + pixelSize*13, (int)getY() + pixelSize*17, pixelSize, pixelSize);
		g.fillRect((int)getX() + pixelSize*13, (int)getY() + pixelSize*14, pixelSize, pixelSize);
		g.fillRect((int)getX() + pixelSize*11, (int)getY() + pixelSize*14, pixelSize, pixelSize);
		g.fillRect((int)getX() + pixelSize*5, (int)getY() + pixelSize*16, pixelSize, pixelSize*5);
		g.fillRect((int)getX() + pixelSize*15, (int)getY() + pixelSize*22, pixelSize, pixelSize);
		g.fillRect((int)getX() + pixelSize*4, (int)getY() + pixelSize*13, pixelSize*2, pixelSize);
		g.fillRect((int)getX() + pixelSize*10, (int)getY() + pixelSize*13, pixelSize, pixelSize);
		g.fillRect((int)getX() + pixelSize*14, (int)getY() + pixelSize*13, pixelSize, pixelSize);
		g.fillRect((int)getX() + pixelSize*13, (int)getY() + pixelSize*12, pixelSize, pixelSize);
		g.fillRect((int)getX() + pixelSize*12, (int)getY() + pixelSize*11, pixelSize, pixelSize);
		g.fillRect((int)getX() + pixelSize*12, (int)getY() + pixelSize*11, pixelSize, pixelSize);
		g.fillRect((int)getX() + pixelSize*9, (int)getY() + pixelSize*12, pixelSize, pixelSize);
		g.fillRect((int)getX() + pixelSize*15, (int)getY() + pixelSize*10, pixelSize, pixelSize);
		g.fillRect((int)getX() + pixelSize*12, (int)getY() + pixelSize*8, pixelSize, pixelSize*2);
		g.fillRect((int)getX() + pixelSize*11, (int)getY() + pixelSize*7, pixelSize, pixelSize);
		
		g.setColor(Color.RED);
		g.fillRect((int)getX() + pixelSize*4, (int)getY() + pixelSize*8, pixelSize, pixelSize);
		g.fillRect((int)getX() + pixelSize*7, (int)getY() + pixelSize*8, pixelSize, pixelSize);
		g.fillRect((int)getX() + pixelSize*4, (int)getY() + pixelSize*10, pixelSize, pixelSize);
		g.fillRect((int)getX() + pixelSize*7, (int)getY() + pixelSize*10, pixelSize, pixelSize);
		
		g.setColor(Color.YELLOW);
		g.fillRect((int)getX() + pixelSize*5, (int)getY() + pixelSize*14, pixelSize, pixelSize);
	}
	
	/**
	 * Draws the mage while facing right, 17x24
	 * @param g the Graphics object
	 */
	public void drawRightMage(Graphics g) {
		g.setColor(Color.BLACK);
		g.fillRect((int)getX(), (int)getY() + pixelSize*5, pixelSize, pixelSize*6);
		g.fillRect((int)getX() + pixelSize, (int)getY() + pixelSize*11, pixelSize, pixelSize*6);
		g.fillRect((int)getX(), (int)getY() + pixelSize*17, pixelSize, pixelSize*6);
		g.fillRect((int)getX() + pixelSize, (int)getY() + pixelSize*23, pixelSize*8, pixelSize);
		g.fillRect((int)getX() + pixelSize*2, (int)getY() + pixelSize*14, pixelSize, pixelSize);
		g.fillRect((int)getX() + pixelSize*3, (int)getY() + pixelSize*13, pixelSize*3, pixelSize);
		g.fillRect((int)getX() + pixelSize*4, (int)getY() + pixelSize*12, pixelSize, pixelSize);
		g.fillRect((int)getX() + pixelSize, (int)getY() + pixelSize*3, pixelSize, pixelSize*2);
		g.fillRect((int)getX() + pixelSize*2, (int)getY() + pixelSize*2, pixelSize, pixelSize);
		g.fillRect((int)getX() + pixelSize*3, (int)getY() + pixelSize, pixelSize*2, pixelSize);
		g.fillRect((int)getX() + pixelSize*5, (int)getY(), pixelSize*6, pixelSize);
		g.fillRect((int)getX() + pixelSize*11, (int)getY() + pixelSize, pixelSize*2, pixelSize);
		g.fillRect((int)getX() + pixelSize*13, (int)getY() + pixelSize*2, pixelSize, pixelSize);
		g.fillRect((int)getX() + pixelSize*14, (int)getY() + pixelSize*3, pixelSize, pixelSize*2);
		g.fillRect((int)getX() + pixelSize*15, (int)getY() + pixelSize*5, pixelSize, pixelSize*3);
		g.fillRect((int)getX() + pixelSize*14, (int)getY() + pixelSize*8, pixelSize, pixelSize);
		g.fillRect((int)getX() + pixelSize*6, (int)getY() + pixelSize*14, pixelSize*5, pixelSize);
		g.fillRect((int)getX() + pixelSize*10, (int)getY() + pixelSize*15, pixelSize*2, pixelSize);
		g.fillRect((int)getX() + pixelSize*12, (int)getY() + pixelSize*14, pixelSize*3, pixelSize);
		g.fillRect((int)getX() + pixelSize*9, (int)getY() + pixelSize*22, pixelSize*3, pixelSize);
		g.fillRect((int)getX() + pixelSize*10, (int)getY() + pixelSize*21, pixelSize*2, pixelSize);
		g.fillRect((int)getX() + pixelSize*14, (int)getY() + pixelSize*10, pixelSize, pixelSize);
		g.fillRect((int)getX() + pixelSize*15, (int)getY() + pixelSize*11, pixelSize, pixelSize*3);
		g.fillRect((int)getX() + pixelSize*14, (int)getY() + pixelSize*13, pixelSize, pixelSize);
		g.fillRect((int)getX() + pixelSize*11, (int)getY() + pixelSize*23, pixelSize*4, pixelSize);
		g.fillRect((int)getX() + pixelSize*15, (int)getY() + pixelSize*22, pixelSize, pixelSize);
		g.fillRect((int)getX() + pixelSize*15, (int)getY() + pixelSize*15, pixelSize, pixelSize*2);
		g.fillRect((int)getX() + pixelSize*16, (int)getY() + pixelSize*17, pixelSize, pixelSize*5);
		g.fillRect((int)getX() + pixelSize*9, (int)getY() + pixelSize*7, pixelSize*5, pixelSize);
		g.fillRect((int)getX() + pixelSize*10, (int)getY() + pixelSize*8, pixelSize*2, pixelSize*3);
		g.fillRect((int)getX() + pixelSize*7, (int)getY() + pixelSize*9, pixelSize, pixelSize*3);
		g.fillRect((int)getX() + pixelSize*8, (int)getY() + pixelSize*8, pixelSize, pixelSize*5);
		g.fillRect((int)getX() + pixelSize*8, (int)getY() + pixelSize*11, pixelSize*6, pixelSize*2);
		g.fillRect((int)getX() + pixelSize*7, (int)getY() + pixelSize*9, pixelSize*7, pixelSize);
		g.fillRect((int)getX() + pixelSize*13, (int)getY() + pixelSize*8, pixelSize, pixelSize*3);
		
		//Lightest Green
		g.setColor(new Color(55, 145, 89));
		g.fillRect((int)getX() + pixelSize*3, (int)getY() + pixelSize*3, pixelSize*11, pixelSize*2);
		g.fillRect((int)getX() + pixelSize*4, (int)getY() + pixelSize*2, pixelSize*9, pixelSize*2);
		g.fillRect((int)getX() + pixelSize*6, (int)getY() + pixelSize, pixelSize*5, pixelSize);
		g.fillRect((int)getX() + pixelSize*3, (int)getY() + pixelSize*5, pixelSize*4, pixelSize);
		g.fillRect((int)getX() + pixelSize*11, (int)getY() + pixelSize*5, pixelSize*2, pixelSize);
		g.fillRect((int)getX() + pixelSize*4, (int)getY() + pixelSize*6, pixelSize*2, pixelSize);
		g.fillRect((int)getX() + pixelSize*7, (int)getY() + pixelSize*6, pixelSize*8, pixelSize);
		g.fillRect((int)getX() + pixelSize*7, (int)getY() + pixelSize*6, pixelSize, pixelSize*2);
		g.fillRect((int)getX() + pixelSize*6, (int)getY() + pixelSize*7, pixelSize*2, pixelSize);
		g.fillRect((int)getX() + pixelSize*6, (int)getY() + pixelSize*7, pixelSize, pixelSize*2);
		g.fillRect((int)getX() + pixelSize*6, (int)getY() + pixelSize*16, pixelSize*3, pixelSize*2);
		g.fillRect((int)getX() + pixelSize*6, (int)getY() + pixelSize*16, pixelSize*2, pixelSize*5);
		g.fillRect((int)getX() + pixelSize*4, (int)getY() + pixelSize*21, pixelSize, pixelSize);
		g.fillRect((int)getX() + pixelSize*5, (int)getY() + pixelSize*20, pixelSize, pixelSize*2);
		g.fillRect((int)getX() + pixelSize*6, (int)getY() + pixelSize*22, pixelSize*3, pixelSize);
		g.fillRect((int)getX() + pixelSize*7, (int)getY() + pixelSize*19, pixelSize*3, pixelSize*3);
		g.fillRect((int)getX() + pixelSize*9, (int)getY() + pixelSize*18, pixelSize, pixelSize);
		g.fillRect((int)getX() + pixelSize*10, (int)getY() + pixelSize*16, pixelSize, pixelSize*4);
		
		//Middle Green
		g.setColor(new Color(51, 116, 86));
		g.fillRect((int)getX() + pixelSize*5, (int)getY() + pixelSize, pixelSize, pixelSize);
		g.fillRect((int)getX() + pixelSize*3, (int)getY() + pixelSize*2, pixelSize, pixelSize);
		g.fillRect((int)getX() + pixelSize, (int)getY() + pixelSize*5, pixelSize, pixelSize*5);
		g.fillRect((int)getX() + pixelSize*2, (int)getY() + pixelSize*3, pixelSize, pixelSize*10);
		g.fillRect((int)getX() + pixelSize*3, (int)getY() + pixelSize*6, pixelSize, pixelSize*6);
		g.fillRect((int)getX() + pixelSize*4, (int)getY() + pixelSize*7, pixelSize, pixelSize);
		g.fillRect((int)getX() + pixelSize*4, (int)getY() + pixelSize*10, pixelSize, pixelSize);
		g.fillRect((int)getX() + pixelSize*5, (int)getY() + pixelSize*8, pixelSize, pixelSize*5);
		g.fillRect((int)getX() + pixelSize*6, (int)getY() + pixelSize*9, pixelSize, pixelSize*4);
		g.fillRect((int)getX() + pixelSize*6, (int)getY() + pixelSize*6, pixelSize, pixelSize);
		g.fillRect((int)getX() + pixelSize*7, (int)getY() + pixelSize*5, pixelSize*4, pixelSize);
		g.fillRect((int)getX() + pixelSize*7, (int)getY() + pixelSize*8, pixelSize, pixelSize);
		g.fillRect((int)getX() + pixelSize*8, (int)getY() + pixelSize*7, pixelSize, pixelSize);
		g.fillRect((int)getX() + pixelSize*7, (int)getY() + pixelSize*13, pixelSize*4, pixelSize);
		g.fillRect((int)getX() + pixelSize*13, (int)getY() + pixelSize*13, pixelSize, pixelSize);
		g.fillRect((int)getX() + pixelSize*14, (int)getY() + pixelSize*11, pixelSize, pixelSize*2);
		g.fillRect((int)getX() + pixelSize*13, (int)getY() + pixelSize*5, pixelSize*2, pixelSize);
		g.fillRect((int)getX() + pixelSize*14, (int)getY() + pixelSize*7, pixelSize, pixelSize);
		g.fillRect((int)getX() + pixelSize*4, (int)getY() + pixelSize*14, pixelSize, pixelSize);
		g.fillRect((int)getX() + pixelSize*3, (int)getY() + pixelSize*15, pixelSize*5, pixelSize);
		g.fillRect((int)getX() + pixelSize*3, (int)getY() + pixelSize*15, pixelSize*3, pixelSize*2);
		g.fillRect((int)getX() + pixelSize, (int)getY() + pixelSize*17, pixelSize*2, pixelSize*5);
		g.fillRect((int)getX() + pixelSize*2, (int)getY() + pixelSize*22, pixelSize*4, pixelSize);
		g.fillRect((int)getX() + pixelSize*3, (int)getY() + pixelSize*18, pixelSize, pixelSize*4);
		g.fillRect((int)getX() + pixelSize*4, (int)getY() + pixelSize*17, pixelSize, pixelSize*4);
		g.fillRect((int)getX() + pixelSize*5, (int)getY() + pixelSize*17, pixelSize, pixelSize*3);
		g.fillRect((int)getX() + pixelSize*6, (int)getY() + pixelSize*21, pixelSize, pixelSize);
		g.fillRect((int)getX() + pixelSize*8, (int)getY() + pixelSize*18, pixelSize, pixelSize);
		g.fillRect((int)getX() + pixelSize*9, (int)getY() + pixelSize*17, pixelSize, pixelSize);
		g.fillRect((int)getX() + pixelSize*10, (int)getY() + pixelSize*20, pixelSize, pixelSize);
		g.fillRect((int)getX() + pixelSize*12, (int)getY() + pixelSize*15, pixelSize*2, pixelSize*8);
		g.fillRect((int)getX() + pixelSize*14, (int)getY() + pixelSize*16, pixelSize, pixelSize*6);
		g.fillRect((int)getX() + pixelSize*15, (int)getY() + pixelSize*17, pixelSize, pixelSize*4);
		
		//Darkest Green
		g.setColor(new Color(34, 75, 60));
		g.fillRect((int)getX() + pixelSize, (int)getY() + pixelSize*10, pixelSize, pixelSize);
		g.fillRect((int)getX() + pixelSize*2, (int)getY() + pixelSize*13, pixelSize, pixelSize);
		g.fillRect((int)getX() + pixelSize*2, (int)getY() + pixelSize*15, pixelSize, pixelSize*2);
		g.fillRect((int)getX() + pixelSize, (int)getY() + pixelSize*22, pixelSize, pixelSize);
		g.fillRect((int)getX() + pixelSize*3, (int)getY() + pixelSize*14, pixelSize, pixelSize);
		g.fillRect((int)getX() + pixelSize*3, (int)getY() + pixelSize*17, pixelSize, pixelSize);
		g.fillRect((int)getX() + pixelSize*5, (int)getY() + pixelSize*14, pixelSize, pixelSize);
		g.fillRect((int)getX() + pixelSize*3, (int)getY() + pixelSize*12, pixelSize, pixelSize);
		g.fillRect((int)getX() + pixelSize*4, (int)getY() + pixelSize*11, pixelSize, pixelSize);
		g.fillRect((int)getX() + pixelSize*4, (int)getY() + pixelSize*8, pixelSize, pixelSize*2);
		g.fillRect((int)getX() + pixelSize*5, (int)getY() + pixelSize*7, pixelSize, pixelSize);
		g.fillRect((int)getX() + pixelSize*6, (int)getY() + pixelSize*13, pixelSize, pixelSize);
		g.fillRect((int)getX() + pixelSize*7, (int)getY() + pixelSize*12, pixelSize, pixelSize);
		g.fillRect((int)getX() + pixelSize*11, (int)getY() + pixelSize*13, pixelSize*2, pixelSize);
		g.fillRect((int)getX() + pixelSize*11, (int)getY() + pixelSize*16, pixelSize, pixelSize*5);
		g.fillRect((int)getX() + pixelSize*8, (int)getY() + pixelSize*15, pixelSize*2, pixelSize);
		g.fillRect((int)getX() + pixelSize*9, (int)getY() + pixelSize*16, pixelSize, pixelSize);
		g.fillRect((int)getX() + pixelSize*14, (int)getY() + pixelSize*15, pixelSize, pixelSize);
		g.fillRect((int)getX() + pixelSize*14, (int)getY() + pixelSize*22, pixelSize, pixelSize);
		g.fillRect((int)getX() + pixelSize*15, (int)getY() + pixelSize*21, pixelSize, pixelSize);
		
		g.setColor(Color.RED);
		g.fillRect((int)getX() + pixelSize*9, (int)getY() + pixelSize*8, pixelSize, pixelSize);
		g.fillRect((int)getX() + pixelSize*12, (int)getY() + pixelSize*8, pixelSize, pixelSize);
		g.fillRect((int)getX() + pixelSize*9, (int)getY() + pixelSize*10, pixelSize, pixelSize);
		g.fillRect((int)getX() + pixelSize*12, (int)getY() + pixelSize*10, pixelSize, pixelSize);
		
		g.setColor(Color.YELLOW);
		g.fillRect((int)getX() + pixelSize*11, (int)getY() + pixelSize*14, pixelSize, pixelSize);
	}
	
	/**
	 * Draws mage while facing left but in white
	 * @param g the Graphics object
	 */
	public void drawLeftWhite(Graphics g) {
		g.setColor(Color.WHITE);
		g.fillRect((int)getX() + pixelSize*6, (int)getY(), pixelSize*6, pixelSize);
		g.fillRect((int)getX() + pixelSize*4, (int)getY() + pixelSize, pixelSize*2, pixelSize);
		g.fillRect((int)getX() + pixelSize*12, (int)getY() + pixelSize, pixelSize*2, pixelSize);
		g.fillRect((int)getX() + pixelSize*3, (int)getY() + pixelSize*2, pixelSize, pixelSize);
		g.fillRect((int)getX() + pixelSize*14, (int)getY() + pixelSize*2, pixelSize, pixelSize);
		g.fillRect((int)getX() + pixelSize*2, (int)getY() + pixelSize*3, pixelSize, pixelSize*2);
		g.fillRect((int)getX() + pixelSize*15, (int)getY() + pixelSize*3, pixelSize, pixelSize*2);
		g.fillRect((int)getX() + pixelSize, (int)getY() + pixelSize*5, pixelSize, pixelSize*3);
		g.fillRect((int)getX() + pixelSize*16, (int)getY() + pixelSize*5, pixelSize, pixelSize*6);
		g.fillRect((int)getX() + pixelSize, (int)getY() + pixelSize*11, pixelSize, pixelSize*3);
		g.fillRect((int)getX() + pixelSize*2, (int)getY() + pixelSize*8, pixelSize, pixelSize);
		g.fillRect((int)getX() + pixelSize*2, (int)getY() + pixelSize*10, pixelSize, pixelSize);
		g.fillRect((int)getX() + pixelSize*3, (int)getY() + pixelSize*7, pixelSize*5, pixelSize);
		g.fillRect((int)getX() + pixelSize*3, (int)getY() + pixelSize*7, pixelSize, pixelSize*6);
		g.fillRect((int)getX() + pixelSize*3, (int)getY() + pixelSize*11, pixelSize*6, pixelSize*2);
		g.fillRect((int)getX() + pixelSize*3, (int)getY() + pixelSize*9, pixelSize*7, pixelSize);
		g.fillRect((int)getX() + pixelSize*5, (int)getY() + pixelSize*8, pixelSize*2, pixelSize*3);
		g.fillRect((int)getX() + pixelSize*8, (int)getY() + pixelSize*8, pixelSize, pixelSize);
		g.fillRect((int)getX() + pixelSize*8, (int)getY() + pixelSize*9, pixelSize*2, pixelSize*3);
		g.fillRect((int)getX() + pixelSize, (int)getY() + pixelSize*13, pixelSize*2, pixelSize);
		g.fillRect((int)getX() + pixelSize*2, (int)getY() + pixelSize*14, pixelSize*3, pixelSize);
		g.fillRect((int)getX() + pixelSize, (int)getY() + pixelSize*15, pixelSize, pixelSize*2);
		g.fillRect((int)getX(), (int)getY() + pixelSize*17, pixelSize, pixelSize*5);
		g.fillRect((int)getX() + pixelSize, (int)getY() + pixelSize*22, pixelSize, pixelSize);
		g.fillRect((int)getX() + pixelSize*2, (int)getY() + pixelSize*23, pixelSize*4, pixelSize);
		g.fillRect((int)getX() + pixelSize*5, (int)getY() + pixelSize*21, pixelSize*2, pixelSize*2);
		g.fillRect((int)getX() + pixelSize*5, (int)getY() + pixelSize*22, pixelSize*3, pixelSize);
		g.fillRect((int)getX() + pixelSize*8, (int)getY() + pixelSize*23, pixelSize*8, pixelSize);
		g.fillRect((int)getX() + pixelSize*16, (int)getY() + pixelSize*17, pixelSize, pixelSize*6);
		g.fillRect((int)getX() + pixelSize*5, (int)getY() + pixelSize*15, pixelSize*2, pixelSize);
		g.fillRect((int)getX() + pixelSize*6, (int)getY() + pixelSize*14, pixelSize*5, pixelSize);
		g.fillRect((int)getX() + pixelSize*11, (int)getY() + pixelSize*13, pixelSize*3, pixelSize);
		g.fillRect((int)getX() + pixelSize*12, (int)getY() + pixelSize*12, pixelSize, pixelSize);
		g.fillRect((int)getX() + pixelSize*14, (int)getY() + pixelSize*14, pixelSize, pixelSize);
		g.fillRect((int)getX() + pixelSize*15, (int)getY() + pixelSize*11, pixelSize, pixelSize*6);
		g.fillRect((int)getX() + pixelSize*2, (int)getY() + pixelSize*6, pixelSize*8, pixelSize);
		g.fillRect((int)getX() + pixelSize*9, (int)getY() + pixelSize*6, pixelSize, pixelSize*2);
		g.fillRect((int)getX() + pixelSize*10, (int)getY() + pixelSize*7, pixelSize, pixelSize*2);
		g.fillRect((int)getX() + pixelSize*3, (int)getY() + pixelSize*3, pixelSize*11, pixelSize*2);
		g.fillRect((int)getX() + pixelSize*4, (int)getY() + pixelSize*5, pixelSize*2, pixelSize);
		g.fillRect((int)getX() + pixelSize*10, (int)getY() + pixelSize*5, pixelSize*4, pixelSize);
		g.fillRect((int)getX() + pixelSize*11, (int)getY() + pixelSize*6, pixelSize*2, pixelSize);
		g.fillRect((int)getX() + pixelSize*4, (int)getY() + pixelSize*2, pixelSize*9, pixelSize);
		g.fillRect((int)getX() + pixelSize*6, (int)getY() + pixelSize, pixelSize*5, pixelSize);
		g.fillRect((int)getX() + pixelSize*6, (int)getY() + pixelSize*16, pixelSize, pixelSize*4);
		g.fillRect((int)getX() + pixelSize*7, (int)getY() + pixelSize*18, pixelSize, pixelSize*4);
		g.fillRect((int)getX() + pixelSize*8, (int)getY() + pixelSize*16, pixelSize*3, pixelSize*2);
		g.fillRect((int)getX() + pixelSize*8, (int)getY() + pixelSize*22, pixelSize*3, pixelSize);
		g.fillRect((int)getX() + pixelSize*8, (int)getY() + pixelSize*19, pixelSize*2, pixelSize*3);
		g.fillRect((int)getX() + pixelSize*9, (int)getY() + pixelSize*18, pixelSize*2, pixelSize*3);
		g.fillRect((int)getX() + pixelSize*11, (int)getY() + pixelSize*20, pixelSize, pixelSize);
		g.fillRect((int)getX() + pixelSize*11, (int)getY() + pixelSize*21, pixelSize*2, pixelSize);
		g.fillRect((int)getX() + pixelSize*2, (int)getY() + pixelSize*5, pixelSize*2, pixelSize);
		g.fillRect((int)getX() + pixelSize*2, (int)getY() + pixelSize*7, pixelSize, pixelSize);
		g.fillRect((int)getX() + pixelSize*6, (int)getY() + pixelSize*5, pixelSize*4, pixelSize);
		g.fillRect((int)getX() + pixelSize*8, (int)getY() + pixelSize*7, pixelSize, pixelSize);
		g.fillRect((int)getX() + pixelSize*9, (int)getY() + pixelSize*8, pixelSize, pixelSize);
		g.fillRect((int)getX() + pixelSize*10, (int)getY() + pixelSize*6, pixelSize, pixelSize);
		g.fillRect((int)getX() + pixelSize*11, (int)getY() + pixelSize, pixelSize, pixelSize);
		g.fillRect((int)getX() + pixelSize*13, (int)getY() + pixelSize*2, pixelSize, pixelSize);
		g.fillRect((int)getX() + pixelSize*14, (int)getY() + pixelSize*3, pixelSize, pixelSize*2);
		g.fillRect((int)getX() + pixelSize*14, (int)getY() + pixelSize*5, pixelSize*2, pixelSize*5);
		g.fillRect((int)getX() + pixelSize*13, (int)getY() + pixelSize*6, pixelSize*2, pixelSize*6);
		g.fillRect((int)getX() + pixelSize*14, (int)getY() + pixelSize*12, pixelSize, pixelSize);
		g.fillRect((int)getX() + pixelSize*12, (int)getY() + pixelSize*10, pixelSize, pixelSize);
		g.fillRect((int)getX() + pixelSize*11, (int)getY() + pixelSize*8, pixelSize, pixelSize*5);
		g.fillRect((int)getX() + pixelSize*10, (int)getY() + pixelSize*9, pixelSize, pixelSize*4);
		g.fillRect((int)getX() + pixelSize*2, (int)getY() + pixelSize*11, pixelSize, pixelSize*2);
		g.fillRect((int)getX() + pixelSize*3, (int)getY() + pixelSize*13, pixelSize, pixelSize);
		g.fillRect((int)getX() + pixelSize*6, (int)getY() + pixelSize*13, pixelSize*4, pixelSize);
		g.fillRect((int)getX() + pixelSize*12, (int)getY() + pixelSize*14, pixelSize, pixelSize);
		g.fillRect((int)getX() + pixelSize*3, (int)getY() + pixelSize*15, pixelSize*2, pixelSize*8);
		g.fillRect((int)getX() + pixelSize*2, (int)getY() + pixelSize*16, pixelSize, pixelSize*7);
		g.fillRect((int)getX() + pixelSize, (int)getY() + pixelSize*17, pixelSize, pixelSize*5);
		g.fillRect((int)getX() + pixelSize*6, (int)getY() + pixelSize*20, pixelSize, pixelSize);
		g.fillRect((int)getX() + pixelSize*7, (int)getY() + pixelSize*17, pixelSize, pixelSize);
		g.fillRect((int)getX() + pixelSize*8, (int)getY() + pixelSize*18, pixelSize, pixelSize);
		g.fillRect((int)getX() + pixelSize*9, (int)getY() + pixelSize*15, pixelSize*5, pixelSize);
		g.fillRect((int)getX() + pixelSize*11, (int)getY() + pixelSize*16, pixelSize*3, pixelSize);
		g.fillRect((int)getX() + pixelSize*11, (int)getY() + pixelSize*17, pixelSize*2, pixelSize);
		g.fillRect((int)getX() + pixelSize*14, (int)getY() + pixelSize*17, pixelSize*2, pixelSize);
		g.fillRect((int)getX() + pixelSize*11, (int)getY() + pixelSize*18, pixelSize*5, pixelSize*2);
		g.fillRect((int)getX() + pixelSize*12, (int)getY() + pixelSize*20, pixelSize*4, pixelSize);
		g.fillRect((int)getX() + pixelSize*13, (int)getY() + pixelSize*21, pixelSize*3, pixelSize);
		g.fillRect((int)getX() + pixelSize*11, (int)getY() + pixelSize*22, pixelSize*4, pixelSize);
		g.fillRect((int)getX() + pixelSize*10, (int)getY() + pixelSize*21, pixelSize, pixelSize);
		g.fillRect((int)getX() + pixelSize*12, (int)getY() + pixelSize*7, pixelSize, pixelSize);
		g.fillRect((int)getX() + pixelSize, (int)getY() + pixelSize*21, pixelSize, pixelSize);
		g.fillRect((int)getX() + pixelSize*2, (int)getY() + pixelSize*22, pixelSize, pixelSize);
		g.fillRect((int)getX() + pixelSize*2, (int)getY() + pixelSize*15, pixelSize, pixelSize);
		g.fillRect((int)getX() + pixelSize*7, (int)getY() + pixelSize*15, pixelSize, pixelSize*2);
		g.fillRect((int)getX() + pixelSize*7, (int)getY() + pixelSize*15, pixelSize*2, pixelSize);
		g.fillRect((int)getX() + pixelSize*14, (int)getY() + pixelSize*15, pixelSize, pixelSize*2);
		g.fillRect((int)getX() + pixelSize*13, (int)getY() + pixelSize*17, pixelSize, pixelSize);
		g.fillRect((int)getX() + pixelSize*13, (int)getY() + pixelSize*14, pixelSize, pixelSize);
		g.fillRect((int)getX() + pixelSize*11, (int)getY() + pixelSize*14, pixelSize, pixelSize);
		g.fillRect((int)getX() + pixelSize*5, (int)getY() + pixelSize*16, pixelSize, pixelSize*5);
		g.fillRect((int)getX() + pixelSize*15, (int)getY() + pixelSize*22, pixelSize, pixelSize);
		g.fillRect((int)getX() + pixelSize*4, (int)getY() + pixelSize*13, pixelSize*2, pixelSize);
		g.fillRect((int)getX() + pixelSize*10, (int)getY() + pixelSize*13, pixelSize, pixelSize);
		g.fillRect((int)getX() + pixelSize*14, (int)getY() + pixelSize*13, pixelSize, pixelSize);
		g.fillRect((int)getX() + pixelSize*13, (int)getY() + pixelSize*12, pixelSize, pixelSize);
		g.fillRect((int)getX() + pixelSize*12, (int)getY() + pixelSize*11, pixelSize, pixelSize);
		g.fillRect((int)getX() + pixelSize*12, (int)getY() + pixelSize*11, pixelSize, pixelSize);
		g.fillRect((int)getX() + pixelSize*9, (int)getY() + pixelSize*12, pixelSize, pixelSize);
		g.fillRect((int)getX() + pixelSize*15, (int)getY() + pixelSize*10, pixelSize, pixelSize);
		g.fillRect((int)getX() + pixelSize*12, (int)getY() + pixelSize*8, pixelSize, pixelSize*2);
		g.fillRect((int)getX() + pixelSize*11, (int)getY() + pixelSize*7, pixelSize, pixelSize);
		g.fillRect((int)getX() + pixelSize*4, (int)getY() + pixelSize*8, pixelSize, pixelSize);
		g.fillRect((int)getX() + pixelSize*7, (int)getY() + pixelSize*8, pixelSize, pixelSize);
		g.fillRect((int)getX() + pixelSize*4, (int)getY() + pixelSize*10, pixelSize, pixelSize);
		g.fillRect((int)getX() + pixelSize*7, (int)getY() + pixelSize*10, pixelSize, pixelSize);
		g.fillRect((int)getX() + pixelSize*5, (int)getY() + pixelSize*14, pixelSize, pixelSize);
	}
	
	/**
	 * Draws mage while facing right but in white
	 * @param g the Graphics object
	 */
	public void drawRightWhite(Graphics g) {
		g.setColor(Color.WHITE);
		g.fillRect((int)getX(), (int)getY() + pixelSize*5, pixelSize, pixelSize*6);
		g.fillRect((int)getX() + pixelSize, (int)getY() + pixelSize*11, pixelSize, pixelSize*6);
		g.fillRect((int)getX(), (int)getY() + pixelSize*17, pixelSize, pixelSize*6);
		g.fillRect((int)getX() + pixelSize, (int)getY() + pixelSize*23, pixelSize*8, pixelSize);
		g.fillRect((int)getX() + pixelSize*2, (int)getY() + pixelSize*14, pixelSize, pixelSize);
		g.fillRect((int)getX() + pixelSize*3, (int)getY() + pixelSize*13, pixelSize*3, pixelSize);
		g.fillRect((int)getX() + pixelSize*4, (int)getY() + pixelSize*12, pixelSize, pixelSize);
		g.fillRect((int)getX() + pixelSize, (int)getY() + pixelSize*3, pixelSize, pixelSize*2);
		g.fillRect((int)getX() + pixelSize*2, (int)getY() + pixelSize*2, pixelSize, pixelSize);
		g.fillRect((int)getX() + pixelSize*3, (int)getY() + pixelSize, pixelSize*2, pixelSize);
		g.fillRect((int)getX() + pixelSize*5, (int)getY(), pixelSize*6, pixelSize);
		g.fillRect((int)getX() + pixelSize*11, (int)getY() + pixelSize, pixelSize*2, pixelSize);
		g.fillRect((int)getX() + pixelSize*13, (int)getY() + pixelSize*2, pixelSize, pixelSize);
		g.fillRect((int)getX() + pixelSize*14, (int)getY() + pixelSize*3, pixelSize, pixelSize*2);
		g.fillRect((int)getX() + pixelSize*15, (int)getY() + pixelSize*5, pixelSize, pixelSize*3);
		g.fillRect((int)getX() + pixelSize*14, (int)getY() + pixelSize*8, pixelSize, pixelSize);
		g.fillRect((int)getX() + pixelSize*6, (int)getY() + pixelSize*14, pixelSize*5, pixelSize);
		g.fillRect((int)getX() + pixelSize*10, (int)getY() + pixelSize*15, pixelSize*2, pixelSize);
		g.fillRect((int)getX() + pixelSize*12, (int)getY() + pixelSize*14, pixelSize*3, pixelSize);
		g.fillRect((int)getX() + pixelSize*9, (int)getY() + pixelSize*22, pixelSize*3, pixelSize);
		g.fillRect((int)getX() + pixelSize*10, (int)getY() + pixelSize*21, pixelSize*2, pixelSize);
		g.fillRect((int)getX() + pixelSize*14, (int)getY() + pixelSize*10, pixelSize, pixelSize);
		g.fillRect((int)getX() + pixelSize*15, (int)getY() + pixelSize*11, pixelSize, pixelSize*3);
		g.fillRect((int)getX() + pixelSize*14, (int)getY() + pixelSize*13, pixelSize, pixelSize);
		g.fillRect((int)getX() + pixelSize*11, (int)getY() + pixelSize*23, pixelSize*4, pixelSize);
		g.fillRect((int)getX() + pixelSize*15, (int)getY() + pixelSize*22, pixelSize, pixelSize);
		g.fillRect((int)getX() + pixelSize*15, (int)getY() + pixelSize*15, pixelSize, pixelSize*2);
		g.fillRect((int)getX() + pixelSize*16, (int)getY() + pixelSize*17, pixelSize, pixelSize*5);
		g.fillRect((int)getX() + pixelSize*9, (int)getY() + pixelSize*7, pixelSize*5, pixelSize);
		g.fillRect((int)getX() + pixelSize*10, (int)getY() + pixelSize*8, pixelSize*2, pixelSize*3);
		g.fillRect((int)getX() + pixelSize*7, (int)getY() + pixelSize*9, pixelSize, pixelSize*3);
		g.fillRect((int)getX() + pixelSize*8, (int)getY() + pixelSize*8, pixelSize, pixelSize*5);
		g.fillRect((int)getX() + pixelSize*8, (int)getY() + pixelSize*11, pixelSize*6, pixelSize*2);
		g.fillRect((int)getX() + pixelSize*7, (int)getY() + pixelSize*9, pixelSize*7, pixelSize);
		g.fillRect((int)getX() + pixelSize*13, (int)getY() + pixelSize*8, pixelSize, pixelSize*3);
		g.fillRect((int)getX() + pixelSize*3, (int)getY() + pixelSize*3, pixelSize*11, pixelSize*2);
		g.fillRect((int)getX() + pixelSize*4, (int)getY() + pixelSize*2, pixelSize*9, pixelSize*2);
		g.fillRect((int)getX() + pixelSize*6, (int)getY() + pixelSize, pixelSize*5, pixelSize);
		g.fillRect((int)getX() + pixelSize*3, (int)getY() + pixelSize*5, pixelSize*4, pixelSize);
		g.fillRect((int)getX() + pixelSize*11, (int)getY() + pixelSize*5, pixelSize*2, pixelSize);
		g.fillRect((int)getX() + pixelSize*4, (int)getY() + pixelSize*6, pixelSize*2, pixelSize);
		g.fillRect((int)getX() + pixelSize*7, (int)getY() + pixelSize*6, pixelSize*8, pixelSize);
		g.fillRect((int)getX() + pixelSize*7, (int)getY() + pixelSize*6, pixelSize, pixelSize*2);
		g.fillRect((int)getX() + pixelSize*6, (int)getY() + pixelSize*7, pixelSize*2, pixelSize);
		g.fillRect((int)getX() + pixelSize*6, (int)getY() + pixelSize*7, pixelSize, pixelSize*2);
		g.fillRect((int)getX() + pixelSize*6, (int)getY() + pixelSize*16, pixelSize*3, pixelSize*2);
		g.fillRect((int)getX() + pixelSize*6, (int)getY() + pixelSize*16, pixelSize*2, pixelSize*5);
		g.fillRect((int)getX() + pixelSize*4, (int)getY() + pixelSize*21, pixelSize, pixelSize);
		g.fillRect((int)getX() + pixelSize*5, (int)getY() + pixelSize*20, pixelSize, pixelSize*2);
		g.fillRect((int)getX() + pixelSize*6, (int)getY() + pixelSize*22, pixelSize*3, pixelSize);
		g.fillRect((int)getX() + pixelSize*7, (int)getY() + pixelSize*19, pixelSize*3, pixelSize*3);
		g.fillRect((int)getX() + pixelSize*9, (int)getY() + pixelSize*18, pixelSize, pixelSize);
		g.fillRect((int)getX() + pixelSize*10, (int)getY() + pixelSize*16, pixelSize, pixelSize*4);
		g.fillRect((int)getX() + pixelSize*5, (int)getY() + pixelSize, pixelSize, pixelSize);
		g.fillRect((int)getX() + pixelSize*3, (int)getY() + pixelSize*2, pixelSize, pixelSize);
		g.fillRect((int)getX() + pixelSize, (int)getY() + pixelSize*5, pixelSize, pixelSize*5);
		g.fillRect((int)getX() + pixelSize*2, (int)getY() + pixelSize*3, pixelSize, pixelSize*10);
		g.fillRect((int)getX() + pixelSize*3, (int)getY() + pixelSize*6, pixelSize, pixelSize*6);
		g.fillRect((int)getX() + pixelSize*4, (int)getY() + pixelSize*7, pixelSize, pixelSize);
		g.fillRect((int)getX() + pixelSize*4, (int)getY() + pixelSize*10, pixelSize, pixelSize);
		g.fillRect((int)getX() + pixelSize*5, (int)getY() + pixelSize*8, pixelSize, pixelSize*5);
		g.fillRect((int)getX() + pixelSize*6, (int)getY() + pixelSize*9, pixelSize, pixelSize*4);
		g.fillRect((int)getX() + pixelSize*6, (int)getY() + pixelSize*6, pixelSize, pixelSize);
		g.fillRect((int)getX() + pixelSize*7, (int)getY() + pixelSize*5, pixelSize*4, pixelSize);
		g.fillRect((int)getX() + pixelSize*7, (int)getY() + pixelSize*8, pixelSize, pixelSize);
		g.fillRect((int)getX() + pixelSize*8, (int)getY() + pixelSize*7, pixelSize, pixelSize);
		g.fillRect((int)getX() + pixelSize*7, (int)getY() + pixelSize*13, pixelSize*4, pixelSize);
		g.fillRect((int)getX() + pixelSize*13, (int)getY() + pixelSize*13, pixelSize, pixelSize);
		g.fillRect((int)getX() + pixelSize*14, (int)getY() + pixelSize*11, pixelSize, pixelSize*2);
		g.fillRect((int)getX() + pixelSize*13, (int)getY() + pixelSize*5, pixelSize*2, pixelSize);
		g.fillRect((int)getX() + pixelSize*14, (int)getY() + pixelSize*7, pixelSize, pixelSize);
		g.fillRect((int)getX() + pixelSize*4, (int)getY() + pixelSize*14, pixelSize, pixelSize);
		g.fillRect((int)getX() + pixelSize*3, (int)getY() + pixelSize*15, pixelSize*5, pixelSize);
		g.fillRect((int)getX() + pixelSize*3, (int)getY() + pixelSize*15, pixelSize*3, pixelSize*2);
		g.fillRect((int)getX() + pixelSize, (int)getY() + pixelSize*17, pixelSize*2, pixelSize*5);
		g.fillRect((int)getX() + pixelSize*2, (int)getY() + pixelSize*22, pixelSize*4, pixelSize);
		g.fillRect((int)getX() + pixelSize*3, (int)getY() + pixelSize*18, pixelSize, pixelSize*4);
		g.fillRect((int)getX() + pixelSize*4, (int)getY() + pixelSize*17, pixelSize, pixelSize*4);
		g.fillRect((int)getX() + pixelSize*5, (int)getY() + pixelSize*17, pixelSize, pixelSize*3);
		g.fillRect((int)getX() + pixelSize*6, (int)getY() + pixelSize*21, pixelSize, pixelSize);
		g.fillRect((int)getX() + pixelSize*8, (int)getY() + pixelSize*18, pixelSize, pixelSize);
		g.fillRect((int)getX() + pixelSize*9, (int)getY() + pixelSize*17, pixelSize, pixelSize);
		g.fillRect((int)getX() + pixelSize*10, (int)getY() + pixelSize*20, pixelSize, pixelSize);
		g.fillRect((int)getX() + pixelSize*12, (int)getY() + pixelSize*15, pixelSize*2, pixelSize*8);
		g.fillRect((int)getX() + pixelSize*14, (int)getY() + pixelSize*16, pixelSize, pixelSize*6);
		g.fillRect((int)getX() + pixelSize*15, (int)getY() + pixelSize*17, pixelSize, pixelSize*4);
		g.fillRect((int)getX() + pixelSize, (int)getY() + pixelSize*10, pixelSize, pixelSize);
		g.fillRect((int)getX() + pixelSize*2, (int)getY() + pixelSize*13, pixelSize, pixelSize);
		g.fillRect((int)getX() + pixelSize*2, (int)getY() + pixelSize*15, pixelSize, pixelSize*2);
		g.fillRect((int)getX() + pixelSize, (int)getY() + pixelSize*22, pixelSize, pixelSize);
		g.fillRect((int)getX() + pixelSize*3, (int)getY() + pixelSize*14, pixelSize, pixelSize);
		g.fillRect((int)getX() + pixelSize*3, (int)getY() + pixelSize*17, pixelSize, pixelSize);
		g.fillRect((int)getX() + pixelSize*5, (int)getY() + pixelSize*14, pixelSize, pixelSize);
		g.fillRect((int)getX() + pixelSize*3, (int)getY() + pixelSize*12, pixelSize, pixelSize);
		g.fillRect((int)getX() + pixelSize*4, (int)getY() + pixelSize*11, pixelSize, pixelSize);
		g.fillRect((int)getX() + pixelSize*4, (int)getY() + pixelSize*8, pixelSize, pixelSize*2);
		g.fillRect((int)getX() + pixelSize*5, (int)getY() + pixelSize*7, pixelSize, pixelSize);
		g.fillRect((int)getX() + pixelSize*6, (int)getY() + pixelSize*13, pixelSize, pixelSize);
		g.fillRect((int)getX() + pixelSize*7, (int)getY() + pixelSize*12, pixelSize, pixelSize);
		g.fillRect((int)getX() + pixelSize*11, (int)getY() + pixelSize*13, pixelSize*2, pixelSize);
		g.fillRect((int)getX() + pixelSize*11, (int)getY() + pixelSize*16, pixelSize, pixelSize*5);
		g.fillRect((int)getX() + pixelSize*8, (int)getY() + pixelSize*15, pixelSize*2, pixelSize);
		g.fillRect((int)getX() + pixelSize*9, (int)getY() + pixelSize*16, pixelSize, pixelSize);
		g.fillRect((int)getX() + pixelSize*14, (int)getY() + pixelSize*15, pixelSize, pixelSize);
		g.fillRect((int)getX() + pixelSize*14, (int)getY() + pixelSize*22, pixelSize, pixelSize);
		g.fillRect((int)getX() + pixelSize*15, (int)getY() + pixelSize*21, pixelSize, pixelSize);
		g.fillRect((int)getX() + pixelSize*9, (int)getY() + pixelSize*8, pixelSize, pixelSize);
		g.fillRect((int)getX() + pixelSize*12, (int)getY() + pixelSize*8, pixelSize, pixelSize);
		g.fillRect((int)getX() + pixelSize*9, (int)getY() + pixelSize*10, pixelSize, pixelSize);
		g.fillRect((int)getX() + pixelSize*12, (int)getY() + pixelSize*10, pixelSize, pixelSize);
		g.fillRect((int)getX() + pixelSize*11, (int)getY() + pixelSize*14, pixelSize, pixelSize);
	}
	/**
	 * detects whether a FireBall intersects with Mage, returns true or false
	 * @param fireball the FireBall which hits intersects with the Mage
	 * @return returns true or false
	 */
	public boolean fireBallHits(FireBall fireball) {
		if(fireball.getX() + fireball.getPixelSize()*10 > getX() && fireball.getX() + fireball.getPixelSize()*10 < getX() + getPixelSize()*17 && fireball.getY() + fireball.getPixelSize()*12 > getY() && fireball.getY() + fireball.getPixelSize()*12 < getY() + getPixelSize()*24) {
			return true;
		}
		
		else if(fireball.getX() > getX() && fireball.getX() < getX() + getPixelSize()*9 && fireball.getY() > getY() && fireball.getY() < getY() + getPixelSize()*24) {
			return true;
		}
		
		else if(fireball.getX() + fireball.getPixelSize()*20 > getX() && fireball.getX() + fireball.getPixelSize()*20 < getX() + getPixelSize()*17 && fireball.getY() + fireball.getPixelSize()*24 > getY() && fireball.getY() + fireball.getPixelSize()*24 < getY() + getPixelSize()*24) {
			return true;
		}
		
		else {
			return false;
		}
	}

	/**
	 * detects whether a fireball is going to impact the Mage from below, returns true if true, false otherwise
	 * @param fireball the object being compared against
	 * @return returns true if a FireBall will collide with Mage
	 */
	public boolean fireballBelow(FireBall fireball) {
		if(fireball.getDirection() == 1 && getX() + getPixelSize()*8.5 < fireball.getX() + fireball.getPixelSize()*20 && getX() + getPixelSize()*8.5 > fireball.getX()) {
			return true;
		}
		else {
			return false;
		}
	}
	
	/**
	 * detects whether a FireBall will collide with Mage from above
	 * @param fireball the object which will be tested if will collide with Mage
	 * @return returns true if the FireBall is going to collide from above, false if not
	 */
	public boolean fireballAbove(FireBall fireball) {
		if(fireball.getDirection() == 3 && getX() + getPixelSize()*8.5 < fireball.getX() + fireball.getPixelSize()*20 && getX() + getPixelSize()*8.5 > fireball.getX()) {
			return true;
		}
		else {
			return false;
		}
	}
	
	/**
	 * Detects whether a FireBall is going to collide with a Mage
	 * @param fireball the object being tested
	 * @return returns true if the FireBall will collide with the Mage from the Left, false if not
	 */
	public boolean fireballLeft(FireBall fireball) {
		if(fireball.getDirection() == 4 && getY() + getPixelSize()*12 < fireball.getY() + fireball.getPixelSize()*24 && getY() + getPixelSize()*12 > fireball.getY()) {
			return true;
		}
		else {
			return false;
		}
	}
	
	/**
	 * Detects whether a FireBall is going to collide with Mage from the right
	 * @param fireball the object which will be tested 
	 * @return returns true if the FireBall is going to collide with the Mage
	 */
	public boolean fireballRight(FireBall fireball) {
		if(fireball.getDirection() == 2 && getY() + getPixelSize()*12 < fireball.getY() + fireball.getPixelSize()*24 && getY() + getPixelSize()*12 > fireball.getY()) {
			return true;
		}
		else {
			return false;
		}
	}
	
	/**
	 * detects whether there will be a collision with a fireball from any side
	 * @param fireball the object being tested
	 * @return returns true if the mage is going to be hit by a fireball
	 */
	public boolean fireballImpact(FireBall fireball) {
		if(fireballRight(fireball) == true) {
			return true;
		}
		else if(fireballLeft(fireball) == true) {
			return true;
		}
		else if(fireballBelow(fireball) == true) {
			return true;
		}
		else if(fireballAbove(fireball) == true) {
			return true;
		}
		else {
			return false;
		}
	}
	
	/**
	 * sets the electroball's location to the location of the mage
	 * @param electroball the object being moved
	 */
	public void setElectroball(Electroball electroball) {
		electroball.setX((int)getX());
		electroball.setY((int)getY());
	}
}
