package _02_gui_with_help._2_photo_quiz;
/*
 *    Copyright (c) The League of Amazing Programmers 2013-2021
 *    Level 1
 */

import java.awt.Component;
import java.net.MalformedURLException;
import java.net.URL;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class PhotoQuiz {

	public void run() {

		JFrame quizWindow = new JFrame();
		quizWindow.setVisible(true);
		// This will make sure the program exits when you close the window
		quizWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		// 1. find an image on the internet, and put its URL in a String
		// variable (from your browser, right click on the image, and select
		// “Copy Image Address” )
		String url = "https://preview.redd.it/zzw9ypzo2nj51.jpg?width=960&crop=smart&auto=webp&s=6828fd0646cefb4ace6bc2a6bc0e79d0e31a366d";

		// 2. create a variable of type "Component" that will hold your image
		Component comp;

		// 3. use the "createImage()" method below to initialize your Component
		comp = createImage(url);

		// 4. add the image to the quiz window
		quizWindow.add(comp);

		// 5. call the pack() method on the quiz window
		quizWindow.pack();

		// 6. ask a question that relates to the image
		String answer = JOptionPane.showInputDialog("Is this image a sunset?");

		// 7. print "CORRECT" if the user gave the right answer
		if (answer.equalsIgnoreCase("yes")) {
			System.out.println("CORRECT");
		}

		// 8. print "INCORRECT" if the answer is wrong
		else if (answer.equalsIgnoreCase("no")) {
			System.out.println("INCORRECT");
		}

		// 9. remove the component from the quiz window (you may not see the
		// effect of this until step 12)
		quizWindow.remove(comp);

		// 10. find another image and create it (might take more than one line
		// of code)
		String url1 = "https://watchandlearn.scholastic.com/content/dam/classroom-magazines/watchandlearn/videos/earth-and-space/earth-science-and-space/what-s-in-the-night-sky/english/wall-2018-whatsinthenightskymp4.transform/content-tile-large/image.png";
		Component comp1;
		comp1 = createImage(url1);
		
		// 11. add the second image to the quiz window
		quizWindow.add(comp1);

		// 12. pack the quiz window
		quizWindow.pack();

		// 13. ask another question
		String answer1 = JOptionPane.showInputDialog("Is this image of a night sky?");

		// 14+ check answer, say if correct or incorrect, etc.
		if (answer1.equalsIgnoreCase("yes")) {
			System.out.println("CORRECT");
		}
		else if (answer1.equalsIgnoreCase("no")) {
			System.out.println("INCORRECT");
		}

	}

	private Component createImage(String imageUrl) {
		JLabel imageLabel = new JLabel();
		URL url;
		try {
			url = new URL(imageUrl);
			Icon icon = new ImageIcon(url);
			imageLabel.setIcon(icon);
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			JOptionPane.showMessageDialog(null, "I can't find your image!!");
		}
		
		return imageLabel;
	}

	/* OPTIONAL */
	// *14. add scoring to your quiz
	// *15. make something happen when mouse enters image
	// (imageComponent.addMouseMotionListener())
}
