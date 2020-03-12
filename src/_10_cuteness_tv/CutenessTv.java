package _10_cuteness_tv;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.URI;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class CutenessTv implements ActionListener{
		JFrame frame = new JFrame();
		JPanel panel = new JPanel();
		JButton button1 = new JButton();
		JButton button2 = new JButton();
		JButton button3 = new JButton();
	public void run() {
		
		button1.addActionListener(this);
		button2.addActionListener(this);
		button3.addActionListener(this);
		button1.setText("3");
		button2.setText("2");
		button3.setText("1");
		panel.add(button3);
		panel.add(button2);
		panel.add(button1);
		frame.add(panel);
		frame.pack();
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}


	void showDucks() {
	     playVideo("https://www.youtube.com/watch?v=MtN1YnoL46Q");
	}

	void showFrog() {
	     playVideo("https://www.youtube.com/watch?v=cBkWhkAZ9ds");
	}

	void showFluffyUnicorns() {
	     playVideo("https://www.youtube.com/watch?v=a-xWhG4UU_Y");
	}

	void playVideo(String videoID) {
	     try {
	          URI uri = new URI(videoID);
	          java.awt.Desktop.getDesktop().browse(uri);
	     } catch (Exception e) {
	          e.printStackTrace();
	     }
	}


	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		JButton buttonPressed = (JButton) e.getSource();
		if (buttonPressed.equals(button1))		{
			showDucks();
		}
		else if (buttonPressed.equals(button2))		{
			showFrog();
		}
		else if (buttonPressed.equals(button3))		{
			showFluffyUnicorns();
		}
	}
}

	
