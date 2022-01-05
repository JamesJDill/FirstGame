import java.awt.Color;
import java.awt.Graphics;

public class FireBall {

	//Private variables for Fireball
	private double x;
	private double y; 
	private double xSpeed;
	private double ySpeed;
	private int pixelSize;
	private int direction;
	
	/**
	 * Constructor for FireBall
	 * @param pixelSize the size of each pixel
	 * @param x the x-coordinate of the upper-left of the FireBall
	 * @param y the y-coordinate of the upper-left of the FireBall
	 * @param xSpeed the xSpeed of the FireBall
	 * @param ySpeed the ySpeed of the FireBall
	 */
	public FireBall(int pixelSize, double x, double y, double xSpeed, double ySpeed) {
		this.pixelSize = pixelSize;
		this.x = x;
		this.y = y;
		this.xSpeed = xSpeed;
		this.ySpeed = ySpeed;	
		this.direction = 0;
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
	 * gets the x-coordinate of the upper-left of the FireBall
	 * @return returns the x-coordinate of the upper-left of the FireBall
	 */
	public double getX() {
		return x;
	}
	
	/**
	 * sets the x-coordinate of the upper-left of the FireBall
	 * @param x the x-coordinate of the upper-left of the FireBall
	 */
	public void setX(double x) {
		this.x = x;
	}
	
	/**
	 * gets the y-coordinate of the upper-left of the FireBall
	 * @return returns the y-coordinate of the upper-left of the FireBall
	 */
	public double getY() {
		return y;
	}
	
	/**
	 * sets the y-coordinate of the upper-left of the FireBall
	 * @param y the y-coordinate of the upper-left of the FireBall
	 */
	public void setY(double y) {
		this.y = y;
	}
	
	/**
	 * gets the xSpeed of the FireBall
	 * @return returns the xSpeed of the FireBall
	 */
	public double getXSpeed() {
		return xSpeed;
	}
	
	/**
	 * sets the xSpeed of the FireBall
	 * @param xSpeed the xSpeed of the FireBall
	 */
	public void setXSpeed(double xSpeed) {
		this.xSpeed = xSpeed;
	}
	
	/**
	 * gets the ySpeed of the FireBall
	 * @return returns the ySpeed of the FireBall
	 */
	public double getYSpeed() {
		return ySpeed;
	}
	
	/**
	 * gets the ySpeed of the FireBall
	 * @param ySpeed the ySpeed of the FireBall
	 */
	public void setYSpeed(double ySpeed) {
		this.ySpeed = ySpeed;
	}
	
	/**
	 * gets the direction of the FireBall
	 * @return returns the direction of the FireBall
	 */
	public int getDirection() {
		return direction;
	}
	
	/**
	 * sets the direction of the FireBall
	 * @param direction the direction of the FireBall
	 */
	public void setDirection(int direction) {
		this.direction = direction;
	}
	
	/**
	 * moves the FireBall depending on the direction
	 * @param direction the direction of which the FireBall travels
	 */
	public void move(int direction) {
		if(direction == 1) {
			setY(getY() - getYSpeed());
		}
		if(direction == 2) {
			setX(getX() - getXSpeed());
		}
		if(direction == 3) {
			setY(getY() + getYSpeed());
		}
		if(direction == 4) {
			setX(getX() + getXSpeed());
		}
	}
	
	/**
	 * Draws the FireBall
	 * @param g the Graphics object
	 */
	public void draw(Graphics g) {
		//20x23
		//Yellow
		g.setColor(new Color(232, 214, 44));
		g.fillRect((int)getX() + pixelSize*8, (int)getY(), pixelSize, pixelSize);
		g.fillRect((int)getX() + pixelSize*7, (int)getY() + pixelSize, pixelSize, pixelSize);
		g.fillRect((int)getX() + pixelSize*10, (int)getY(), pixelSize*5, pixelSize);
		g.fillRect((int)getX() + pixelSize*12, (int)getY() + pixelSize, pixelSize*5, pixelSize);
		g.fillRect((int)getX() + pixelSize*5, (int)getY() + pixelSize*2, pixelSize*9, pixelSize);
		g.fillRect((int)getX() + pixelSize*16, (int)getY() + pixelSize*2, pixelSize, pixelSize);
		g.fillRect((int)getX() + pixelSize*4, (int)getY() + pixelSize*3, pixelSize*11, pixelSize);
		g.fillRect((int)getX() + pixelSize*2, (int)getY() + pixelSize*4, pixelSize*4, pixelSize);
		g.fillRect((int)getX() + pixelSize*2, (int)getY() + pixelSize*5, pixelSize*2, pixelSize);
		g.fillRect((int)getX() + pixelSize, (int)getY() + pixelSize*6, pixelSize*2, pixelSize);
		g.fillRect((int)getX(), (int)getY() + pixelSize*7, pixelSize*3, pixelSize);
		g.fillRect((int)getX(), (int)getY() + pixelSize*7, pixelSize*2, pixelSize*10);
		g.fillRect((int)getX() + pixelSize*17, (int)getY() + pixelSize*3, pixelSize*2, pixelSize*2);
		g.fillRect((int)getX() + pixelSize*18, (int)getY() + pixelSize*5, pixelSize*2, pixelSize*12);
		g.fillRect((int)getX() + pixelSize*9, (int)getY() + pixelSize*5, pixelSize*2, pixelSize);
		g.fillRect((int)getX() + pixelSize*10, (int)getY() + pixelSize*6, pixelSize, pixelSize);
		g.fillRect((int)getX() + pixelSize*12, (int)getY() + pixelSize*6, pixelSize*3, pixelSize);
		g.fillRect((int)getX() + pixelSize*13, (int)getY() + pixelSize*7, pixelSize*2, pixelSize);
		g.fillRect((int)getX() + pixelSize*14, (int)getY() + pixelSize*7, pixelSize*2, pixelSize*2);
		g.fillRect((int)getX() + pixelSize*6, (int)getY() + pixelSize*6, pixelSize, pixelSize);
		g.fillRect((int)getX() + pixelSize*5, (int)getY() + pixelSize*7, pixelSize*3, pixelSize);
		g.fillRect((int)getX() + pixelSize*5, (int)getY() + pixelSize*7, pixelSize*2, pixelSize*4);
		g.fillRect((int)getX() + pixelSize*4, (int)getY() + pixelSize*9, pixelSize, pixelSize*2);
		g.fillRect((int)getX() + pixelSize*4, (int)getY() + pixelSize*12, pixelSize*2, pixelSize*3);
		g.fillRect((int)getX() + pixelSize*5, (int)getY() + pixelSize*14, pixelSize*2, pixelSize*2);
		g.fillRect((int)getX() + pixelSize*11, (int)getY() + pixelSize*14, pixelSize*3, pixelSize);
		g.fillRect((int)getX() + pixelSize*7, (int)getY() + pixelSize*15, pixelSize, pixelSize);
		g.fillRect((int)getX() + pixelSize*5, (int)getY() + pixelSize*11, pixelSize, pixelSize);
		g.fillRect((int)getX() + pixelSize, (int)getY() + pixelSize*16, pixelSize*2, pixelSize*2);
		g.fillRect((int)getX() + pixelSize*2, (int)getY() + pixelSize*18, pixelSize*2, pixelSize*2);
		g.fillRect((int)getX() + pixelSize*3, (int)getY() + pixelSize*20, pixelSize*2, pixelSize*2);
		g.fillRect((int)getX() + pixelSize*5, (int)getY() + pixelSize*21, pixelSize*2, pixelSize*2);
		g.fillRect((int)getX() + pixelSize*7, (int)getY() + pixelSize*20, pixelSize*3, pixelSize*4);
		g.fillRect((int)getX() + pixelSize*7, (int)getY() + pixelSize*23, pixelSize*5, pixelSize);
		g.fillRect((int)getX() + pixelSize*13, (int)getY() + pixelSize*23, pixelSize, pixelSize);
		g.fillRect((int)getX() + pixelSize*7, (int)getY() + pixelSize*20, pixelSize*8, pixelSize*2);
		g.fillRect((int)getX() + pixelSize*14, (int)getY() + pixelSize*19, pixelSize*2, pixelSize*2);
		g.fillRect((int)getX() + pixelSize*16, (int)getY() + pixelSize*18, pixelSize*2, pixelSize*2);
		g.fillRect((int)getX() + pixelSize*17, (int)getY() + pixelSize*16, pixelSize*2, pixelSize*2);
		g.fillRect((int)getX() + pixelSize*9, (int)getY() + pixelSize*17, pixelSize*2, pixelSize);
		g.fillRect((int)getX() + pixelSize*10, (int)getY() + pixelSize*18, pixelSize*2, pixelSize);
		g.fillRect((int)getX() + pixelSize*12, (int)getY() + pixelSize*16, pixelSize*2, pixelSize);
		g.fillRect((int)getX() + pixelSize*13, (int)getY() + pixelSize*17, pixelSize*2, pixelSize);
		
		//red
		g.setColor(new Color(199, 93, 51));
		g.fillRect((int)getX() + pixelSize*6, (int)getY() + pixelSize*4, pixelSize*5, pixelSize);
		g.fillRect((int)getX() + pixelSize*4, (int)getY() + pixelSize*5, pixelSize*5, pixelSize);
		g.fillRect((int)getX() + pixelSize*3, (int)getY() + pixelSize*6, pixelSize*3, pixelSize);
		g.fillRect((int)getX() + pixelSize*3, (int)getY() + pixelSize*6, pixelSize*2, pixelSize*3);
		g.fillRect((int)getX() + pixelSize*2, (int)getY() + pixelSize*8, pixelSize*2, pixelSize*8);
		g.fillRect((int)getX() + pixelSize*3, (int)getY() + pixelSize*15, pixelSize*2, pixelSize*3);
		g.fillRect((int)getX() + pixelSize*4, (int)getY() + pixelSize*11, pixelSize, pixelSize);
		g.fillRect((int)getX() + pixelSize*4, (int)getY() + pixelSize*16, pixelSize*5, pixelSize*4);
		g.fillRect((int)getX() + pixelSize*4, (int)getY() + pixelSize*16, pixelSize*8, pixelSize);
		g.fillRect((int)getX() + pixelSize*14, (int)getY() + pixelSize*16, pixelSize*3, pixelSize);
		g.fillRect((int)getX() + pixelSize*5, (int)getY() + pixelSize*20, pixelSize*2, pixelSize);
		g.fillRect((int)getX() + pixelSize*9, (int)getY() + pixelSize*18, pixelSize, pixelSize*2);
		g.fillRect((int)getX() + pixelSize*10, (int)getY() + pixelSize*19, pixelSize*4, pixelSize);
		g.fillRect((int)getX() + pixelSize*11, (int)getY() + pixelSize*17, pixelSize*2, pixelSize);
		g.fillRect((int)getX() + pixelSize*15, (int)getY() + pixelSize*17, pixelSize*3, pixelSize);
		g.fillRect((int)getX() + pixelSize*12, (int)getY() + pixelSize*18, pixelSize*4, pixelSize);
		g.fillRect((int)getX() + pixelSize*7, (int)getY() + pixelSize*6, pixelSize*3, pixelSize);
		g.fillRect((int)getX() + pixelSize*7, (int)getY() + pixelSize*8, pixelSize*3, pixelSize*2);
		g.fillRect((int)getX() + pixelSize*8, (int)getY() + pixelSize*7, pixelSize*2, pixelSize*4);
		g.fillRect((int)getX() + pixelSize*7, (int)getY() + pixelSize*11, pixelSize*4, pixelSize*4);
		g.fillRect((int)getX() + pixelSize*6, (int)getY() + pixelSize*13, pixelSize*6, pixelSize);
		g.fillRect((int)getX() + pixelSize*8, (int)getY() + pixelSize*15, pixelSize*10, pixelSize);
		g.fillRect((int)getX() + pixelSize*12, (int)getY() + pixelSize*10, pixelSize, pixelSize);
		g.fillRect((int)getX() + pixelSize*12, (int)getY() + pixelSize*11, pixelSize*6, pixelSize*3);
		g.fillRect((int)getX() + pixelSize*14, (int)getY() + pixelSize*14, pixelSize*4, pixelSize);
		
		//orange
		g.setColor(new Color(223, 176, 45));
		g.fillRect((int)getX() + pixelSize*14, (int)getY() + pixelSize*2, pixelSize*2, pixelSize);
		g.fillRect((int)getX() + pixelSize*15, (int)getY() + pixelSize*3, pixelSize*2, pixelSize);
		g.fillRect((int)getX() + pixelSize*11, (int)getY() + pixelSize*4, pixelSize*6, pixelSize*2);
		g.fillRect((int)getX() + pixelSize*11, (int)getY() + pixelSize*4, pixelSize, pixelSize*9);
		g.fillRect((int)getX() + pixelSize*10, (int)getY() + pixelSize*7, pixelSize, pixelSize*4);
		g.fillRect((int)getX() + pixelSize*12, (int)getY() + pixelSize*7, pixelSize, pixelSize*3);
		g.fillRect((int)getX() + pixelSize*13, (int)getY() + pixelSize*8, pixelSize, pixelSize*3);
		g.fillRect((int)getX() + pixelSize*13, (int)getY() + pixelSize*9, pixelSize*5, pixelSize*2);
		g.fillRect((int)getX() + pixelSize*15, (int)getY() + pixelSize*6, pixelSize*3, pixelSize);
		g.fillRect((int)getX() + pixelSize*15, (int)getY() + pixelSize*5, pixelSize*3, pixelSize);
		g.fillRect((int)getX() + pixelSize*16, (int)getY() + pixelSize*7, pixelSize*2, pixelSize*2);
		g.fillRect((int)getX() + pixelSize*6, (int)getY() + pixelSize*11, pixelSize, pixelSize*2);
		g.fillRect((int)getX() + pixelSize*7, (int)getY() + pixelSize*10, pixelSize, pixelSize);
	}
}
