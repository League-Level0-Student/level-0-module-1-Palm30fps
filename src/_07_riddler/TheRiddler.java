package _07_riddler;

import javax.swing.JOptionPane;

//    Copyright (c) The League of Amazing Programmers 2013-2019
//    Level 0

public class TheRiddler {

	public static void main(String[] args) {

		// 1. Make a variable to hold the score
		int score = 0;
		// 3. Ask the user a riddle. Here are some ideas: bit.ly/some-riddles
		String riddle = JOptionPane.showInputDialog(null,
				"What can travel around the whole wide world while staying in a corner?");
		// 4. If they got the answer right, pop up "correct!" and increase the score by
		// one
		if (riddle.equals("a stamp")) {
			JOptionPane.showMessageDialog(null, "Correct");

			score++;
		}

// 5. Otherwise, say "wrong" and tell them the answer
		else {
			JOptionPane.showMessageDialog(null, "Oops you got it wrong. The right answer was, A stamp!");
		}
		// 6. Add some more riddles

		// 2. Make a pop up to show the score.
		JOptionPane.showMessageDialog(null, "The score is   "+ score);

		String riddle2 = JOptionPane.showInputDialog(null, "I drink I die I eat I thrive, what am I? ¯\\_(ツ)_/¯  ");

		if (riddle2.equals("fire")) {
			JOptionPane.showMessageDialog(null, "Correct");
	score++;	}
		else {
			JOptionPane.showMessageDialog(null, "Oops you got it wrong. The right answer was, fire!");
		}
	
		JOptionPane.showMessageDialog(null, "The score is  "+score);
	
	
	}
	}


