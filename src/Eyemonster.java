import java.awt.Color;
import java.awt.Graphics;

public class Eyemonster {

	/**
	 * private variables
	 */
	private int pixelSize;
	private double x;
	private double y;
	private double xSpeed;
	private double ySpeed;
	private double hpPercent;
	
	/**
	 * 5 parameter constructor for monster
	 * @param pixelSize the size of each pixel
	 * @param x the x-coordinate of the upper-left of the monster
	 * @param y the y-coordinate of the upper-left of the monster
	 * @param xSpeed the speed of the monster in the x-direction
	 * @param ySpeed the speed of the monster in the y-direction
	 */
	public Eyemonster(int pixelSize, double x, double y, double xSpeed, double ySpeed) {
		this.pixelSize = pixelSize;
		this.x = x;
		this.y = y;
		this.xSpeed = xSpeed;
		this.ySpeed = ySpeed;
		this.hpPercent = 1;
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
	 * @param x the x-coordinate of the upper-left of the monster
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
	 * @param xSpeed the speed of the monster in the x-direction
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
	 * @param ySpeed the speed of the monster in the y-direction
	 */
	public void setYSpeed(double ySpeed) {
		this.ySpeed = ySpeed;
	}
	
	/**
	 * gets the pixelSize of the monster
	 * @return returns the pixelSize of the monster
	 */
	public int getPixelSize() {
		return pixelSize;
	}
	
	/**
	 * sets the pixelSize of the monster
	 * @param pixelSize the size of each pixel of the monster
	 */
	public void setPixelSize(int pixelSize) {
		this.pixelSize = pixelSize;
	}
	
	/**
	 * gets the hpPercent of the monster
	 * @return returns the hpPercent
	 */
	public double gethpPercent() {
		return hpPercent;
	}
	
	/**
	 * sets the hpPercent of the monster
	 * @param hpPercent the hpPercent of the monster
	 */
	public void sethpPercent(double hpPercent) {
		this.hpPercent = hpPercent;
	}
	
	/**
	 * decreases the y-coordinate of the monster
	 */
	public void moveUp() {
		setY(getY() - getYSpeed());
	}
	
	/**
	 * increases the y-coordinate of the monster
	 */
	public void moveDown() {
		setY(getY() + getYSpeed());
	}
	
	/**
	 * increases the x-coordinate of the monster
	 */
	public void moveRight() { 
		setX(getX() + getXSpeed());
	}
	
	/**
	 * decreases the x-coordinate of the monster
	 */
	public void moveLeft() { 
		setX(getX() - getXSpeed());
	}
	
	/**
	 * Draws the eye monster, width x height, 39x48
	 * @param g the Graphics object
	 */
	public void draw(Graphics g) {
		//Dark green outline
		g.setColor(new Color(30, 138, 24));
		g.fillRect((int)getX(), (int)getY() + pixelSize*14, pixelSize, pixelSize*7);
		g.fillRect((int)getX() + pixelSize, (int)getY() + pixelSize*11, pixelSize, pixelSize*3);
		g.fillRect((int)getX() + pixelSize, (int)getY() + pixelSize*21, pixelSize, pixelSize*3);
		g.fillRect((int)getX() + pixelSize*2, (int)getY() + pixelSize*9, pixelSize, pixelSize*2);
		g.fillRect((int)getX() + pixelSize*2, (int)getY() + pixelSize*24, pixelSize, pixelSize*2);
		g.fillRect((int)getX() + pixelSize*3, (int)getY() + pixelSize*7, pixelSize, pixelSize*2);
		g.fillRect((int)getX() + pixelSize*3, (int)getY() + pixelSize*26, pixelSize, pixelSize*2);
		g.fillRect((int)getX() + pixelSize*4, (int)getY() + pixelSize*28, pixelSize, pixelSize);
		g.fillRect((int)getX() + pixelSize*4, (int)getY() + pixelSize*6, pixelSize, pixelSize);
		g.fillRect((int)getX() + pixelSize*5, (int)getY() + pixelSize*5, pixelSize, pixelSize);
		g.fillRect((int)getX() + pixelSize*5, (int)getY() + pixelSize*29, pixelSize, pixelSize);
		g.fillRect((int)getX() + pixelSize*6, (int)getY() + pixelSize*4, pixelSize, pixelSize);
		g.fillRect((int)getX() + pixelSize*6, (int)getY() + pixelSize*30, pixelSize, pixelSize);
		g.fillRect((int)getX() + pixelSize*7, (int)getY() + pixelSize*3, pixelSize*2, pixelSize);
		g.fillRect((int)getX() + pixelSize*7, (int)getY() + pixelSize*31, pixelSize*2, pixelSize);
		g.fillRect((int)getX() + pixelSize*9, (int)getY() + pixelSize*2, pixelSize*2, pixelSize);
		g.fillRect((int)getX() + pixelSize*9, (int)getY() + pixelSize*32, pixelSize*2, pixelSize);
		g.fillRect((int)getX() + pixelSize*11, (int)getY() + pixelSize, pixelSize*3, pixelSize);
		g.fillRect((int)getX() + pixelSize*11, (int)getY() + pixelSize*33, pixelSize*3, pixelSize);
		g.fillRect((int)getX() + pixelSize*14, (int)getY(), pixelSize*7, pixelSize);
		g.fillRect((int)getX() + pixelSize*14, (int)getY() + pixelSize*34, pixelSize*7, pixelSize);
		g.fillRect((int)getX() + pixelSize*21, (int)getY() + pixelSize, pixelSize*3, pixelSize);
		g.fillRect((int)getX() + pixelSize*21, (int)getY() + pixelSize*33, pixelSize*3, pixelSize);
		g.fillRect((int)getX() + pixelSize*21, (int)getY() + pixelSize*39, pixelSize, pixelSize*6);
		g.fillRect((int)getX() + pixelSize*22, (int)getY() + pixelSize*38, pixelSize, pixelSize);
		g.fillRect((int)getX() + pixelSize*22, (int)getY() + pixelSize*45, pixelSize, pixelSize);
		g.fillRect((int)getX() + pixelSize*23, (int)getY() + pixelSize*37, pixelSize, pixelSize);
		g.fillRect((int)getX() + pixelSize*23, (int)getY() + pixelSize*46, pixelSize, pixelSize);
		g.fillRect((int)getX() + pixelSize*24, (int)getY() + pixelSize*2, pixelSize*2, pixelSize);
		g.fillRect((int)getX() + pixelSize*24, (int)getY() + pixelSize*32, pixelSize*2, pixelSize);
		g.fillRect((int)getX() + pixelSize*24, (int)getY() + pixelSize*36, pixelSize, pixelSize);
		g.fillRect((int)getX() + pixelSize*24, (int)getY() + pixelSize*41, pixelSize, pixelSize*4);
		g.fillRect((int)getX() + pixelSize*24, (int)getY() + pixelSize*47, pixelSize*4, pixelSize);
		g.fillRect((int)getX() + pixelSize*25, (int)getY() + pixelSize*35, pixelSize*2, pixelSize);
		g.fillRect((int)getX() + pixelSize*25, (int)getY() + pixelSize*40, pixelSize, pixelSize);
		g.fillRect((int)getX() + pixelSize*25, (int)getY() + pixelSize*45, pixelSize*2, pixelSize);
		g.fillRect((int)getX() + pixelSize*26, (int)getY() + pixelSize*3, pixelSize*2, pixelSize);
		g.fillRect((int)getX() + pixelSize*26, (int)getY() + pixelSize*31, pixelSize*2, pixelSize);
		g.fillRect((int)getX() + pixelSize*26, (int)getY() + pixelSize*39, pixelSize*2, pixelSize);
		g.fillRect((int)getX() + pixelSize*26, (int)getY() + pixelSize*42, pixelSize*2, pixelSize);
		g.fillRect((int)getX() + pixelSize*26, (int)getY() + pixelSize*43, pixelSize, pixelSize);
		g.fillRect((int)getX() + pixelSize*27, (int)getY() + pixelSize*34, pixelSize*2, pixelSize);
		g.fillRect((int)getX() + pixelSize*27, (int)getY() + pixelSize*44, pixelSize, pixelSize);
		g.fillRect((int)getX() + pixelSize*28, (int)getY() + pixelSize*4, pixelSize, pixelSize);
		g.fillRect((int)getX() + pixelSize*28, (int)getY() + pixelSize*30, pixelSize, pixelSize);
		g.fillRect((int)getX() + pixelSize*28, (int)getY() + pixelSize*38, pixelSize*2, pixelSize);
		g.fillRect((int)getX() + pixelSize*28, (int)getY() + pixelSize*43, pixelSize, pixelSize);
		g.fillRect((int)getX() + pixelSize*28, (int)getY() + pixelSize*46, pixelSize, pixelSize);
		g.fillRect((int)getX() + pixelSize*29, (int)getY() + pixelSize*44, pixelSize, pixelSize*2);
		g.fillRect((int)getX() + pixelSize*29, (int)getY() + pixelSize*33, pixelSize*2, pixelSize);
		g.fillRect((int)getX() + pixelSize*29, (int)getY() + pixelSize*5, pixelSize, pixelSize);
		g.fillRect((int)getX() + pixelSize*29, (int)getY() + pixelSize*29, pixelSize*3, pixelSize);
		g.fillRect((int)getX() + pixelSize*30, (int)getY() + pixelSize*6, pixelSize, pixelSize);
		g.fillRect((int)getX() + pixelSize*30, (int)getY() + pixelSize*28, pixelSize, pixelSize);
		g.fillRect((int)getX() + pixelSize*30, (int)getY() + pixelSize*37, pixelSize*2, pixelSize);
		g.fillRect((int)getX() + pixelSize*31, (int)getY() + pixelSize*7, pixelSize, pixelSize*2);
		g.fillRect((int)getX() + pixelSize*31, (int)getY() + pixelSize*26, pixelSize, pixelSize*2);
		g.fillRect((int)getX() + pixelSize*31, (int)getY() + pixelSize*32, pixelSize, pixelSize);
		g.fillRect((int)getX() + pixelSize*32, (int)getY() + pixelSize*9, pixelSize, pixelSize*2);
		g.fillRect((int)getX() + pixelSize*32, (int)getY() + pixelSize*24, pixelSize, pixelSize*2);
		g.fillRect((int)getX() + pixelSize*32, (int)getY() + pixelSize*30, pixelSize, pixelSize*2);
		g.fillRect((int)getX() + pixelSize*32, (int)getY() + pixelSize*36, pixelSize*2, pixelSize);
		g.fillRect((int)getX() + pixelSize*33, (int)getY() + pixelSize*11, pixelSize, pixelSize*3);
		g.fillRect((int)getX() + pixelSize*33, (int)getY() + pixelSize*21, pixelSize, pixelSize*3);
		g.fillRect((int)getX() + pixelSize*34, (int)getY() + pixelSize*14, pixelSize, pixelSize*7);
		g.fillRect((int)getX() + pixelSize*34, (int)getY() + pixelSize*35, pixelSize*2, pixelSize);
		g.fillRect((int)getX() + pixelSize*35, (int)getY() + pixelSize*20, pixelSize, pixelSize*2);
		g.fillRect((int)getX() + pixelSize*36, (int)getY() + pixelSize*22, pixelSize, pixelSize*2);
		g.fillRect((int)getX() + pixelSize*36, (int)getY() + pixelSize*34, pixelSize, pixelSize);
		g.fillRect((int)getX() + pixelSize*37, (int)getY() + pixelSize*24, pixelSize, pixelSize*2);
		g.fillRect((int)getX() + pixelSize*37, (int)getY() + pixelSize*32, pixelSize, pixelSize*2);
		g.fillRect((int)getX() + pixelSize*38, (int)getY() + pixelSize*26, pixelSize, pixelSize*6);
		
		//2nd layer, light green
		g.setColor(new Color(77, 231, 70));
		g.fillRect((int)getX() + pixelSize, (int)getY() + pixelSize*20, pixelSize, pixelSize);
		g.fillRect((int)getX() + pixelSize, (int)getY() + pixelSize*14, pixelSize, pixelSize);
		g.fillRect((int)getX() + pixelSize*2, (int)getY() + pixelSize*11, pixelSize, pixelSize*2);
		g.fillRect((int)getX() + pixelSize*4, (int)getY() + pixelSize*7, pixelSize, pixelSize);
		g.fillRect((int)getX() + pixelSize*4, (int)getY() + pixelSize*26, pixelSize, pixelSize*2);
		g.fillRect((int)getX() + pixelSize*5, (int)getY() + pixelSize*27, pixelSize, pixelSize);
		g.fillRect((int)getX() + pixelSize*6, (int)getY() + pixelSize*5, pixelSize, pixelSize);
		g.fillRect((int)getX() + pixelSize*6, (int)getY() + pixelSize*28, pixelSize, pixelSize);
		g.fillRect((int)getX() + pixelSize*6, (int)getY() + pixelSize*29, pixelSize*3, pixelSize);
		g.fillRect((int)getX() + pixelSize*7, (int)getY() + pixelSize*4, pixelSize*2, pixelSize);
		g.fillRect((int)getX() + pixelSize*7, (int)getY() + pixelSize*30, pixelSize, pixelSize);
		g.fillRect((int)getX() + pixelSize*9, (int)getY() + pixelSize*3, pixelSize*2, pixelSize);
		g.fillRect((int)getX() + pixelSize*9, (int)getY() + pixelSize*30, pixelSize*3, pixelSize*2);
		g.fillRect((int)getX() + pixelSize*11, (int)getY() + pixelSize*32, pixelSize*3, pixelSize);
		g.fillRect((int)getX() + pixelSize*11, (int)getY() + pixelSize*2, pixelSize*5, pixelSize);
		g.fillRect((int)getX() + pixelSize*11, (int)getY() + pixelSize*31, pixelSize*2, pixelSize);
		g.fillRect((int)getX() + pixelSize*14, (int)getY() + pixelSize, pixelSize*2, pixelSize);
		g.fillRect((int)getX() + pixelSize*15, (int)getY() + pixelSize*31, pixelSize*3, pixelSize*2);
		g.fillRect((int)getX() + pixelSize*16, (int)getY() + pixelSize*32, pixelSize*3, pixelSize*2);
		g.fillRect((int)getX() + pixelSize*17, (int)getY() + pixelSize, pixelSize*3, pixelSize*2);
		g.fillRect((int)getX() + pixelSize*17, (int)getY() + pixelSize*33, pixelSize*3, pixelSize);
		g.fillRect((int)getX() + pixelSize*19, (int)getY() + pixelSize*3, pixelSize*2, pixelSize);
		g.fillRect((int)getX() + pixelSize*20, (int)getY() + pixelSize*2, pixelSize*3, pixelSize);
		g.fillRect((int)getX() + pixelSize*19, (int)getY() + pixelSize*30, pixelSize*4, pixelSize*2);
		g.fillRect((int)getX() + pixelSize*21, (int)getY() + pixelSize*29, pixelSize*3, pixelSize*2);
		g.fillRect((int)getX() + pixelSize*22, (int)getY() + pixelSize*28, pixelSize, pixelSize*5);
		g.fillRect((int)getX() + pixelSize*24, (int)getY() + pixelSize*30, pixelSize, pixelSize*2);
		g.fillRect((int)getX() + pixelSize*22, (int)getY() + pixelSize*4, pixelSize*5, pixelSize*2);
		g.fillRect((int)getX() + pixelSize*22, (int)getY() + pixelSize*4, pixelSize*3, pixelSize*3);
		g.fillRect((int)getX() + pixelSize*23, (int)getY() + pixelSize*7, pixelSize, pixelSize);
		g.fillRect((int)getX() + pixelSize*25, (int)getY() + pixelSize*3, pixelSize, pixelSize);
		g.fillRect((int)getX() + pixelSize*24, (int)getY() + pixelSize*25, pixelSize, pixelSize*4);
		g.fillRect((int)getX() + pixelSize*24, (int)getY() + pixelSize*8, pixelSize, pixelSize);
		g.fillRect((int)getX() + pixelSize*25, (int)getY() + pixelSize*7, pixelSize*4, pixelSize*4);
		g.fillRect((int)getX() + pixelSize*25, (int)getY() + pixelSize*7, pixelSize*5, pixelSize*2);
		g.fillRect((int)getX() + pixelSize*26, (int)getY() + pixelSize*10, pixelSize*6, pixelSize*2);
		g.fillRect((int)getX() + pixelSize*28, (int)getY() + pixelSize*10, pixelSize*4, pixelSize*3);
		g.fillRect((int)getX() + pixelSize*30, (int)getY() + pixelSize*9, pixelSize*2, pixelSize);
		g.fillRect((int)getX() + pixelSize*32, (int)getY() + pixelSize*11, pixelSize, pixelSize);
		g.fillRect((int)getX() + pixelSize*27, (int)getY() + pixelSize*13, pixelSize, pixelSize);
		g.fillRect((int)getX() + pixelSize*28, (int)getY() + pixelSize*14, pixelSize, pixelSize);
		g.fillRect((int)getX() + pixelSize*30, (int)getY() + pixelSize*14, pixelSize*3, pixelSize);
		g.fillRect((int)getX() + pixelSize*33, (int)getY() + pixelSize*15, pixelSize, pixelSize);
		g.fillRect((int)getX() + pixelSize*30, (int)getY() + pixelSize*19, pixelSize*4, pixelSize);
		g.fillRect((int)getX() + pixelSize*27, (int)getY() + pixelSize*20, pixelSize*3, pixelSize);
		g.fillRect((int)getX() + pixelSize*27, (int)getY() + pixelSize*20, pixelSize*2, pixelSize*2);
		g.fillRect((int)getX() + pixelSize*27, (int)getY() + pixelSize*15, pixelSize*6, pixelSize*2);
		g.fillRect((int)getX() + pixelSize*27, (int)getY() + pixelSize*15, pixelSize*3, pixelSize*4);
		g.fillRect((int)getX() + pixelSize*30, (int)getY() + pixelSize*18, pixelSize*3, pixelSize*2);
		g.fillRect((int)getX() + pixelSize*29, (int)getY() + pixelSize*22, pixelSize*4, pixelSize);
		g.fillRect((int)getX() + pixelSize*30, (int)getY() + pixelSize*21, pixelSize*2, pixelSize*3);
		g.fillRect((int)getX() + pixelSize*27, (int)getY() + pixelSize*23, pixelSize*3, pixelSize*3);
		g.fillRect((int)getX() + pixelSize*28, (int)getY() + pixelSize*25, pixelSize*3, pixelSize*2);
		g.fillRect((int)getX() + pixelSize*26, (int)getY() + pixelSize*22, pixelSize, pixelSize*4);
		g.fillRect((int)getX() + pixelSize*25, (int)getY() + pixelSize*24, pixelSize, pixelSize);
		g.fillRect((int)getX() + pixelSize*25, (int)getY() + pixelSize*26, pixelSize, pixelSize*4);
		g.fillRect((int)getX() + pixelSize*26, (int)getY() + pixelSize*27, pixelSize*3, pixelSize*3);
		g.fillRect((int)getX() + pixelSize*29, (int)getY() + pixelSize*28, pixelSize, pixelSize);
		g.fillRect((int)getX() + pixelSize*24, (int)getY() + pixelSize*46, pixelSize, pixelSize);
		g.fillRect((int)getX() + pixelSize*26, (int)getY() + pixelSize*46, pixelSize, pixelSize);
		g.fillRect((int)getX() + pixelSize*27, (int)getY() + pixelSize*45, pixelSize, pixelSize);
		g.fillRect((int)getX() + pixelSize*23, (int)getY() + pixelSize*45, pixelSize, pixelSize);
		g.fillRect((int)getX() + pixelSize*22, (int)getY() + pixelSize*44, pixelSize, pixelSize);
		g.fillRect((int)getX() + pixelSize*22, (int)getY() + pixelSize*39, pixelSize, pixelSize);
		g.fillRect((int)getX() + pixelSize*25, (int)getY() + pixelSize*39, pixelSize, pixelSize);
		g.fillRect((int)getX() + pixelSize*27, (int)getY() + pixelSize*38, pixelSize, pixelSize);
		g.fillRect((int)getX() + pixelSize*29, (int)getY() + pixelSize*37, pixelSize, pixelSize);
		g.fillRect((int)getX() + pixelSize*30, (int)getY() + pixelSize*36, pixelSize*2, pixelSize);
		g.fillRect((int)getX() + pixelSize*32, (int)getY() + pixelSize*35, pixelSize*2, pixelSize);
		g.fillRect((int)getX() + pixelSize*31, (int)getY() + pixelSize*28, pixelSize, pixelSize);
		g.fillRect((int)getX() + pixelSize*32, (int)getY() + pixelSize*26, pixelSize, pixelSize);
		g.fillRect((int)getX() + pixelSize*33, (int)getY() + pixelSize*24, pixelSize, pixelSize);
		g.fillRect((int)getX() + pixelSize*34, (int)getY() + pixelSize*21, pixelSize, pixelSize*3);
		g.fillRect((int)getX() + pixelSize*35, (int)getY() + pixelSize*22, pixelSize, pixelSize*3);
		g.fillRect((int)getX() + pixelSize*36, (int)getY() + pixelSize*24, pixelSize, pixelSize*4);
		g.fillRect((int)getX() + pixelSize*37, (int)getY() + pixelSize*26, pixelSize, pixelSize*6);
		g.fillRect((int)getX() + pixelSize*36, (int)getY() + pixelSize*31, pixelSize, pixelSize*3);
		g.fillRect((int)getX() + pixelSize*35, (int)getY() + pixelSize*33, pixelSize, pixelSize*2);
		g.fillRect((int)getX() + pixelSize*34, (int)getY() + pixelSize*34, pixelSize, pixelSize);

		//3rd layer, yellow-greenish
		g.setColor(new Color(189, 247, 90));
		g.fillRect((int)getX() + pixelSize*11, (int)getY() + pixelSize*3, pixelSize*8, pixelSize);
		g.fillRect((int)getX() + pixelSize*9, (int)getY() + pixelSize*4, pixelSize*12, pixelSize);
		g.fillRect((int)getX() + pixelSize*7, (int)getY() + pixelSize*5, pixelSize*13, pixelSize);
		g.fillRect((int)getX() + pixelSize*5, (int)getY() + pixelSize*6, pixelSize*16, pixelSize);
		g.fillRect((int)getX() + pixelSize*5, (int)getY() + pixelSize*7, pixelSize*18, pixelSize);
		g.fillRect((int)getX() + pixelSize*4, (int)getY() + pixelSize*8, pixelSize*19, pixelSize);
		g.fillRect((int)getX() + pixelSize*3, (int)getY() + pixelSize*9, pixelSize*22, pixelSize*2);
		g.fillRect((int)getX() + pixelSize*3, (int)getY() + pixelSize*11, pixelSize*23, pixelSize*2);
		g.fillRect((int)getX() + pixelSize*2, (int)getY() + pixelSize*13, pixelSize*25, pixelSize*2);
		g.fillRect((int)getX() + pixelSize, (int)getY() + pixelSize*15, pixelSize*26, pixelSize*5);
		g.fillRect((int)getX() + pixelSize*2, (int)getY() + pixelSize*20, pixelSize*25, pixelSize*2);
		g.fillRect((int)getX() + pixelSize*2, (int)getY() + pixelSize*20, pixelSize*24, pixelSize*4);
		g.fillRect((int)getX() + pixelSize*3, (int)getY() + pixelSize*24, pixelSize*22, pixelSize);
		g.fillRect((int)getX() + pixelSize*4, (int)getY() + pixelSize*25, pixelSize*20, pixelSize);
		g.fillRect((int)getX() + pixelSize*5, (int)getY() + pixelSize*26, pixelSize*18, pixelSize);
		g.fillRect((int)getX() + pixelSize*7, (int)getY() + pixelSize*27, pixelSize*15, pixelSize*2);
		g.fillRect((int)getX() + pixelSize*10, (int)getY() + pixelSize*29, pixelSize*11, pixelSize);
		g.fillRect((int)getX() + pixelSize*13, (int)getY() + pixelSize*30, pixelSize*6, pixelSize);
		g.fillRect((int)getX() + pixelSize*34, (int)getY() + pixelSize*24, pixelSize, pixelSize);
		g.fillRect((int)getX() + pixelSize*33, (int)getY() + pixelSize*25, pixelSize*3, pixelSize*8);
		g.fillRect((int)getX() + pixelSize*32, (int)getY() + pixelSize*27, pixelSize, pixelSize);
		g.fillRect((int)getX() + pixelSize*32, (int)getY() + pixelSize*28, pixelSize, pixelSize*2);
		g.fillRect((int)getX() + pixelSize*36, (int)getY() + pixelSize*28, pixelSize, pixelSize*3);
		g.fillRect((int)getX() + pixelSize*32, (int)getY() + pixelSize*32, pixelSize*3, pixelSize*2);
		g.fillRect((int)getX() + pixelSize*31, (int)getY() + pixelSize*33, pixelSize*3, pixelSize*2);
		g.fillRect((int)getX() + pixelSize*29, (int)getY() + pixelSize*34, pixelSize*3, pixelSize*2);
		g.fillRect((int)getX() + pixelSize*27, (int)getY() + pixelSize*35, pixelSize*3, pixelSize*2);
		g.fillRect((int)getX() + pixelSize*25, (int)getY() + pixelSize*36, pixelSize*4, pixelSize*2);
		g.fillRect((int)getX() + pixelSize*24, (int)getY() + pixelSize*37, pixelSize*3, pixelSize*2);
		g.fillRect((int)getX() + pixelSize*23, (int)getY() + pixelSize*38, pixelSize*2, pixelSize*3);
		g.fillRect((int)getX() + pixelSize*22, (int)getY() + pixelSize*40, pixelSize*2, pixelSize*4);
		g.fillRect((int)getX() + pixelSize*23, (int)getY() + pixelSize*44, pixelSize, pixelSize);
		g.fillRect((int)getX() + pixelSize*24, (int)getY() + pixelSize*45, pixelSize, pixelSize);
		g.fillRect((int)getX() + pixelSize*25, (int)getY() + pixelSize*46, pixelSize, pixelSize);
		g.fillRect((int)getX() + pixelSize*27, (int)getY() + pixelSize*46, pixelSize, pixelSize);
		g.fillRect((int)getX() + pixelSize*28, (int)getY() + pixelSize*44, pixelSize, pixelSize*2);
		g.fillRect((int)getX() + pixelSize*27, (int)getY() + pixelSize*43, pixelSize, pixelSize);

		//Dark blue eyeball outline
		g.setColor(new Color(0, 14, 201));
		g.fillRect((int)getX() + pixelSize*3, (int)getY() + pixelSize*14, pixelSize, pixelSize*7);
		g.fillRect((int)getX() + pixelSize*4, (int)getY() + pixelSize*12, pixelSize, pixelSize*4);
		g.fillRect((int)getX() + pixelSize*4, (int)getY() + pixelSize*21, pixelSize, pixelSize*2);
		g.fillRect((int)getX() + pixelSize*5, (int)getY() + pixelSize*23, pixelSize, pixelSize);
		g.fillRect((int)getX() + pixelSize*6, (int)getY() + pixelSize*24, pixelSize*2, pixelSize);
		g.fillRect((int)getX() + pixelSize*8, (int)getY() + pixelSize*25, pixelSize*3, pixelSize);
		g.fillRect((int)getX() + pixelSize*5, (int)getY() + pixelSize*11, pixelSize, pixelSize*2);
		g.fillRect((int)getX() + pixelSize*6, (int)getY() + pixelSize*10, pixelSize*3, pixelSize);
		g.fillRect((int)getX() + pixelSize*6, (int)getY() + pixelSize*10, pixelSize, pixelSize*2);
		g.fillRect((int)getX() + pixelSize*8, (int)getY() + pixelSize*9, pixelSize*5, pixelSize);
		g.fillRect((int)getX() + pixelSize*13, (int)getY() + pixelSize*10, pixelSize*2, pixelSize);
		g.fillRect((int)getX() + pixelSize*15, (int)getY() + pixelSize*11, pixelSize, pixelSize);
		g.fillRect((int)getX() + pixelSize*16, (int)getY() + pixelSize*12, pixelSize, pixelSize*2);
		g.fillRect((int)getX() + pixelSize*17, (int)getY() + pixelSize*14, pixelSize, pixelSize);
		g.fillRect((int)getX() + pixelSize*17, (int)getY() + pixelSize*16, pixelSize, pixelSize);
		
		//middle blue filling in eyeball
		g.setColor(new Color(40, 208, 254));
		g.fillRect((int)getX() + pixelSize*4, (int)getY() + pixelSize*16, pixelSize, pixelSize*5);
		g.fillRect((int)getX() + pixelSize*4, (int)getY() + pixelSize*16, pixelSize*2, pixelSize);
		g.fillRect((int)getX() + pixelSize*4, (int)getY() + pixelSize*18, pixelSize*2, pixelSize);
		g.fillRect((int)getX() + pixelSize*4, (int)getY() + pixelSize*20, pixelSize*3, pixelSize);
		g.fillRect((int)getX() + pixelSize*5, (int)getY() + pixelSize*13, pixelSize, pixelSize);
		g.fillRect((int)getX() + pixelSize*6, (int)getY() + pixelSize*12, pixelSize, pixelSize);
		g.fillRect((int)getX() + pixelSize*7, (int)getY() + pixelSize*11, pixelSize, pixelSize);
		g.fillRect((int)getX() + pixelSize*9, (int)getY() + pixelSize*10, pixelSize*4, pixelSize);
		g.fillRect((int)getX() + pixelSize*10, (int)getY() + pixelSize*12, pixelSize, pixelSize);
		g.fillRect((int)getX() + pixelSize*11, (int)getY() + pixelSize*11, pixelSize, pixelSize*2);
		g.fillRect((int)getX() + pixelSize*12, (int)getY() + pixelSize*13, pixelSize, pixelSize);
		g.fillRect((int)getX() + pixelSize*13, (int)getY() + pixelSize*14, pixelSize, pixelSize);
		g.fillRect((int)getX() + pixelSize*13, (int)getY() + pixelSize*11, pixelSize*2, pixelSize);
		g.fillRect((int)getX() + pixelSize*13, (int)getY() + pixelSize*11, pixelSize, pixelSize*2);
		g.fillRect((int)getX() + pixelSize*14, (int)getY() + pixelSize*13, pixelSize*2, pixelSize);
		g.fillRect((int)getX() + pixelSize*15, (int)getY() + pixelSize*12, pixelSize, pixelSize);
		g.fillRect((int)getX() + pixelSize*16, (int)getY() + pixelSize*14, pixelSize, pixelSize);
		g.fillRect((int)getX() + pixelSize*17, (int)getY() + pixelSize*15, pixelSize, pixelSize);
		g.fillRect((int)getX() + pixelSize*17, (int)getY() + pixelSize*17, pixelSize, pixelSize*4);
		g.fillRect((int)getX() + pixelSize*16, (int)getY() + pixelSize*21, pixelSize, pixelSize*2);
		g.fillRect((int)getX() + pixelSize*15, (int)getY() + pixelSize*23, pixelSize, pixelSize);
		g.fillRect((int)getX() + pixelSize*13, (int)getY() + pixelSize*24, pixelSize*2, pixelSize);
		g.fillRect((int)getX() + pixelSize*11, (int)getY() + pixelSize*25, pixelSize*2, pixelSize);
		g.fillRect((int)getX() + pixelSize*5, (int)getY() + pixelSize*21, pixelSize, pixelSize*2);
		g.fillRect((int)getX() + pixelSize*7, (int)getY() + pixelSize*21, pixelSize, pixelSize);
		g.fillRect((int)getX() + pixelSize*6, (int)getY() + pixelSize*22, pixelSize, pixelSize*2);
		g.fillRect((int)getX() + pixelSize*7, (int)getY() + pixelSize*23, pixelSize, pixelSize);
		g.fillRect((int)getX() + pixelSize*8, (int)getY() + pixelSize*24, pixelSize, pixelSize);
		
		//lightest blue in eyeball
		g.setColor(new Color(31, 240, 234));
		g.fillRect((int)getX() + pixelSize*5, (int)getY() + pixelSize*14, pixelSize, pixelSize*2);
		g.fillRect((int)getX() + pixelSize*6, (int)getY() + pixelSize*13, pixelSize, pixelSize*2);
		g.fillRect((int)getX() + pixelSize*7, (int)getY() + pixelSize*12, pixelSize, pixelSize*2);
		g.fillRect((int)getX() + pixelSize*8, (int)getY() + pixelSize*11, pixelSize*2, pixelSize*2);
		g.fillRect((int)getX() + pixelSize*10, (int)getY() + pixelSize*11, pixelSize, pixelSize);
		g.fillRect((int)getX() + pixelSize*11, (int)getY() + pixelSize*13, pixelSize, pixelSize);
		g.fillRect((int)getX() + pixelSize*12, (int)getY() + pixelSize*11, pixelSize, pixelSize*2);
		g.fillRect((int)getX() + pixelSize*12, (int)getY() + pixelSize*14, pixelSize, pixelSize);
		g.fillRect((int)getX() + pixelSize*13, (int)getY() + pixelSize*13, pixelSize, pixelSize);
		g.fillRect((int)getX() + pixelSize*14, (int)getY() + pixelSize*12, pixelSize, pixelSize);
		g.fillRect((int)getX() + pixelSize*14, (int)getY() + pixelSize*14, pixelSize*2, pixelSize);
		g.fillRect((int)getX() + pixelSize*13, (int)getY() + pixelSize*15, pixelSize*4, pixelSize*3);
		g.fillRect((int)getX() + pixelSize*13, (int)getY() + pixelSize*18, pixelSize, pixelSize*2);
		g.fillRect((int)getX() + pixelSize*15, (int)getY() + pixelSize*18, pixelSize*2, pixelSize);
		g.fillRect((int)getX() + pixelSize*16, (int)getY() + pixelSize*19, pixelSize, pixelSize*2);
		g.fillRect((int)getX() + pixelSize*14, (int)getY() + pixelSize*19, pixelSize, pixelSize*2);
		g.fillRect((int)getX() + pixelSize*15, (int)getY() + pixelSize*20, pixelSize, pixelSize*3);
		g.fillRect((int)getX() + pixelSize*5, (int)getY() + pixelSize*17, pixelSize, pixelSize);
		g.fillRect((int)getX() + pixelSize*5, (int)getY() + pixelSize*19, pixelSize, pixelSize);
		g.fillRect((int)getX() + pixelSize*6, (int)getY() + pixelSize*21, pixelSize, pixelSize);
		g.fillRect((int)getX() + pixelSize*7, (int)getY() + pixelSize*22, pixelSize*8, pixelSize);
		g.fillRect((int)getX() + pixelSize*8, (int)getY() + pixelSize*23, pixelSize*7, pixelSize);
		g.fillRect((int)getX() + pixelSize*9, (int)getY() + pixelSize*24, pixelSize*4, pixelSize);
		g.fillRect((int)getX() + pixelSize*11, (int)getY() + pixelSize*21, pixelSize*3, pixelSize);
		g.fillRect((int)getX() + pixelSize*12, (int)getY() + pixelSize*20, pixelSize, pixelSize);
		
		//Red
		g.setColor(new Color(123, 9, 3));
		g.fillRect((int)getX() + pixelSize*3, (int)getY() + pixelSize*25, pixelSize, pixelSize);
		g.fillRect((int)getX() + pixelSize*5, (int)getY() + pixelSize*28, pixelSize, pixelSize);
		g.fillRect((int)getX() + pixelSize*6, (int)getY() + pixelSize*27, pixelSize, pixelSize);
		g.fillRect((int)getX() + pixelSize*8, (int)getY() + pixelSize*30, pixelSize, pixelSize);
		g.fillRect((int)getX() + pixelSize*9, (int)getY() + pixelSize*29, pixelSize, pixelSize);
		g.fillRect((int)getX() + pixelSize*12, (int)getY() + pixelSize*29, pixelSize, pixelSize*2);
		g.fillRect((int)getX() + pixelSize*13, (int)getY() + pixelSize*31, pixelSize, pixelSize);
		g.fillRect((int)getX() + pixelSize*14, (int)getY() + pixelSize*30, pixelSize, pixelSize*4);
		g.fillRect((int)getX() + pixelSize*15, (int)getY() + pixelSize*33, pixelSize, pixelSize);
		g.fillRect((int)getX() + pixelSize*14, (int)getY() + pixelSize*4, pixelSize, pixelSize*2);
		g.fillRect((int)getX() + pixelSize*15, (int)getY() + pixelSize*3, pixelSize, pixelSize);
		g.fillRect((int)getX() + pixelSize*16, (int)getY() + pixelSize, pixelSize, pixelSize*2);
		g.fillRect((int)getX() + pixelSize*17, (int)getY() + pixelSize*3, pixelSize, pixelSize);
		g.fillRect((int)getX() + pixelSize*20, (int)getY() + pixelSize, pixelSize, pixelSize);
		g.fillRect((int)getX() + pixelSize*20, (int)getY() + pixelSize*5, pixelSize, pixelSize);
		g.fillRect((int)getX() + pixelSize*20, (int)getY() + pixelSize*7, pixelSize, pixelSize);
		g.fillRect((int)getX() + pixelSize*21, (int)getY() + pixelSize*3, pixelSize, pixelSize*4);
		g.fillRect((int)getX() + pixelSize*21, (int)getY() + pixelSize*3, pixelSize*4, pixelSize);
		g.fillRect((int)getX() + pixelSize*23, (int)getY() + pixelSize*2, pixelSize, pixelSize);
		g.fillRect((int)getX() + pixelSize*22, (int)getY() + pixelSize*9, pixelSize, pixelSize);
		g.fillRect((int)getX() + pixelSize*23, (int)getY() + pixelSize*8, pixelSize, pixelSize);
		g.fillRect((int)getX() + pixelSize*24, (int)getY() + pixelSize*7, pixelSize, pixelSize);
		g.fillRect((int)getX() + pixelSize*25, (int)getY() + pixelSize*6, pixelSize*5, pixelSize);
		g.fillRect((int)getX() + pixelSize*27, (int)getY() + pixelSize*4, pixelSize, pixelSize*2);
		g.fillRect((int)getX() + pixelSize*28, (int)getY() + pixelSize*5, pixelSize, pixelSize);
		g.fillRect((int)getX() + pixelSize*29, (int)getY() + pixelSize*9, pixelSize, pixelSize);
		g.fillRect((int)getX() + pixelSize*30, (int)getY() + pixelSize*7, pixelSize, pixelSize*2);
		g.fillRect((int)getX() + pixelSize*24, (int)getY() + pixelSize*13, pixelSize, pixelSize);
		g.fillRect((int)getX() + pixelSize*25, (int)getY() + pixelSize*12, pixelSize*3, pixelSize);
		g.fillRect((int)getX() + pixelSize*27, (int)getY() + pixelSize*14, pixelSize, pixelSize);
		g.fillRect((int)getX() + pixelSize*28, (int)getY() + pixelSize*13, pixelSize*5, pixelSize);
		g.fillRect((int)getX() + pixelSize*29, (int)getY() + pixelSize*14, pixelSize, pixelSize);
		g.fillRect((int)getX() + pixelSize*32, (int)getY() + pixelSize*12, pixelSize, pixelSize*2);
		g.fillRect((int)getX() + pixelSize*33, (int)getY() + pixelSize*14, pixelSize, pixelSize);
		g.fillRect((int)getX() + pixelSize*33, (int)getY() + pixelSize*16, pixelSize, pixelSize*3);
		g.fillRect((int)getX() + pixelSize*30, (int)getY() + pixelSize*17, pixelSize*4, pixelSize);
		g.fillRect((int)getX() + pixelSize*30, (int)getY() + pixelSize*20, pixelSize*4, pixelSize);
		g.fillRect((int)getX() + pixelSize*23, (int)getY() + pixelSize*17, pixelSize, pixelSize);
		g.fillRect((int)getX() + pixelSize*24, (int)getY() + pixelSize*18, pixelSize*2, pixelSize);
		g.fillRect((int)getX() + pixelSize*25, (int)getY() + pixelSize*20, pixelSize, pixelSize);
		g.fillRect((int)getX() + pixelSize*26, (int)getY() + pixelSize*19, pixelSize*4, pixelSize);
		g.fillRect((int)getX() + pixelSize*27, (int)getY() + pixelSize*22, pixelSize*2, pixelSize);
		g.fillRect((int)getX() + pixelSize*29, (int)getY() + pixelSize*21, pixelSize, pixelSize);
		g.fillRect((int)getX() + pixelSize*32, (int)getY() + pixelSize*21, pixelSize, pixelSize);
		g.fillRect((int)getX() + pixelSize*32, (int)getY() + pixelSize*23, pixelSize, pixelSize);
		g.fillRect((int)getX() + pixelSize*30, (int)getY() + pixelSize*24, pixelSize*2, pixelSize);
		g.fillRect((int)getX() + pixelSize*31, (int)getY() + pixelSize*25, pixelSize, pixelSize);
		g.fillRect((int)getX() + pixelSize*25, (int)getY() + pixelSize*25, pixelSize, pixelSize);
		g.fillRect((int)getX() + pixelSize*26, (int)getY() + pixelSize*26, pixelSize*2, pixelSize);
		g.fillRect((int)getX() + pixelSize*28, (int)getY() + pixelSize*27, pixelSize*3, pixelSize);
		g.fillRect((int)getX() + pixelSize*29, (int)getY() + pixelSize*28, pixelSize, pixelSize);
		g.fillRect((int)getX() + pixelSize*28, (int)getY() + pixelSize*29, pixelSize, pixelSize);
		g.fillRect((int)getX() + pixelSize*25, (int)getY() + pixelSize*30, pixelSize*3, pixelSize);
		g.fillRect((int)getX() + pixelSize*25, (int)getY() + pixelSize*30, pixelSize, pixelSize*2);
		g.fillRect((int)getX() + pixelSize*24, (int)getY() + pixelSize*29, pixelSize, pixelSize);
		g.fillRect((int)getX() + pixelSize*23, (int)getY() + pixelSize*26, pixelSize, pixelSize*3);
		g.fillRect((int)getX() + pixelSize*22, (int)getY() + pixelSize*25, pixelSize, pixelSize);
		g.fillRect((int)getX() + pixelSize*21, (int)getY() + pixelSize*24, pixelSize, pixelSize);
		g.fillRect((int)getX() + pixelSize*22, (int)getY() + pixelSize*27, pixelSize, pixelSize);
		g.fillRect((int)getX() + pixelSize*21, (int)getY() + pixelSize*28, pixelSize, pixelSize);
		g.fillRect((int)getX() + pixelSize*17, (int)getY() + pixelSize*28, pixelSize, pixelSize);
		g.fillRect((int)getX() + pixelSize*18, (int)getY() + pixelSize*29, pixelSize, pixelSize*3);
		g.fillRect((int)getX() + pixelSize*19, (int)getY() + pixelSize*32, pixelSize*3, pixelSize);
		g.fillRect((int)getX() + pixelSize*20, (int)getY() + pixelSize*33, pixelSize, pixelSize);
		g.fillRect((int)getX() + pixelSize*23, (int)getY() + pixelSize*31, pixelSize, pixelSize*2);
		
		//White
		g.setColor(Color.WHITE);
		g.fillRect((int)getX() + pixelSize*7, (int)getY() + pixelSize*16, pixelSize, pixelSize);
		g.fillRect((int)getX() + pixelSize*7, (int)getY() + pixelSize*18, pixelSize, pixelSize);
		g.fillRect((int)getX() + pixelSize*8, (int)getY() + pixelSize*15, pixelSize, pixelSize);
		g.fillRect((int)getX() + pixelSize*9, (int)getY() + pixelSize*14, pixelSize, pixelSize);
		g.fillRect((int)getX() + pixelSize*10, (int)getY() + pixelSize*20, pixelSize, pixelSize);
		g.fillRect((int)getX() + pixelSize*11, (int)getY() + pixelSize*19, pixelSize, pixelSize);
		g.fillRect((int)getX() + pixelSize*11, (int)getY() + pixelSize*23, pixelSize, pixelSize);
		g.fillRect((int)getX() + pixelSize*13, (int)getY() + pixelSize*22, pixelSize, pixelSize);
		g.fillRect((int)getX() + pixelSize*13, (int)getY() + pixelSize*20, pixelSize, pixelSize);
		g.fillRect((int)getX() + pixelSize*14, (int)getY() + pixelSize*21, pixelSize, pixelSize);
		g.fillRect((int)getX() + pixelSize*14, (int)getY() + pixelSize*18, pixelSize, pixelSize);
		g.fillRect((int)getX() + pixelSize*15, (int)getY() + pixelSize*19, pixelSize, pixelSize);
		
		//Black
		g.setColor(Color.BLACK);
		g.fillRect((int)getX() + pixelSize*6, (int)getY() + pixelSize*15, pixelSize, pixelSize*5);
		g.fillRect((int)getX() + pixelSize*7, (int)getY() + pixelSize*14, pixelSize, pixelSize);
		g.fillRect((int)getX() + pixelSize*7, (int)getY() + pixelSize*20, pixelSize*3, pixelSize);
		g.fillRect((int)getX() + pixelSize*8, (int)getY() + pixelSize*21, pixelSize*3, pixelSize);
		g.fillRect((int)getX() + pixelSize*11, (int)getY() + pixelSize*20, pixelSize, pixelSize);
		g.fillRect((int)getX() + pixelSize*8, (int)getY() + pixelSize*13, pixelSize*3, pixelSize);
		g.fillRect((int)getX() + pixelSize*12, (int)getY() + pixelSize*15, pixelSize, pixelSize*5);
		g.fillRect((int)getX() + pixelSize*11, (int)getY() + pixelSize*14, pixelSize, pixelSize*4);
		g.fillRect((int)getX() + pixelSize*10, (int)getY() + pixelSize*14, pixelSize, pixelSize*5);
		g.fillRect((int)getX() + pixelSize*9, (int)getY() + pixelSize*16, pixelSize, pixelSize*4);
		g.fillRect((int)getX() + pixelSize*8, (int)getY() + pixelSize*17, pixelSize, pixelSize*3);
		
		//Gray
		g.setColor(Color.LIGHT_GRAY);
		g.fillRect((int)getX() + pixelSize*7, (int)getY() + pixelSize*15, pixelSize, pixelSize);
		g.fillRect((int)getX() + pixelSize*7, (int)getY() + pixelSize*17, pixelSize, pixelSize);
		g.fillRect((int)getX() + pixelSize*7, (int)getY() + pixelSize*19, pixelSize, pixelSize);
		g.fillRect((int)getX() + pixelSize*8, (int)getY() + pixelSize*14, pixelSize, pixelSize);
		g.fillRect((int)getX() + pixelSize*8, (int)getY() + pixelSize*16, pixelSize, pixelSize);
		g.fillRect((int)getX() + pixelSize*9, (int)getY() + pixelSize*15, pixelSize, pixelSize);
		g.fillRect((int)getX() + pixelSize*10, (int)getY() + pixelSize*19, pixelSize, pixelSize);
		g.fillRect((int)getX() + pixelSize*11, (int)getY() + pixelSize*18, pixelSize, pixelSize);
	}

	/**
	 * Draws monster but in white
	 * @param g the Graphics object
	 */
	public void drawWhite(Graphics g) {
		g.setColor(Color.WHITE);
		g.fillRect((int)getX(), (int)getY() + pixelSize*14, pixelSize, pixelSize*7);
		g.fillRect((int)getX() + pixelSize, (int)getY() + pixelSize*11, pixelSize, pixelSize*3);
		g.fillRect((int)getX() + pixelSize, (int)getY() + pixelSize*21, pixelSize, pixelSize*3);
		g.fillRect((int)getX() + pixelSize*2, (int)getY() + pixelSize*9, pixelSize, pixelSize*2);
		g.fillRect((int)getX() + pixelSize*2, (int)getY() + pixelSize*24, pixelSize, pixelSize*2);
		g.fillRect((int)getX() + pixelSize*3, (int)getY() + pixelSize*7, pixelSize, pixelSize*2);
		g.fillRect((int)getX() + pixelSize*3, (int)getY() + pixelSize*26, pixelSize, pixelSize*2);
		g.fillRect((int)getX() + pixelSize*4, (int)getY() + pixelSize*28, pixelSize, pixelSize);
		g.fillRect((int)getX() + pixelSize*4, (int)getY() + pixelSize*6, pixelSize, pixelSize);
		g.fillRect((int)getX() + pixelSize*5, (int)getY() + pixelSize*5, pixelSize, pixelSize);
		g.fillRect((int)getX() + pixelSize*5, (int)getY() + pixelSize*29, pixelSize, pixelSize);
		g.fillRect((int)getX() + pixelSize*6, (int)getY() + pixelSize*4, pixelSize, pixelSize);
		g.fillRect((int)getX() + pixelSize*6, (int)getY() + pixelSize*30, pixelSize, pixelSize);
		g.fillRect((int)getX() + pixelSize*7, (int)getY() + pixelSize*3, pixelSize*2, pixelSize);
		g.fillRect((int)getX() + pixelSize*7, (int)getY() + pixelSize*31, pixelSize*2, pixelSize);
		g.fillRect((int)getX() + pixelSize*9, (int)getY() + pixelSize*2, pixelSize*2, pixelSize);
		g.fillRect((int)getX() + pixelSize*9, (int)getY() + pixelSize*32, pixelSize*2, pixelSize);
		g.fillRect((int)getX() + pixelSize*11, (int)getY() + pixelSize, pixelSize*3, pixelSize);
		g.fillRect((int)getX() + pixelSize*11, (int)getY() + pixelSize*33, pixelSize*3, pixelSize);
		g.fillRect((int)getX() + pixelSize*14, (int)getY(), pixelSize*7, pixelSize);
		g.fillRect((int)getX() + pixelSize*14, (int)getY() + pixelSize*34, pixelSize*7, pixelSize);
		g.fillRect((int)getX() + pixelSize*21, (int)getY() + pixelSize, pixelSize*3, pixelSize);
		g.fillRect((int)getX() + pixelSize*21, (int)getY() + pixelSize*33, pixelSize*3, pixelSize);
		g.fillRect((int)getX() + pixelSize*21, (int)getY() + pixelSize*39, pixelSize, pixelSize*6);
		g.fillRect((int)getX() + pixelSize*22, (int)getY() + pixelSize*38, pixelSize, pixelSize);
		g.fillRect((int)getX() + pixelSize*22, (int)getY() + pixelSize*45, pixelSize, pixelSize);
		g.fillRect((int)getX() + pixelSize*23, (int)getY() + pixelSize*37, pixelSize, pixelSize);
		g.fillRect((int)getX() + pixelSize*23, (int)getY() + pixelSize*46, pixelSize, pixelSize);
		g.fillRect((int)getX() + pixelSize*24, (int)getY() + pixelSize*2, pixelSize*2, pixelSize);
		g.fillRect((int)getX() + pixelSize*24, (int)getY() + pixelSize*32, pixelSize*2, pixelSize);
		g.fillRect((int)getX() + pixelSize*24, (int)getY() + pixelSize*36, pixelSize, pixelSize);
		g.fillRect((int)getX() + pixelSize*24, (int)getY() + pixelSize*41, pixelSize, pixelSize*4);
		g.fillRect((int)getX() + pixelSize*24, (int)getY() + pixelSize*47, pixelSize*4, pixelSize);
		g.fillRect((int)getX() + pixelSize*25, (int)getY() + pixelSize*35, pixelSize*2, pixelSize);
		g.fillRect((int)getX() + pixelSize*25, (int)getY() + pixelSize*40, pixelSize, pixelSize);
		g.fillRect((int)getX() + pixelSize*25, (int)getY() + pixelSize*45, pixelSize*2, pixelSize);
		g.fillRect((int)getX() + pixelSize*26, (int)getY() + pixelSize*3, pixelSize*2, pixelSize);
		g.fillRect((int)getX() + pixelSize*26, (int)getY() + pixelSize*31, pixelSize*2, pixelSize);
		g.fillRect((int)getX() + pixelSize*26, (int)getY() + pixelSize*39, pixelSize*2, pixelSize);
		g.fillRect((int)getX() + pixelSize*26, (int)getY() + pixelSize*42, pixelSize*2, pixelSize);
		g.fillRect((int)getX() + pixelSize*26, (int)getY() + pixelSize*43, pixelSize, pixelSize);
		g.fillRect((int)getX() + pixelSize*27, (int)getY() + pixelSize*34, pixelSize*2, pixelSize);
		g.fillRect((int)getX() + pixelSize*27, (int)getY() + pixelSize*44, pixelSize, pixelSize);
		g.fillRect((int)getX() + pixelSize*28, (int)getY() + pixelSize*4, pixelSize, pixelSize);
		g.fillRect((int)getX() + pixelSize*28, (int)getY() + pixelSize*30, pixelSize, pixelSize);
		g.fillRect((int)getX() + pixelSize*28, (int)getY() + pixelSize*38, pixelSize*2, pixelSize);
		g.fillRect((int)getX() + pixelSize*28, (int)getY() + pixelSize*43, pixelSize, pixelSize);
		g.fillRect((int)getX() + pixelSize*28, (int)getY() + pixelSize*46, pixelSize, pixelSize);
		g.fillRect((int)getX() + pixelSize*29, (int)getY() + pixelSize*44, pixelSize, pixelSize*2);
		g.fillRect((int)getX() + pixelSize*29, (int)getY() + pixelSize*33, pixelSize*2, pixelSize);
		g.fillRect((int)getX() + pixelSize*29, (int)getY() + pixelSize*5, pixelSize, pixelSize);
		g.fillRect((int)getX() + pixelSize*29, (int)getY() + pixelSize*29, pixelSize*3, pixelSize);
		g.fillRect((int)getX() + pixelSize*30, (int)getY() + pixelSize*6, pixelSize, pixelSize);
		g.fillRect((int)getX() + pixelSize*30, (int)getY() + pixelSize*28, pixelSize, pixelSize);
		g.fillRect((int)getX() + pixelSize*30, (int)getY() + pixelSize*37, pixelSize*2, pixelSize);
		g.fillRect((int)getX() + pixelSize*31, (int)getY() + pixelSize*7, pixelSize, pixelSize*2);
		g.fillRect((int)getX() + pixelSize*31, (int)getY() + pixelSize*26, pixelSize, pixelSize*2);
		g.fillRect((int)getX() + pixelSize*31, (int)getY() + pixelSize*32, pixelSize, pixelSize);
		g.fillRect((int)getX() + pixelSize*32, (int)getY() + pixelSize*9, pixelSize, pixelSize*2);
		g.fillRect((int)getX() + pixelSize*32, (int)getY() + pixelSize*24, pixelSize, pixelSize*2);
		g.fillRect((int)getX() + pixelSize*32, (int)getY() + pixelSize*30, pixelSize, pixelSize*2);
		g.fillRect((int)getX() + pixelSize*32, (int)getY() + pixelSize*36, pixelSize*2, pixelSize);
		g.fillRect((int)getX() + pixelSize*33, (int)getY() + pixelSize*11, pixelSize, pixelSize*3);
		g.fillRect((int)getX() + pixelSize*33, (int)getY() + pixelSize*21, pixelSize, pixelSize*3);
		g.fillRect((int)getX() + pixelSize*34, (int)getY() + pixelSize*14, pixelSize, pixelSize*7);
		g.fillRect((int)getX() + pixelSize*34, (int)getY() + pixelSize*35, pixelSize*2, pixelSize);
		g.fillRect((int)getX() + pixelSize*35, (int)getY() + pixelSize*20, pixelSize, pixelSize*2);
		g.fillRect((int)getX() + pixelSize*36, (int)getY() + pixelSize*22, pixelSize, pixelSize*2);
		g.fillRect((int)getX() + pixelSize*36, (int)getY() + pixelSize*34, pixelSize, pixelSize);
		g.fillRect((int)getX() + pixelSize*37, (int)getY() + pixelSize*24, pixelSize, pixelSize*2);
		g.fillRect((int)getX() + pixelSize*37, (int)getY() + pixelSize*32, pixelSize, pixelSize*2);
		g.fillRect((int)getX() + pixelSize*38, (int)getY() + pixelSize*26, pixelSize, pixelSize*6);
		g.fillRect((int)getX() + pixelSize, (int)getY() + pixelSize*20, pixelSize, pixelSize);
		g.fillRect((int)getX() + pixelSize, (int)getY() + pixelSize*14, pixelSize, pixelSize);
		g.fillRect((int)getX() + pixelSize*2, (int)getY() + pixelSize*11, pixelSize, pixelSize*2);
		g.fillRect((int)getX() + pixelSize*4, (int)getY() + pixelSize*7, pixelSize, pixelSize);
		g.fillRect((int)getX() + pixelSize*4, (int)getY() + pixelSize*26, pixelSize, pixelSize*2);
		g.fillRect((int)getX() + pixelSize*5, (int)getY() + pixelSize*27, pixelSize, pixelSize);
		g.fillRect((int)getX() + pixelSize*6, (int)getY() + pixelSize*5, pixelSize, pixelSize);
		g.fillRect((int)getX() + pixelSize*6, (int)getY() + pixelSize*28, pixelSize, pixelSize);
		g.fillRect((int)getX() + pixelSize*6, (int)getY() + pixelSize*29, pixelSize*3, pixelSize);
		g.fillRect((int)getX() + pixelSize*7, (int)getY() + pixelSize*4, pixelSize*2, pixelSize);
		g.fillRect((int)getX() + pixelSize*7, (int)getY() + pixelSize*30, pixelSize, pixelSize);
		g.fillRect((int)getX() + pixelSize*9, (int)getY() + pixelSize*3, pixelSize*2, pixelSize);
		g.fillRect((int)getX() + pixelSize*9, (int)getY() + pixelSize*30, pixelSize*3, pixelSize*2);
		g.fillRect((int)getX() + pixelSize*11, (int)getY() + pixelSize*32, pixelSize*3, pixelSize);
		g.fillRect((int)getX() + pixelSize*11, (int)getY() + pixelSize*2, pixelSize*5, pixelSize);
		g.fillRect((int)getX() + pixelSize*11, (int)getY() + pixelSize*31, pixelSize*2, pixelSize);
		g.fillRect((int)getX() + pixelSize*14, (int)getY() + pixelSize, pixelSize*2, pixelSize);
		g.fillRect((int)getX() + pixelSize*15, (int)getY() + pixelSize*31, pixelSize*3, pixelSize*2);
		g.fillRect((int)getX() + pixelSize*16, (int)getY() + pixelSize*32, pixelSize*3, pixelSize*2);
		g.fillRect((int)getX() + pixelSize*17, (int)getY() + pixelSize, pixelSize*3, pixelSize*2);
		g.fillRect((int)getX() + pixelSize*17, (int)getY() + pixelSize*33, pixelSize*3, pixelSize);
		g.fillRect((int)getX() + pixelSize*19, (int)getY() + pixelSize*3, pixelSize*2, pixelSize);
		g.fillRect((int)getX() + pixelSize*20, (int)getY() + pixelSize*2, pixelSize*3, pixelSize);
		g.fillRect((int)getX() + pixelSize*19, (int)getY() + pixelSize*30, pixelSize*4, pixelSize*2);
		g.fillRect((int)getX() + pixelSize*21, (int)getY() + pixelSize*29, pixelSize*3, pixelSize*2);
		g.fillRect((int)getX() + pixelSize*22, (int)getY() + pixelSize*28, pixelSize, pixelSize*5);
		g.fillRect((int)getX() + pixelSize*24, (int)getY() + pixelSize*30, pixelSize, pixelSize*2);
		g.fillRect((int)getX() + pixelSize*22, (int)getY() + pixelSize*4, pixelSize*5, pixelSize*2);
		g.fillRect((int)getX() + pixelSize*22, (int)getY() + pixelSize*4, pixelSize*3, pixelSize*3);
		g.fillRect((int)getX() + pixelSize*23, (int)getY() + pixelSize*7, pixelSize, pixelSize);
		g.fillRect((int)getX() + pixelSize*25, (int)getY() + pixelSize*3, pixelSize, pixelSize);
		g.fillRect((int)getX() + pixelSize*24, (int)getY() + pixelSize*25, pixelSize, pixelSize*4);
		g.fillRect((int)getX() + pixelSize*24, (int)getY() + pixelSize*8, pixelSize, pixelSize);
		g.fillRect((int)getX() + pixelSize*25, (int)getY() + pixelSize*7, pixelSize*4, pixelSize*4);
		g.fillRect((int)getX() + pixelSize*25, (int)getY() + pixelSize*7, pixelSize*5, pixelSize*2);
		g.fillRect((int)getX() + pixelSize*26, (int)getY() + pixelSize*10, pixelSize*6, pixelSize*2);
		g.fillRect((int)getX() + pixelSize*28, (int)getY() + pixelSize*10, pixelSize*4, pixelSize*3);
		g.fillRect((int)getX() + pixelSize*30, (int)getY() + pixelSize*9, pixelSize*2, pixelSize);
		g.fillRect((int)getX() + pixelSize*32, (int)getY() + pixelSize*11, pixelSize, pixelSize);
		g.fillRect((int)getX() + pixelSize*27, (int)getY() + pixelSize*13, pixelSize, pixelSize);
		g.fillRect((int)getX() + pixelSize*28, (int)getY() + pixelSize*14, pixelSize, pixelSize);
		g.fillRect((int)getX() + pixelSize*30, (int)getY() + pixelSize*14, pixelSize*3, pixelSize);
		g.fillRect((int)getX() + pixelSize*33, (int)getY() + pixelSize*15, pixelSize, pixelSize);
		g.fillRect((int)getX() + pixelSize*30, (int)getY() + pixelSize*19, pixelSize*4, pixelSize);
		g.fillRect((int)getX() + pixelSize*27, (int)getY() + pixelSize*20, pixelSize*3, pixelSize);
		g.fillRect((int)getX() + pixelSize*27, (int)getY() + pixelSize*20, pixelSize*2, pixelSize*2);
		g.fillRect((int)getX() + pixelSize*27, (int)getY() + pixelSize*15, pixelSize*6, pixelSize*2);
		g.fillRect((int)getX() + pixelSize*27, (int)getY() + pixelSize*15, pixelSize*3, pixelSize*4);
		g.fillRect((int)getX() + pixelSize*30, (int)getY() + pixelSize*18, pixelSize*3, pixelSize*2);
		g.fillRect((int)getX() + pixelSize*29, (int)getY() + pixelSize*22, pixelSize*4, pixelSize);
		g.fillRect((int)getX() + pixelSize*30, (int)getY() + pixelSize*21, pixelSize*2, pixelSize*3);
		g.fillRect((int)getX() + pixelSize*27, (int)getY() + pixelSize*23, pixelSize*3, pixelSize*3);
		g.fillRect((int)getX() + pixelSize*28, (int)getY() + pixelSize*25, pixelSize*3, pixelSize*2);
		g.fillRect((int)getX() + pixelSize*26, (int)getY() + pixelSize*22, pixelSize, pixelSize*4);
		g.fillRect((int)getX() + pixelSize*25, (int)getY() + pixelSize*24, pixelSize, pixelSize);
		g.fillRect((int)getX() + pixelSize*25, (int)getY() + pixelSize*26, pixelSize, pixelSize*4);
		g.fillRect((int)getX() + pixelSize*26, (int)getY() + pixelSize*27, pixelSize*3, pixelSize*3);
		g.fillRect((int)getX() + pixelSize*29, (int)getY() + pixelSize*28, pixelSize, pixelSize);
		g.fillRect((int)getX() + pixelSize*24, (int)getY() + pixelSize*46, pixelSize, pixelSize);
		g.fillRect((int)getX() + pixelSize*26, (int)getY() + pixelSize*46, pixelSize, pixelSize);
		g.fillRect((int)getX() + pixelSize*27, (int)getY() + pixelSize*45, pixelSize, pixelSize);
		g.fillRect((int)getX() + pixelSize*23, (int)getY() + pixelSize*45, pixelSize, pixelSize);
		g.fillRect((int)getX() + pixelSize*22, (int)getY() + pixelSize*44, pixelSize, pixelSize);
		g.fillRect((int)getX() + pixelSize*22, (int)getY() + pixelSize*39, pixelSize, pixelSize);
		g.fillRect((int)getX() + pixelSize*25, (int)getY() + pixelSize*39, pixelSize, pixelSize);
		g.fillRect((int)getX() + pixelSize*27, (int)getY() + pixelSize*38, pixelSize, pixelSize);
		g.fillRect((int)getX() + pixelSize*29, (int)getY() + pixelSize*37, pixelSize, pixelSize);
		g.fillRect((int)getX() + pixelSize*30, (int)getY() + pixelSize*36, pixelSize*2, pixelSize);
		g.fillRect((int)getX() + pixelSize*32, (int)getY() + pixelSize*35, pixelSize*2, pixelSize);
		g.fillRect((int)getX() + pixelSize*31, (int)getY() + pixelSize*28, pixelSize, pixelSize);
		g.fillRect((int)getX() + pixelSize*32, (int)getY() + pixelSize*26, pixelSize, pixelSize);
		g.fillRect((int)getX() + pixelSize*33, (int)getY() + pixelSize*24, pixelSize, pixelSize);
		g.fillRect((int)getX() + pixelSize*34, (int)getY() + pixelSize*21, pixelSize, pixelSize*3);
		g.fillRect((int)getX() + pixelSize*35, (int)getY() + pixelSize*22, pixelSize, pixelSize*3);
		g.fillRect((int)getX() + pixelSize*36, (int)getY() + pixelSize*24, pixelSize, pixelSize*4);
		g.fillRect((int)getX() + pixelSize*37, (int)getY() + pixelSize*26, pixelSize, pixelSize*6);
		g.fillRect((int)getX() + pixelSize*36, (int)getY() + pixelSize*31, pixelSize, pixelSize*3);
		g.fillRect((int)getX() + pixelSize*35, (int)getY() + pixelSize*33, pixelSize, pixelSize*2);
		g.fillRect((int)getX() + pixelSize*34, (int)getY() + pixelSize*34, pixelSize, pixelSize);
		g.fillRect((int)getX() + pixelSize*11, (int)getY() + pixelSize*3, pixelSize*8, pixelSize);
		g.fillRect((int)getX() + pixelSize*9, (int)getY() + pixelSize*4, pixelSize*12, pixelSize);
		g.fillRect((int)getX() + pixelSize*7, (int)getY() + pixelSize*5, pixelSize*13, pixelSize);
		g.fillRect((int)getX() + pixelSize*5, (int)getY() + pixelSize*6, pixelSize*16, pixelSize);
		g.fillRect((int)getX() + pixelSize*5, (int)getY() + pixelSize*7, pixelSize*18, pixelSize);
		g.fillRect((int)getX() + pixelSize*4, (int)getY() + pixelSize*8, pixelSize*19, pixelSize);
		g.fillRect((int)getX() + pixelSize*3, (int)getY() + pixelSize*9, pixelSize*22, pixelSize*2);
		g.fillRect((int)getX() + pixelSize*3, (int)getY() + pixelSize*11, pixelSize*23, pixelSize*2);
		g.fillRect((int)getX() + pixelSize*2, (int)getY() + pixelSize*13, pixelSize*25, pixelSize*2);
		g.fillRect((int)getX() + pixelSize, (int)getY() + pixelSize*15, pixelSize*26, pixelSize*5);
		g.fillRect((int)getX() + pixelSize*2, (int)getY() + pixelSize*20, pixelSize*25, pixelSize*2);
		g.fillRect((int)getX() + pixelSize*2, (int)getY() + pixelSize*20, pixelSize*24, pixelSize*4);
		g.fillRect((int)getX() + pixelSize*3, (int)getY() + pixelSize*24, pixelSize*22, pixelSize);
		g.fillRect((int)getX() + pixelSize*4, (int)getY() + pixelSize*25, pixelSize*20, pixelSize);
		g.fillRect((int)getX() + pixelSize*5, (int)getY() + pixelSize*26, pixelSize*18, pixelSize);
		g.fillRect((int)getX() + pixelSize*7, (int)getY() + pixelSize*27, pixelSize*15, pixelSize*2);
		g.fillRect((int)getX() + pixelSize*10, (int)getY() + pixelSize*29, pixelSize*11, pixelSize);
		g.fillRect((int)getX() + pixelSize*13, (int)getY() + pixelSize*30, pixelSize*6, pixelSize);
		g.fillRect((int)getX() + pixelSize*34, (int)getY() + pixelSize*24, pixelSize, pixelSize);
		g.fillRect((int)getX() + pixelSize*33, (int)getY() + pixelSize*25, pixelSize*3, pixelSize*8);
		g.fillRect((int)getX() + pixelSize*32, (int)getY() + pixelSize*27, pixelSize, pixelSize);
		g.fillRect((int)getX() + pixelSize*32, (int)getY() + pixelSize*28, pixelSize, pixelSize*2);
		g.fillRect((int)getX() + pixelSize*36, (int)getY() + pixelSize*28, pixelSize, pixelSize*3);
		g.fillRect((int)getX() + pixelSize*32, (int)getY() + pixelSize*32, pixelSize*3, pixelSize*2);
		g.fillRect((int)getX() + pixelSize*31, (int)getY() + pixelSize*33, pixelSize*3, pixelSize*2);
		g.fillRect((int)getX() + pixelSize*29, (int)getY() + pixelSize*34, pixelSize*3, pixelSize*2);
		g.fillRect((int)getX() + pixelSize*27, (int)getY() + pixelSize*35, pixelSize*3, pixelSize*2);
		g.fillRect((int)getX() + pixelSize*25, (int)getY() + pixelSize*36, pixelSize*4, pixelSize*2);
		g.fillRect((int)getX() + pixelSize*24, (int)getY() + pixelSize*37, pixelSize*3, pixelSize*2);
		g.fillRect((int)getX() + pixelSize*23, (int)getY() + pixelSize*38, pixelSize*2, pixelSize*3);
		g.fillRect((int)getX() + pixelSize*22, (int)getY() + pixelSize*40, pixelSize*2, pixelSize*4);
		g.fillRect((int)getX() + pixelSize*23, (int)getY() + pixelSize*44, pixelSize, pixelSize);
		g.fillRect((int)getX() + pixelSize*24, (int)getY() + pixelSize*45, pixelSize, pixelSize);
		g.fillRect((int)getX() + pixelSize*25, (int)getY() + pixelSize*46, pixelSize, pixelSize);
		g.fillRect((int)getX() + pixelSize*27, (int)getY() + pixelSize*46, pixelSize, pixelSize);
		g.fillRect((int)getX() + pixelSize*28, (int)getY() + pixelSize*44, pixelSize, pixelSize*2);
		g.fillRect((int)getX() + pixelSize*27, (int)getY() + pixelSize*43, pixelSize, pixelSize);
		g.fillRect((int)getX() + pixelSize*3, (int)getY() + pixelSize*14, pixelSize, pixelSize*7);
		g.fillRect((int)getX() + pixelSize*4, (int)getY() + pixelSize*12, pixelSize, pixelSize*4);
		g.fillRect((int)getX() + pixelSize*4, (int)getY() + pixelSize*21, pixelSize, pixelSize*2);
		g.fillRect((int)getX() + pixelSize*5, (int)getY() + pixelSize*23, pixelSize, pixelSize);
		g.fillRect((int)getX() + pixelSize*6, (int)getY() + pixelSize*24, pixelSize*2, pixelSize);
		g.fillRect((int)getX() + pixelSize*8, (int)getY() + pixelSize*25, pixelSize*3, pixelSize);
		g.fillRect((int)getX() + pixelSize*5, (int)getY() + pixelSize*11, pixelSize, pixelSize*2);
		g.fillRect((int)getX() + pixelSize*6, (int)getY() + pixelSize*10, pixelSize*3, pixelSize);
		g.fillRect((int)getX() + pixelSize*6, (int)getY() + pixelSize*10, pixelSize, pixelSize*2);
		g.fillRect((int)getX() + pixelSize*8, (int)getY() + pixelSize*9, pixelSize*5, pixelSize);
		g.fillRect((int)getX() + pixelSize*13, (int)getY() + pixelSize*10, pixelSize*2, pixelSize);
		g.fillRect((int)getX() + pixelSize*15, (int)getY() + pixelSize*11, pixelSize, pixelSize);
		g.fillRect((int)getX() + pixelSize*16, (int)getY() + pixelSize*12, pixelSize, pixelSize*2);
		g.fillRect((int)getX() + pixelSize*17, (int)getY() + pixelSize*14, pixelSize, pixelSize);
		g.fillRect((int)getX() + pixelSize*17, (int)getY() + pixelSize*16, pixelSize, pixelSize);
		g.fillRect((int)getX() + pixelSize*4, (int)getY() + pixelSize*16, pixelSize, pixelSize*5);
		g.fillRect((int)getX() + pixelSize*4, (int)getY() + pixelSize*16, pixelSize*2, pixelSize);
		g.fillRect((int)getX() + pixelSize*4, (int)getY() + pixelSize*18, pixelSize*2, pixelSize);
		g.fillRect((int)getX() + pixelSize*4, (int)getY() + pixelSize*20, pixelSize*3, pixelSize);
		g.fillRect((int)getX() + pixelSize*5, (int)getY() + pixelSize*13, pixelSize, pixelSize);
		g.fillRect((int)getX() + pixelSize*6, (int)getY() + pixelSize*12, pixelSize, pixelSize);
		g.fillRect((int)getX() + pixelSize*7, (int)getY() + pixelSize*11, pixelSize, pixelSize);
		g.fillRect((int)getX() + pixelSize*9, (int)getY() + pixelSize*10, pixelSize*4, pixelSize);
		g.fillRect((int)getX() + pixelSize*10, (int)getY() + pixelSize*12, pixelSize, pixelSize);
		g.fillRect((int)getX() + pixelSize*11, (int)getY() + pixelSize*11, pixelSize, pixelSize*2);
		g.fillRect((int)getX() + pixelSize*12, (int)getY() + pixelSize*13, pixelSize, pixelSize);
		g.fillRect((int)getX() + pixelSize*13, (int)getY() + pixelSize*14, pixelSize, pixelSize);
		g.fillRect((int)getX() + pixelSize*13, (int)getY() + pixelSize*11, pixelSize*2, pixelSize);
		g.fillRect((int)getX() + pixelSize*13, (int)getY() + pixelSize*11, pixelSize, pixelSize*2);
		g.fillRect((int)getX() + pixelSize*14, (int)getY() + pixelSize*13, pixelSize*2, pixelSize);
		g.fillRect((int)getX() + pixelSize*15, (int)getY() + pixelSize*12, pixelSize, pixelSize);
		g.fillRect((int)getX() + pixelSize*16, (int)getY() + pixelSize*14, pixelSize, pixelSize);
		g.fillRect((int)getX() + pixelSize*17, (int)getY() + pixelSize*15, pixelSize, pixelSize);
		g.fillRect((int)getX() + pixelSize*17, (int)getY() + pixelSize*17, pixelSize, pixelSize*4);
		g.fillRect((int)getX() + pixelSize*16, (int)getY() + pixelSize*21, pixelSize, pixelSize*2);
		g.fillRect((int)getX() + pixelSize*15, (int)getY() + pixelSize*23, pixelSize, pixelSize);
		g.fillRect((int)getX() + pixelSize*13, (int)getY() + pixelSize*24, pixelSize*2, pixelSize);
		g.fillRect((int)getX() + pixelSize*11, (int)getY() + pixelSize*25, pixelSize*2, pixelSize);
		g.fillRect((int)getX() + pixelSize*5, (int)getY() + pixelSize*21, pixelSize, pixelSize*2);
		g.fillRect((int)getX() + pixelSize*7, (int)getY() + pixelSize*21, pixelSize, pixelSize);
		g.fillRect((int)getX() + pixelSize*6, (int)getY() + pixelSize*22, pixelSize, pixelSize*2);
		g.fillRect((int)getX() + pixelSize*7, (int)getY() + pixelSize*23, pixelSize, pixelSize);
		g.fillRect((int)getX() + pixelSize*8, (int)getY() + pixelSize*24, pixelSize, pixelSize);
		g.fillRect((int)getX() + pixelSize*5, (int)getY() + pixelSize*14, pixelSize, pixelSize*2);
		g.fillRect((int)getX() + pixelSize*6, (int)getY() + pixelSize*13, pixelSize, pixelSize*2);
		g.fillRect((int)getX() + pixelSize*7, (int)getY() + pixelSize*12, pixelSize, pixelSize*2);
		g.fillRect((int)getX() + pixelSize*8, (int)getY() + pixelSize*11, pixelSize*2, pixelSize*2);
		g.fillRect((int)getX() + pixelSize*10, (int)getY() + pixelSize*11, pixelSize, pixelSize);
		g.fillRect((int)getX() + pixelSize*11, (int)getY() + pixelSize*13, pixelSize, pixelSize);
		g.fillRect((int)getX() + pixelSize*12, (int)getY() + pixelSize*11, pixelSize, pixelSize*2);
		g.fillRect((int)getX() + pixelSize*12, (int)getY() + pixelSize*14, pixelSize, pixelSize);
		g.fillRect((int)getX() + pixelSize*13, (int)getY() + pixelSize*13, pixelSize, pixelSize);
		g.fillRect((int)getX() + pixelSize*14, (int)getY() + pixelSize*12, pixelSize, pixelSize);
		g.fillRect((int)getX() + pixelSize*14, (int)getY() + pixelSize*14, pixelSize*2, pixelSize);
		g.fillRect((int)getX() + pixelSize*13, (int)getY() + pixelSize*15, pixelSize*4, pixelSize*3);
		g.fillRect((int)getX() + pixelSize*13, (int)getY() + pixelSize*18, pixelSize, pixelSize*2);
		g.fillRect((int)getX() + pixelSize*15, (int)getY() + pixelSize*18, pixelSize*2, pixelSize);
		g.fillRect((int)getX() + pixelSize*16, (int)getY() + pixelSize*19, pixelSize, pixelSize*2);
		g.fillRect((int)getX() + pixelSize*14, (int)getY() + pixelSize*19, pixelSize, pixelSize*2);
		g.fillRect((int)getX() + pixelSize*15, (int)getY() + pixelSize*20, pixelSize, pixelSize*3);
		g.fillRect((int)getX() + pixelSize*5, (int)getY() + pixelSize*17, pixelSize, pixelSize);
		g.fillRect((int)getX() + pixelSize*5, (int)getY() + pixelSize*19, pixelSize, pixelSize);
		g.fillRect((int)getX() + pixelSize*6, (int)getY() + pixelSize*21, pixelSize, pixelSize);
		g.fillRect((int)getX() + pixelSize*7, (int)getY() + pixelSize*22, pixelSize*8, pixelSize);
		g.fillRect((int)getX() + pixelSize*8, (int)getY() + pixelSize*23, pixelSize*7, pixelSize);
		g.fillRect((int)getX() + pixelSize*9, (int)getY() + pixelSize*24, pixelSize*4, pixelSize);
		g.fillRect((int)getX() + pixelSize*11, (int)getY() + pixelSize*21, pixelSize*3, pixelSize);
		g.fillRect((int)getX() + pixelSize*12, (int)getY() + pixelSize*20, pixelSize, pixelSize);
		g.fillRect((int)getX() + pixelSize*3, (int)getY() + pixelSize*25, pixelSize, pixelSize);
		g.fillRect((int)getX() + pixelSize*5, (int)getY() + pixelSize*28, pixelSize, pixelSize);
		g.fillRect((int)getX() + pixelSize*6, (int)getY() + pixelSize*27, pixelSize, pixelSize);
		g.fillRect((int)getX() + pixelSize*8, (int)getY() + pixelSize*30, pixelSize, pixelSize);
		g.fillRect((int)getX() + pixelSize*9, (int)getY() + pixelSize*29, pixelSize, pixelSize);
		g.fillRect((int)getX() + pixelSize*12, (int)getY() + pixelSize*29, pixelSize, pixelSize*2);
		g.fillRect((int)getX() + pixelSize*13, (int)getY() + pixelSize*31, pixelSize, pixelSize);
		g.fillRect((int)getX() + pixelSize*14, (int)getY() + pixelSize*30, pixelSize, pixelSize*4);
		g.fillRect((int)getX() + pixelSize*15, (int)getY() + pixelSize*33, pixelSize, pixelSize);
		g.fillRect((int)getX() + pixelSize*14, (int)getY() + pixelSize*4, pixelSize, pixelSize*2);
		g.fillRect((int)getX() + pixelSize*15, (int)getY() + pixelSize*3, pixelSize, pixelSize);
		g.fillRect((int)getX() + pixelSize*16, (int)getY() + pixelSize, pixelSize, pixelSize*2);
		g.fillRect((int)getX() + pixelSize*17, (int)getY() + pixelSize*3, pixelSize, pixelSize);
		g.fillRect((int)getX() + pixelSize*20, (int)getY() + pixelSize, pixelSize, pixelSize);
		g.fillRect((int)getX() + pixelSize*20, (int)getY() + pixelSize*5, pixelSize, pixelSize);
		g.fillRect((int)getX() + pixelSize*20, (int)getY() + pixelSize*7, pixelSize, pixelSize);
		g.fillRect((int)getX() + pixelSize*21, (int)getY() + pixelSize*3, pixelSize, pixelSize*4);
		g.fillRect((int)getX() + pixelSize*21, (int)getY() + pixelSize*3, pixelSize*4, pixelSize);
		g.fillRect((int)getX() + pixelSize*23, (int)getY() + pixelSize*2, pixelSize, pixelSize);
		g.fillRect((int)getX() + pixelSize*22, (int)getY() + pixelSize*9, pixelSize, pixelSize);
		g.fillRect((int)getX() + pixelSize*23, (int)getY() + pixelSize*8, pixelSize, pixelSize);
		g.fillRect((int)getX() + pixelSize*24, (int)getY() + pixelSize*7, pixelSize, pixelSize);
		g.fillRect((int)getX() + pixelSize*25, (int)getY() + pixelSize*6, pixelSize*5, pixelSize);
		g.fillRect((int)getX() + pixelSize*27, (int)getY() + pixelSize*4, pixelSize, pixelSize*2);
		g.fillRect((int)getX() + pixelSize*28, (int)getY() + pixelSize*5, pixelSize, pixelSize);
		g.fillRect((int)getX() + pixelSize*29, (int)getY() + pixelSize*9, pixelSize, pixelSize);
		g.fillRect((int)getX() + pixelSize*30, (int)getY() + pixelSize*7, pixelSize, pixelSize*2);
		g.fillRect((int)getX() + pixelSize*24, (int)getY() + pixelSize*13, pixelSize, pixelSize);
		g.fillRect((int)getX() + pixelSize*25, (int)getY() + pixelSize*12, pixelSize*3, pixelSize);
		g.fillRect((int)getX() + pixelSize*27, (int)getY() + pixelSize*14, pixelSize, pixelSize);
		g.fillRect((int)getX() + pixelSize*28, (int)getY() + pixelSize*13, pixelSize*5, pixelSize);
		g.fillRect((int)getX() + pixelSize*29, (int)getY() + pixelSize*14, pixelSize, pixelSize);
		g.fillRect((int)getX() + pixelSize*32, (int)getY() + pixelSize*12, pixelSize, pixelSize*2);
		g.fillRect((int)getX() + pixelSize*33, (int)getY() + pixelSize*14, pixelSize, pixelSize);
		g.fillRect((int)getX() + pixelSize*33, (int)getY() + pixelSize*16, pixelSize, pixelSize*3);
		g.fillRect((int)getX() + pixelSize*30, (int)getY() + pixelSize*17, pixelSize*4, pixelSize);
		g.fillRect((int)getX() + pixelSize*30, (int)getY() + pixelSize*20, pixelSize*4, pixelSize);
		g.fillRect((int)getX() + pixelSize*23, (int)getY() + pixelSize*17, pixelSize, pixelSize);
		g.fillRect((int)getX() + pixelSize*24, (int)getY() + pixelSize*18, pixelSize*2, pixelSize);
		g.fillRect((int)getX() + pixelSize*25, (int)getY() + pixelSize*20, pixelSize, pixelSize);
		g.fillRect((int)getX() + pixelSize*26, (int)getY() + pixelSize*19, pixelSize*4, pixelSize);
		g.fillRect((int)getX() + pixelSize*27, (int)getY() + pixelSize*22, pixelSize*2, pixelSize);
		g.fillRect((int)getX() + pixelSize*29, (int)getY() + pixelSize*21, pixelSize, pixelSize);
		g.fillRect((int)getX() + pixelSize*32, (int)getY() + pixelSize*21, pixelSize, pixelSize);
		g.fillRect((int)getX() + pixelSize*32, (int)getY() + pixelSize*23, pixelSize, pixelSize);
		g.fillRect((int)getX() + pixelSize*30, (int)getY() + pixelSize*24, pixelSize*2, pixelSize);
		g.fillRect((int)getX() + pixelSize*31, (int)getY() + pixelSize*25, pixelSize, pixelSize);
		g.fillRect((int)getX() + pixelSize*25, (int)getY() + pixelSize*25, pixelSize, pixelSize);
		g.fillRect((int)getX() + pixelSize*26, (int)getY() + pixelSize*26, pixelSize*2, pixelSize);
		g.fillRect((int)getX() + pixelSize*28, (int)getY() + pixelSize*27, pixelSize*3, pixelSize);
		g.fillRect((int)getX() + pixelSize*29, (int)getY() + pixelSize*28, pixelSize, pixelSize);
		g.fillRect((int)getX() + pixelSize*28, (int)getY() + pixelSize*29, pixelSize, pixelSize);
		g.fillRect((int)getX() + pixelSize*25, (int)getY() + pixelSize*30, pixelSize*3, pixelSize);
		g.fillRect((int)getX() + pixelSize*25, (int)getY() + pixelSize*30, pixelSize, pixelSize*2);
		g.fillRect((int)getX() + pixelSize*24, (int)getY() + pixelSize*29, pixelSize, pixelSize);
		g.fillRect((int)getX() + pixelSize*23, (int)getY() + pixelSize*26, pixelSize, pixelSize*3);
		g.fillRect((int)getX() + pixelSize*22, (int)getY() + pixelSize*25, pixelSize, pixelSize);
		g.fillRect((int)getX() + pixelSize*21, (int)getY() + pixelSize*24, pixelSize, pixelSize);
		g.fillRect((int)getX() + pixelSize*22, (int)getY() + pixelSize*27, pixelSize, pixelSize);
		g.fillRect((int)getX() + pixelSize*21, (int)getY() + pixelSize*28, pixelSize, pixelSize);
		g.fillRect((int)getX() + pixelSize*17, (int)getY() + pixelSize*28, pixelSize, pixelSize);
		g.fillRect((int)getX() + pixelSize*18, (int)getY() + pixelSize*29, pixelSize, pixelSize*3);
		g.fillRect((int)getX() + pixelSize*19, (int)getY() + pixelSize*32, pixelSize*3, pixelSize);
		g.fillRect((int)getX() + pixelSize*20, (int)getY() + pixelSize*33, pixelSize, pixelSize);
		g.fillRect((int)getX() + pixelSize*23, (int)getY() + pixelSize*31, pixelSize, pixelSize*2);
		g.fillRect((int)getX() + pixelSize*7, (int)getY() + pixelSize*16, pixelSize, pixelSize);
		g.fillRect((int)getX() + pixelSize*7, (int)getY() + pixelSize*18, pixelSize, pixelSize);
		g.fillRect((int)getX() + pixelSize*8, (int)getY() + pixelSize*15, pixelSize, pixelSize);
		g.fillRect((int)getX() + pixelSize*9, (int)getY() + pixelSize*14, pixelSize, pixelSize);
		g.fillRect((int)getX() + pixelSize*10, (int)getY() + pixelSize*20, pixelSize, pixelSize);
		g.fillRect((int)getX() + pixelSize*11, (int)getY() + pixelSize*19, pixelSize, pixelSize);
		g.fillRect((int)getX() + pixelSize*11, (int)getY() + pixelSize*23, pixelSize, pixelSize);
		g.fillRect((int)getX() + pixelSize*13, (int)getY() + pixelSize*22, pixelSize, pixelSize);
		g.fillRect((int)getX() + pixelSize*13, (int)getY() + pixelSize*20, pixelSize, pixelSize);
		g.fillRect((int)getX() + pixelSize*14, (int)getY() + pixelSize*21, pixelSize, pixelSize);
		g.fillRect((int)getX() + pixelSize*14, (int)getY() + pixelSize*18, pixelSize, pixelSize);
		g.fillRect((int)getX() + pixelSize*15, (int)getY() + pixelSize*19, pixelSize, pixelSize);
		g.fillRect((int)getX() + pixelSize*6, (int)getY() + pixelSize*15, pixelSize, pixelSize*5);
		g.fillRect((int)getX() + pixelSize*7, (int)getY() + pixelSize*14, pixelSize, pixelSize);
		g.fillRect((int)getX() + pixelSize*7, (int)getY() + pixelSize*20, pixelSize*3, pixelSize);
		g.fillRect((int)getX() + pixelSize*8, (int)getY() + pixelSize*21, pixelSize*3, pixelSize);
		g.fillRect((int)getX() + pixelSize*11, (int)getY() + pixelSize*20, pixelSize, pixelSize);
		g.fillRect((int)getX() + pixelSize*8, (int)getY() + pixelSize*13, pixelSize*3, pixelSize);
		g.fillRect((int)getX() + pixelSize*12, (int)getY() + pixelSize*15, pixelSize, pixelSize*5);
		g.fillRect((int)getX() + pixelSize*11, (int)getY() + pixelSize*14, pixelSize, pixelSize*4);
		g.fillRect((int)getX() + pixelSize*10, (int)getY() + pixelSize*14, pixelSize, pixelSize*5);
		g.fillRect((int)getX() + pixelSize*9, (int)getY() + pixelSize*16, pixelSize, pixelSize*4);
		g.fillRect((int)getX() + pixelSize*8, (int)getY() + pixelSize*17, pixelSize, pixelSize*3);
		g.fillRect((int)getX() + pixelSize*7, (int)getY() + pixelSize*15, pixelSize, pixelSize);
		g.fillRect((int)getX() + pixelSize*7, (int)getY() + pixelSize*17, pixelSize, pixelSize);
		g.fillRect((int)getX() + pixelSize*7, (int)getY() + pixelSize*19, pixelSize, pixelSize);
		g.fillRect((int)getX() + pixelSize*8, (int)getY() + pixelSize*14, pixelSize, pixelSize);
		g.fillRect((int)getX() + pixelSize*8, (int)getY() + pixelSize*16, pixelSize, pixelSize);
		g.fillRect((int)getX() + pixelSize*9, (int)getY() + pixelSize*15, pixelSize, pixelSize);
		g.fillRect((int)getX() + pixelSize*10, (int)getY() + pixelSize*19, pixelSize, pixelSize);
		g.fillRect((int)getX() + pixelSize*11, (int)getY() + pixelSize*18, pixelSize, pixelSize);
	}
	
	/**
	 * detects whether Fireball hits Eyemonster
	 * @param fireball FireBall object
	 * @return returns true if Eyemonster is hit by FireBall
	 */
	public boolean fireballhits(FireBall fireball) {
		if(fireball.getX() < getX() + getPixelSize()*39 && fireball.getX() > getX() && fireball.getY() < getY() + getPixelSize()*48 && fireball.getY() > getY()) {
			return true;
		}
		else if(fireball.getX() + fireball.getPixelSize()*10 < getX() + getPixelSize()*39 && fireball.getX() + fireball.getPixelSize()*10 > getX() && fireball.getY() + fireball.getPixelSize()*12 < getY() + getPixelSize()*48 && fireball.getY() + fireball.getPixelSize()*12 > getY()) {
			return true;
		}
		else if(fireball.getX() + fireball.getPixelSize()*10 < getX() + getPixelSize()*39 && fireball.getX() + fireball.getPixelSize()*10 > getX() && fireball.getY() + fireball.getPixelSize()*12 < getY() + getPixelSize()*48 && fireball.getY() + fireball.getPixelSize()*12 > getY()) {
			return true;
		}
		else {
			return false;
		}
	}
}
