package _09_sound_effects_machine;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class SoundEffectsMachine implements ActionListener{
public void run() {
	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	JButton sound1 = new JButton();
	JButton sound2 = new JButton();
	JButton sound3 = new JButton();
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
	frame.show(true);
}

@Override
public void actionPerformed(ActionEvent e) {
	// TODO Auto-generated method stub
	
}
}
 