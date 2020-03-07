package _07_fortune_cookie;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class fortune_cookie implements ActionListener {
	void showButton(){
		JFrame frame = new JFrame();
		frame.setVisible(true);
		JButton button = new JButton();
		frame.add(button);
		frame.pack();
		button.addActionListener(this);


		    System.out.println("Button clicked");
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		JOptionPane.showMessageDialog(null, "WOOHOO");
		   int rand = new Random().nextInt(5);
		   if (rand==0) {
			   JOptionPane.showMessageDialog(null, "hi");
		   }
		   else if (rand==1) {
			   JOptionPane.showMessageDialog(null, "hello");
		   }
		   else if (rand==2) {
			   JOptionPane.showMessageDialog(null, "e");
		   }
		   else if (rand==3) {
			   JOptionPane.showMessageDialog(null, "1");
		   }
		   else if (rand==4) {
			   JOptionPane.showMessageDialog(null, "2");
		   }
		
	}
		   
		}

