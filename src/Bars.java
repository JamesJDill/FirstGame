import java.awt.Color;
import java.awt.Graphics;

public class Bars {
	
	/**
	 * default constructor for bars
	 */
	public Bars() {
		
	}
	
	/**
	 * draws healthbar 
	 * @param g the graphics object
	 * @param percent percent of the healthbar from full
	 * @param pixelSize the pixelSize of the pixels of the heart
	 * @param x the x-coordinate of the upper-left of the heart
	 * @param y the y-coordinate of the upper-left of the heart
	 */
	public void drawHealthBar(Graphics g, double percent, int x, int y, int width, int height) {
			g.setColor(new Color(229, 233, 234));
			g.fillRect(x, y, width, height);
			
			g.setColor(new Color(255, 153, 153));
			g.fillRect(x, y, (int) (width*percent), height);
	}
	
	/**
	 * draws a heart
	 * @param g the Graphics object
	 * @param pixelSize the size of each pixel
	 * @param x the x-coordinate of the upper-left of the heart
	 * @param y the y-coordinate of the upper-left of the heart
	 */
	public void drawHeart(Graphics g, int pixelSize, int x, int y) {
		g.setColor(Color.RED);
		g.fillRect(x + pixelSize, y, pixelSize*4, pixelSize);
		g.fillRect(x + pixelSize*8, y, pixelSize*4, pixelSize);
		g.fillRect(x, y + pixelSize, pixelSize*2, pixelSize*4);
		g.fillRect(x + pixelSize*4, y + pixelSize, pixelSize*2, pixelSize);
		g.fillRect(x + pixelSize*7, y + pixelSize, pixelSize*6, pixelSize*4);
		g.fillRect(x + pixelSize*3, y + pixelSize*2, pixelSize*10, pixelSize);
		g.fillRect(x + pixelSize*2, y + pixelSize*3, pixelSize*11, pixelSize);
		g.fillRect(x + pixelSize, y + pixelSize*4, pixelSize*8, pixelSize);
		g.fillRect(x + pixelSize, y + pixelSize*5, pixelSize*11, pixelSize);
		g.fillRect(x + pixelSize*2, y + pixelSize*6, pixelSize*9, pixelSize);
		g.fillRect(x + pixelSize*3, y + pixelSize*7, pixelSize*7, pixelSize);
		g.fillRect(x + pixelSize*4, y + pixelSize*8, pixelSize*5, pixelSize);
		g.fillRect(x + pixelSize*5, y + pixelSize*9, pixelSize*3, pixelSize);
		g.fillRect(x + pixelSize*6, y + pixelSize*10, pixelSize, pixelSize);
		
		g.setColor(Color.WHITE);
		g.fillRect(x + pixelSize*2, y + pixelSize, pixelSize*2, pixelSize);
		g.fillRect(x + pixelSize, y + pixelSize*2, pixelSize*2, pixelSize);
		g.fillRect(x + pixelSize, y + pixelSize*3, pixelSize, pixelSize);
	}
	
	/**
	 * Draws the manabar
	 * @param g the graphics object
	 * @param percent the percent of the healthbar from full
	 */
	public void drawManaBar(Graphics g, double percent) {
			//Grey Filling
			g.setColor(new Color(229, 233, 234));
			g.fillRect(180, 55, 600, 35);
			
			//Blue
			g.setColor(new Color(7, 213, 255));
			g.fillRect(180, 55, (int) (600*percent), 35);
		
	}
}
