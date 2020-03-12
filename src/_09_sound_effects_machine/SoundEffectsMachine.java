package _09_sound_effects_machine;

import java.applet.AudioClip;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JApplet;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class SoundEffectsMachine implements ActionListener{
	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	JButton sound1 = new JButton();
	JButton sound2 = new JButton();
	JButton sound3 = new JButton();
public void run() {
	
	sound1.addActionListener(this);
	sound2.addActionListener(this);
	sound3.addActionListener(this);
	sound1.setText("3");
	sound2.setText("2");
	sound3.setText("1");
	panel.add(sound3);
	panel.add(sound2);
	panel.add(sound1);
	frame.add(panel);
	frame.pack();
	frame.setVisible(true);
	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

}

@Override
public void actionPerformed(ActionEvent e) {
	// TODO Auto-generated method stub
	JButton buttonPressed = (JButton) e.getSource();
	if (buttonPressed.equals(sound1))		{
		playSound("godzilla.wav");
	}
	else if (buttonPressed.equals(sound2))		{
		playSound("storm.wav");
	}
	else if (buttonPressed.equals(sound3))		{
		playSound("waterfall.wav");
	}
	}
	
private void playSound(String fileName) {
    AudioClip sound = JApplet.newAudioClip(getClass().getResource(fileName));
    sound.play();
}
}
 