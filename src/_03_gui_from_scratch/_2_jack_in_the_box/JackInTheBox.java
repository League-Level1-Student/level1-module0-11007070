package _03_gui_from_scratch._2_jack_in_the_box;

import java.net.URL;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class JackInTheBox implements ActionListener {

	JButton button = new JButton();
	int count = 0;

	public void run() {
		JFrame frame = new JFrame();
		frame.setVisible(true);

		button.setText("Surprise!");
		frame.add(button);
		frame.pack();
		button.addActionListener(this);

	}

	private void showPicture(String fileName) {
		try {
			JLabel imageLabel = createLabelImage(fileName);
			JFrame frame = new JFrame();
			frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			frame.add(imageLabel);
			frame.setVisible(true);
			frame.pack();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	private JLabel createLabelImage(String fileName) {
		try {
			URL imageURL = getClass().getResource(fileName);
			if (imageURL == null) {
				System.err.println("Could not find image " + fileName);
				return new JLabel();
			} else {
				Icon icon = new ImageIcon(imageURL);
				JLabel imageLabel = new JLabel(icon);
				return imageLabel;
			}
		} catch (Exception e) {
			System.err.println("Could not find image " + fileName);
			return new JLabel();
		}
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		JButton buttonPressed = (JButton) arg0.getSource();
		System.out.println("count is: " + count);
		if (buttonPressed.equals(button)) {
			count++;
			if (count == 5) {
				count = 0;
				showPicture("jackInTheBox.png");
				createLabelImage("jackInTheBox.png");
			}
		}

	}
}
