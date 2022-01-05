import java.awt.Color;
import java.awt.Graphics;

public class Energyblast {

	/**
	 * Private variables
	 */
	private int pixelSize;
	private double x;
	private double y;
	private double xSpeed;
	private double ySpeed;
	
	/**
	 * 5 paremeter constructor
	 * @param pixelSize the size of each pixel
	 * @param x the upper-left x-coordinate
	 * @param y the upper-left y-coordinate
	 * @param xSpeed the speed in the x-direction 
	 * @param ySpeed the speed in the y-direction
	 */
	public Energyblast(int pixelSize, double x, double y, double xSpeed, double ySpeed) {
		this.x = x;
		this.y = y;
		this.xSpeed = x;
		this.ySpeed = y;
		this.pixelSize = pixelSize;
	}
	
	/**
	 * gets the upper-left x-coordinate
	 * @return returns the x-coordinate of the upper-left point
	 */
	public double getX() {
		return x;
	}
	
	/**
	 * sets the upper-left x-coordinate
	 * @param x the x-coordinate of the of the upper-left point
	 */
	public void setX(double x) {
		this.x = x;
	}
	
	/**
	 * gets the y-coordinate of the upper-left
	 * @return returns the y-coordinate of the upper-left
	 */
	public double getY() {
		return y;
	}
	
	/**
	 * sets the y-coordinate of the upper-left
	 * @param y the y-coordinate of the upper-left
	 */
	public void setY(double y) {
		this.y = y;
	}
	
	/**
	 * gets the speed in the x-direction
	 * @return returns the speed in the x-direction
	 */
	public double getXSpeed() {
		return xSpeed;
	}
	
	/**
	 * sets the speed in the x-direction
	 * @param xSpeed the speed in the x-direction
	 */
	public void setXSpeed(double xSpeed) {
		this.xSpeed = xSpeed;
	}
	
	/**
	 * gets the speed in the y-direction
	 * @return returns the speed in the y-direction
	 */
	public double getYSpeed() {
		return ySpeed;
	}
	
	/**
	 * sets the speed in the y-direction
	 * @param ySpeed the speed in the y-direction
	 */
	public void setYSpeed(double ySpeed) {
		this.ySpeed = ySpeed;
	}
	
	/**
	 * gets the pixelSize 
	 * @return returns the pixelSize
	 */
	public int getPixelSize() {
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
	 * moves the energyblast left
	 */
	public void moveLeft() {
		setX(getX() - getXSpeed());
	}
	
	/**
	 * moves the energyblast down
	 */
	public void moveDown() {
		setY(getY() + getYSpeed());
	}
	
	/**
	 * moves the energyblast up
	 */
	public void moveUp() {
		setY(getY() - getYSpeed());
	}
	
	/**
	 * moves the energy blast accordingly to the location of the warrior
	 * @param warrior
	 */
	public void trackWarrior(Warrior warrior) {
			moveLeft();
		if(getY() + getPixelSize()*8 > warrior.getY() + warrior.getPixelSize()*11) {
			if(getY() > 1080/2 - 85 && getX() > warrior.getX() + warrior.getPixelSize()*14) {
				moveUp();
			}
		}
		if(getY() + getPixelSize()*8 < warrior.getY() + warrior.getPixelSize()*11) {
			if(getY() + getPixelSize()*17 < 1080/2 + 85 && getX() > warrior.getX() + warrior.getPixelSize()*14) {
				moveDown();
			}
		}
	}
	
	/**
	 * Detects collision with a FireBall
	 * @param fireball FireBall object
	 * @return returns true if there is a collision with FireBall
	 */
	public boolean intersectsWith(FireBall fireball) {
		if(fireball.getX() + fireball.getPixelSize()*20 < getX() + getPixelSize()*23 && fireball.getX() + fireball.getPixelSize()*20 > getX() && fireball.getY() + fireball.getPixelSize()*12 < getY() + getPixelSize()*17 && fireball.getY() + fireball.getPixelSize()*12 > getY()) {
				return true;
		}
		else if(fireball.getX() + fireball.getPixelSize()*20 < getX() + getPixelSize()*23 && fireball.getX() + fireball.getPixelSize()*20 > getX() && fireball.getY() < getY() + getPixelSize()*17 && fireball.getY() > getY()) {
				return true;
		}
		else if(fireball.getX() + fireball.getPixelSize()*20 < getX() + getPixelSize()*23 && fireball.getX() + fireball.getPixelSize()*20 > getX() && fireball.getY() + fireball.getPixelSize()*24 < getY() + getPixelSize()*17 && fireball.getY() + fireball.getPixelSize()*24 > getY()) {
				return true;
		}
		else if(fireball.getX() + fireball.getPixelSize()*10 < getX() + getPixelSize()*20 && fireball.getX() + fireball.getPixelSize()*10 > getX() && fireball.getY() + fireball.getPixelSize()*12 > getY() && fireball.getY() + fireball.getPixelSize()*12 < getY() + getPixelSize()*17) {
				return true;
		}
		else {
			return false;
		}
	}
	
	/**
	 * Detects collision with Warrior
	 * @param warrior Warrior object
	 * @return returns true if intersects Warrior, false otherwise
	 */
	public boolean intersectsWith(Warrior warrior) {
		if(warrior.getX() + warrior.getPixelSize()*14 < getX() + getPixelSize()*23 && warrior.getX() + warrior.getPixelSize()*14 > getX() && warrior.getY() < getY() + getPixelSize()*17 && warrior.getY() > getY()) {
			return true;
		}
		else if(warrior.getX() + warrior.getPixelSize()*14 < getX() + getPixelSize()*23 && warrior.getX() + warrior.getPixelSize()*14 > getX() && warrior.getY() + warrior.getPixelSize()*23 < getY() + getPixelSize()*17 && warrior.getY() + warrior.getPixelSize()*23 > getY()) {
			return true;
		}
		else if(warrior.getX() + warrior.getPixelSize()*14 < getX() + getPixelSize()*23 && warrior.getX() + warrior.getPixelSize()*14 > getX() && warrior.getY() + warrior.getPixelSize()*12 < getY() + getPixelSize()*17 && warrior.getY() + warrior.getPixelSize()*12 > getY()) {
			return true;
		}
		else if(warrior.getX() + warrior.getPixelSize()*7 < getX() + getPixelSize()*23 && warrior.getX() + warrior.getPixelSize()*7 > getX() && warrior.getY() < getY() + getPixelSize()*17 && warrior.getY() > getY()) {
			return true;
		}
		else if(warrior.getX() + warrior.getPixelSize()*7 < getX() + getPixelSize()*23 && warrior.getX() + warrior.getPixelSize()*7 > getX() && warrior.getY() + warrior.getPixelSize()*23 < getY() + getPixelSize()*17 && warrior.getY() + warrior.getPixelSize()*23 > getY()) {
			return true;
		}
		else if(warrior.getX() + warrior.getPixelSize()*7 < getX() + getPixelSize()*23 && warrior.getX() + warrior.getPixelSize()*7 > getX() && warrior.getY() + warrior.getPixelSize()*12 < getY() + getPixelSize()*17 && warrior.getY() + warrior.getPixelSize()*12 > getY()) {
			return true;
		}
		else {
			return false;
		}
	}
	
	/**
	 * Draws Energyblast 23x17, width x height
	 * @param g the Graphics object
	 */
	public void draw(Graphics g) {
		//darkest green
		g.setColor(new Color(0, 250, 30));
		g.fillRect((int)getX() + pixelSize*2, (int)getY() + pixelSize*2, pixelSize, pixelSize);
		g.fillRect((int)getX() + pixelSize*3, (int)getY() + pixelSize, pixelSize*10, pixelSize);
		g.fillRect((int)getX() + pixelSize*5, (int)getY(), pixelSize*5, pixelSize);
		g.fillRect((int)getX() + pixelSize*5, (int)getY() + pixelSize*2, pixelSize*10, pixelSize);
		g.fillRect((int)getX() + pixelSize*10, (int)getY() + pixelSize*3, pixelSize*7, pixelSize);
		g.fillRect((int)getX() + pixelSize*12, (int)getY() + pixelSize*4, pixelSize*6, pixelSize);
		g.fillRect((int)getX() + pixelSize*13, (int)getY() + pixelSize*5, pixelSize*7, pixelSize);
		g.fillRect((int)getX() + pixelSize*14, (int)getY() + pixelSize*6, pixelSize*7, pixelSize);
		g.fillRect((int)getX() + pixelSize*15, (int)getY() + pixelSize*7, pixelSize*7, pixelSize);
		g.fillRect((int)getX() + pixelSize*17, (int)getY() + pixelSize*8, pixelSize*6, pixelSize);
		g.fillRect((int)getX() + pixelSize*15, (int)getY() + pixelSize*9, pixelSize*7, pixelSize);
		g.fillRect((int)getX() + pixelSize*14, (int)getY() + pixelSize*10, pixelSize*7, pixelSize);
		g.fillRect((int)getX() + pixelSize*13, (int)getY() + pixelSize*11, pixelSize*7, pixelSize);
		g.fillRect((int)getX() + pixelSize*12, (int)getY() + pixelSize*12, pixelSize*6, pixelSize);
		g.fillRect((int)getX() + pixelSize*10, (int)getY() + pixelSize*13, pixelSize*7, pixelSize);
		g.fillRect((int)getX() + pixelSize*5, (int)getY() + pixelSize*14, pixelSize*10, pixelSize);
		g.fillRect((int)getX() + pixelSize*3, (int)getY() + pixelSize*15, pixelSize*10, pixelSize);
		g.fillRect((int)getX() + pixelSize*2, (int)getY() + pixelSize*14, pixelSize, pixelSize);
		g.fillRect((int)getX() + pixelSize*5, (int)getY() + pixelSize*16, pixelSize*5, pixelSize);

		//lightest green
		g.setColor(new Color(130, 250, 120));
		g.fillRect((int)getX() + pixelSize*3, (int)getY() + pixelSize*2, pixelSize*2, pixelSize);
		g.fillRect((int)getX() + pixelSize*2, (int)getY() + pixelSize*3, pixelSize*8, pixelSize);
		g.fillRect((int)getX() + pixelSize*5, (int)getY() + pixelSize*4, pixelSize*7, pixelSize);
		g.fillRect((int)getX() + pixelSize*6, (int)getY() + pixelSize*5, pixelSize*7, pixelSize);
		g.fillRect((int)getX() + pixelSize*7, (int)getY() + pixelSize*6, pixelSize*7, pixelSize);
		g.fillRect((int)getX() + pixelSize*7, (int)getY() + pixelSize*7, pixelSize*9, pixelSize);
		g.fillRect((int)getX() + pixelSize*7, (int)getY() + pixelSize*8, pixelSize*11, pixelSize);
		g.fillRect((int)getX() + pixelSize*7, (int)getY() + pixelSize*9, pixelSize*9, pixelSize);
		g.fillRect((int)getX() + pixelSize*7, (int)getY() + pixelSize*10, pixelSize*7, pixelSize);
		g.fillRect((int)getX() + pixelSize*6, (int)getY() + pixelSize*11, pixelSize*7, pixelSize);
		g.fillRect((int)getX() + pixelSize*5, (int)getY() + pixelSize*12, pixelSize*7, pixelSize);
		g.fillRect((int)getX() + pixelSize*2, (int)getY() + pixelSize*13, pixelSize*8, pixelSize);
		g.fillRect((int)getX() + pixelSize*3, (int)getY() + pixelSize*14, pixelSize*2, pixelSize);
		
		g.setColor(Color.WHITE);
		g.fillRect((int)getX() + pixelSize, (int)getY() + pixelSize*3, pixelSize, pixelSize);
		g.fillRect((int)getX() + pixelSize, (int)getY() + pixelSize*4, pixelSize*4, pixelSize);
		g.fillRect((int)getX(), (int)getY() + pixelSize*5, pixelSize*6, pixelSize);
		g.fillRect((int)getX(), (int)getY() + pixelSize*6, pixelSize*7, pixelSize*5);
		g.fillRect((int)getX(), (int)getY() + pixelSize*11, pixelSize*6, pixelSize);
		g.fillRect((int)getX() + pixelSize, (int)getY() + pixelSize*12, pixelSize*4, pixelSize);
		g.fillRect((int)getX() + pixelSize, (int)getY() + pixelSize*13, pixelSize, pixelSize);
	}
	
	/**
	 * Draws Energy blast but in white
	 * @param g the Graphics object
	 */
	public void drawWhite(Graphics g) {
		g.setColor(Color.WHITE);
		g.fillRect((int)getX() + pixelSize*2, (int)getY() + pixelSize*2, pixelSize, pixelSize);
		g.fillRect((int)getX() + pixelSize*3, (int)getY() + pixelSize, pixelSize*10, pixelSize);
		g.fillRect((int)getX() + pixelSize*5, (int)getY(), pixelSize*5, pixelSize);
		g.fillRect((int)getX() + pixelSize*5, (int)getY() + pixelSize*2, pixelSize*10, pixelSize);
		g.fillRect((int)getX() + pixelSize*10, (int)getY() + pixelSize*3, pixelSize*7, pixelSize);
		g.fillRect((int)getX() + pixelSize*12, (int)getY() + pixelSize*4, pixelSize*6, pixelSize);
		g.fillRect((int)getX() + pixelSize*13, (int)getY() + pixelSize*5, pixelSize*7, pixelSize);
		g.fillRect((int)getX() + pixelSize*14, (int)getY() + pixelSize*6, pixelSize*7, pixelSize);
		g.fillRect((int)getX() + pixelSize*15, (int)getY() + pixelSize*7, pixelSize*7, pixelSize);
		g.fillRect((int)getX() + pixelSize*17, (int)getY() + pixelSize*8, pixelSize*6, pixelSize);
		g.fillRect((int)getX() + pixelSize*15, (int)getY() + pixelSize*9, pixelSize*7, pixelSize);
		g.fillRect((int)getX() + pixelSize*14, (int)getY() + pixelSize*10, pixelSize*7, pixelSize);
		g.fillRect((int)getX() + pixelSize*13, (int)getY() + pixelSize*11, pixelSize*7, pixelSize);
		g.fillRect((int)getX() + pixelSize*12, (int)getY() + pixelSize*12, pixelSize*6, pixelSize);
		g.fillRect((int)getX() + pixelSize*10, (int)getY() + pixelSize*13, pixelSize*7, pixelSize);
		g.fillRect((int)getX() + pixelSize*5, (int)getY() + pixelSize*14, pixelSize*10, pixelSize);
		g.fillRect((int)getX() + pixelSize*3, (int)getY() + pixelSize*15, pixelSize*10, pixelSize);
		g.fillRect((int)getX() + pixelSize*2, (int)getY() + pixelSize*14, pixelSize, pixelSize);
		g.fillRect((int)getX() + pixelSize*5, (int)getY() + pixelSize*16, pixelSize*5, pixelSize);
		g.fillRect((int)getX() + pixelSize*3, (int)getY() + pixelSize*2, pixelSize*2, pixelSize);
		g.fillRect((int)getX() + pixelSize*2, (int)getY() + pixelSize*3, pixelSize*8, pixelSize);
		g.fillRect((int)getX() + pixelSize*5, (int)getY() + pixelSize*4, pixelSize*7, pixelSize);
		g.fillRect((int)getX() + pixelSize*6, (int)getY() + pixelSize*5, pixelSize*7, pixelSize);
		g.fillRect((int)getX() + pixelSize*7, (int)getY() + pixelSize*6, pixelSize*7, pixelSize);
		g.fillRect((int)getX() + pixelSize*7, (int)getY() + pixelSize*7, pixelSize*9, pixelSize);
		g.fillRect((int)getX() + pixelSize*7, (int)getY() + pixelSize*8, pixelSize*11, pixelSize);
		g.fillRect((int)getX() + pixelSize*7, (int)getY() + pixelSize*9, pixelSize*9, pixelSize);
		g.fillRect((int)getX() + pixelSize*7, (int)getY() + pixelSize*10, pixelSize*7, pixelSize);
		g.fillRect((int)getX() + pixelSize*6, (int)getY() + pixelSize*11, pixelSize*7, pixelSize);
		g.fillRect((int)getX() + pixelSize*5, (int)getY() + pixelSize*12, pixelSize*7, pixelSize);
		g.fillRect((int)getX() + pixelSize*2, (int)getY() + pixelSize*13, pixelSize*8, pixelSize);
		g.fillRect((int)getX() + pixelSize*3, (int)getY() + pixelSize*14, pixelSize*2, pixelSize);
		g.fillRect((int)getX() + pixelSize, (int)getY() + pixelSize*3, pixelSize, pixelSize);
		g.fillRect((int)getX() + pixelSize, (int)getY() + pixelSize*4, pixelSize*4, pixelSize);
		g.fillRect((int)getX(), (int)getY() + pixelSize*5, pixelSize*6, pixelSize);
		g.fillRect((int)getX(), (int)getY() + pixelSize*6, pixelSize*7, pixelSize*5);
		g.fillRect((int)getX(), (int)getY() + pixelSize*11, pixelSize*6, pixelSize);
		g.fillRect((int)getX() + pixelSize, (int)getY() + pixelSize*12, pixelSize*4, pixelSize);
		g.fillRect((int)getX() + pixelSize, (int)getY() + pixelSize*13, pixelSize, pixelSize);
	}
}
