import java.awt.Color;
import java.awt.Graphics;

public class Shadowmonster {

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
	 * constructor for Shadow monster
	 * @param pixelSize the size of each individual pixel of the Shadow monster
	 * @param x the x-coordinate of the upper-left of the Shadow monster
	 * @param y the y-coordinate of the upper-left of the Shadow monster
	 * @param xSpeed the speed of the Shadow monster in the x-direction
	 * @param ySpeed the speed of the Shadow monster in the y-direction
	 */
	public Shadowmonster(int pixelSize, double x, double y, double xSpeed, double ySpeed) {
		this.pixelSize = pixelSize;
		this.x = x;
		this.y = y;
		this.xSpeed = xSpeed;
		this.ySpeed = ySpeed;
	}
	
	/**
	 * gets the pixelSize for the Shadow monster
	 * @return returns the pixelSize of the Shadow monster
	 */
	public double getPixelSize() {
		return pixelSize;
	}
	
	/**
	 * sets the pixelSize of the Shadow monster
	 * @param pixelSize the size of each pixel
	 */
	public void setPixelSize(int pixelSize) {
		this.pixelSize = pixelSize;
	}
	
	/**
	 * gets the x-coordinate of the upper-left of the Shadow monster
	 * @return returns the x-coordinate of the upper-left of the Shadow monster
	 */
	public double getX() {
		return x;
	}
	
	/**
	 * sets the x-coordinate of the upper-left of the Shadow monster
	 * @param x
	 */
	public void setX(double x) {
		this.x = x;
	}
	
	/**
	 * gets the y-coordinate of the upper-left of the Shadow monster
	 * @return returns the y-coordinate of the upper-left of the Shadow monster
	 */
	public double getY() {
		return y;
	}
	
	/**
	 * sets the y-coordinate of the upper-left of the Shadow monster
	 * @param y the y-coordinate of the upper-left of the Shadow monster
	 */
	public void setY(double y) {
		this.y = y;
	}
	
	/**
	 * gets the xSpeed of the Shadow monster
	 * @return returns the xSpeed of the Shadow monster
	 */
	public double getXSpeed() {
		return xSpeed;
	}
	
	/**
	 * sets the xSpeed of the Shadow monster
	 * @param xSpeed the xSpeed of the Shadow monster
	 */
	public void setXSpeed(double xSpeed) {
		this.xSpeed = xSpeed;
	}
	
	/**
	 * gets the ySpeed of the Shadow monster
	 * @return returns the ySpeed of the Shadow monster
	 */
	public double getYSpeed() {
		return ySpeed;
	}
	
	/**
	 * sets the ySpeed of the Shadow monster
	 * @param ySpeed the ySpeed of the Shadow monster
	 */
	public void setYSpeed(double ySpeed) {
		this.ySpeed = ySpeed;
	}
	
	/**
	 * gets the hpPercent of the Shadow monster
	 * @return returns the hpPercent of the Shadow monster
	 */
	public double gethpPercent() {
		return hpPercent;
	}
	
	/**
	 * sets the hpPercent of the Shadow monster
	 * @param hpPercent the percentage of health that the Shadow monster has remaining
	 */
	public void sethpPercent(double hpPercent) {
		this.hpPercent = hpPercent;
	}
	
	/**
	 * gets the direction which of the Shadow monster is facing
	 * @return returns the direction which the Shadow monster is facing
	 */
	public int getDirection() {
		return direction;
	}
	
	/**
	 * sets the direction of the Shadow monster
	 * @param direction the direction which the Shadow monster is facing
	 */
	public void setDirection(int direction) {
		this.direction = direction;
	}
	
	/**
	 * sets the Location of the Shadow monster from the upper-left coordinate
	 * @param x the x-coordinate of the upper-left of the Shadow monster
	 * @param y the y-coordinate of the upper-left of the Shadow monster
	 */
	public void setLocation(double x, double y) {
		setX(x);
		setY(y);
	}
	
	/**
	 * the Shadow monster moves up, increase in y-position
	 */
	public void moveUp() {
		setY(getY() - getYSpeed());
	}
	
	/**
	 * the Shadow monster moves down, decrease in y-position
	 */
	public void moveDown() {
		setY(getY() + getYSpeed());
	}
	
	/**
	 * the Shadow monster moves to the right, increase in x-position
	 */
	public void moveRight() { 
		setX(getX() + getXSpeed());
	}
	
	/**
	 * the Shadow monster moves left, decrease in the x-position
	 */
	public void moveLeft() { 
		setX(getX() - getXSpeed());
	}
	
	/**
	 * Shadow monster moves based off a direction
	 * @param monsterdirection the direction of which the monster is facing/moving in
	 */
	public void moveMonster(int shadowdirection) {
		if(shadowdirection == 1) {
			moveDown();
		}
		if(shadowdirection == 2) {
			moveUp();
		}
		if(shadowdirection == 3) {
			moveLeft();
		}
		if(shadowdirection == 4) {
			moveRight();
		}
	}
	
	/**
	 * Draws the shadow monster while facing left
	 * @param g the Graphics object
	 */
	public void drawLeftShadow(Graphics g) {
		//Shadow
		g.setColor(Color.BLACK);
		g.fillRect((int)getX() + pixelSize*35, (int)getY(), pixelSize, pixelSize);
		g.fillRect((int)getX(), (int)getY() + pixelSize*21, pixelSize*4, pixelSize*3);
		g.fillRect((int)getX() + pixelSize*33, (int)getY() + pixelSize, pixelSize*2, pixelSize);
		g.fillRect((int)getX() + pixelSize*42, (int)getY() + pixelSize, pixelSize, pixelSize);
		g.fillRect((int)getX() + pixelSize*32, (int)getY() + pixelSize*2, pixelSize*2, pixelSize);
		g.fillRect((int)getX() + pixelSize*40, (int)getY() + pixelSize*2, pixelSize*2, pixelSize);
		g.fillRect((int)getX() + pixelSize*40, (int)getY() + pixelSize*3, pixelSize, pixelSize);
		g.fillRect((int)getX() + pixelSize*31, (int)getY() + pixelSize*3, pixelSize, pixelSize);
		g.fillRect((int)getX() + pixelSize*20, (int)getY() + pixelSize*4, pixelSize*3, pixelSize);
		g.fillRect((int)getX() + pixelSize*31, (int)getY() + pixelSize*4, pixelSize*2, pixelSize);
		g.fillRect((int)getX() + pixelSize*39, (int)getY() + pixelSize*4, pixelSize, pixelSize);
		g.fillRect((int)getX() + pixelSize*42, (int)getY() + pixelSize*4, pixelSize, pixelSize);
		g.fillRect((int)getX() + pixelSize*31, (int)getY() + pixelSize*5, pixelSize*3, pixelSize);
		g.fillRect((int)getX() + pixelSize*36, (int)getY() + pixelSize*5, pixelSize*7, pixelSize);
		g.fillRect((int)getX() + pixelSize*19, (int)getY() + pixelSize*5, pixelSize*3, pixelSize);
		g.fillRect((int)getX() + pixelSize*18, (int)getY() + pixelSize*6, pixelSize*3, pixelSize*2);
		g.fillRect((int)getX() + pixelSize*28, (int)getY() + pixelSize*6, pixelSize*13, pixelSize);
		g.fillRect((int)getX() + pixelSize*44, (int)getY() + pixelSize*6, pixelSize, pixelSize);
		g.fillRect((int)getX() + pixelSize*47, (int)getY() + pixelSize*6, pixelSize, pixelSize);
		g.fillRect((int)getX() + pixelSize*14, (int)getY() + pixelSize*7, pixelSize*2, pixelSize);
		g.fillRect((int)getX() + pixelSize*27, (int)getY() + pixelSize*7, pixelSize*18, pixelSize);
		g.fillRect((int)getX() + pixelSize*46, (int)getY() + pixelSize*7, pixelSize*2, pixelSize);
		g.fillRect((int)getX() + pixelSize*17, (int)getY() + pixelSize*8, pixelSize*30, pixelSize);
		g.fillRect((int)getX() + pixelSize*12, (int)getY() + pixelSize*8, pixelSize*3, pixelSize);
		g.fillRect((int)getX() + pixelSize*9, (int)getY() + pixelSize*9, pixelSize*3, pixelSize);
		g.fillRect((int)getX() + pixelSize*16, (int)getY() + pixelSize*9, pixelSize*30, pixelSize*2);
		g.fillRect((int)getX() + pixelSize*12, (int)getY() + pixelSize*10, pixelSize*4, pixelSize);
		g.fillRect((int)getX() + pixelSize*5, (int)getY() + pixelSize*10, pixelSize*4, pixelSize);
		g.fillRect((int)getX() + pixelSize*4, (int)getY() + pixelSize*11, pixelSize*40, pixelSize*4);
		g.fillRect((int)getX() + pixelSize*3, (int)getY() + pixelSize*12, pixelSize, pixelSize*3);
		g.fillRect((int)getX() + pixelSize*2, (int)getY() + pixelSize*15, pixelSize*40, pixelSize*2);
		g.fillRect((int)getX() + pixelSize*2, (int)getY() + pixelSize*17, pixelSize*39, pixelSize*2);
		g.fillRect((int)getX() + pixelSize*2, (int)getY() + pixelSize*19, pixelSize*41, pixelSize*2);
		g.fillRect((int)getX() + pixelSize, (int)getY() + pixelSize*20, pixelSize, pixelSize);
		g.fillRect((int)getX() + pixelSize*7, (int)getY() + pixelSize*21, pixelSize*4, pixelSize);
		g.fillRect((int)getX() + pixelSize*15, (int)getY() + pixelSize*21, pixelSize*27, pixelSize);
		g.fillRect((int)getX(), (int)getY() + pixelSize*22, pixelSize*41, pixelSize);
		g.fillRect((int)getX(), (int)getY() + pixelSize*23, pixelSize*39, pixelSize);
		g.fillRect((int)getX() + pixelSize, (int)getY() + pixelSize*24, pixelSize*39, pixelSize*3);
		g.fillRect((int)getX() + pixelSize, (int)getY() + pixelSize*27, pixelSize*38, pixelSize);
		g.fillRect((int)getX() + pixelSize*2, (int)getY() + pixelSize*28, pixelSize*36, pixelSize);
		g.fillRect((int)getX() + pixelSize*3, (int)getY() + pixelSize*29, pixelSize*34, pixelSize);
		g.fillRect((int)getX() + pixelSize*4, (int)getY() + pixelSize*30, pixelSize*35, pixelSize);
		g.fillRect((int)getX() + pixelSize*40, (int)getY() + pixelSize*30, pixelSize, pixelSize);
		g.fillRect((int)getX() + pixelSize*40, (int)getY() + pixelSize*29, pixelSize*2, pixelSize);
		g.fillRect((int)getX() + pixelSize*6, (int)getY() + pixelSize*31, pixelSize*35, pixelSize);
		g.fillRect((int)getX() + pixelSize*7, (int)getY() + pixelSize*32, pixelSize*31, pixelSize);
		g.fillRect((int)getX() + pixelSize*9, (int)getY() + pixelSize*33, pixelSize*27, pixelSize);
		g.fillRect((int)getX() + pixelSize*11, (int)getY() + pixelSize*34, pixelSize*22, pixelSize);
		
		//Eyes
		g.setColor(Color.RED);
		g.fillRect((int)getX() + pixelSize*4, (int)getY() + pixelSize*21, pixelSize*3, pixelSize);
		g.fillRect((int)getX() + pixelSize*11, (int)getY() + pixelSize*21, pixelSize*4, pixelSize);
	}
	
	/**
	 * Draws Shadow while facing right but in white
	 * @param g the Graphics object
	 */
	public void drawLeftWhite(Graphics g) {
		g.setColor(Color.WHITE);
		g.fillRect((int)getX() + pixelSize*35, (int)getY(), pixelSize, pixelSize);
		g.fillRect((int)getX(), (int)getY() + pixelSize*21, pixelSize*4, pixelSize*3);
		g.fillRect((int)getX() + pixelSize*33, (int)getY() + pixelSize, pixelSize*2, pixelSize);
		g.fillRect((int)getX() + pixelSize*42, (int)getY() + pixelSize, pixelSize, pixelSize);
		g.fillRect((int)getX() + pixelSize*32, (int)getY() + pixelSize*2, pixelSize*2, pixelSize);
		g.fillRect((int)getX() + pixelSize*40, (int)getY() + pixelSize*2, pixelSize*2, pixelSize);
		g.fillRect((int)getX() + pixelSize*40, (int)getY() + pixelSize*3, pixelSize, pixelSize);
		g.fillRect((int)getX() + pixelSize*31, (int)getY() + pixelSize*3, pixelSize, pixelSize);
		g.fillRect((int)getX() + pixelSize*20, (int)getY() + pixelSize*4, pixelSize*3, pixelSize);
		g.fillRect((int)getX() + pixelSize*31, (int)getY() + pixelSize*4, pixelSize*2, pixelSize);
		g.fillRect((int)getX() + pixelSize*39, (int)getY() + pixelSize*4, pixelSize, pixelSize);
		g.fillRect((int)getX() + pixelSize*42, (int)getY() + pixelSize*4, pixelSize, pixelSize);
		g.fillRect((int)getX() + pixelSize*31, (int)getY() + pixelSize*5, pixelSize*3, pixelSize);
		g.fillRect((int)getX() + pixelSize*36, (int)getY() + pixelSize*5, pixelSize*7, pixelSize);
		g.fillRect((int)getX() + pixelSize*19, (int)getY() + pixelSize*5, pixelSize*3, pixelSize);
		g.fillRect((int)getX() + pixelSize*18, (int)getY() + pixelSize*6, pixelSize*3, pixelSize*2);
		g.fillRect((int)getX() + pixelSize*28, (int)getY() + pixelSize*6, pixelSize*13, pixelSize);
		g.fillRect((int)getX() + pixelSize*44, (int)getY() + pixelSize*6, pixelSize, pixelSize);
		g.fillRect((int)getX() + pixelSize*47, (int)getY() + pixelSize*6, pixelSize, pixelSize);
		g.fillRect((int)getX() + pixelSize*14, (int)getY() + pixelSize*7, pixelSize*2, pixelSize);
		g.fillRect((int)getX() + pixelSize*27, (int)getY() + pixelSize*7, pixelSize*18, pixelSize);
		g.fillRect((int)getX() + pixelSize*46, (int)getY() + pixelSize*7, pixelSize*2, pixelSize);
		g.fillRect((int)getX() + pixelSize*17, (int)getY() + pixelSize*8, pixelSize*30, pixelSize);
		g.fillRect((int)getX() + pixelSize*12, (int)getY() + pixelSize*8, pixelSize*3, pixelSize);
		g.fillRect((int)getX() + pixelSize*9, (int)getY() + pixelSize*9, pixelSize*3, pixelSize);
		g.fillRect((int)getX() + pixelSize*16, (int)getY() + pixelSize*9, pixelSize*30, pixelSize*2);
		g.fillRect((int)getX() + pixelSize*12, (int)getY() + pixelSize*10, pixelSize*4, pixelSize);
		g.fillRect((int)getX() + pixelSize*5, (int)getY() + pixelSize*10, pixelSize*4, pixelSize);
		g.fillRect((int)getX() + pixelSize*4, (int)getY() + pixelSize*11, pixelSize*40, pixelSize*4);
		g.fillRect((int)getX() + pixelSize*3, (int)getY() + pixelSize*12, pixelSize, pixelSize*3);
		g.fillRect((int)getX() + pixelSize*2, (int)getY() + pixelSize*15, pixelSize*40, pixelSize*2);
		g.fillRect((int)getX() + pixelSize*2, (int)getY() + pixelSize*17, pixelSize*39, pixelSize*2);
		g.fillRect((int)getX() + pixelSize*2, (int)getY() + pixelSize*19, pixelSize*41, pixelSize*2);
		g.fillRect((int)getX() + pixelSize, (int)getY() + pixelSize*20, pixelSize, pixelSize);
		g.fillRect((int)getX() + pixelSize*7, (int)getY() + pixelSize*21, pixelSize*4, pixelSize);
		g.fillRect((int)getX() + pixelSize*15, (int)getY() + pixelSize*21, pixelSize*27, pixelSize);
		g.fillRect((int)getX(), (int)getY() + pixelSize*22, pixelSize*41, pixelSize);
		g.fillRect((int)getX(), (int)getY() + pixelSize*23, pixelSize*39, pixelSize);
		g.fillRect((int)getX() + pixelSize, (int)getY() + pixelSize*24, pixelSize*39, pixelSize*3);
		g.fillRect((int)getX() + pixelSize, (int)getY() + pixelSize*27, pixelSize*38, pixelSize);
		g.fillRect((int)getX() + pixelSize*2, (int)getY() + pixelSize*28, pixelSize*36, pixelSize);
		g.fillRect((int)getX() + pixelSize*3, (int)getY() + pixelSize*29, pixelSize*34, pixelSize);
		g.fillRect((int)getX() + pixelSize*4, (int)getY() + pixelSize*30, pixelSize*35, pixelSize);
		g.fillRect((int)getX() + pixelSize*40, (int)getY() + pixelSize*30, pixelSize, pixelSize);
		g.fillRect((int)getX() + pixelSize*40, (int)getY() + pixelSize*29, pixelSize*2, pixelSize);
		g.fillRect((int)getX() + pixelSize*6, (int)getY() + pixelSize*31, pixelSize*35, pixelSize);
		g.fillRect((int)getX() + pixelSize*7, (int)getY() + pixelSize*32, pixelSize*31, pixelSize);
		g.fillRect((int)getX() + pixelSize*9, (int)getY() + pixelSize*33, pixelSize*27, pixelSize);
		g.fillRect((int)getX() + pixelSize*11, (int)getY() + pixelSize*34, pixelSize*22, pixelSize);
		g.fillRect((int)getX() + pixelSize*4, (int)getY() + pixelSize*21, pixelSize*3, pixelSize);
		g.fillRect((int)getX() + pixelSize*11, (int)getY() + pixelSize*21, pixelSize*4, pixelSize);
	}
	
	/**
	 * Draws the shadow monster while facing right
	 * @param g the Graphics object
	 */
	public void drawRightShadow(Graphics g) {
		//Shadow
		g.setColor(Color.BLACK);
		
		//Eyes
		g.setColor(Color.RED);
	}
	
	/** 48x35, width x height
	 * Draws the Shadow monster depending on the direction
	 * @param g the Graphics object
	 * @param shadowdirection the direction of the shadow monster, 1-Left, 2-Right
	 */
	public void drawShadow(Graphics g, int shadowdirection) {
		if(shadowdirection == 1) {
			drawLeftShadow(g);
		}
		if(shadowdirection == 2) {
			drawRightShadow(g);
		}
	}
	
	/**
	 * detects whether warrior intersects with Shadow monster
	 * @param warrior the object which intersection is being calculated with
	 * @return returns true if intersecting, false otherwise
	 */
	public boolean intersectsWith(Warrior warrior) {
		if(warrior.getX() + warrior.getPixelSize()*7 > getX() && warrior.getX() + warrior.getPixelSize()*7 < getX() + getPixelSize()*48 && warrior.getY() + warrior.getPixelSize()*11 > getY() && warrior.getY() + getPixelSize()*11 < getY() + getPixelSize()*35) {
			return true;
		}
		
		else if(warrior.getX() > getX() && warrior.getX() < getX() + getPixelSize()*48 && warrior.getY() > getY() && warrior.getY() < getY() + getPixelSize()*35) {
			return true;
		}
		
		else if(warrior.getX() + warrior.getPixelSize()*14 > getX() && warrior.getX() + warrior.getPixelSize()*14 < getX() + getPixelSize()*48 && warrior.getY() + warrior.getPixelSize()*23 > getY() && warrior.getY() + getPixelSize()*23 < getY() + getPixelSize()*35) {
			return true;
		}
		
		else {
			return false;
		}
	}
	
	/**
	 * detects whether a FireBall intersects with Shadow monster, returns true or false
	 * @param fireball the FireBall which hits intersects with the Shadow monster
	 * @return returns true or false
	 */
	public boolean fireBallHits(FireBall fireball) {
		if(fireball.getX() + fireball.getPixelSize()*10 > getX() && fireball.getX() + fireball.getPixelSize()*10 < getX() + getPixelSize()*48 && fireball.getY() + fireball.getPixelSize()*12 > getY() && fireball.getY() + getPixelSize()*12 < getY() + getPixelSize()*35) {
			return true;
		}
		
		else if(fireball.getX() > getX() && fireball.getX() < getX() + getPixelSize()*33 && fireball.getY() > getY() && fireball.getY() < getY() + getPixelSize()*47) {
			return true;
		}
		
		if(fireball.getX() + fireball.getPixelSize()*20 > getX() && fireball.getX() + fireball.getPixelSize()*20 < getX() + getPixelSize()*48 && fireball.getY() + fireball.getPixelSize()*24 > getY() && fireball.getY() + getPixelSize()*24 < getY() + getPixelSize()*35) {
			return true;
		}
		
		else {
			return false;
		}
	}
}
