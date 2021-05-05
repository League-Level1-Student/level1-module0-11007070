package _01_methods._1_houses;

import java.awt.Color;
import java.nio.charset.MalformedInputException;

import org.jointheleague.graphical.robot.Robot;

/*
 *    Copyright (c) The League of Amazing Programmers 2013-2021
 *    Level 1
 */
public class Houses {
		static Robot rob = new Robot();
	public static void main(String[] args) {
		rob.setSpeed(100);
		rob.moveTo(60, 500);
		rob.turn(90);
		rob.penDown();
		rob.setPenWidth(5);
		run("yellow", 100, "flatRoof");
		run("red", 150, "pointyRoof");
		run("orange", 70, "flatRoof");
		run("blue", 170, "pointyRoof");
		run("pink", 200, "pointyRoof");
		run("green", 120, "flatRoof");
	}
	
	public static void run(String color, int height, String roofType) {
		if (color.equals("red")) {
			rob.setPenColor(65, 122, 13);
			rob.move(15);
			rob.turn(-90);
			rob.setPenColor(Color.red);
			rob.move(height);
			if (roofType.equals("flatRoof")) {
				drawFlatRoof();
			}
			else if (roofType.equals("pointyRoof")) {
				drawPointyRoof();
			}
			rob.move(height);
			rob.turn(-90);
		}
		else if (color.equals("orange")) {
			rob.setPenColor(65, 122, 13);
			rob.move(15);
			rob.turn(-90);
			rob.setPenColor(Color.orange);
			rob.move(height);
			if (roofType.equals("flatRoof")) {
				drawFlatRoof();
			}
			else if (roofType.equals("pointyRoof")) {
				drawPointyRoof();
			}
			rob.move(height);
			rob.turn(-90);
		}
		else if (color.equals("yellow")) {
			rob.setPenColor(65, 122, 13);
			rob.move(15);
			rob.turn(-90);
			rob.setPenColor(Color.yellow);
			rob.move(height);
			if (roofType.equals("flatRoof")) {
				drawFlatRoof();
			}
			else if (roofType.equals("pointyRoof")) {
				drawPointyRoof();
			}
			rob.move(height);
			rob.turn(-90);
		}
		else if (color.equals("green")) {
			rob.setPenColor(65, 122, 13);
			rob.move(15);
			rob.turn(-90);
			rob.setPenColor(Color.green);
			rob.move(height);
			if (roofType.equals("flatRoof")) {
				drawFlatRoof();
			}
			else if (roofType.equals("pointyRoof")) {
				drawPointyRoof();
			}
			rob.move(height);
			rob.turn(-90);
		}
		else if (color.equals("blue")) {
			rob.setPenColor(65, 122, 13);
			rob.move(15);
			rob.turn(-90);
			rob.setPenColor(Color.blue);
			rob.move(height);
			if (roofType.equals("flatRoof")) {
				drawFlatRoof();
			}
			else if (roofType.equals("pointyRoof")) {
				drawPointyRoof();
			}
			rob.move(height);
			rob.turn(-90);
		}
		else if (color.equals("pink")) {
			rob.setPenColor(65, 122, 13);
			rob.move(15);
			rob.turn(-90);
			rob.setPenColor(Color.pink);
			rob.move(height);
			if (roofType.equals("flatRoof")) {
				drawFlatRoof();
			}
			else if (roofType.equals("pointyRoof")) {
				drawPointyRoof();
			}
			rob.move(height);
			rob.turn(-90);
		}
	}
	
	public static void drawPointyRoof() {
		rob.turn(50);
		rob.move(25);
		rob.turn(85);
		rob.move(25);
		rob.turn(45);
	}
	
	public static void drawFlatRoof() {
		rob.turn(90);
		rob.move(30);
		rob.turn(90);
	}
}
