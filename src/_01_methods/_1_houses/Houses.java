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
		run2("red", 100);
		run2("yellow", 150);
		run2("blue", 90);
		run2("pink", 200);
		run2("orange", 120);
		run2("green", 110);
		run2("yellow", 170);
		run2("red", 140);
		run2("blue", 180);
	}
	public static void run(String height) {
		
		if (height.equals("small")) {
			rob.setPenColor(65, 122, 13);
			rob.move(15);
			rob.turn(-90);
			rob.setPenColor(Color.green);
			rob.move(60);
			rob.turn(90);
			rob.move(30);
			rob.turn(90);
			rob.move(60);
			rob.turn(-90);
			rob.setPenColor(65, 122, 13);
			rob.move(15);
		}
		else if (height.equals("medium")) {
			rob.setPenColor(65, 122, 13);
			rob.move(15);
			rob.turn(-90);
			rob.setPenColor(Color.green);
			rob.move(120);
			rob.turn(90);
			rob.move(30);
			rob.turn(90);
			rob.move(120);
			rob.turn(-90);
		}
		else if (height.equals("large")) {
			rob.setPenColor(65, 122, 13);
			rob.move(15);
			rob.turn(-90);
			rob.setPenColor(Color.green);
			rob.move(250);
			rob.turn(90);
			rob.move(30);
			rob.turn(90);
			rob.move(250);
			rob.turn(-90);
		}
	}
	
	public static void run2(String color, int height) {
		if (color.equals("red")) {
			rob.setPenColor(65, 122, 13);
			rob.move(15);
			rob.turn(-90);
			rob.setPenColor(Color.red);
			rob.move(height);
			rob.turn(90);
			rob.move(30);
			rob.turn(90);
			rob.move(height);
			rob.turn(-90);
		}
		else if (color.equals("orange")) {
			rob.setPenColor(65, 122, 13);
			rob.move(15);
			rob.turn(-90);
			rob.setPenColor(Color.orange);
			rob.move(height);
			rob.turn(90);
			rob.move(30);
			rob.turn(90);
			rob.move(height);
			rob.turn(-90);
		}
		else if (color.equals("yellow")) {
			rob.setPenColor(65, 122, 13);
			rob.move(15);
			rob.turn(-90);
			rob.setPenColor(Color.yellow);
			rob.move(height);
			rob.turn(90);
			rob.move(30);
			rob.turn(90);
			rob.move(height);
			rob.turn(-90);
		}
		else if (color.equals("green")) {
			rob.setPenColor(65, 122, 13);
			rob.move(15);
			rob.turn(-90);
			rob.setPenColor(Color.green);
			rob.move(height);
			rob.turn(90);
			rob.move(30);
			rob.turn(90);
			rob.move(height);
			rob.turn(-90);
		}
		else if (color.equals("blue")) {
			rob.setPenColor(65, 122, 13);
			rob.move(15);
			rob.turn(-90);
			rob.setPenColor(Color.blue);
			rob.move(height);
			rob.turn(90);
			rob.move(30);
			rob.turn(90);
			rob.move(height);
			rob.turn(-90);
		}
		else if (color.equals("pink")) {
			rob.setPenColor(65, 122, 13);
			rob.move(15);
			rob.turn(-90);
			rob.setPenColor(Color.pink);
			rob.move(height);
			rob.turn(90);
			rob.move(30);
			rob.turn(90);
			rob.move(height);
			rob.turn(-90);
		}
	}
}
