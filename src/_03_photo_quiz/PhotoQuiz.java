package _03_photo_quiz;
/*
 *    Copyright (c) The League of Amazing Programmers 2013-2019
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

	public void run() throws Exception {

		JFrame quizWindow = new JFrame();
		quizWindow.setVisible(true);
		// This will make sure the program exits when you close the window
		quizWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		// 1. find an image on the internet, and put its URL in a String
		// variable (from your browser, right click on the image, and select
		// “Copy Image Address”)
String picture ="https://vignette.wikia.nocookie.net/jurassicworld-evolution/images/0/04/Prothumb.png/revision/latest?cb=20190817155036";
		// 2. create a variable of type "Component" that will hold your image
Component pic = (createImage(picture));
		// 3. use the "createImage()" method below to initialize your Component

		// 4. add the image to the quiz window
quizWindow.add(pic);
		// 5. call the pack() method on the quiz window
quizWindow.pack();
		// 6. ask a question that relates to the image
String answer = JOptionPane.showInputDialog("What is this Dinosaur");
		// 7. print "CORRECT" if the user gave the right answer
if(answer.equalsIgnoreCase("proceratosaurus")) {
	JOptionPane.showMessageDialog(null, "CORRECT");
}
		// 8. print "INCORRECT" if the answer is wrong
else {
	JOptionPane.showMessageDialog(null, "Incorrect");
}
		// 9. remove the component from the quiz window (you may not see the
		// effect of this until step 12)
quizWindow.remove(pic);
		// 10. find another image and create it (might take more than one line
		// of code) KKKKKEEEEEVVVVIIIINNNN   ^W^
String newpic= "https://66.media.tumblr.com/3e681b8883783b5250ff7bf38a6ebdbe/tumblr_inline_pjzqmhcggp1rx4yme_500.jpg";
		Component pict = (createImage(newpic)); 
// 11. add the second image to the quiz window
quizWindow.add(pict);
quizWindow.pack();
		// 12. pack the quiz window
String con = JOptionPane.showInputDialog("What Dinosaur is this");

		// 14 check answer, say if correct or incorrect, etc.
if(con.equalsIgnoreCase("concavenator corcovatus")) {
	JOptionPane.showMessageDialog(null, "CORRECT");
}
else{
	JOptionPane.showMessageDialog(null, "WRONG");
}
	}

	private Component createImage(String imageUrl) throws MalformedURLException {
		URL url = new URL(imageUrl);
		Icon icon = new ImageIcon(url);
		JLabel imageLabel = new JLabel(icon);
		return imageLabel;
	}

	/* OPTIONAL */
	// *14. add scoring to your quiz
	// *15. make something happen when mouse enters image
	// (imageComponent.addMouseMotionListener())
}
