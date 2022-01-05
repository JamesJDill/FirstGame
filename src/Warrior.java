import java.awt.Color;
import java.awt.Graphics;

public class Warrior {
	
	/**
	 * Private variables
	 */
	private int pixelSize;
	private double x;
	private double y;
	private double xSpeed;
	private double ySpeed;	
	
	/**
	 * 5 parameter constructor for Warrior
	 * @param pixelSize the size of each pixel
	 * @param x the x-coordinate of the upper-left of the Warrior
	 * @param y the y-coordinate of the upper-left of the Warrior
	 * @param xSpeed the xSpeed of the Warrior
	 * @param ySpeed the ySpeed of the Warrior
	 */
	public Warrior(int pixelSize, double x, double y, double xSpeed, double ySpeed) {
		this.pixelSize = pixelSize;
		this.x = x;
		this.y = y;
		this.xSpeed = xSpeed;
		this.ySpeed = ySpeed;
	}
	
	/**
	 * gets the pixelSize of the Warrior
	 * @return returns the pixelSize of the Warrior
	 */
	public double getPixelSize() {
		return pixelSize;
	}
	
	/**
	 * sets the pixelSize of the Warrior
	 * @param pixelSize the size of the pixels of the Warrior
	 */
	public void setPixelSize(int pixelSize) {
		this.pixelSize = pixelSize;
	}
	
	/**
	 * gets the x-coordinate of the upper-left of the Warrior
	 * @return returns the x-coordinate of the upper-left of the Warrior
	 */
	public double getX() {
		return x;
	}
	
	/**
	 * sets the x-coordinate of the upper-left of the Warrior
	 * @param x the x-coordinate of the upper-left of the Warrior
	 */
	public void setX(double x) {
		this.x = x;
	}
	
	/**
	 * gets the y-coordinate of the upper-left of the Warrior
	 * @return returns the y-coordinate of the upper-left of the Warrior
	 */
	public double getY() {
		return y;
	}
	
	/**
	 * sets the y-coordinate of the upper-left of the Warrior
	 * @param y the y-coordinate of the upper-left of the Warrior
	 */
	public void setY(double y) {
		this.y = y;
	}
	
	/**
	 * gets the xSpeed of the Warrior
	 * @return returns the xSpeed of the Warrior
	 */
	public double getXSpeed() {
		return xSpeed;
	}
	
	/**
	 * sets the xSpeed of the Warrior
	 * @param xSpeed the xSpeed of the Warrior
	 */
	public void setXSpeed(double xSpeed) {
		this.xSpeed = xSpeed;
	}
	
	/**
	 * gets the ySpeed of the Warrior
	 * @return returns the ySpeed of the Warrior
	 */
	public double getYSpeed() {
		return ySpeed;
	}
	
	/**
	 * sets the ySpeed of the Warrior
	 * @param ySpeed the ySpeed of the Warrior
	 */
	public void setYSpeed(double ySpeed) {
		this.ySpeed = ySpeed;
	}
	
	/**
	 * sets the location of the Warrior
	 * @param x the x-coordinate of the upper-left of the Warrior
	 * @param y the y-coordinate of the upper-left of the Warrior
	 */
	public void setLocation(double x, double y) {
		setX(x);
		setY(y);
	}
	
	/**
	 * decreases the y-value
	 */
	public void moveUp() {
		setY(getY() - getYSpeed());
	}
	
	/**
	 * increases the y-value
	 */
	public void moveDown() {
		setY(getY() + getYSpeed());
	}
	
	/**
	 * increases the x-value
	 */
	public void moveRight() { 
		setX(getX() + getXSpeed());
	}
	
	/**
	 * decreases the x-value
	 */
	public void moveLeft() { 
		setX(getX() - getXSpeed());
	}
	
	//14 x 23 - width x height
	/**
	 * Draws the head of the Warrior facing right
	 * @param g the Graphics object
	 */
	public void drawRightHead(Graphics g) {
		g.setColor(new Color(175, 120, 100));
		g.fillRect((int)getX() + pixelSize*13, (int)getY() + pixelSize*4, pixelSize, pixelSize*7);
		g.fillRect((int)getX() + pixelSize*12, (int)getY() + pixelSize*3, pixelSize, pixelSize);
		g.fillRect((int)getX() + pixelSize*11, (int)getY() + pixelSize*2, pixelSize*2, pixelSize);
		g.fillRect((int)getX() + pixelSize*9, (int)getY() + pixelSize*1, pixelSize*3, pixelSize);
		g.fillRect((int)getX() + pixelSize*13, (int)getY() + pixelSize*(7), pixelSize, pixelSize*6);
		g.fillRect((int)getX() + pixelSize*5, (int)getY(), pixelSize*4, pixelSize);
		g.fillRect((int)getX() + pixelSize*3, (int)getY() + pixelSize, pixelSize*2, pixelSize);
		g.fillRect((int)getX() + pixelSize*2, (int)getY() + pixelSize*2, pixelSize, pixelSize);
		g.fillRect((int)getX() + pixelSize, (int)getY() + pixelSize*3, pixelSize, pixelSize*2);
		g.fillRect((int)getX(), (int)getY() + pixelSize*5, pixelSize, pixelSize*4);
		g.fillRect((int)getX() + pixelSize, (int)getY() + pixelSize*11, pixelSize, pixelSize);
		g.fillRect((int)getX() + pixelSize*9, (int)getY() + pixelSize*15, pixelSize*3, pixelSize);
		g.setColor(Color.BLACK);
		g.fillRect((int)getX(), (int)getY() + pixelSize*9, pixelSize, pixelSize*2);
		g.fillRect((int)getX() + pixelSize, (int)getY() + pixelSize*12, pixelSize, pixelSize);
		g.fillRect((int)getX() + pixelSize*2, (int)getY() + pixelSize*13, pixelSize, pixelSize);
		g.fillRect((int)getX() + pixelSize*3, (int)getY() + pixelSize*14, pixelSize, pixelSize);
		g.fillRect((int)getX() + pixelSize*4, (int)getY() + pixelSize*15, pixelSize*3, pixelSize);
		g.fillRect((int)getX() + pixelSize*6, (int)getY() + pixelSize*12, pixelSize, pixelSize*2);
		g.fillRect((int)getX() + pixelSize*7, (int)getY() + pixelSize*11, pixelSize, pixelSize);
		g.fillRect((int)getX() + pixelSize*11, (int)getY() + pixelSize*11, pixelSize, pixelSize*2);
		g.setColor(new Color(234, 189, 152));
		g.fillRect((int)getX() + pixelSize*13, (int)getY() + pixelSize*13, pixelSize, pixelSize);
		g.fillRect((int)getX() + pixelSize*12, (int)getY() + pixelSize*14, pixelSize, pixelSize);
		g.fillRect((int)getX() + pixelSize*7, (int)getY() + pixelSize*15, pixelSize*2, pixelSize);
		g.fillRect((int)getX() + pixelSize, (int)getY() + pixelSize*5, pixelSize, pixelSize*6);
		g.fillRect((int)getX() + pixelSize*2, (int)getY() + pixelSize*10, pixelSize*2, pixelSize);
		g.fillRect((int)getX() + pixelSize*2, (int)getY() + pixelSize*11, pixelSize*3, pixelSize);
		g.fillRect((int)getX() + pixelSize*2, (int)getY() + pixelSize*12, pixelSize*4, pixelSize);
		g.fillRect((int)getX() + pixelSize*3, (int)getY() + pixelSize*13, pixelSize*3, pixelSize);
		g.fillRect((int)getX() + pixelSize*4, (int)getY() + pixelSize*14, pixelSize*4, pixelSize);
		g.fillRect((int)getX() + pixelSize*8, (int)getY() + pixelSize*11, pixelSize, pixelSize);
		g.setColor(new Color(255, 224, 198));
		g.fillRect((int)getX() + pixelSize*5, (int)getY() + pixelSize, pixelSize*4, pixelSize);
		g.fillRect((int)getX() + pixelSize*3, (int)getY() + pixelSize*2, pixelSize*8, pixelSize);
		g.fillRect((int)getX() + pixelSize*2, (int)getY() + pixelSize*3, pixelSize*10, pixelSize);
		g.fillRect((int)getX() + pixelSize*2, (int)getY() + pixelSize*4, pixelSize*11, pixelSize*6);
		g.fillRect((int)getX() + pixelSize*4, (int)getY() + pixelSize*10, pixelSize*9, pixelSize);
		g.fillRect((int)getX() + pixelSize*5, (int)getY() + pixelSize*11, pixelSize*2, pixelSize);
		g.fillRect((int)getX() + pixelSize*7, (int)getY() + pixelSize*12, pixelSize*3, pixelSize*2);
		g.fillRect((int)getX() + pixelSize*9, (int)getY() + pixelSize*11, pixelSize, pixelSize);
		g.fillRect((int)getX() + pixelSize*12, (int)getY() + pixelSize*11, pixelSize, pixelSize*2);
		g.fillRect((int)getX() + pixelSize*10, (int)getY() + pixelSize*13, pixelSize*3, pixelSize);
		g.fillRect((int)getX() + pixelSize*8, (int)getY() + pixelSize*14, pixelSize*4, pixelSize);
		g.setColor(Color.WHITE);
		g.fillRect((int)getX() + pixelSize*10, (int)getY() + pixelSize*11, pixelSize, pixelSize*2);
	}
	
		/**
		 * draws the head of the Warrior while facing left
		 * @param g the Graphics object
		 */
		public void drawLeftHead(Graphics g) {
		g.setColor(new Color(175, 120, 100));			
		g.fillRect((int)getX(), (int)getY() + pixelSize*4, pixelSize, pixelSize*9);
		g.fillRect((int)getX() + pixelSize*2, (int)getY() + pixelSize*15, pixelSize*3, pixelSize);
		g.fillRect((int)getX() + pixelSize, (int)getY() + pixelSize*2, pixelSize, pixelSize*2);
		g.fillRect((int)getX() + pixelSize*2, (int)getY() + pixelSize, pixelSize, pixelSize*2);
		g.fillRect((int)getX() + pixelSize*3, (int)getY() + pixelSize, pixelSize*2, pixelSize);
		g.fillRect((int)getX() + pixelSize*5, (int)getY(), pixelSize*4, pixelSize);
		g.fillRect((int)getX() + pixelSize*9, (int)getY() + pixelSize, pixelSize*2, pixelSize);
		g.fillRect((int)getX() + pixelSize*11, (int)getY() + pixelSize*2, pixelSize, pixelSize);
		g.fillRect((int)getX() + pixelSize*12, (int)getY() + pixelSize*3, pixelSize, pixelSize*2);
		g.fillRect((int)getX() + pixelSize*13, (int)getY() + pixelSize*5, pixelSize, pixelSize*4);
		g.fillRect((int)getX() + pixelSize*12, (int)getY() + pixelSize*11, pixelSize, pixelSize);
		
		g.setColor(new Color(255, 224, 198));
		g.fillRect((int)getX() + pixelSize*5, (int)getY() + pixelSize, pixelSize*4, pixelSize);
		g.fillRect((int)getX() + pixelSize*3, (int)getY() + pixelSize*2, pixelSize*8, pixelSize);
		g.fillRect((int)getX() + pixelSize*2, (int)getY() + pixelSize*3, pixelSize*10, pixelSize);
		g.fillRect((int)getX() + pixelSize, (int)getY() + pixelSize*4, pixelSize*11, pixelSize);
		g.fillRect((int)getX() + pixelSize, (int)getY() + pixelSize*5, pixelSize*11, pixelSize*5);
		g.fillRect((int)getX() + pixelSize, (int)getY() + pixelSize*10, pixelSize*9, pixelSize);
		g.fillRect((int)getX() + pixelSize, (int)getY() + pixelSize*11, pixelSize, pixelSize*2);
		g.fillRect((int)getX() + pixelSize, (int)getY() + pixelSize*13, pixelSize*6, pixelSize);
		g.fillRect((int)getX() + pixelSize*2, (int)getY() + pixelSize*14, pixelSize*4, pixelSize);
		g.fillRect((int)getX() + pixelSize*4, (int)getY() + pixelSize*11, pixelSize, pixelSize*2);
		g.fillRect((int)getX() + pixelSize*7, (int)getY() + pixelSize*11, pixelSize*2, pixelSize);
		g.fillRect((int)getX() + pixelSize*5, (int)getY() + pixelSize*12, pixelSize*2, pixelSize);
		
		g.setColor(new Color(234, 189, 152));
		g.fillRect((int)getX(), (int)getY() + pixelSize*13, pixelSize, pixelSize);
		g.fillRect((int)getX() + pixelSize, (int)getY() + pixelSize*14, pixelSize, pixelSize);
		g.fillRect((int)getX() + pixelSize*5, (int)getY() + pixelSize*15, pixelSize*2, pixelSize);
		g.fillRect((int)getX() + pixelSize*6, (int)getY() + pixelSize*14, pixelSize*4, pixelSize);
		g.fillRect((int)getX() + pixelSize*5, (int)getY() + pixelSize*11, pixelSize, pixelSize);
		g.fillRect((int)getX() + pixelSize*8, (int)getY() + pixelSize*13, pixelSize*3, pixelSize);
		g.fillRect((int)getX() + pixelSize*8, (int)getY() + pixelSize*12, pixelSize*4, pixelSize);
		g.fillRect((int)getX() + pixelSize*9, (int)getY() + pixelSize*11, pixelSize*3, pixelSize);
		g.fillRect((int)getX() + pixelSize*10, (int)getY() + pixelSize*10, pixelSize*3, pixelSize);
		g.fillRect((int)getX() + pixelSize*12, (int)getY() + pixelSize*5, pixelSize, pixelSize*5);
		
		g.setColor(Color.BLACK);
		g.fillRect((int)getX() + pixelSize*13, (int)getY() + pixelSize*9, pixelSize, pixelSize*2);
		g.fillRect((int)getX() + pixelSize*2, (int)getY() + pixelSize*11, pixelSize, pixelSize*2);
		g.fillRect((int)getX() + pixelSize*12, (int)getY() + pixelSize*12, pixelSize, pixelSize);
		g.fillRect((int)getX() + pixelSize*11, (int)getY() + pixelSize*13, pixelSize, pixelSize);
		g.fillRect((int)getX() + pixelSize*10, (int)getY() + pixelSize*14, pixelSize, pixelSize);
		g.fillRect((int)getX() + pixelSize*7, (int)getY() + pixelSize*15, pixelSize*3, pixelSize);
		g.fillRect((int)getX() + pixelSize*6, (int)getY() + pixelSize*11, pixelSize, pixelSize);
		g.fillRect((int)getX() + pixelSize*7, (int)getY() + pixelSize*12, pixelSize, pixelSize*2);
	
		g.setColor(Color.WHITE);
		g.fillRect((int)getX() + pixelSize*3, (int)getY() + pixelSize*11, pixelSize, pixelSize*2);
		}
	
		/**
		 * draws the body of the Warrior while facing left
		 * @param g the Graphics object
		 */
		public void drawLeftBody(Graphics g) {
			g.setColor(new Color(175, 120, 100));
			g.fillRect((int)getX() + pixelSize*3, (int)getY() + pixelSize*16, pixelSize, pixelSize);
			g.fillRect((int)getX() + pixelSize*4, (int)getY() + pixelSize*19, pixelSize, pixelSize*2);
			g.fillRect((int)getX() + pixelSize*8, (int)getY() + pixelSize*16, pixelSize, pixelSize*2);
			
			g.setColor(new Color(255, 224, 198));
			g.fillRect((int)getX() + pixelSize*3, (int)getY() + pixelSize*17, pixelSize, pixelSize*2);
			g.fillRect((int)getX() + pixelSize*5, (int)getY() + pixelSize*19, pixelSize*2, pixelSize);
			g.fillRect((int)getX() + pixelSize*6, (int)getY() + pixelSize*17, pixelSize, pixelSize);
			g.fillRect((int)getX() + pixelSize*6, (int)getY() + pixelSize*18, pixelSize*3, pixelSize);
			g.fillRect((int)getX() + pixelSize*4, (int)getY() + pixelSize*22, pixelSize*3, pixelSize);
			
			g.setColor(new Color(234, 189, 152));
			g.fillRect((int)getX() + pixelSize*4, (int)getY() + pixelSize*16, pixelSize*4, pixelSize);
			g.fillRect((int)getX() + pixelSize*4, (int)getY() + pixelSize*17, pixelSize, pixelSize*2);
			g.fillRect((int)getX() + pixelSize*7, (int)getY() + pixelSize*17, pixelSize, pixelSize);
			g.fillRect((int)getX() + pixelSize*3, (int)getY() + pixelSize*19, pixelSize, pixelSize*2);
			g.fillRect((int)getX() + pixelSize*5, (int)getY() + pixelSize*20, pixelSize*2, pixelSize);
			g.fillRect((int)getX() + pixelSize*8, (int)getY() + pixelSize*19, pixelSize, pixelSize*2);
			
			g.setColor(Color.BLACK);
			g.fillRect((int)getX() + pixelSize*2, (int)getY() + pixelSize*17, pixelSize, pixelSize*4);
			g.fillRect((int)getX() + pixelSize*3, (int)getY() + pixelSize*21, pixelSize, pixelSize*2);
			g.fillRect((int)getX() + pixelSize*4, (int)getY() + pixelSize*23, pixelSize*3, pixelSize);
			g.fillRect((int)getX() + pixelSize*7, (int)getY() + pixelSize*22, pixelSize, pixelSize);
			g.fillRect((int)getX() + pixelSize*8, (int)getY() + pixelSize*21, pixelSize, pixelSize);
			g.fillRect((int)getX() + pixelSize*9, (int)getY() + pixelSize*18, pixelSize, pixelSize*3);
			g.fillRect((int)getX() + pixelSize*5, (int)getY() + pixelSize*17, pixelSize, pixelSize*2);
			g.fillRect((int)getX() + pixelSize*5, (int)getY() + pixelSize*21, pixelSize*2, pixelSize);
			g.fillRect((int)getX() + pixelSize*7, (int)getY() + pixelSize*19, pixelSize, pixelSize*2);
			
			g.setColor(Color.WHITE);
			g.fillRect((int)getX() + pixelSize*4, (int)getY() + pixelSize*21, pixelSize, pixelSize);
			g.fillRect((int)getX() + pixelSize*7, (int)getY() + pixelSize*21, pixelSize, pixelSize);
			
		}
		
		/**
		 * Draws the body of the Warrior while facing right
		 * @param g the Graphics object
		 */
		public void drawRightBody(Graphics g) {
			g.setColor(new Color(175, 120, 100));
			g.fillRect((int)getX() + pixelSize*5, (int)getY() + pixelSize*16, pixelSize, pixelSize*2);
			g.fillRect((int)getX() + pixelSize*10, (int)getY() + pixelSize*16, pixelSize, pixelSize);
			g.fillRect((int)getX() + pixelSize*9,(int)getY() + pixelSize*19, pixelSize, pixelSize*2);
			
			g.setColor(new Color(255, 224, 198));
			g.fillRect((int)getX() + pixelSize*5, (int)getY() + pixelSize*18, pixelSize*3, pixelSize);
			g.fillRect((int)getX() + pixelSize*7, (int)getY() + pixelSize*17, pixelSize, pixelSize);
			g.fillRect((int)getX() + pixelSize*10,(int)getY() + pixelSize*17, pixelSize, pixelSize*2);
			g.fillRect((int)getX() + pixelSize*7,(int)getY() + pixelSize*19, pixelSize*2, pixelSize);
			g.fillRect((int)getX() + pixelSize*7,(int)getY() + pixelSize*22, pixelSize*3, pixelSize);
			
			g.setColor(new Color(234, 189, 152));
			g.fillRect((int)getX() + pixelSize*6, (int)getY() + pixelSize*16, pixelSize*4, pixelSize);
			g.fillRect((int)getX() + pixelSize*6, (int)getY() + pixelSize*17, pixelSize, pixelSize);
			g.fillRect((int)getX() + pixelSize*5, (int)getY() + pixelSize*19, pixelSize, pixelSize*2);
			g.fillRect((int)getX() + pixelSize*9,(int)getY() + pixelSize*17, pixelSize, pixelSize*2);
			g.fillRect((int)getX() + pixelSize*7,(int)getY() + pixelSize*20, pixelSize*2, pixelSize);
			g.fillRect((int)getX() + pixelSize*10,(int)getY() + pixelSize*19, pixelSize, pixelSize*2);
			
			g.setColor(Color.BLACK);
			g.fillRect((int)getX() + pixelSize*4, (int)getY() + pixelSize*18, pixelSize, pixelSize*3);
			g.fillRect((int)getX() + pixelSize*5, (int)getY() + pixelSize*21, pixelSize, pixelSize);
			g.fillRect((int)getX() + pixelSize*6, (int)getY() + pixelSize*22, pixelSize, pixelSize);
			g.fillRect((int)getX() + pixelSize*7, (int)getY() + pixelSize*23, pixelSize*3, pixelSize);
			g.fillRect((int)getX() + pixelSize*10, (int)getY() + pixelSize*21, pixelSize, pixelSize*2);
			g.fillRect((int)getX() + pixelSize*11, (int)getY() + pixelSize*17, pixelSize, pixelSize*4);
			g.fillRect((int)getX() + pixelSize*6, (int)getY() + pixelSize*19, pixelSize, pixelSize*2);
			g.fillRect((int)getX() + pixelSize*7, (int)getY() + pixelSize*21, pixelSize*2, pixelSize);
			g.fillRect((int)getX() + pixelSize*8, (int)getY() + pixelSize*17, pixelSize, pixelSize*2);
			
			g.setColor(Color.WHITE);
			g.fillRect((int)getX() + pixelSize*6, (int)getY() + pixelSize*21, pixelSize, pixelSize);
			g.fillRect((int)getX() + pixelSize*9, (int)getY() + pixelSize*21, pixelSize, pixelSize);
		}
		
		/**
		 * Draws the back of the head of the Warrior while looking forward
		 * @param g the Graphics object
		 */
		public void drawBackHead(Graphics g) {
			g.setColor(new Color(175, 120, 100));
			g.fillRect((int)getX() - pixelSize*2, (int)getY() + pixelSize*7, pixelSize, pixelSize);
			g.fillRect((int)getX(), (int)getY() + pixelSize*3, pixelSize, pixelSize*2);
			g.fillRect((int)getX(), (int)getY() + pixelSize*9, pixelSize, pixelSize*2);
			g.fillRect((int)getX() + pixelSize, (int)getY() + pixelSize*2, pixelSize, pixelSize);
			g.fillRect((int)getX() + pixelSize*2, (int)getY() + pixelSize, pixelSize*2, pixelSize);
			g.fillRect((int)getX() + pixelSize*4, (int)getY(), pixelSize*5, pixelSize);
			g.fillRect((int)getX() + pixelSize*9, (int)getY() + pixelSize, pixelSize*2, pixelSize);
			g.fillRect((int)getX() + pixelSize*11, (int)getY() + pixelSize*2, pixelSize, pixelSize);
			g.fillRect((int)getX() + pixelSize*12, (int)getY() + pixelSize*3, pixelSize, pixelSize*2);
			g.fillRect((int)getX() + pixelSize*12, (int)getY() + pixelSize*9, pixelSize, pixelSize*2);
			g.fillRect((int)getX() + pixelSize*14, (int)getY() + pixelSize*7, pixelSize, pixelSize);
			g.fillRect((int)getX() + pixelSize, (int)getY() + pixelSize*11, pixelSize, pixelSize*2);
			g.fillRect((int)getX() + pixelSize*2, (int)getY() + pixelSize*13, pixelSize, pixelSize);
			g.fillRect((int)getX() + pixelSize*4, (int)getY() + pixelSize*14, pixelSize*5, pixelSize);
			g.fillRect((int)getX() + pixelSize*10, (int)getY() + pixelSize*13, pixelSize, pixelSize);
			g.fillRect((int)getX() + pixelSize*11, (int)getY() + pixelSize*11, pixelSize, pixelSize*2);

			g.setColor(new Color(255, 224, 198));
			g.fillRect((int)getX() + pixelSize*4, (int)getY() + pixelSize, pixelSize*5, pixelSize*2);
			g.fillRect((int)getX() + pixelSize*2, (int)getY() + pixelSize*3, pixelSize*9, pixelSize*7);
			g.fillRect((int)getX() + pixelSize, (int)getY() + pixelSize*4, pixelSize, pixelSize*4);
			g.fillRect((int)getX() + pixelSize*11, (int)getY() + pixelSize*4, pixelSize, pixelSize*4);
			g.fillRect((int)getX() + pixelSize*4, (int)getY() + pixelSize*10, pixelSize*5, pixelSize);
			
			g.setColor(new Color(234, 189, 152));
			g.fillRect((int)getX(), (int)getY() + pixelSize*5, pixelSize, pixelSize*3);
			g.fillRect((int)getX() - pixelSize, (int)getY() + pixelSize*8, pixelSize, pixelSize*2);
			g.fillRect((int)getX() + pixelSize, (int)getY() + pixelSize*3, pixelSize, pixelSize);
			g.fillRect((int)getX() + pixelSize, (int)getY() + pixelSize*8, pixelSize, pixelSize*3);
			g.fillRect((int)getX() + pixelSize*2, (int)getY() + pixelSize*2, pixelSize*2, pixelSize);
			g.fillRect((int)getX() + pixelSize*2, (int)getY() + pixelSize*10, pixelSize*2, pixelSize*3);
			g.fillRect((int)getX() + pixelSize*3, (int)getY() + pixelSize*11, pixelSize*7, pixelSize*3);
			g.fillRect((int)getX() + pixelSize*9, (int)getY() + pixelSize*10, pixelSize*2, pixelSize*3);
			g.fillRect((int)getX() + pixelSize*11, (int)getY() + pixelSize*8, pixelSize, pixelSize*3);
			g.fillRect((int)getX() + pixelSize*11, (int)getY() + pixelSize*3, pixelSize, pixelSize);
			g.fillRect((int)getX() + pixelSize*9, (int)getY() + pixelSize*2, pixelSize*2, pixelSize);
			g.fillRect((int)getX() + pixelSize*12, (int)getY() + pixelSize*5, pixelSize, pixelSize*3);
			g.fillRect((int)getX() + pixelSize*13, (int)getY() + pixelSize*8, pixelSize, pixelSize*2);
			
			g.setColor(Color.BLACK);
			g.fillRect((int)getX() - pixelSize*2, (int)getY() + pixelSize*8, pixelSize, pixelSize*2);
			g.fillRect((int)getX() - pixelSize, (int)getY() + pixelSize*5, pixelSize, pixelSize*3);
			g.fillRect((int)getX() - pixelSize, (int)getY() + pixelSize*10, pixelSize, pixelSize);
			g.fillRect((int)getX(), (int)getY() + pixelSize*8, pixelSize, pixelSize);
			g.fillRect((int)getX(), (int)getY() + pixelSize*11, pixelSize, pixelSize);
			g.fillRect((int)getX() + pixelSize, (int)getY() + pixelSize*13, pixelSize, pixelSize);	
			g.fillRect((int)getX() + pixelSize*3, (int)getY() + pixelSize*14, pixelSize, pixelSize);
			g.fillRect((int)getX() + pixelSize*9, (int)getY() + pixelSize*14, pixelSize, pixelSize);
			g.fillRect((int)getX() + pixelSize*11, (int)getY() + pixelSize*13, pixelSize, pixelSize);
			g.fillRect((int)getX() + pixelSize*12, (int)getY() + pixelSize*11, pixelSize, pixelSize);
			g.fillRect((int)getX() + pixelSize*12, (int)getY() + pixelSize*8, pixelSize, pixelSize);
			g.fillRect((int)getX() + pixelSize*13, (int)getY() + pixelSize*5, pixelSize, pixelSize*3);
			g.fillRect((int)getX() + pixelSize*13, (int)getY() + pixelSize*10, pixelSize, pixelSize);
			g.fillRect((int)getX() + pixelSize*14, (int)getY() + pixelSize*8, pixelSize, pixelSize*2);
		}
		
		/**
		 * draws the back of the Warrior while facing forward
		 * @param g the Graphics object
		 */
		public void drawBackBody(Graphics g) {
			g.setColor(new Color(175, 120, 100));
			g.fillRect((int)getX() + pixelSize, (int)getY() + pixelSize*17, pixelSize, pixelSize);
			g.fillRect((int)getX() + pixelSize*2, (int)getY() + pixelSize*16, pixelSize, pixelSize);
			g.fillRect((int)getX() + pixelSize*10, (int)getY() + pixelSize*16, pixelSize, pixelSize);
			g.fillRect((int)getX() + pixelSize*11, (int)getY() + pixelSize*17, pixelSize, pixelSize);
			
			g.setColor(new Color(255, 224, 198));
			g.fillRect((int)getX() - pixelSize, (int)getY() + pixelSize*16, pixelSize, pixelSize*2);
			g.fillRect((int)getX(), (int)getY() + pixelSize*15, pixelSize, pixelSize*3);
			g.fillRect((int)getX() + pixelSize*2, (int)getY() + pixelSize*20, pixelSize, pixelSize*2);
			g.fillRect((int)getX() + pixelSize*3, (int)getY() + pixelSize*21, pixelSize, pixelSize);
			g.fillRect((int)getX() + pixelSize*9, (int)getY() + pixelSize*21, pixelSize*2, pixelSize);
			g.fillRect((int)getX() + pixelSize*10, (int)getY() + pixelSize*20, pixelSize, pixelSize);
			g.fillRect((int)getX() + pixelSize*12, (int)getY() + pixelSize*15, pixelSize, pixelSize*3);
			g.fillRect((int)getX() + pixelSize*13, (int)getY() + pixelSize*16, pixelSize, pixelSize*2);
			
			g.setColor(new Color(234, 189, 152));
			g.fillRect((int)getX() + pixelSize, (int)getY() + pixelSize*14, pixelSize*2, pixelSize*2);
			g.fillRect((int)getX() + pixelSize, (int)getY() + pixelSize*16, pixelSize, pixelSize);
			g.fillRect((int)getX() + pixelSize*3, (int)getY() + pixelSize*15, pixelSize*7, pixelSize*5);
			g.fillRect((int)getX() + pixelSize*2, (int)getY() + pixelSize*17, pixelSize, pixelSize*2);
			g.fillRect((int)getX() + pixelSize*10, (int)getY() + pixelSize*17, pixelSize, pixelSize*2);
			g.fillRect((int)getX() + pixelSize*10, (int)getY() + pixelSize*14, pixelSize*2, pixelSize*2);
			g.fillRect((int)getX() + pixelSize*11, (int)getY() + pixelSize*16, pixelSize, pixelSize);
			
			g.setColor(Color.BLACK);
			g.fillRect((int)getX() - pixelSize*2, (int)getY() + pixelSize*16, pixelSize, pixelSize*2);
			g.fillRect((int)getX() - pixelSize, (int)getY() + pixelSize*15, pixelSize, pixelSize);
			g.fillRect((int)getX() - pixelSize, (int)getY() + pixelSize*18, pixelSize*3, pixelSize);
			g.fillRect((int)getX(), (int)getY() + pixelSize*14, pixelSize, pixelSize);
			g.fillRect((int)getX() + pixelSize, (int)getY() + pixelSize*18, pixelSize, pixelSize*4);
			g.fillRect((int)getX() + pixelSize*2, (int)getY() + pixelSize*22, pixelSize*2, pixelSize);
			g.fillRect((int)getX() + pixelSize*4, (int)getY() + pixelSize*21, pixelSize*5, pixelSize);
			g.fillRect((int)getX() + pixelSize*9, (int)getY() + pixelSize*22, pixelSize*2, pixelSize);
			g.fillRect((int)getX() + pixelSize*11, (int)getY() + pixelSize*18, pixelSize, pixelSize*4);
			g.fillRect((int)getX() + pixelSize*11, (int)getY() + pixelSize*18, pixelSize*3, pixelSize);
			g.fillRect((int)getX() + pixelSize*14, (int)getY() + pixelSize*16, pixelSize, pixelSize*2);
			g.fillRect((int)getX() + pixelSize*13, (int)getY() + pixelSize*15, pixelSize, pixelSize);
			g.fillRect((int)getX() + pixelSize*12, (int)getY() + pixelSize*14, pixelSize, pixelSize);
			
			g.setColor(Color.WHITE);
			g.fillRect((int)getX() + pixelSize*2, (int)getY() + pixelSize*19, pixelSize, pixelSize);
			g.fillRect((int)getX() + pixelSize*3, (int)getY() + pixelSize*20, pixelSize*7, pixelSize);
			g.fillRect((int)getX() + pixelSize*10, (int)getY() + pixelSize*19, pixelSize, pixelSize);
		}
		
		/**
		 * Draws the face of the Warrior while looking down
		 * @param g the Graphics object
		 */
		public void drawFrontHead(Graphics g) {
			
			g.setColor(new Color(175, 120, 100));
			g.fillRect((int)getX() - pixelSize*2, (int)getY() + pixelSize*7, pixelSize, pixelSize);
			g.fillRect((int)getX(), (int)getY() + pixelSize*3, pixelSize, pixelSize*2);
			g.fillRect((int)getX(), (int)getY() + pixelSize*9, pixelSize, pixelSize*2);
			g.fillRect((int)getX() + pixelSize, (int)getY() + pixelSize*2, pixelSize, pixelSize);
			g.fillRect((int)getX() + pixelSize*2, (int)getY() + pixelSize, pixelSize*2, pixelSize);
			g.fillRect((int)getX() + pixelSize*4, (int)getY(), pixelSize*5, pixelSize);
			g.fillRect((int)getX() + pixelSize*9, (int)getY() + pixelSize, pixelSize*2, pixelSize);
			g.fillRect((int)getX() + pixelSize*11, (int)getY() + pixelSize*2, pixelSize, pixelSize);
			g.fillRect((int)getX() + pixelSize*12, (int)getY() + pixelSize*3, pixelSize, pixelSize*2);
			g.fillRect((int)getX() + pixelSize*12, (int)getY() + pixelSize*9, pixelSize, pixelSize*2);
			g.fillRect((int)getX() + pixelSize*14, (int)getY() + pixelSize*7, pixelSize, pixelSize);
			g.fillRect((int)getX() + pixelSize, (int)getY() + pixelSize*11, pixelSize, pixelSize*2);
			g.fillRect((int)getX() + pixelSize*2, (int)getY() + pixelSize*13, pixelSize, pixelSize);
			g.fillRect((int)getX() + pixelSize*4, (int)getY() + pixelSize*14, pixelSize*5, pixelSize);
			g.fillRect((int)getX() + pixelSize*10, (int)getY() + pixelSize*13, pixelSize, pixelSize);
			g.fillRect((int)getX() + pixelSize*11, (int)getY() + pixelSize*11, pixelSize, pixelSize*2);

			g.setColor(new Color(255, 224, 198));
			g.fillRect((int)getX() + pixelSize, (int)getY() + pixelSize*4, pixelSize*11, pixelSize*3);
			g.fillRect((int)getX() + pixelSize*2, (int)getY() + pixelSize*3, pixelSize*9, pixelSize*6);
			g.fillRect((int)getX() + pixelSize*3, (int)getY() + pixelSize*9, pixelSize*7, pixelSize);
			g.fillRect((int)getX() + pixelSize*3, (int)getY() + pixelSize*12, pixelSize*7, pixelSize);
			g.fillRect((int)getX() + pixelSize*4, (int)getY() + pixelSize*13, pixelSize*2, pixelSize);
			g.fillRect((int)getX() + pixelSize*7, (int)getY() + pixelSize*13, pixelSize*2, pixelSize);
			g.fillRect((int)getX() + pixelSize*5, (int)getY() + pixelSize*10, pixelSize*3, pixelSize*2);
			g.fillRect((int)getX() + pixelSize*5, (int)getY() + pixelSize, pixelSize*3, pixelSize);
			g.fillRect((int)getX() + pixelSize*4, (int)getY() + pixelSize*2, pixelSize*5, pixelSize);
			
			g.setColor(new Color(234, 189, 152));
			g.fillRect((int)getX() - pixelSize, (int)getY() + pixelSize*8, pixelSize, pixelSize*2);
			g.fillRect((int)getX() + pixelSize*13, (int)getY() + pixelSize*8, pixelSize, pixelSize*2);
			g.fillRect((int)getX(), (int)getY() + pixelSize*5, pixelSize, pixelSize*3);
			g.fillRect((int)getX() + pixelSize, (int)getY() + pixelSize*7, pixelSize, pixelSize*4);
			g.fillRect((int)getX() + pixelSize, (int)getY() + pixelSize*3, pixelSize, pixelSize);
			g.fillRect((int)getX() + pixelSize*2, (int)getY() + pixelSize*2, pixelSize*2, pixelSize);
			g.fillRect((int)getX() + pixelSize*2, (int)getY() + pixelSize*9, pixelSize, pixelSize*4);
			g.fillRect((int)getX() + pixelSize*3, (int)getY() + pixelSize*13, pixelSize, pixelSize);
			g.fillRect((int)getX() + pixelSize*4, (int)getY() + pixelSize, pixelSize, pixelSize);
			g.fillRect((int)getX() + pixelSize*8, (int)getY() + pixelSize, pixelSize, pixelSize);
			g.fillRect((int)getX() + pixelSize*9, (int)getY() + pixelSize*2, pixelSize*2, pixelSize);
			g.fillRect((int)getX() + pixelSize*11, (int)getY() + pixelSize*3, pixelSize, pixelSize);
			g.fillRect((int)getX() + pixelSize*12, (int)getY() + pixelSize*5, pixelSize, pixelSize*3);
			g.fillRect((int)getX() + pixelSize*11, (int)getY() + pixelSize*7, pixelSize, pixelSize*4);
			g.fillRect((int)getX() + pixelSize*10, (int)getY() + pixelSize*9, pixelSize, pixelSize*4);
			g.fillRect((int)getX() + pixelSize*9, (int)getY() + pixelSize*13, pixelSize, pixelSize);
		
			g.setColor(new Color(204, 163, 130));
			g.fillRect((int)getX() + pixelSize*5, (int)getY() + pixelSize*14, pixelSize*3, pixelSize);
			g.fillRect((int)getX() + pixelSize*6, (int)getY() + pixelSize*13, pixelSize, pixelSize);
			
			g.setColor(Color.BLACK);
			g.fillRect((int)getX() - pixelSize*2, (int)getY() + pixelSize*8, pixelSize, pixelSize*2);
			g.fillRect((int)getX() - pixelSize, (int)getY() + pixelSize*5, pixelSize, pixelSize*3);
			g.fillRect((int)getX() - pixelSize, (int)getY() + pixelSize*10, pixelSize, pixelSize);
			g.fillRect((int)getX(), (int)getY() + pixelSize*8, pixelSize, pixelSize);
			g.fillRect((int)getX(), (int)getY() + pixelSize*11, pixelSize, pixelSize);
			g.fillRect((int)getX() + pixelSize, (int)getY() + pixelSize*13, pixelSize, pixelSize);	
			g.fillRect((int)getX() + pixelSize*3, (int)getY() + pixelSize*14, pixelSize, pixelSize);
			g.fillRect((int)getX() + pixelSize*9, (int)getY() + pixelSize*14, pixelSize, pixelSize);
			g.fillRect((int)getX() + pixelSize*11, (int)getY() + pixelSize*13, pixelSize, pixelSize);
			g.fillRect((int)getX() + pixelSize*12, (int)getY() + pixelSize*11, pixelSize, pixelSize);
			g.fillRect((int)getX() + pixelSize*12, (int)getY() + pixelSize*8, pixelSize, pixelSize);
			g.fillRect((int)getX() + pixelSize*13, (int)getY() + pixelSize*5, pixelSize, pixelSize*3);
			g.fillRect((int)getX() + pixelSize*13, (int)getY() + pixelSize*10, pixelSize, pixelSize);
			g.fillRect((int)getX() + pixelSize*14, (int)getY() + pixelSize*8, pixelSize, pixelSize*2);
			g.fillRect((int)getX() + pixelSize*4, (int)getY() + pixelSize*10, pixelSize, pixelSize*2);
			g.fillRect((int)getX() + pixelSize*8, (int)getY() + pixelSize*10, pixelSize, pixelSize*2);
			
			g.setColor(Color.WHITE);
			g.fillRect((int)getX() + pixelSize*3, (int)getY() + pixelSize*10, pixelSize, pixelSize*2);
			g.fillRect((int)getX() + pixelSize*9, (int)getY() + pixelSize*10, pixelSize, pixelSize*2);
		}
		
		/**
		 * Draws the body of the Warrior while looking down
		 * @param g the Graphics object
		 */
		public void drawFrontBody(Graphics g) {
			g.setColor(new Color(175, 120, 100));
			g.fillRect((int)getX() + pixelSize, (int)getY() + pixelSize*17, pixelSize, pixelSize);
			g.fillRect((int)getX() + pixelSize*2, (int)getY() + pixelSize*16, pixelSize, pixelSize);
			g.fillRect((int)getX() + pixelSize*10, (int)getY() + pixelSize*16, pixelSize, pixelSize);
			g.fillRect((int)getX() + pixelSize*11, (int)getY() + pixelSize*17, pixelSize, pixelSize);
			
			g.setColor(new Color(255, 224, 198));
			g.fillRect((int)getX() - pixelSize, (int)getY() + pixelSize*16, pixelSize, pixelSize*2);
			g.fillRect((int)getX(), (int)getY() + pixelSize*15, pixelSize, pixelSize*3);
			g.fillRect((int)getX() + pixelSize*2, (int)getY() + pixelSize*20, pixelSize, pixelSize*2);
			g.fillRect((int)getX() + pixelSize*3, (int)getY() + pixelSize*21, pixelSize, pixelSize);
			g.fillRect((int)getX() + pixelSize*9, (int)getY() + pixelSize*21, pixelSize*2, pixelSize);
			g.fillRect((int)getX() + pixelSize*10, (int)getY() + pixelSize*20, pixelSize, pixelSize);
			g.fillRect((int)getX() + pixelSize*12, (int)getY() + pixelSize*15, pixelSize, pixelSize*3);
			g.fillRect((int)getX() + pixelSize*13, (int)getY() + pixelSize*16, pixelSize, pixelSize*2);
			g.fillRect((int)getX() + pixelSize*3, (int)getY() + pixelSize*16, pixelSize*7, pixelSize*2);
			g.fillRect((int)getX() + pixelSize*5, (int)getY() + pixelSize*15, pixelSize*3, pixelSize);
			g.fillRect((int)getX() + pixelSize*4, (int)getY() + pixelSize*18, pixelSize*2, pixelSize);
			g.fillRect((int)getX() + pixelSize*7, (int)getY() + pixelSize*18, pixelSize*2, pixelSize);
			
			g.setColor(new Color(234, 189, 152));
			g.fillRect((int)getX() + pixelSize, (int)getY() + pixelSize*14, pixelSize*2, pixelSize*2);
			g.fillRect((int)getX() + pixelSize, (int)getY() + pixelSize*14, pixelSize, pixelSize*3);
			g.fillRect((int)getX() + pixelSize, (int)getY() + pixelSize*15, pixelSize*4, pixelSize);
			g.fillRect((int)getX() + pixelSize*2, (int)getY() + pixelSize*17, pixelSize, pixelSize*2);
			g.fillRect((int)getX() + pixelSize*3, (int)getY() + pixelSize*18, pixelSize, pixelSize*2);
			g.fillRect((int)getX() + pixelSize*3, (int)getY() + pixelSize*19, pixelSize*7, pixelSize);
			g.fillRect((int)getX() + pixelSize*6, (int)getY() + pixelSize*18, pixelSize, pixelSize);
			g.fillRect((int)getX() + pixelSize*9, (int)getY() + pixelSize*18, pixelSize*2, pixelSize);
			g.fillRect((int)getX() + pixelSize*10, (int)getY() + pixelSize*17, pixelSize, pixelSize);
			g.fillRect((int)getX() + pixelSize*8, (int)getY() + pixelSize*15, pixelSize*4, pixelSize);
			g.fillRect((int)getX() + pixelSize*10, (int)getY() + pixelSize*14, pixelSize*2, pixelSize*2);
			g.fillRect((int)getX() + pixelSize*11, (int)getY() + pixelSize*16, pixelSize, pixelSize);
			g.setColor(Color.BLACK);
			g.fillRect((int)getX() - pixelSize*2, (int)getY() + pixelSize*16, pixelSize, pixelSize*2);
			g.fillRect((int)getX() - pixelSize, (int)getY() + pixelSize*15, pixelSize, pixelSize);
			g.fillRect((int)getX() - pixelSize, (int)getY() + pixelSize*18, pixelSize*3, pixelSize);
			g.fillRect((int)getX(), (int)getY() + pixelSize*14, pixelSize, pixelSize);
			g.fillRect((int)getX() + pixelSize, (int)getY() + pixelSize*18, pixelSize, pixelSize*4);
			g.fillRect((int)getX() + pixelSize*2, (int)getY() + pixelSize*22, pixelSize*2, pixelSize);
			g.fillRect((int)getX() + pixelSize*4, (int)getY() + pixelSize*21, pixelSize*5, pixelSize);
			g.fillRect((int)getX() + pixelSize*9, (int)getY() + pixelSize*22, pixelSize*2, pixelSize);
			g.fillRect((int)getX() + pixelSize*11, (int)getY() + pixelSize*18, pixelSize, pixelSize*4);
			g.fillRect((int)getX() + pixelSize*11, (int)getY() + pixelSize*18, pixelSize*3, pixelSize);
			g.fillRect((int)getX() + pixelSize*14, (int)getY() + pixelSize*16, pixelSize, pixelSize*2);
			g.fillRect((int)getX() + pixelSize*13, (int)getY() + pixelSize*15, pixelSize, pixelSize);
			g.fillRect((int)getX() + pixelSize*12, (int)getY() + pixelSize*14, pixelSize, pixelSize);
			
			g.setColor(Color.WHITE);
			g.fillRect((int)getX() + pixelSize*2, (int)getY() + pixelSize*19, pixelSize, pixelSize);
			g.fillRect((int)getX() + pixelSize*3, (int)getY() + pixelSize*20, pixelSize*7, pixelSize);
			g.fillRect((int)getX() + pixelSize*10, (int)getY() + pixelSize*19, pixelSize, pixelSize);
		}
}
