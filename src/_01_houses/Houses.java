package _01_houses;

import java.util.Random;

import org.jointheleague.graphical.robot.Robot;

public class Houses {
	Robot rob = new Robot("mini");

	public static void main(String[] args) {
		new Houses().run();
	}

	public void run() {
	
		rob.setX(10);
		rob.setY(550);
		rob.penDown();
		rob.setSpeed(999);
		for(int i = 0; i<10;i++) {
		Random ran = new Random();
		int height = ran.nextInt(3);
		if(height == 0) {
			drawhousie("small");
		}
		else if(height == 1) {
			drawhousie("medium");
		}
		else if(height == 2) {
			drawhousie("large");
		}
		}
		}

	void drawhousie(int height) {
		
		rob.move(height);
		drawPointyRoof();
		rob.move(height);
		rob.turn(-90);
		rob.setPenColor(0, 999, 0);
		rob.move(30);
		rob.turn(-90);
	}
	void drawhousie(String size) {
		if(size.equals("small")) {
			drawhousie(60);
			
			rob.setPenColor(999, 0, 0);
			
		}
		else if (size.equals("medium")) {
			drawhousie(120);
			
			rob.setPenColor(0, 999, 0);
		
		}
		else if(size.equals("large")){
			drawhousie(250);
			
			rob.setPenColor(0, 0, 999);
	
		}
	}
	void drawPointyRoof() {
		rob.turn(60);
		rob.move(20);
		rob.turn(60);
		rob.move(20);
		rob.turn(60);
	}
	void drawFlatRoof() {
		rob.turn(90);
		rob.move(30);
		rob.turn(90);
		
	}
	
}
