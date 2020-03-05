package _07_fortune_cookie;

import javax.swing.JButton;
import javax.swing.JFrame;

public class fortune_cookie {
	void showButton(){
		JFrame frame = new JFrame();
		frame.setVisible(true);
		JButton button = new JButton();
		frame.add(button);
		frame.pack();
		button.addActionListener(this);//<========}==><>


		    System.out.println("Button clicked");
	}
		   
		}

