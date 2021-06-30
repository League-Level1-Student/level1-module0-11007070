package _03_gui_from_scratch._1_fortune_cookie;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class FortuneCookie implements ActionListener {
    public void showButton() {
    	JFrame frame = new JFrame();
    	frame.setVisible(true);
    	
    	JButton button = new JButton();
        frame.add(button);
        frame.pack();
        
        button.addActionListener(this);
        
        int rand = new Random().nextInt(5);
        if (rand == 0) {
        	JOptionPane.showMessageDialog(null, "Your fortune is...");
        	JOptionPane.showMessageDialog(null, "You will soon meet a stranger who will change your life forever.");
        }
        else if (rand == 1) {
        	JOptionPane.showMessageDialog(null, "Your fortune is...");
        	JOptionPane.showMessageDialog(null, "There is a big bag of loot waiting at the end of your rainbow.");
        }
        else if (rand == 2) {
        	JOptionPane.showMessageDialog(null, "Your fortune is...");
        	JOptionPane.showMessageDialog(null, "You will find a home in an unexpected place.");
        }
        else if (rand == 3) {
        	JOptionPane.showMessageDialog(null, "Your fortune is...");
        	JOptionPane.showMessageDialog(null, "You will soon lose something only to get something even better in return.");
        }
        else if (rand == 4) {
        	JOptionPane.showMessageDialog(null, "Your fortune is...");
        	JOptionPane.showMessageDialog(null, "Always act as your best yourself. You never know who's watching.");
        }
        
        System.out.println("Button clicked");
   }

	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		JOptionPane.showMessageDialog(null, "Woohoo!");
		
	}
}
