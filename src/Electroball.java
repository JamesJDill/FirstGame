import java.awt.Color;
import java.awt.Graphics;

public class Electroball {

	/**
	 * Private variables for Electroball
	 */
	private int pixelSize;
	private double x;
	private double y;
	private double xSpeed;
	private double ySpeed;
	private int direction;
	
	/**
	 * 5 parameter constructor for Electroball, uses FireBall constructor
	 * @param pixelSize the size of each individual pixel
	 * @param x the x-coordinate of the upper-left of the Electroball
	 * @param y the y-coordinate of the upper-left of the Electroball
	 * @param xSpeed the speed of the Electroball in the x direction
	 * @param ySpeed the speed of the Electroball in the y direction
	 */
	public Electroball(int pixelSize, double x, double y, double xSpeed, double ySpeed) {
		this.pixelSize = pixelSize;
		this.x = x;
		this.y = y;
		this.xSpeed = xSpeed;
		this.ySpeed = ySpeed;
		this.direction = 1;
	}
	
	/**
	 * gets the pixelSize
	 * @return returns the pixelSize
	 */
	public double getPixelSize() {
		return pixelSize;
	}
	
	/**
	 * sets the pixelSize
	 * @param pixelSize the size of each pixel
	 */
	public void setPixelSize(int pixelSize) {
		this.pixelSize = pixelSize;
	}
	
	/**
	 * gets the x-coordinate of the upper-left of the Electroball
	 * @return returns the x-coordinate of the upper-left of the Electroball
	 */
	public double getX() {
		return x;
	}
	
	/**
	 * sets the x-coordinate of the upper-left of the Electroball
	 * @param x the x-coordinate of the upper-left of the Electroball
	 */
	public void setX(double x) {
		this.x = x;
	}
	
	/**
	 * gets the y-coordinate of the upper-left of the Electroball
	 * @return returns the y-coordinate of the upper-left of the Electroball
	 */
	public double getY() {
		return y;
	}
	
	/**
	 * sets the y-coordinate of the upper-left of the Electroball
	 * @param y the y-coordinate of the upper-left of the Electroball
	 */
	public void setY(double y) {
		this.y = y;
	}
	
	/**
	 * gets the xSpeed of the Electroball
	 * @return returns the xSpeed of the Electroball
	 */
	public double getXSpeed() {
		return xSpeed;
	}
	
	/**
	 * sets the xSpeed of the Electroball
	 * @param xSpeed the xSpeed of the Electroball
	 */
	public void setXSpeed(double xSpeed) {
		this.xSpeed = xSpeed;
	}
	
	/**
	 * gets the ySpeed of the Electroball
	 * @return returns the ySpeed of the Electroball
	 */
	public double getYSpeed() {
		return ySpeed;
	}
	
	/**
	 * gets the ySpeed of the Electroball
	 * @param ySpeed the ySpeed of the Electroball
	 */
	public void setYSpeed(double ySpeed) {
		this.ySpeed = ySpeed;
	}
	
	/**
	 * gets the direction of the Electroball
	 * @return returns the direction of the Electroball
	 */
	public int getDirection() {
		return direction;
	}
	
	/**
	 * sets the direction of the Electroball
	 * @param direction the direction of the Electroball
	 */
	public void setDirection(int direction) {
		this.direction = direction;
	}
	
	/**
	 * moves the electroball left
	 */
	public void moveLeft() {
		setX(getX() - getXSpeed());
	}
	
	/**
	 * moves the electroball right
	 */
	public void moveRight() {
		setX(getX() + getXSpeed());
	}
	
	/**
	 * moves the electroball downwards
	 */
	public void moveDown() {
		setY(getY() + getYSpeed());
	}
	
	/**
	 * moves the electroball upwards
	 */
	public void moveUp() {
		setY(getY() - getYSpeed());
	}
	
	/**
	 * Moves depending on direction
	 * @param direction the direction of the ball
	 */
	public void move(int direction) {
		if(direction == 1) {
			moveLeft();
		}
		if(direction == 2) {
			moveRight();
		}
	}
	
	/**
	 * Draws the Electroball
	 * @param g the Graphics object
	 */
	public void drawElectroball(Graphics g) {
		g.setColor(Color.BLACK);
		g.fillRect((int)getX(), (int)getY() + pixelSize*5, pixelSize, pixelSize*4);
		g.fillRect((int)getX() + pixelSize, (int)getY() + pixelSize*3, pixelSize, pixelSize*2);
		g.fillRect((int)getX() + pixelSize*2, (int)getY() + pixelSize*2, pixelSize, pixelSize);
		g.fillRect((int)getX() + pixelSize*3, (int)getY() + pixelSize, pixelSize*2, pixelSize);
		g.fillRect((int)getX() + pixelSize*5, (int)getY(), pixelSize*4, pixelSize);
		g.fillRect((int)getX() + pixelSize, (int)getY() + pixelSize*9, pixelSize, pixelSize*2);
		g.fillRect((int)getX() + pixelSize*2, (int)getY() + pixelSize*11, pixelSize, pixelSize);
		g.fillRect((int)getX() + pixelSize*3, (int)getY() + pixelSize*12, pixelSize*2, pixelSize);
		g.fillRect((int)getX() + pixelSize*5, (int)getY() + pixelSize*13, pixelSize*4, pixelSize);
		g.fillRect((int)getX() + pixelSize*9, (int)getY() + pixelSize, pixelSize*2, pixelSize);
		g.fillRect((int)getX() + pixelSize*9,  (int)getY() + pixelSize*12,  pixelSize*2, pixelSize);
		g.fillRect((int)getX() + pixelSize*11, (int)getY() + pixelSize*2, pixelSize, pixelSize);
		g.fillRect((int)getX() + pixelSize*11, (int)getY() + pixelSize*11, pixelSize, pixelSize);
		g.fillRect((int)getX() + pixelSize*12, (int)getY() + pixelSize*3, pixelSize, pixelSize*2);
		g.fillRect((int)getX() + pixelSize*12, (int)getY() + pixelSize*9, pixelSize, pixelSize*2);
		g.fillRect((int)getX() + pixelSize*13, (int)getY() + pixelSize*5, pixelSize, pixelSize*4);
		
		g.setColor(Color.WHITE);
		g.fillRect((int)getX() + pixelSize*5, (int)getY() + pixelSize, pixelSize*4, pixelSize);
		g.fillRect((int)getX() + pixelSize*4, (int)getY() + pixelSize*2, pixelSize*6, pixelSize);
		g.fillRect((int)getX() + pixelSize*3, (int)getY() + pixelSize*3, pixelSize*8, pixelSize);
		g.fillRect((int)getX() + pixelSize*2, (int)getY() + pixelSize*4, pixelSize*10, pixelSize);
		g.fillRect((int)getX() + pixelSize, (int)getY() + pixelSize*5, pixelSize*5, pixelSize);
		g.fillRect((int)getX() + pixelSize*8, (int)getY() + pixelSize*5, pixelSize*5, pixelSize);
		g.fillRect((int)getX() + pixelSize, (int)getY() + pixelSize*6, pixelSize*4, pixelSize*2);
		g.fillRect((int)getX() + pixelSize*9, (int)getY() + pixelSize*6, pixelSize*4, pixelSize*2);
		g.fillRect((int)getX() + pixelSize*6, (int)getY() + pixelSize*6, pixelSize, pixelSize);
		g.fillRect((int)getX() + pixelSize, (int)getY() + pixelSize*8, pixelSize*5, pixelSize);
		g.fillRect((int)getX() + pixelSize*8, (int)getY() + pixelSize*8, pixelSize*5, pixelSize);
		g.fillRect((int)getX() + pixelSize*2, (int)getY() + pixelSize*9, pixelSize*10, pixelSize);
		g.fillRect((int)getX() + pixelSize*3, (int)getY() + pixelSize*10, pixelSize*8, pixelSize);
		g.fillRect((int)getX() + pixelSize*4, (int)getY() + pixelSize*11, pixelSize*6, pixelSize);
		g.fillRect((int)getX() + pixelSize*5, (int)getY() + pixelSize*12, pixelSize*4, pixelSize);
		
		g.setColor(new Color(144, 212, 213));
		g.fillRect((int)getX() - pixelSize*5, (int)getY() + pixelSize*5, pixelSize*3, pixelSize);
		g.fillRect((int)getX() - pixelSize*4, (int)getY() + pixelSize*3, pixelSize*2, pixelSize);
		g.fillRect((int)getX() - pixelSize*4, (int)getY() + pixelSize*4, pixelSize, pixelSize);
		g.fillRect((int)getX() - pixelSize*3, (int)getY() + pixelSize*5, pixelSize, pixelSize*4);
		g.fillRect((int)getX() - pixelSize*4, (int)getY() + pixelSize*8, pixelSize*3, pixelSize);
		g.fillRect((int)getX() - pixelSize*2, (int)getY() + pixelSize*2, pixelSize*2, pixelSize);
		g.fillRect((int)getX() - pixelSize, (int)getY() + pixelSize*12, pixelSize*3, pixelSize);
		g.fillRect((int)getX() - pixelSize, (int)getY() + pixelSize*12, pixelSize, pixelSize*4);
		g.fillRect((int)getX() - pixelSize, (int)getY() + pixelSize*15, pixelSize*3, pixelSize);
		g.fillRect((int)getX() + pixelSize, (int)getY() + pixelSize*16, pixelSize*4, pixelSize);
		g.fillRect((int)getX() + pixelSize*4, (int)getY() + pixelSize*15, pixelSize*2, pixelSize);
		g.fillRect((int)getX() + pixelSize*5, (int)getY() + pixelSize*14, pixelSize, pixelSize);
		g.fillRect((int)getX() + pixelSize*2, (int)getY() + pixelSize*3, pixelSize, pixelSize);
		g.fillRect((int)getX() + pixelSize*3, (int)getY() + pixelSize*2, pixelSize, pixelSize);
		g.fillRect((int)getX() + pixelSize*2, (int)getY() + pixelSize*10, pixelSize, pixelSize);
		g.fillRect((int)getX() + pixelSize*3, (int)getY() + pixelSize*11, pixelSize, pixelSize);
		g.fillRect((int)getX() + pixelSize*10, (int)getY() + pixelSize*11, pixelSize, pixelSize);
		g.fillRect((int)getX() + pixelSize*10, (int)getY() + pixelSize*2, pixelSize, pixelSize);
		g.fillRect((int)getX() + pixelSize*11, (int)getY() + pixelSize*3, pixelSize, pixelSize);
		g.fillRect((int)getX() + pixelSize*11, (int)getY() + pixelSize*10, pixelSize, pixelSize);
		g.fillRect((int)getX() + pixelSize*7, (int)getY() - pixelSize, pixelSize*2, pixelSize);
		g.fillRect((int)getX() + pixelSize*8, (int)getY() - pixelSize*2, pixelSize*2, pixelSize);
		g.fillRect((int)getX() + pixelSize*9, (int)getY() - pixelSize*3, pixelSize*3, pixelSize);
		g.fillRect((int)getX() + pixelSize*10, (int)getY() - pixelSize*4, pixelSize*3, pixelSize);
		g.fillRect((int)getX() + pixelSize*11, (int)getY() - pixelSize*2, pixelSize*2, pixelSize);
		g.fillRect((int)getX() + pixelSize*12, (int)getY() - pixelSize*2, pixelSize, pixelSize*4);
		g.fillRect((int)getX() + pixelSize*11, (int)getY() + pixelSize, pixelSize, pixelSize);
		g.fillRect((int)getX() + pixelSize*13, (int)getY(), pixelSize, pixelSize);
		g.fillRect((int)getX() + pixelSize*13, (int)getY() + pixelSize*9, pixelSize, pixelSize*4);
		g.fillRect((int)getX() + pixelSize*11, (int)getY() + pixelSize*12, pixelSize*3, pixelSize);
		g.fillRect((int)getX() + pixelSize*14, (int)getY() + pixelSize*8, pixelSize, pixelSize);
		g.fillRect((int)getX() + pixelSize*15, (int)getY() + pixelSize*7, pixelSize, pixelSize);
		g.fillRect((int)getX() + pixelSize*14, (int)getY() + pixelSize*4, pixelSize, pixelSize*2);
		g.fillRect((int)getX() + pixelSize*14, (int)getY() + pixelSize*4, pixelSize*3, pixelSize);
		g.fillRect((int)getX() + pixelSize*16, (int)getY() + pixelSize*4, pixelSize, pixelSize*4);
		g.fillRect((int)getX() + pixelSize*5, (int)getY() + pixelSize*6, pixelSize, pixelSize*2);
		g.fillRect((int)getX() + pixelSize*6, (int)getY() + pixelSize*5, pixelSize*2, pixelSize);
		g.fillRect((int)getX() + pixelSize*6, (int)getY() + pixelSize*7, pixelSize*2, pixelSize*2);
		g.fillRect((int)getX() + pixelSize*7, (int)getY() + pixelSize*6, pixelSize*2, pixelSize*2);
		
	}
	
	/**
	 * Detects whether a FireBall hits Electroball
	 * @param fireball the FireBall
	 * @return returns true if FireBall hits Electroball, returns false if not
	 */
	public boolean FireballIntersects(FireBall fireball) {
		if(fireball.getX() < getX() + getPixelSize()*14 && fireball.getX() > getX() && fireball.getY() < getY() + getPixelSize()*14 && fireball.getY() > getY()) {
			return true;
		}
		else if(fireball.getX() + fireball.getPixelSize()*10 < getX() + getPixelSize()*14 && fireball.getX() + fireball.getPixelSize()*10 > getX() && fireball.getY() + fireball.getPixelSize()*12 < getY() + getPixelSize()*14 && fireball.getY() + fireball.getPixelSize()*12 > getY()) {
			return true;
		}
		else if(fireball.getX() + fireball.getPixelSize()*20 < getX() + getPixelSize()*14 && fireball.getX() + fireball.getPixelSize()*20 > getX() && fireball.getY() + fireball.getPixelSize()*24 < getY() + getPixelSize()*14 && fireball.getY() + fireball.getPixelSize()*24 > getY()) {
			return true;
		}
		else {
			return false;
		}
	}
	
	/**
	 * Detects whether intersects warrior
	 * @param warrior Warrior object
	 * @return returns true if hits warrior, false otherwise
	 */
	public boolean intersectsWarrior(Warrior warrior) {
		if(getX() < warrior.getX() + warrior.getPixelSize()*14 && getX() > warrior.getX() && getY() < warrior.getY() + warrior.getPixelSize()*23 && getY() > warrior.getY()) {
			return true;
		}
		else if(getX() + getPixelSize()*14 < warrior.getX() + warrior.getPixelSize()*14 && getX() + getPixelSize()*14 > warrior.getX() && getY() + getPixelSize()*23 < warrior.getY() + warrior.getPixelSize()*23 && getY() + getPixelSize()*23 > warrior.getY()) {
			return true;
		}
		else {
			return false;
		}
	}
}
