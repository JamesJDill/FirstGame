import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.image.BufferedImage;
import java.util.ArrayList;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.Timer;

@SuppressWarnings("serial")
public class BasicVideogame extends JPanel {
	
	//private values
	private static final int WIDTH = 1940;
	private static final int HEIGHT = 1080;
			
	//private objects
	private ArrayList<monster> monsters = new ArrayList<monster>();
	private ArrayList<Shadowmonster> shadows = new ArrayList<Shadowmonster>();
	private ArrayList<Electroball> electroballs = new ArrayList<Electroball>();
	private ArrayList<Energyblast> energyblasts = new ArrayList<Energyblast>();
	private ArrayList<Laser> room6lasers = new ArrayList<Laser>();
	
	private BufferedImage image;
	private Timer timer;
	private Graphics g;
	private Warrior char1;
	private Rooms rooms;
	private FireBall fireball;
	private Bars bars;
	private monster monster;
	private Shadowmonster shadow;
	private Mage mage;
	private Electroball electroball;
	private Eyemonster eye;
	private Eyemonster eye2;
	private Energyblast energy;
	private Laser room6laser;
	private Laser room8laser;
	//private boolean variables
	private boolean wPressed, aPressed, sPressed, dPressed, spacePressed;
	
	//private int and double variables
	private int lastDirection;
	private int roomnumber;
	private int room2monsters;
	private int room3monsters;
	private int abilitySelected;
	private int mageAttackCD;
	private int regentime;
	private int eyemovement;
	private int energyblastfiretime;
	private int ee;
	private int energyCD;
	private int energywait;
	private int timesfireballhit;
	private int laserfired;
	private int lasertime;
	private int laserfiretime;
	private int eyeballability;
	
	private double manaPercent;
	private double manapool;
	private double hpPercent;
	private double manaregen;
	
	//draws Background, sets parameters, sets starting values
	public BasicVideogame() {
	
		image =  new BufferedImage(WIDTH, HEIGHT, BufferedImage.TYPE_INT_RGB);
		g = image.getGraphics();

		GraphicsUtilities.drawBackground(g, Color.GRAY, WIDTH, HEIGHT);
		
		rooms = new Rooms(WIDTH, HEIGHT, 100);
		
		char1 = new Warrior(5, WIDTH/2 - 35, HEIGHT, 4, 4);
		
		fireball = new FireBall(3, 10000, 10000, 30, 30);
		
		bars = new Bars();
				
		spacePressed = false;
		wPressed = false;
		aPressed = false;
		sPressed = false;
		dPressed = false;
		
		room3monsters = 35;
		room2monsters = 4;
		manapool = 500;
		lastDirection = 1;
		fireball.setDirection(1);
		manaPercent = 1;
		hpPercent = 1;
		roomnumber = 1;
		manaregen = 0;
		mageAttackCD = 0;
		abilitySelected = 1;
		eyeballability = 1;
		laserfired = 0;
		regentime = 0;
		eyemovement = 0;
		energyblastfiretime = 0;
		ee = 0;
		energyCD = 0;
		energywait = 0;
		timesfireballhit = 0;
		lasertime = 0;
		laserfiretime = 0;
		
			monster = new monster(5, rooms.getWallThickness() + 10, rooms.getWallThickness() + 10, 1.5, 1.5);
			monsters.add(monster);
			monster = new monster(5, rooms.getWidth() - rooms.getWallThickness() - 10 - 5*34, rooms.getWallThickness() + 10, 1.5, 1.5);
			monsters.add(monster);
			monster = new monster(5, rooms.getWallThickness() + 10, rooms.getHeight() - rooms.getWallThickness() - 10 - 5*48, 1.5, 1.5);
			monsters.add(monster);
			monster = new monster(5, rooms.getWidth() - rooms.getWallThickness() - 10 - 5*34, rooms.getHeight() - rooms.getWallThickness() - 10 - 5*48, 1.5, 1.5);
			monsters.add(monster);
			
			for(int i = 0; i < room3monsters; i++) {
				shadow = new Shadowmonster(2, (int)(Math.random()*rooms.getWidth()-48*2), (int)(Math.random()*(rooms.getHeight()-2*35)), 3, 3);
				shadows.add(shadow);
			}
				
			for(int i = 0; i < 12; i++) {
				electroball = new Electroball(5, rooms.getWallThickness() + 150*i, HEIGHT/2 - 5*7, 10, 10*(Math.pow(-1, i)));
				electroballs.add(electroball);
			}
				
			electroball = new Electroball(5, 10000, 500, 20, 20);
					
			mage = new Mage(5, 1550, 500, 2, 2);
			mage.setDirection(1);
		
			
			for(int i = 0; i < room2monsters; i++) {
				monsters.get(i).sethpPercent(1);
				monsters.get(i).setDirection(1);
			}
		
			eye = new Eyemonster(5, rooms.getWidth() - 5*19.5 - ((rooms.getWidth() - rooms.getWallThickness()*2)/3)/2, rooms.getHeight()/2 - 5*24, .4, .2);
			eye2 = new Eyemonster(5, rooms.getWidth() - 250, rooms.getHeight()/2 - 200, 1, 1.25);
			
			for(int i = 0; i < 100; i++) {
				energy = new Energyblast(3, 10000, 10000, 1, 5);
				energy.setXSpeed(10);
				energy.setYSpeed(2);
				energyblasts.add(energy);
			}
			
			for(int i = 0; i < 9; i++) {
				room6laser = new Laser(125 + i*200, rooms.getHeight()/2 - 125, 0, 250, 76);
				room6lasers.add(room6laser);
			}
			room8laser = new Laser(0, 0, WIDTH, 0, 70);
			
		//Starts timer
		timer = new Timer(2, new TimerListener());
		timer.start();
		
		//Adds key listener class
		addKeyListener(new KeyBoard());
		setFocusable(true);
	}
	
	private class KeyBoard implements KeyListener {

		@Override
		public void keyPressed(KeyEvent e) {
			//whenever keys, W, A, S, D, and Space are pressed, corresponding boolean is set to true
			if(e.getKeyCode() == KeyEvent.VK_W) {
				wPressed = true;
			}
			if(e.getKeyCode() == KeyEvent.VK_A) {
				aPressed = true;
			}
			if(e.getKeyCode() == KeyEvent.VK_S) {
				sPressed = true;
			}
			if(e.getKeyCode() == KeyEvent.VK_D) {
				dPressed = true;
			}
			if(e.getKeyCode() == KeyEvent.VK_SPACE) {
				spacePressed = true;
			}
		}

		@Override
		public void keyReleased(KeyEvent e) {
			//Selects abilities based off number
			if(e.getKeyCode() == KeyEvent.VK_1) {
				abilitySelected = 1;
			}
			if(e.getKeyCode() == KeyEvent.VK_2) {
				abilitySelected = 2;
			}
			if(e.getKeyCode() == KeyEvent.VK_3) {
				abilitySelected = 3;
			}
			
			//if spacebar is pressed and mana is over 100 sets spacePressed to false
			if(e.getKeyCode() == KeyEvent.VK_SPACE && abilitySelected == 1) { 
				if(manapool >= 100) {
				manapool = manapool - 100;
				fireball.setX(char1.getX() + char1.getPixelSize()/2);
				fireball.setY(char1.getY());
				lastDirection = fireball.getDirection();
				timesfireballhit = 0;
				}
			}
			
			//whenever keys, W, A, S, D, are released corresponding boolean arg is set to false
			if(e.getKeyCode() == KeyEvent.VK_W) {
				wPressed = false;
			}
			if(e.getKeyCode() == KeyEvent.VK_S) {
				sPressed = false;
			}
			if(e.getKeyCode() == KeyEvent.VK_A) {
				aPressed = false;
			}
			if(e.getKeyCode() == KeyEvent.VK_D) {
				dPressed = false;
			}
			if(e.getKeyCode() == KeyEvent.VK_SPACE) {
				spacePressed = false;
			}
		}

		@Override
		public void keyTyped(KeyEvent e) {
		}
	}

	private class TimerListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {

			// draw a background color to cover up all the previous graphics
			GraphicsUtilities.drawBackground(g, Color.GRAY, WIDTH, HEIGHT);
			
			//Draws room based off number	
			
			rooms.drawRoom(g, roomnumber);
			
			//Sets up monsters for room two
			if(roomnumber == 2) {
				for(int i = 0; i < room2monsters; i++) {
					if(!monsters.get(i).fireBallHits(fireball)) {
						monsters.get(i).drawMonster(g, monsters.get(i).getDirection());
					}
					if(monsters.get(i).fireBallHits(fireball)) {
						fireball.setX(100000);
						monsters.get(i).sethpPercent(monsters.get(i).gethpPercent()-.3333333333333334);
						if(monsters.get(i).getDirection() == 3) {
							monsters.get(i).drawLeftWhite(g);
						}
						else if(monsters.get(i).getDirection() == 4) {
							monsters.get(i).drawRightWhite(g);
						}
					}
					if(monsters.get(i).gethpPercent() <= 0) {
						monsters.get(i).setX(rooms.getWidth()/2);
						monsters.get(i).setY(100000);
						monsters.get(i).sethpPercent(1);
					}
				}
			}
			
			//Sets up shadow monsters for room three
			if(roomnumber == 3) {
				for(int i = 0; i < room3monsters; i++) {
					if(!shadows.get(i).fireBallHits(fireball)) {
						shadows.get(i).drawLeftShadow(g);
					}
					shadows.get(i).moveLeft();
					if(shadows.get(i).getX() + shadows.get(i).getPixelSize()*48 < 0) {
						shadows.get(i).setLocation(rooms.getWidth(), (int)(Math.random()*(rooms.getHeight()-35*2)));
					}
					if(shadows.get(i).intersectsWith(char1)) {
						hpPercent = hpPercent - .01;
					}
					if(shadows.get(i).fireBallHits(fireball)) {
						shadows.get(i).drawLeftWhite(g);
						shadows.get(i).setLocation(rooms.getWidth(), (int)(Math.random()*(rooms.getHeight()-35*2)));
					}
				}
			}
			
			//Sets up mage, and other hostiles interactions and AI for room 4 and interaction with other objects
			if(roomnumber == 4) {
				if(!mage.fireBallHits(fireball)) {
					mage.drawMage(g, mage.getDirection());
				}
				electroball.drawElectroball(g);
				
				//Mage attack cd
				if(mageAttackCD < 75) {
					mageAttackCD++;
				}
				
				if(mageAttackCD == 75) {
					mage.setElectroball(electroball);
					mageAttackCD = 0;
				}
				electroball.move(mage.getDirection());
				
				if(electroball.intersectsWarrior(char1)) {
					electroball.setY(10000);
					hpPercent = hpPercent - .5;
				}
				
				//Sets what direction the mage is facing depending on the position of the Char
				if(char1.getX() + char1.getPixelSize()*7 < mage.getX() + mage.getPixelSize()*8.5) {
					mage.setDirection(1);
				}
				if(char1.getX() + char1.getPixelSize()*7 > mage.getX() + mage.getPixelSize()*8.5) {
					mage.setDirection(2);
				}
				
				//Mage follows the movement of the char if a fireball is not coming
				if(char1.getY() + char1.getPixelSize()*11.5 > mage.getY() + mage.getPixelSize()*12 && mage.getY() + mage.getPixelSize()*23 < rooms.getHeight() - rooms.getWallThickness()*2) {
					mage.moveDown();
				}
				if(char1.getY() + char1.getPixelSize()*11.5 < mage.getY() + mage.getPixelSize()*12) {
					mage.moveUp();	
				}
				
				//Detects if FireBall and Electroball hit, and they nullify each other if true
				if(electroball.FireballIntersects(fireball)) {
					electroball.setX(10000);
					fireball.setX(-10000);
				}
		
				//mage hp 
				if(mage.fireBallHits(fireball)) {
					mage.sethpPercent(mage.gethpPercent() - .101);
					fireball.setY(100000);
					if(mage.getDirection() == 1) {
						mage.drawLeftWhite(g);
					}
					else {
						mage.drawRightWhite(g);
					}
				}
				
				//If mage hp depletes, teleports away
				if(mage.gethpPercent() <= 0) {
					mage.sethpPercent(1);
					mage.setLocation(100000, 100000);
				}
			}
			
			//Sets up hostiles for room 5
			if(roomnumber == 5) {
				for(int i = 0; i < 12; i++) {
					electroballs.get(i).drawElectroball(g);
					electroballs.get(i).moveUp();
					if(electroballs.get(i).getY() < rooms.getWallThickness() || electroballs.get(i).getY() + electroballs.get(i).getPixelSize()*14 > rooms.getHeight() - rooms.getWallThickness()) {
						electroballs.get(i).setYSpeed(electroballs.get(i).getYSpeed()*-1);
					}
					if(electroballs.get(i).intersectsWarrior(char1)) {
						hpPercent = hpPercent - .1;
					}
				}
			}
			
			//Hostiles for room 6
			if(roomnumber == 6) {
				//Sets up lasers on room 6 and damage to char
				for(int i = 0; i < 9; i++) {
					room6lasers.get(i).drawSmallWhiteVertical(g);
					if(lasertime < 5) {
						lasertime++;
					}
					if(lasertime == 5) {
						if(laserfiretime < 100) {
							room6lasers.get(laserfired).drawVertical(g);
							//player collision
							if(room6lasers.get(laserfired).intersectsWithVertical(char1)) {
								hpPercent = hpPercent - .01;
							}
							laserfiretime++;
						}
						if(laserfiretime == 100) {
							lasertime = 0;
							laserfiretime = 0;
							laserfired++;
						}
					}		
					if(laserfired == 9) {
						laserfired = 0;
					}
				}
			}
			
			//Hostiles for room 7
			if(roomnumber == 7) {
				//Sets up the eyemonster interaction with char, hp, damage, and movement,
				if(!eye.fireballhits(fireball)) {
					eye.draw(g);
				}
				if(eye.fireballhits(fireball)) {
					eye.drawWhite(g);
					fireball.setY(10000);
					eye.sethpPercent(eye.gethpPercent() - .1001);
				}
				if(char1.getX() + char1.getPixelSize()*14 > eye.getX()) {
					hpPercent = -1;
				}
				if(eye.gethpPercent() <= 0) {
					eye.setX(10000);
					eye.setY(10000);
					eye.sethpPercent(1);
				}
				if(eye.getY() > rooms.getHeight()/2 - 125 && eyemovement == 0) {
					eye.moveUp();
				}
				if(eye.getY() <= rooms.getHeight()/2 - 125) {
					eyemovement = 1;
				}
				if(eye.getY() + eye.getPixelSize()*48 < rooms.getHeight()/2 + 125 && eyemovement == 1) {
					eye.moveDown();
				}
				if(eye.getY() + eye.getPixelSize()*48 >= rooms.getHeight()/2 + 125) {
					eyemovement = 0;
				}
				if(eye.getX() - char1.getX() < 750 && eye.getX() + eye.getPixelSize()*39 < rooms.getWidth()) {
					eye.moveRight();
				}
				if(eye.getX() - char1.getX() > 750 && eye.getX() > rooms.getWidth() - ((rooms.getWidth() - rooms.getWallThickness()*2)/3) - rooms.getWallThickness()) {
					eye.moveLeft();
				}
				
				//Energyblasts
				//Sets up energyblasts movement, hits, FireBall & char interaction, fire cooldown,
				for(int i = 0; i < 100; i++) {
					//Draws energyblasts and moves
					energyblasts.get(i).draw(g);
					energyblasts.get(i).trackWarrior(char1);
			
					//Sets up damage energy blasts have on char
					if(energyblasts.get(i).intersectsWith(char1)) {
						energyblasts.get(i).setX(-10000);
						hpPercent = hpPercent - .25;
					}
					//Fireball - energy interaction
					if(energyblasts.get(i).intersectsWith(fireball) && timesfireballhit < 4) {
						energyblasts.get(i).setX(-10000);
						timesfireballhit++;
					}
					if(energyblasts.get(i).intersectsWith(fireball) && timesfireballhit == 4) {
						fireball.setX(10000);
					}
					if(energyblastfiretime == 10 && energyCD < 300) {
						energyblasts.get(ee).setX(eye.getX() - energy.getPixelSize()*23);
						energyblasts.get(ee).setY(eye.getY() + eye.getPixelSize()*14);
						energyblastfiretime = 0;
						ee++;
					}
				}
				//Sets up cooldown on energy attacks
				if(ee == 99) {
					ee = 0;
				}
				if(eyeballability == 1) {
					if(energyblastfiretime < 10) {
						energyblastfiretime++;
					}
					if(energyCD < 300) {
						energyCD++;
					}
					if(energyCD == 300) {
						if(energywait < 150) {
							energywait++;
						}
						if(energywait == 150) {
							energywait = 0;
							energyCD = 0;
						}
					}
				}
			}
			
			//Sets up eye mini-boss for room 8
			if(roomnumber == 8) {
				//Sets up eye mini-boss
				eye2.setPixelSize(10);
				eye2.setX(rooms.getWidth() - eye2.getPixelSize()*48 - 100);

				if(eye2.getY() + eye2.getPixelSize()*17 > char1.getY() + char1.getPixelSize()*11.5 && eye2.getY() + eye2.getPixelSize()*4 > rooms.getWallThickness()) {
					eye2.moveUp();
				}
				if(eye2.getY() + eye2.getPixelSize()*17 < char1.getY() + char1.getPixelSize()*11.5 && eye2.getY() + eye2.getPixelSize()*30 < rooms.getHeight() - rooms.getWallThickness()) {
					eye2.moveDown();
				}
				if(!eye2.fireballhits(fireball)) {
					eye2.draw(g);
				}
				if(eye2.fireballhits(fireball)) {
					eye2.drawWhite(g);
					fireball.setY(10000);
					eye2.sethpPercent(eye2.gethpPercent() - .025);
				}
				if(char1.getX() + char1.getPixelSize()*14 > eye2.getX() && eye2.gethpPercent() > 0) {
					hpPercent = -1;
				}
				if(eye2.gethpPercent() <= 0) {
					eye2.setX(10000);
					eye2.setY(10000);
				}
				
				//Energy blasts for boss
				for(int i = 0; i < 100; i++) {
					//Draws energyblasts and moves
					energyblasts.get(i).draw(g);
					energyblasts.get(i).moveLeft();
					if(energyblasts.get(i).getY() + energyblasts.get(i).getPixelSize()*17 < eye2.getY() + eye2.getPixelSize()*34) {
						energyblasts.get(i).moveDown();
					}
					if(energyblasts.get(i).getY() > eye2.getY()) {
						energyblasts.get(i).moveUp();
					}
					
					//Sets up damage energy blasts have on char
					if(energyblasts.get(i).intersectsWith(char1)) {
						energyblasts.get(i).setX(-10000);
						hpPercent = hpPercent - .25;
					}
					//Fireball - energy interaction
					if(energyblasts.get(i).intersectsWith(fireball) && timesfireballhit < 5) {
						energyblasts.get(i).setX(-10000);
						timesfireballhit++;
					}
					if(energyblasts.get(i).intersectsWith(fireball) && timesfireballhit == 5) {
						fireball.setX(10000);
					}
					if(energyblastfiretime == 10 && energyCD < 400) {
						energyblasts.get(ee).setX(eye2.getX() - energy.getPixelSize()*23);
						energyblasts.get(ee).setY(eye2.getY() + eye2.getPixelSize()*14);
						energyblastfiretime = 0;
						ee++;
					}
				}
				//Sets up cooldown on energy attacks
				if(eyeballability == 1) {
					if(ee == 99) {
						ee = 0;
					}
					if(energyblastfiretime < 10) {
						energyblastfiretime++;
					}
					if(energyCD < 400) {
						energyCD++;
					}
					if(energyCD == 400) {
						if(energywait < 150) {
							energywait++;
							room8laser.setHorizontalLength((int)eye2.getX() + eye2.getPixelSize()*8);
							room8laser.setY((int)eye2.getY() + eye2.getPixelSize()*14);
							room8laser.drawSmallWhiteHorizontal(g);
						}
						if(energywait == 150) {
							energyCD = 0;
							energywait = 0;
							eyeballability = 2;
						}
					}
				}
				if(eyeballability == 2) {
					if(laserfiretime < 300) {
						laserfiretime++;
						room8laser.setHorizontalLength((int)eye2.getX() + eye2.getPixelSize()*8);
						room8laser.setY((int)eye2.getY() + eye2.getPixelSize()*14);
						room8laser.drawHorizontal(g);
						for(int i = 0; i < 100; i++) {
							energyblasts.get(i).setX(-10000);
						}
						if(room8laser.intersectsWithHorizontal(char1)) {
							hpPercent = hpPercent - .05;
						}
					}
					if(laserfiretime == 300) {
						if(lasertime < 150) {
							lasertime++;
						}
						if(lasertime == 150) {
							lasertime = 0;
							laserfiretime = 0;
							eyeballability = 1;
						}
					}
				}
			}
			
			//movement of character, draws corresponding sprite depending on direction
			if(wPressed == true && aPressed == false && dPressed == false && sPressed == false) {
				char1.drawBackHead(g);
				char1.drawBackBody(g);
				char1.moveUp();
				fireball.setDirection(1);
			}
			
			if(aPressed == true && wPressed == false && dPressed == false && sPressed == false) { 
				char1.drawLeftHead(g);
				char1.drawLeftBody(g);
				char1.moveLeft();
				fireball.setDirection(2);
			}
			
			if(sPressed == true && wPressed == false && aPressed == false && dPressed == false) {
				char1.drawFrontHead(g);
				char1.drawFrontBody(g);
				char1.moveDown();
				fireball.setDirection(3);
			}
			
			if(dPressed == true && wPressed == false && aPressed == false && sPressed == false) {
				char1.drawRightHead(g);
				char1.drawRightBody(g);
				char1.moveRight();
				fireball.setDirection(4);
			}
			
			if(dPressed == true && wPressed == true && sPressed == false && aPressed == false) {
				char1.drawRightHead(g);
				char1.drawRightBody(g);
				char1.moveRight();
				char1.moveUp();
				fireball.setDirection(4);
			}
			
			if(dPressed == true && sPressed == true && wPressed == false && aPressed == false) {
				char1.drawRightHead(g);
				char1.drawRightBody(g);
				char1.moveRight();
				char1.moveDown();
				fireball.setDirection(4);
			}
			
			if(aPressed == true && sPressed == true && wPressed == false && dPressed == false) {
				char1.drawLeftHead(g);
				char1.drawLeftBody(g);
				char1.moveLeft();
				char1.moveDown();
				fireball.setDirection(2);
			}
			
			if(aPressed == true && wPressed == true && sPressed == false && dPressed == false) {
				char1.drawLeftHead(g);
				char1.drawLeftBody(g);
				char1.moveLeft();
				char1.moveUp();
				fireball.setDirection(2);
			}
			
			if(wPressed == true && sPressed == true && aPressed == false && dPressed == false) {
				char1.drawFrontHead(g);
				char1.drawFrontBody(g);
				fireball.setDirection(3);
			}
			
			if(aPressed == true && dPressed == true && wPressed == false && sPressed == false) {
				char1.drawLeftHead(g);
				char1.drawLeftBody(g);
				fireball.setDirection(2);
			}
			
			if(aPressed == true && dPressed == true && wPressed == true && sPressed == false) {
				char1.drawBackHead(g);
				char1.drawBackBody(g);
				fireball.setDirection(1);
			}
			
			if(aPressed == true && dPressed == true && sPressed == true && wPressed == false) {
				char1.drawFrontHead(g);
				char1.drawFrontBody(g);
				fireball.setDirection(3);
			}

			if(dPressed == false && wPressed == false && aPressed == false && sPressed == false && fireball.getDirection() == 1) {
				char1.drawBackHead(g);
				char1.drawBackBody(g);
			}
			
			if(dPressed == false && wPressed == false && aPressed == false && sPressed == false && fireball.getDirection() == 2) {
				char1.drawLeftHead(g);
				char1.drawLeftBody(g);
			}
			
			if(dPressed == false && wPressed == false && aPressed == false && sPressed == false && fireball.getDirection() == 3) {
				char1.drawFrontHead(g);
				char1.drawFrontBody(g);
			}
			
			if(dPressed == false && wPressed == false && aPressed == false && sPressed == false && fireball.getDirection() == 4) {
				char1.drawRightHead(g);
				char1.drawRightBody(g);
			}
			
			//wall interactions for room 1
			//Does walls interaction with char, fireball
			if(roomnumber == 1) {
				if(char1.getX() < rooms.getWallThickness() + char1.getPixelSize()) {
					char1.setX(rooms.getWallThickness() + char1.getPixelSize());
				}
				
				if(char1.getY() + char1.getPixelSize()*23 > rooms.getHeight() - rooms.getWallThickness()) {
					char1.setY((rooms.getHeight() - rooms.getWallThickness()) - char1.getPixelSize()*23);
				}
				
				if(char1.getX() + char1.getPixelSize()*14 > rooms.getWidth() - rooms.getWallThickness()) {
					char1.setX(rooms.getWidth() - rooms.getWallThickness() - char1.getPixelSize()*14);
				}
				
				if(char1.getX() < rooms.getWidth()/2 - 175 && char1.getY() < rooms.getWallThickness()) {
					char1.setY(rooms.getWallThickness());
				}
				
				if(char1.getX() > rooms.getWidth()/2 + 125 && char1.getY() < rooms.getWallThickness()) {
					char1.setY(rooms.getWallThickness());
				}
				//FireBall interaction with walls
				if(fireball.getX() < rooms.getWallThickness() + fireball.getPixelSize()) {
					fireball.setX(10000);
				}
				
				if(fireball.getY() + fireball.getPixelSize()*24 > rooms.getHeight() - rooms.getWallThickness()) {
					fireball.setX(10000);
				}
				
				if(fireball.getX() + char1.getPixelSize()*10 > rooms.getWidth() - rooms.getWallThickness()) {
					fireball.setX(10000);
				}
				
				if(fireball.getX() < rooms.getWidth()/2 - 175 && fireball.getY() < rooms.getWallThickness()) {
					fireball.setX(10000);
				}
				
				if(fireball.getX() > rooms.getWidth()/2 + 125 && fireball.getY() < rooms.getWallThickness()) {
					fireball.setX(10000);
				}
			}
			
			//interactions for room 2
			//wall interaction with char, fireball, and monsters
			if(roomnumber == 2) {
				if(char1.getX() < 
						rooms.getWallThickness() + char1.getPixelSize()) {
					char1.setX(rooms.getWallThickness() + char1.getPixelSize());
				}
				
				if(char1.getX() + char1.getPixelSize()*14 > rooms.getWidth() - rooms.getWallThickness()) {
					char1.setX(rooms.getWidth() - rooms.getWallThickness() - char1.getPixelSize()*14);
				}
				
				if(char1.getX() < rooms.getWidth()/2 - 175 && char1.getY() < rooms.getWallThickness()) {
					char1.setY(rooms.getWallThickness());
				}
				
				if(char1.getX() > rooms.getWidth()/2 + 125 && char1.getY() < rooms.getWallThickness()) {
					char1.setY(rooms.getWallThickness());
				}
				
				if(char1.getX() < rooms.getWidth()/2 - 175 && char1.getY() + char1.getPixelSize()*23 > rooms.getHeight() - rooms.getWallThickness()) {
					char1.setY(rooms.getHeight() - rooms.getWallThickness() - char1.getPixelSize()*23);
				}
				
				if(char1.getX() > rooms.getWidth()/2 + 125 && char1.getY() + char1.getPixelSize()*23 > rooms.getHeight() - rooms.getWallThickness()) {
					char1.setY(rooms.getHeight() - rooms.getWallThickness() - char1.getPixelSize()*23);
				}
				
				//Fireball interaction with walls
				if(fireball.getX() < rooms.getWallThickness()) {
					fireball.setX(10000);
				}
				
				if(fireball.getX() + fireball.getPixelSize()*20 > rooms.getWidth() - rooms.getWallThickness()) {
					fireball.setX(10000);
				}
				
				if(fireball.getX() < rooms.getWidth()/2 - 175 && fireball.getY() < rooms.getWallThickness()) {
					fireball.setX(10000);
				}
				
				if(fireball.getX() > rooms.getWidth()/2 + 125 && fireball.getY() < rooms.getWallThickness()) {
					fireball.setX(10000);
				}
				
				if(fireball.getX() < rooms.getWidth()/2 - 175 && fireball.getY() + fireball.getPixelSize()*24 > rooms.getHeight() - rooms.getWallThickness()) {
					fireball.setX(10000);
				}
				
				if(fireball.getX() > rooms.getWidth()/2 + 125 && fireball.getY() + fireball.getPixelSize()*24 > rooms.getHeight() - rooms.getWallThickness()) {
					fireball.setX(10000);
				}
				
				//Monster wall interaction
				for(int i = 0; i < room2monsters; i++) {
					if(monsters.get(i).getX() < rooms.getWallThickness() + monsters.get(i).getPixelSize()) {
						monsters.get(i).setX(rooms.getWallThickness() + monsters.get(i).getPixelSize());
					}
					
					if(monsters.get(i).getX() + monsters.get(i).getPixelSize()*33 > rooms.getWidth() - rooms.getWallThickness()) {
						monsters.get(i).setX(rooms.getWidth() - rooms.getWallThickness() - monsters.get(i).getPixelSize()*33);
					}
					
					if(monsters.get(i).getX() < rooms.getWidth()/2 - 175 && monsters.get(i).getY() < rooms.getWallThickness()) {
						monsters.get(i).setY(rooms.getWallThickness());
					}
					
					if(monsters.get(i).getX() > rooms.getWidth()/2 + 125 && monsters.get(i).getY() < rooms.getWallThickness()) {
						monsters.get(i).setY(rooms.getWallThickness());
					}
					
					if(monsters.get(i).getX() < rooms.getWidth()/2 - 175 && monsters.get(i).getY() + monsters.get(i).getPixelSize()*47 > rooms.getHeight() - rooms.getWallThickness()) {
						monsters.get(i).setY(rooms.getHeight() - rooms.getWallThickness() - monsters.get(i).getPixelSize()*47);
					}
					
					if(monsters.get(i).getX() > rooms.getWidth()/2 + 125 && monsters.get(i).getY() + monsters.get(i).getPixelSize()*47 > rooms.getHeight() - rooms.getWallThickness()) {
						monsters.get(i).setY(rooms.getHeight() - rooms.getWallThickness() - monsters.get(i).getPixelSize()*47);
					}
				}
				
				
				//Monster - char interaction
				for(int i = 0; i < room2monsters; i++) {
					if(monsters.get(i).intersectsWith(char1)) {
						hpPercent = hpPercent - .05;
					}
					if(!monsters.get(i).intersectsWith(char1) && monsters.get(i).getDistanceFrom(char1) < 2500) {
						if(monsters.get(i).getY() > char1.getY() - char1.getPixelSize()*7) {
							monsters.get(i).moveUp();
							monsters.get(i).setDirection(1);
						}
						if(monsters.get(i).getY() < char1.getY() - char1.getPixelSize()*7) {
							monsters.get(i).moveDown();
							monsters.get(i).setDirection(1);
						}
						if(monsters.get(i).getX() < char1.getX() + char1.getPixelSize()*14) {
							monsters.get(i).moveRight();
							monsters.get(i).setDirection(4);
						}
						if(monsters.get(i).getX() + monsters.get(i).getPixelSize()*32 > char1.getX()) {
							monsters.get(i).moveLeft();
							monsters.get(i).setDirection(3);
						}
					}
					if(monsters.get(i).getX() + monsters.get(i).getPixelSize()*17 < char1.getX() + char1.getPixelSize()*7) {
						 monsters.get(i).setDirection(4); 
					}
					if(monsters.get(i).getX() + monsters.get(i).getPixelSize()*17 > char1.getX() + char1.getPixelSize()*7) {
						 monsters.get(i).setDirection(3); 
					}
				}

			}
			
			//wall interactions for room 3
			//char, fireball interactions with walls
			if(roomnumber == 3) {
				if(char1.getX() < rooms.getWallThickness() + char1.getPixelSize()) {
					char1.setX(rooms.getWallThickness() + char1.getPixelSize());
				}
				
				if(char1.getX() + char1.getPixelSize()*14 > rooms.getWidth() - rooms.getWallThickness()) {
					char1.setX(rooms.getWidth() - rooms.getWallThickness() - char1.getPixelSize()*14);
				}
				
				if(char1.getX() > rooms.getWallThickness() + 250 && char1.getY() + char1.getPixelSize()*23 > rooms.getHeight() - rooms.getWallThickness()) {
					char1.setY(rooms.getHeight() - rooms.getWallThickness() - char1.getPixelSize()*23);
				}
				
				if(char1.getX() < rooms.getWidth() - rooms.getWallThickness() - 350 && char1.getY() < rooms.getWallThickness()) {
					char1.setY(rooms.getWallThickness());
				}
				
				if(char1.getX() + char1.getPixelSize()*14 < rooms.getWallThickness() + 300 && char1.getX() + char1.getPixelSize()*14 > rooms.getWallThickness() + 250 && char1.getY() > rooms.getWallThickness() + 150) {
					char1.setX(rooms.getWallThickness() + 300 - char1.getPixelSize()*24);
				}
				
				if(char1.getX() > rooms.getWallThickness()  + 300 && char1.getX() < rooms.getWallThickness() + 350 && char1.getY() > rooms.getWallThickness() + 150) {
					char1.setX(rooms.getWallThickness() + 350);
				}
				
				if(char1.getX() + char1.getPixelSize()*7 > rooms.getWallThickness() + 250 && char1.getX() + char1.getPixelSize()*7 < rooms.getWallThickness()*2 + 250 && char1.getY() + char1.getPixelSize()*23 > rooms.getWallThickness() + 250) {
					char1.setY(rooms.getWallThickness() + 250 - char1.getPixelSize()*23);
				}
				
				if(char1.getX() + char1.getPixelSize()*7 > rooms.getWallThickness()*3 + 750 && char1.getX() + char1.getPixelSize()*7 < rooms.getWallThickness()*4 + 750 && char1.getY() + char1.getPixelSize()*23 > rooms.getWallThickness() + 250) {
					char1.setY(rooms.getWallThickness() + 250 - char1.getPixelSize()*23);
				}
				
				if(char1.getX() + char1.getPixelSize()*14 < rooms.getWallThickness()*3 + 800 && char1.getX() + char1.getPixelSize()*14 > rooms.getWallThickness()*3 + 750 && char1.getY() > rooms.getWallThickness() + 150) {
					char1.setX(rooms.getWallThickness()*3 + 800 - char1.getPixelSize()*24);
				}
				
				if(char1.getX() > rooms.getWallThickness()*3  + 800 && char1.getX() < rooms.getWallThickness()*4 + 750 && char1.getY() > rooms.getWallThickness() + 150) {
					char1.setX(rooms.getWallThickness()*4 + 750);
				}
				
				if(char1.getX() < rooms.getWidth() - 340 - rooms.getWallThickness() && char1.getX() > rooms.getWidth() - 390 - rooms.getWallThickness() && char1.getY() < rooms.getHeight() - rooms.getWallThickness() - 250) {
					char1.setX(rooms.getWallThickness()*5 + 1000);
				}
				
				if(char1.getX() + char1.getPixelSize()*14 < rooms.getWidth() - 390 - rooms.getWallThickness() && char1.getX() + char1.getPixelSize()*14 > rooms.getWidth() - 340 - rooms.getWallThickness()*2 && char1.getY() < rooms.getHeight() - rooms.getWallThickness() - 250) {
					char1.setX(rooms.getWallThickness()*4 + 1000 - char1.getPixelSize()*14);
				}
				
				if(char1.getX() < rooms.getWidth() - 840 - rooms.getWallThickness()*3 && char1.getX() > rooms.getWidth() - 890 - rooms.getWallThickness()*3 && char1.getY() < rooms.getHeight() - rooms.getWallThickness() - 250) {
					char1.setX(rooms.getWidth() - 840 - rooms.getWallThickness()*3);
				}
				
				if(char1.getX() + char1.getPixelSize()*14 < rooms.getWidth() - 890 - rooms.getWallThickness()*3 && char1.getX() + char1.getPixelSize()*14 > rooms.getWidth() - 840 - rooms.getWallThickness()*4 && char1.getY() < rooms.getHeight() - rooms.getWallThickness() - 250) {
					char1.setX(rooms.getWidth() - 840 - char1.getPixelSize()*14 - rooms.getWallThickness()*4);
				}
				
				if(char1.getX() + char1.getPixelSize()*7 < rooms.getWidth() - 340 - rooms.getWallThickness() && char1.getX() + char1.getPixelSize()*7 > rooms.getWidth() - 340 - rooms.getWallThickness()*2 && char1.getY() < rooms.getHeight() - rooms.getWallThickness() - 250) {
					char1.setY(rooms.getHeight() - rooms.getWallThickness() - 250);
				}
			
				if(char1.getX() + char1.getPixelSize()*7 < rooms.getWidth() - 840 - rooms.getWallThickness()*3 && char1.getX() + char1.getPixelSize()*7 > rooms.getWidth() - 840 - rooms.getWallThickness()*4 && char1.getY() < rooms.getHeight() - rooms.getWallThickness() - 250) {
					char1.setY(rooms.getHeight() - rooms.getWallThickness() - 250);
				}
				
				//Fireball interaction with walls
				if(fireball.getX() < rooms.getWallThickness() + char1.getPixelSize()) {
					fireball.setX(10000);
				}
				
				if(fireball.getX() + fireball.getPixelSize()*20 > rooms.getWidth() - rooms.getWallThickness()) {
					fireball.setX(10000);
				}
				
				if(fireball.getX() > rooms.getWallThickness() + 250 && fireball.getY() + fireball.getPixelSize()*24 > rooms.getHeight() - rooms.getWallThickness()) {
					fireball.setX(10000);
				}
				
				if(fireball.getX() < rooms.getWidth() - rooms.getWallThickness() - 350 && fireball.getY() < rooms.getWallThickness()) {
					fireball.setX(10000);
				}
				
				if(fireball.getX() + fireball.getPixelSize()*20 < rooms.getWallThickness() + 300 && fireball.getX() + fireball.getPixelSize()*14 > rooms.getWallThickness() + 250 && fireball.getY() > rooms.getWallThickness() + 150) {
					fireball.setX(10000);
				}
				
				if(fireball.getX() > rooms.getWallThickness()  + 300 && fireball.getX() < rooms.getWallThickness() + 350 && fireball.getY() > rooms.getWallThickness() + 150) {
					fireball.setX(10000);
				}
				
				if(fireball.getX() + fireball.getPixelSize()*10 > rooms.getWallThickness() + 250 && fireball.getX() + fireball.getPixelSize()*10 < rooms.getWallThickness()*2 + 250 && fireball.getY() + fireball.getPixelSize()*24 > rooms.getWallThickness() + 250) {
					fireball.setX(10000);
				}
				
				if(fireball.getX() + fireball.getPixelSize()*10 > rooms.getWallThickness()*3 + 750 && fireball.getX() + fireball.getPixelSize()*10 < rooms.getWallThickness()*4 + 750 && fireball.getY() + fireball.getPixelSize()*24 > rooms.getWallThickness() + 250) {
					fireball.setX(10000);
				}
				
				if(fireball.getX() + fireball.getPixelSize()*20 < rooms.getWallThickness()*3 + 800 && fireball.getX() + fireball.getPixelSize()*20 > rooms.getWallThickness()*3 + 750 && fireball.getY() > rooms.getWallThickness() + 150) {
					fireball.setX(10000);
				}
				
				if(fireball.getX() > rooms.getWallThickness()*3  + 800 && fireball.getX() < rooms.getWallThickness()*4 + 750 && fireball.getY() > rooms.getWallThickness() + 150) {
					fireball.setX(10000);
				}
				
				if(fireball.getX() < rooms.getWidth() - 340 - rooms.getWallThickness() && fireball.getX() > rooms.getWidth() - 390 - rooms.getWallThickness() && fireball.getY() < rooms.getHeight() - rooms.getWallThickness() - 250) {
					fireball.setX(10000);
				}
				
				if(fireball.getX() + fireball.getPixelSize()*20 < rooms.getWidth() - 390 - rooms.getWallThickness() && fireball.getX() + fireball.getPixelSize()*20 > rooms.getWidth() - 340 - rooms.getWallThickness()*2 && fireball.getY() < rooms.getHeight() - rooms.getWallThickness() - 250) {
					fireball.setX(10000);
				}
				
				if(fireball.getX() < rooms.getWidth() - 840 - rooms.getWallThickness()*3 && fireball.getX() > rooms.getWidth() - 890 - rooms.getWallThickness()*3 && fireball.getY() < rooms.getHeight() - rooms.getWallThickness() - 250) {
					fireball.setX(10000);
				}
				
				if(fireball.getX() + fireball.getPixelSize()*20 < rooms.getWidth() - 890 - rooms.getWallThickness()*3 && fireball.getX() + fireball.getPixelSize()*20 > rooms.getWidth() - 840 - rooms.getWallThickness()*4 && fireball.getY() < rooms.getHeight() - rooms.getWallThickness() - 250) {
					fireball.setX(10000);
				}
				
				if(fireball.getX() + fireball.getPixelSize()*10 < rooms.getWidth() - 340 - rooms.getWallThickness() && fireball.getX() + fireball.getPixelSize()*10 > rooms.getWidth() - 340 - rooms.getWallThickness()*2 && fireball.getY() < rooms.getHeight() - rooms.getWallThickness() - 250) {
					fireball.setX(10000);
				}
			
				if(fireball.getX() + fireball.getPixelSize()*10 < rooms.getWidth() - 840 - rooms.getWallThickness()*3 && fireball.getX() + fireball.getPixelSize()*10 > rooms.getWidth() - 840 - rooms.getWallThickness()*4 && fireball.getY() < rooms.getHeight() - rooms.getWallThickness() - 250) {
					fireball.setX(10000);
				}
			}
			
			//wall interactions for room 4
			if(roomnumber == 4) {
				if(char1.getX() < rooms.getWallThickness()*2) {
					char1.setX(rooms.getWallThickness()*2);
				}
				if(char1.getY() < rooms.getWallThickness()*2) {
					char1.setY(rooms.getWallThickness()*2);
				}
				if(char1.getX() + char1.getPixelSize()*14 > rooms.getWidth() - rooms.getWallThickness()*2 && char1.getY() + char1.getPixelSize()*23 > rooms.getWallThickness()*2 + 260) {
					char1.setX(rooms.getWidth() - rooms.getWallThickness()*2 - char1.getPixelSize()*14);
				}
				if(char1.getX() + char1.getPixelSize()*14 > rooms.getWidth() - rooms.getWallThickness()*2 && char1.getY() + char1.getPixelSize()*23 > rooms.getWallThickness()*2 + 250 && char1.getY() + char1.getPixelSize()*23 < rooms.getWallThickness()*2 + 260) {
					char1.setY(rooms.getWallThickness()*2 + 250 - char1.getPixelSize()*23);
				}
				if(char1.getX() + char1.getPixelSize()*14 > rooms.getWallThickness()*2 + 260 && char1.getY() + char1.getPixelSize()*23 > rooms.getHeight() - rooms.getWallThickness()*2) {
					char1.setY(rooms.getHeight() - rooms.getWallThickness()*2 - char1.getPixelSize()*23);
				}
				if(char1.getX() + char1.getPixelSize()*14 < rooms.getWallThickness()*2 + 260 && char1.getX() + char1.getPixelSize()*14 > rooms.getWallThickness()*2 + 250 && char1.getY() + char1.getPixelSize()*23 > rooms.getHeight() - rooms.getWallThickness()*2) {
					char1.setX(rooms.getWallThickness()*2 + 250 - char1.getPixelSize()*14);
				}
				
				//Fireball interacts with walls for room 4
				if(fireball.getX() < rooms.getWallThickness()*2) {
					fireball.setY(100000);
				}
				if(fireball.getY() < rooms.getWallThickness()*2) {
					fireball.setY(100000);
				}
				if(fireball.getX() + fireball.getPixelSize()*20 > rooms.getWidth() - rooms.getWallThickness()*2 && fireball.getY() + fireball.getPixelSize()*24 > rooms.getWallThickness()*2 + 260) {
					fireball.setY(100000);
				}
				if(fireball.getX() + fireball.getPixelSize()*20 > rooms.getWidth() - rooms.getWallThickness()*2 && fireball.getY() + fireball.getPixelSize()*24 > rooms.getWallThickness()*2 + 250 && fireball.getY() + fireball.getPixelSize()*24 < rooms.getWallThickness()*2 + 260) {
					fireball.setY(100000);
				}
				if(fireball.getX() + fireball.getPixelSize()*20 > rooms.getWallThickness()*2 + 260 && fireball.getY() + fireball.getPixelSize()*24 > rooms.getHeight() - rooms.getWallThickness()*2) {
					fireball.setY(100000);
				}
				if(fireball.getX() + fireball.getPixelSize()*20 < rooms.getWallThickness()*2 + 260 && fireball.getX() + fireball.getPixelSize()*20 > rooms.getWallThickness()*2 + 250 && fireball.getY() + fireball.getPixelSize()*24 > rooms.getHeight() - rooms.getWallThickness()*2) {
					fireball.setY(100000);
				}
				
				//Electroball interaction with wall
				if(electroball.getX() < rooms.getWallThickness()*2) {
					electroball.setY(100000);
				}
				if(electroball.getY() < rooms.getWallThickness()*2) {
					electroball.setY(100000);
				}
				if(electroball.getX() + electroball.getPixelSize()*14 > rooms.getWidth() - rooms.getWallThickness()*2 && electroball.getY() + electroball.getPixelSize()*14 > rooms.getWallThickness()*2 + 260) {
					electroball.setY(100000);
				}
				if(electroball.getX() + electroball.getPixelSize()*14 > rooms.getWidth() - rooms.getWallThickness()*2 && electroball.getY() + electroball.getPixelSize()*14 > rooms.getWallThickness()*2 + 250 && electroball.getY() + electroball.getPixelSize()*14 < rooms.getWallThickness()*2 + 260) {
					electroball.setY(100000);
				}
				if(electroball.getX() + electroball.getPixelSize()*14 > rooms.getWallThickness()*2 + 260 && electroball.getY() + electroball.getPixelSize()*24 > rooms.getHeight() - rooms.getWallThickness()*2) {
					electroball.setY(100000);
				}
				if(electroball.getX() + electroball.getPixelSize()*14 < rooms.getWallThickness()*2 + 260 && electroball.getX() + electroball.getPixelSize()*20 > rooms.getWallThickness()*2 + 250 && electroball.getY() + electroball.getPixelSize()*24 > rooms.getHeight() - rooms.getWallThickness()*2) {
					electroball.setY(100000);
				}
			}
			
			//Object interactions for room 5
			if(roomnumber == 5) {
				//char interaction with wall
				if(char1.getY() + char1.getPixelSize()*23 > rooms.getHeight() - rooms.getWallThickness()) {
					char1.setY(rooms.getHeight() - rooms.getWallThickness() - char1.getPixelSize()*23);
				}
				if(char1.getY() < rooms.getWallThickness()) {
					char1.setY(rooms.getWallThickness());
				}
				if(char1.getX() < rooms.getWallThickness() && char1.getY() < rooms.getHeight()/2 - 135) {
					char1.setX(rooms.getWallThickness());
				}
				if(char1.getX() < rooms.getWallThickness() && char1.getY() > rooms.getHeight()/2 - 135 && char1.getY() < rooms.getHeight()/2 - 125) {
					char1.setY(rooms.getHeight()/2 - 125);
				}
				if(char1.getX() < rooms.getWallThickness() && char1.getY() + char1.getPixelSize()*23 > rooms.getHeight()/2 + 135) {
					char1.setX(rooms.getWallThickness());
				}
				if(char1.getX() < rooms.getWallThickness() && char1.getY() + char1.getPixelSize()*23 > rooms.getHeight()/2 + 125 && char1.getY() + char1.getPixelSize()*23 < rooms.getHeight()/2 + 135) {
					char1.setY(rooms.getHeight()/2 + 125 - char1.getPixelSize()*23);
				}
				if(char1.getX() + char1.getPixelSize()*14 > rooms.getWidth() - rooms.getWallThickness() && char1.getY() < rooms.getHeight()/2 - 135) {
					char1.setX(rooms.getWidth() - rooms.getWallThickness() - char1.getPixelSize()*14);
				}
				if(char1.getX() + char1.getPixelSize()*14 > rooms.getWidth() - rooms.getWallThickness() && char1.getY() > rooms.getHeight()/2 - 135 && char1.getY() < rooms.getHeight()/2 - 125) {
					char1.setY(rooms.getHeight()/2 - 125);
				}
				if(char1.getX() + char1.getPixelSize()*14 > rooms.getWidth() - rooms.getWallThickness() && char1.getY() + char1.getPixelSize()*23 > rooms.getHeight()/2 + 135) {
					char1.setX(rooms.getWidth() - rooms.getWallThickness() - char1.getPixelSize()*14);
				}
				if(char1.getX() + char1.getPixelSize()*14 > rooms.getWidth() - rooms.getWallThickness() && char1.getY() + char1.getPixelSize()*23 > rooms.getHeight()/2 + 125 && char1.getY() + char1.getPixelSize()*23 < rooms.getHeight()/2 + 135) {
					char1.setY(rooms.getHeight()/2 + 125 - char1.getPixelSize()*23);
				}
				
				//Fireball interaction with wall
				if(fireball.getY() + fireball.getPixelSize()*24 > rooms.getHeight() - rooms.getWallThickness()) {
					fireball.setY(100000);
				}
				if(fireball.getY() < rooms.getWallThickness()) {
					fireball.setY(100000);
				}
				if(fireball.getX() < rooms.getWallThickness() && fireball.getY() < rooms.getHeight()/2 - 135) {
					fireball.setY(100000);
				}
				if(fireball.getX() < rooms.getWallThickness() && fireball.getY() > rooms.getHeight()/2 - 135 && fireball.getY() < rooms.getHeight()/2 - 125) {
					fireball.setY(100000);
				}
				if(fireball.getX() < rooms.getWallThickness() && fireball.getY() + fireball.getPixelSize()*24 > rooms.getHeight()/2 + 135) {
					fireball.setY(100000);
				}
				if(fireball.getX() < rooms.getWallThickness() && fireball.getY() + fireball.getPixelSize()*24 > rooms.getHeight()/2 + 125 && fireball.getY() + fireball.getPixelSize()*24 < rooms.getHeight()/2 + 135) {
					fireball.setY(100000);
				}
				if(fireball.getX() + fireball.getPixelSize()*20 > rooms.getWidth() - rooms.getWallThickness() && fireball.getY() < rooms.getHeight()/2 - 135) {
					fireball.setY(100000);
				}
				if(fireball.getX() + fireball.getPixelSize()*20 > rooms.getWidth() - rooms.getWallThickness() && fireball.getY() > rooms.getHeight()/2 - 135 && char1.getY() < rooms.getHeight()/2 - 125) {
					fireball.setY(100000);
				}
				if(fireball.getX() + fireball.getPixelSize()*20 > rooms.getWidth() - rooms.getWallThickness() && fireball.getY() + fireball.getPixelSize()*24 > rooms.getHeight()/2 + 135) {
					fireball.setY(100000);
				}
				if(fireball.getX() + fireball.getPixelSize()*20 > rooms.getWidth() - rooms.getWallThickness() && fireball.getY() + fireball.getPixelSize()*24 > rooms.getHeight()/2 + 125 && fireball.getY() + fireball.getPixelSize()*24 < rooms.getHeight()/2 + 135) {
					fireball.setY(100000);
				}
			}
			
			//Object interactions in room 6
			if(roomnumber == 6) {
				//char - wall interaction
				if(char1.getY() < rooms.getHeight()/2 - 125) {
					char1.setY(rooms.getHeight()/2 - 125);
				}
				if(char1.getY() + char1.getPixelSize()*23 > rooms.getHeight()/2 + 125) {
					char1.setY(rooms.getHeight()/2 + 125 - char1.getPixelSize()*23);
				}
				//fireball - wall interaction
				if(fireball.getY() < rooms.getHeight()/2 - 125) {
					fireball.setY(10000);
				}
				if(fireball.getY() + fireball.getPixelSize()*24 > rooms.getHeight()/2 + 125) {
					fireball.setY(10000);
				}
			}
			
			//Object interactions in room 7
			if(roomnumber == 7) {
				//char - wall interaction
				if(char1.getY() < rooms.getHeight()/2 - 125 && char1.getX() < ((rooms.getWidth() - rooms.getWallThickness()*2)/3) + rooms.getWallThickness() - 10) {
					char1.setY(rooms.getHeight()/2 - 125);
				}
				if(char1.getY() + char1.getPixelSize()*23 > rooms.getHeight()/2 + 125 && char1.getX() < ((rooms.getWidth() - rooms.getWallThickness()*2)/3) + rooms.getWallThickness() - 10) {
					char1.setY(rooms.getHeight()/2 + 125 - char1.getPixelSize()*23);
				}
				if(char1.getY() < rooms.getHeight()/2 - 125 && char1.getX() + char1.getPixelSize()*14 > ((rooms.getWidth() - rooms.getWallThickness()*2)/3)*2 + rooms.getWallThickness() + 10) {
					char1.setY(rooms.getHeight()/2 - 125);
				}
				if(char1.getY() + char1.getPixelSize()*23 > rooms.getHeight()/2 + 125 && char1.getX() + char1.getPixelSize()*14 > ((rooms.getWidth() - rooms.getWallThickness()*2)/3)*2 + rooms.getWallThickness() + 10) {
					char1.setY(rooms.getHeight()/2 + 125 - char1.getPixelSize()*23);
				}
				if(char1.getY() < rooms.getWallThickness()*2) {
					char1.setY(rooms.getWallThickness()*2);
				}
				if(char1.getY() + char1.getPixelSize()*23 > rooms.getHeight() - rooms.getWallThickness()*2) {
					char1.setY(rooms.getHeight() - rooms.getWallThickness()*2 - char1.getPixelSize()*23);
				}
				if(char1.getY() < rooms.getHeight()/2 - 125 && char1.getX() < rooms.getWallThickness() + ((rooms.getWidth() - rooms.getWallThickness()*2)/3) && char1.getX() > rooms.getWallThickness() + ((rooms.getWidth() - rooms.getWallThickness()*2)/3 - 10)) {
					char1.setX(rooms.getWallThickness() + ((rooms.getWidth() - rooms.getWallThickness()*2)/3));
				}
				if(char1.getY() + char1.getPixelSize()*23 > rooms.getHeight()/2 + 125 && char1.getX() < rooms.getWallThickness() + ((rooms.getWidth() - rooms.getWallThickness()*2)/3) && char1.getX() > rooms.getWallThickness() + ((rooms.getWidth() - rooms.getWallThickness()*2)/3 - 10)) {
					char1.setX(rooms.getWallThickness() + ((rooms.getWidth() - rooms.getWallThickness()*2)/3));
				}
				if(char1.getY() < rooms.getHeight()/2 - 125 && char1.getX() + char1.getPixelSize()*14 > rooms.getWallThickness() + ((rooms.getWidth() - rooms.getWallThickness()*2)/3)*2 && char1.getX() + char1.getPixelSize()*14 < rooms.getWallThickness() + ((rooms.getWidth() - rooms.getWallThickness()*2)/3)*2 + 10) {
					char1.setX(rooms.getWallThickness() + ((rooms.getWidth() - rooms.getWallThickness()*2)/3)*2 - char1.getPixelSize()*14);
				}
				if(char1.getY() + char1.getPixelSize()*23 > rooms.getHeight()/2 + 125 && char1.getX() + char1.getPixelSize()*14 > rooms.getWallThickness() + ((rooms.getWidth() - rooms.getWallThickness()*2)/3)*2 && char1.getX() + char1.getPixelSize()*14 < rooms.getWallThickness() + ((rooms.getWidth() - rooms.getWallThickness()*2)/3)*2 + 10) {
					char1.setX(rooms.getWallThickness() + ((rooms.getWidth() - rooms.getWallThickness()*2)/3)*2 - char1.getPixelSize()*14);
				}
				//Fireball - wall interaction
				if(fireball.getY() < rooms.getHeight()/2 - 125 && fireball.getX() < ((rooms.getWidth() - rooms.getWallThickness()*2)/3) + rooms.getWallThickness()) {
					fireball.setY(10000);
				}
				if(fireball.getY() + char1.getPixelSize()*23 > rooms.getHeight()/2 + 125 && fireball.getX() < ((rooms.getWidth() - rooms.getWallThickness()*2)/3) + rooms.getWallThickness()) {
					fireball.setY(10000);
				}
				if(fireball.getY() < rooms.getHeight()/2 - 125 && fireball.getX() + fireball.getPixelSize()*20 > ((rooms.getWidth() - rooms.getWallThickness()*2)/3)*2 + rooms.getWallThickness()) {
					fireball.setY(10000);
				}
				if(fireball.getY() + fireball.getPixelSize()*24 > rooms.getHeight()/2 + 125 && fireball.getX() + fireball.getPixelSize()*20 > ((rooms.getWidth() - rooms.getWallThickness()*2)/3)*2 + rooms.getWallThickness()) {
					fireball.setY(10000);
				}
				if(fireball.getY() < rooms.getWallThickness()*2) {
					fireball.setY(10000);
				}
				if(fireball.getY() + fireball.getPixelSize()*24 > rooms.getHeight() - rooms.getWallThickness()*2) {
					fireball.setY(10000);
				}
			}
			
			//Object interactions in room 8
			if(roomnumber == 8) {
				//Char interaction with wall
				if(char1.getY() + char1.getPixelSize()*23 > rooms.getHeight() - rooms.getWallThickness()) {
					char1.setY(rooms.getHeight() - rooms.getWallThickness() - char1.getPixelSize()*23);
				}
				if(char1.getY() < rooms.getWallThickness()) {
					char1.setY(rooms.getWallThickness());
				}
				if(char1.getX() < rooms.getWallThickness() && char1.getY() < rooms.getHeight()/2 - 135) {
					char1.setX(rooms.getWallThickness());
				}
				if(char1.getX() < rooms.getWallThickness() && char1.getY() > rooms.getHeight()/2 - 135 && char1.getY() < rooms.getHeight()/2 - 125) {
					char1.setY(rooms.getHeight()/2 - 125);
				}
				if(char1.getX() < rooms.getWallThickness() && char1.getY() + char1.getPixelSize()*23 > rooms.getHeight()/2 + 135) {
					char1.setX(rooms.getWallThickness());
				}
				if(char1.getX() < rooms.getWallThickness() && char1.getY() + char1.getPixelSize()*23 > rooms.getHeight()/2 + 125 && char1.getY() + char1.getPixelSize()*23 < rooms.getHeight()/2 + 135) {
					char1.setY(rooms.getHeight()/2 + 125 - char1.getPixelSize()*23);
				}
				if(char1.getX() + char1.getPixelSize()*14 > rooms.getWidth() - rooms.getWallThickness() && char1.getY() < rooms.getHeight()/2 - 135) {
					char1.setX(rooms.getWidth() - rooms.getWallThickness() - char1.getPixelSize()*14);
				}
				if(char1.getX() + char1.getPixelSize()*14 > rooms.getWidth() - rooms.getWallThickness() && char1.getY() > rooms.getHeight()/2 - 135 && char1.getY() < rooms.getHeight()/2 - 125) {
					char1.setY(rooms.getHeight()/2 - 125);
				}
				if(char1.getX() + char1.getPixelSize()*14 > rooms.getWidth() - rooms.getWallThickness() && char1.getY() + char1.getPixelSize()*23 > rooms.getHeight()/2 + 135) {
					char1.setX(rooms.getWidth() - rooms.getWallThickness() - char1.getPixelSize()*14);
				}
				if(char1.getX() + char1.getPixelSize()*14 > rooms.getWidth() - rooms.getWallThickness() && char1.getY() + char1.getPixelSize()*23 > rooms.getHeight()/2 + 125 && char1.getY() + char1.getPixelSize()*23 < rooms.getHeight()/2 + 135) {
					char1.setY(rooms.getHeight()/2 + 125 - char1.getPixelSize()*23);
				}
				
				//Fireball interaction with wall
				if(fireball.getY() + fireball.getPixelSize()*24 > rooms.getHeight() - rooms.getWallThickness()) {
					fireball.setY(100000);
				}
				if(fireball.getY() < rooms.getWallThickness()) {
					fireball.setY(100000);
				}
				if(fireball.getX() < rooms.getWallThickness() && fireball.getY() < rooms.getHeight()/2 - 135) {
					fireball.setY(100000);
				}
				if(fireball.getX() < rooms.getWallThickness() && fireball.getY() > rooms.getHeight()/2 - 135 && fireball.getY() < rooms.getHeight()/2 - 125) {
					fireball.setY(100000);
				}
				if(fireball.getX() < rooms.getWallThickness() && fireball.getY() + fireball.getPixelSize()*24 > rooms.getHeight()/2 + 135) {
					fireball.setY(100000);
				}
				if(fireball.getX() < rooms.getWallThickness() && fireball.getY() + fireball.getPixelSize()*24 > rooms.getHeight()/2 + 125 && fireball.getY() + fireball.getPixelSize()*24 < rooms.getHeight()/2 + 135) {
					fireball.setY(100000);
				}
				if(fireball.getX() + fireball.getPixelSize()*20 > rooms.getWidth() - rooms.getWallThickness() && fireball.getY() < rooms.getHeight()/2 - 135) {
					fireball.setY(100000);
				}
				if(fireball.getX() + fireball.getPixelSize()*20 > rooms.getWidth() - rooms.getWallThickness() && fireball.getY() > rooms.getHeight()/2 - 135 && char1.getY() < rooms.getHeight()/2 - 125) {
					fireball.setY(100000);
				}
				if(fireball.getX() + fireball.getPixelSize()*20 > rooms.getWidth() - rooms.getWallThickness() && fireball.getY() + fireball.getPixelSize()*24 > rooms.getHeight()/2 + 135) {
					fireball.setY(100000);
				}
				if(fireball.getX() + fireball.getPixelSize()*20 > rooms.getWidth() - rooms.getWallThickness() && fireball.getY() + fireball.getPixelSize()*24 > rooms.getHeight()/2 + 125 && fireball.getY() + fireball.getPixelSize()*24 < rooms.getHeight()/2 + 135) {
					fireball.setY(100000);
				}
			}
			
			
			if(roomnumber == 9) {
				//Char interaction with wall
				if(char1.getY() + char1.getPixelSize()*23 > rooms.getHeight() - rooms.getWallThickness()) {
					char1.setY(rooms.getHeight() - rooms.getWallThickness() - char1.getPixelSize()*23);
				}
				if(char1.getY() < rooms.getWallThickness()) {
					char1.setY(rooms.getWallThickness());
				}
				if(char1.getX() < rooms.getWallThickness() && char1.getY() < rooms.getHeight()/2 - 135) {
					char1.setX(rooms.getWallThickness());
				}
				if(char1.getX() < rooms.getWallThickness() && char1.getY() > rooms.getHeight()/2 - 135 && char1.getY() < rooms.getHeight()/2 - 125) {
					char1.setY(rooms.getHeight()/2 - 125);
				}
				if(char1.getX() < rooms.getWallThickness() && char1.getY() + char1.getPixelSize()*23 > rooms.getHeight()/2 + 135) {
					char1.setX(rooms.getWallThickness());
				}
				if(char1.getX() < rooms.getWallThickness() && char1.getY() + char1.getPixelSize()*23 > rooms.getHeight()/2 + 125 && char1.getY() + char1.getPixelSize()*23 < rooms.getHeight()/2 + 135) {
					char1.setY(rooms.getHeight()/2 + 125 - char1.getPixelSize()*23);
				}
				if(char1.getX() + char1.getPixelSize()*14 > rooms.getWidth() - rooms.getWallThickness() && char1.getY() < rooms.getHeight()/2 - 135) {
					char1.setX(rooms.getWidth() - rooms.getWallThickness() - char1.getPixelSize()*14);
				}
				if(char1.getX() + char1.getPixelSize()*14 > rooms.getWidth() - rooms.getWallThickness() && char1.getY() > rooms.getHeight()/2 - 135 && char1.getY() < rooms.getHeight()/2 - 125) {
					char1.setY(rooms.getHeight()/2 - 125);
				}
				if(char1.getX() + char1.getPixelSize()*14 > rooms.getWidth() - rooms.getWallThickness()) {
					char1.setX(rooms.getWidth() - rooms.getWallThickness() - char1.getPixelSize()*14);
				}
				//Fireball interaction with wall
				if(fireball.getY() + fireball.getPixelSize()*24 > rooms.getHeight() - rooms.getWallThickness()) {
					fireball.setY(100000);
				}
				if(fireball.getY() < rooms.getWallThickness()) {
					fireball.setY(100000);
				}
				if(fireball.getX() < rooms.getWallThickness() && fireball.getY() < rooms.getHeight()/2 - 135) {
					fireball.setY(100000);
				}
				if(fireball.getX() < rooms.getWallThickness() && fireball.getY() > rooms.getHeight()/2 - 135 && fireball.getY() < rooms.getHeight()/2 - 125) {
					fireball.setY(100000);
				}
				if(fireball.getX() < rooms.getWallThickness() && fireball.getY() + fireball.getPixelSize()*24 > rooms.getHeight()/2 + 135) {
					fireball.setY(100000);
				}
				if(fireball.getX() < rooms.getWallThickness() && fireball.getY() + fireball.getPixelSize()*24 > rooms.getHeight()/2 + 125 && fireball.getY() + fireball.getPixelSize()*24 < rooms.getHeight()/2 + 135) {
					fireball.setY(100000);
				}
				if(fireball.getX() + fireball.getPixelSize()*20 > rooms.getWidth() - rooms.getWallThickness() && fireball.getY() < rooms.getHeight()/2 - 135) {
					fireball.setY(100000);
				}
				if(fireball.getX() + fireball.getPixelSize()*20 > rooms.getWidth() - rooms.getWallThickness() && fireball.getY() > rooms.getHeight()/2 - 135 && char1.getY() < rooms.getHeight()/2 - 125) {
					fireball.setY(100000);
				}
				if(fireball.getX() + fireball.getPixelSize()*20 > rooms.getWidth() - rooms.getWallThickness()) {
					fireball.setY(100000);
				}
			}
			
			//Room transitions
			if(roomnumber == 1 && char1.getY() + char1.getPixelSize()*23 < 0) {
				roomnumber++;
				char1.setLocation(WIDTH/2 - 35, HEIGHT - rooms.getWallThickness());
			}
			if(roomnumber == 2 && char1.getY() > HEIGHT) {
				roomnumber--;
				char1.setLocation(WIDTH/2 - 35, 10);
			}
			if(roomnumber == 2 && char1.getY() + char1.getPixelSize()*23 < 0) {
				roomnumber++;
				char1.setLocation(rooms.getWallThickness() + 90, HEIGHT - rooms.getWallThickness());
			}
			if(roomnumber == 3 && char1.getY() + char1.getPixelSize()*23 < 0) {
				roomnumber++;
				char1.setLocation(rooms.getWallThickness()*2 + 125 - char1.getPixelSize()*7, rooms.getHeight() - char1.getPixelSize()*23 - 10);
			}
			if(roomnumber == 3 && char1.getY() > HEIGHT) {
				roomnumber--;
				char1.setLocation(WIDTH/2 - 35, 0);
			}
			if(roomnumber == 4 && char1.getY() > HEIGHT) {
				roomnumber--;
				char1.setLocation(rooms.getWidth() - rooms.getWallThickness() - 170 - char1.getPixelSize()*7 , 10);
			}
			if(roomnumber == 4 && char1.getX() > WIDTH) {
				roomnumber++;
				char1.setLocation(0, rooms.getHeight()/2 - char1.getPixelSize()*12);
			}
			if(roomnumber == 5 && char1.getX() + char1.getPixelSize()*14 < 0) {
				roomnumber--;
				char1.setLocation(rooms.getWidth() - char1.getPixelSize()*14, rooms.getWallThickness()*2 + 125 - char1.getPixelSize()*12);
			}
			if(roomnumber == 5 && char1.getX() > WIDTH) {
				roomnumber++;
				char1.setLocation(0, rooms.getHeight()/2 - char1.getPixelSize()*12);
			}
			if(roomnumber == 6 && char1.getX() + char1.getPixelSize()*14 < 0) {
				roomnumber--;
				char1.setLocation(WIDTH - char1.getPixelSize()*14, rooms.getHeight()/2 - char1.getPixelSize()*12);
			}
			if(roomnumber == 6 && char1.getX() > WIDTH) {
				roomnumber++;
				char1.setLocation(0, rooms.getHeight()/2 - char1.getPixelSize()*12);
			}
			if(roomnumber == 7 && char1.getX() + char1.getPixelSize()*14 < 0) {
				roomnumber--;
				char1.setLocation(WIDTH - char1.getPixelSize()*14, rooms.getHeight()/2 - char1.getPixelSize()*12);
			}
			if(roomnumber == 7 && char1.getX() > WIDTH) {
				roomnumber++;
				char1.setLocation(0, rooms.getHeight()/2 - char1.getPixelSize()*12);
			}
			if(roomnumber == 8 && char1.getX() + char1.getPixelSize()*14 < 0) {
				roomnumber--;
				char1.setLocation(WIDTH - char1.getPixelSize()*14, rooms.getHeight()/2 - char1.getPixelSize()*12);
			}
			if(roomnumber == 8 && char1.getX() > rooms.getWidth()) {
				roomnumber++;
				char1.setLocation(0, rooms.getHeight()/2 - char1.getPixelSize()*12);
			}
			if(roomnumber == 9 && char1.getX() + char1.getPixelSize()*14 < 0) {
				roomnumber--;
				char1.setLocation(WIDTH - char1.getPixelSize()*14, rooms.getHeight()/2 - char1.getPixelSize()*12);
			}
			
			//Sets mana percent and manapool
			manaPercent = (double) (manapool/500);
			
			//draws mana & healthbars
			bars.drawManaBar(g, manaPercent);
			bars.drawHealthBar(g, hpPercent, 180, 10, 600, 35);
			bars.drawHeart(g, 4, 115, 5);
			for(int i = 0; i < room2monsters; i++) {
				if(roomnumber == 2) {
					bars.drawHealthBar(g, monsters.get(i).gethpPercent(), (int)monsters.get(i).getX() + (int)(monsters.get(i).getPixelSize()*8.5), (int)monsters.get(i).getY() - (int)monsters.get(i).getPixelSize()*4, (int)monsters.get(i).getPixelSize()*17, 6);
				}
			}
			
			//Healthbar for eyeball in room 4
			if(roomnumber == 4) {
				bars.drawHealthBar(g, mage.gethpPercent(), (int)mage.getX() + (int)mage.getPixelSize()*2, (int)mage.getY() - (int)mage.getPixelSize()*4, (int)mage.getPixelSize()*13, 6);
			}
			
			//Healthbar for eyeball in room 7
			if(roomnumber == 7) {
				bars.drawHealthBar(g, eye.gethpPercent(), (int)eye.getX() + (int)eye.getPixelSize()*5, (int)eye.getY() - (int)eye.getPixelSize()*4, (int)eye.getPixelSize()*29, 6);
			}
			
			//Healthbar for eyeball in room 8
			if(roomnumber == 8 ) { 
				bars.drawHealthBar(g, eye2.gethpPercent(), (int)eye2.getX() + (int)eye2.getPixelSize()*5, (int)eye2.getY() - (int)eye2.getPixelSize()*4, (int)eye2.getPixelSize()*29, 10);
			}
			
			//increases manapool each iteration, capping at 500
			if(spacePressed == false) {
				if(manaregen < 10) {
					manaregen++;
				}
				if(manaregen == 10 && manapool < 500) {
					manapool = manapool + 10;
					manaregen = 0;
				}
				if(manapool > 500) {
					manapool = manapool - (manapool - 500);
				}
				if(regentime < 10) {
					regentime++;
				}
				if(regentime == 10 && hpPercent < 1) {
					hpPercent = hpPercent + .00075;
				}
				if(hpPercent > 1) {
					hpPercent = hpPercent - (hpPercent - 1);
				}
			}
			
			//healing ability
			if(spacePressed == true && manapool >= 1 && hpPercent < 1 && abilitySelected == 2) {
				hpPercent = hpPercent + .01;
				manapool = manapool - 15;
			}
			if(hpPercent > 1) {
				hpPercent = hpPercent - (hpPercent - 1);
			}
			
			//Agility ability
			if(spacePressed == true && manapool >= 0 && abilitySelected == 3) {
				char1.setXSpeed(9);
				char1.setYSpeed(9);
				manapool = manapool - 3;
			}
			if(spacePressed == false) {
				char1.setXSpeed(4);
				char1.setYSpeed(4);
			}
				
			//fireball moves in direction of char
			fireball.move(lastDirection);
			fireball.draw(g);
			
			// This is the last line of actionPerformed
			repaint(); 

			//tracks enemies slain
			g.setColor(Color.white);
			g.setFont(new Font("Times New Roman", Font.BOLD, 40));
			if(!(roomnumber == 3)) {
				g.drawString("Level: " + (roomnumber), rooms.getWidth()/2 + 185, 40);
				
				if(abilitySelected == 1) {
					g.drawString("Ability Selected: FireBall", rooms.getWidth()/2 + 186, 80);
				}
				if(abilitySelected == 2) {
					g.drawString("Ability Selected: Heal", rooms.getWidth()/2 + 186, 80);
				}
				if(abilitySelected == 3) {
					g.drawString("Ability Selected: Agility", rooms.getWidth()/2 + 186, 80);
				}
			}
			if(roomnumber == 3) {
				g.drawString("Level: " + (roomnumber), rooms.getWidth()/2, 40);
				
				if(abilitySelected == 1) {
					g.drawString("Ability Selected: FireBall", rooms.getWidth()/2, 80);
				}
				if(abilitySelected == 2) {
					g.drawString("Ability Selected: Heal", rooms.getWidth()/2, 80);
				}
				if(abilitySelected == 3) {
					g.drawString("Ability Selected: Agility", rooms.getWidth()/2, 80);
				}
			}
			
			//ends game if killed
			if(hpPercent <= 0) {
				timer.stop();
				g.setColor(Color.BLACK);
				g.fillRect(0, 0, WIDTH, HEIGHT);
				g.setColor(Color.RED);
				g.drawString("GAME", WIDTH/2 - 50, HEIGHT/2 - 50);
				g.drawString("OVER", WIDTH/2 - 45, HEIGHT/2);
			}
		}
	}
	
	public void paintComponent(Graphics g) {
		g.drawImage(image, 0, 0, getWidth(), getHeight(), null);
	}
	
	public static void main(String[] args) {
		JFrame frame = new JFrame("");
		frame.setSize(WIDTH, HEIGHT);
		frame.setLocation(-10, 0);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setContentPane(new BasicVideogame());
		frame.setVisible(true);
	}
} 
