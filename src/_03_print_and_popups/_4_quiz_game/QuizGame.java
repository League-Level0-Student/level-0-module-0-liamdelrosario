package _03_print_and_popups._4_quiz_game;

import javax.swing.JOptionPane;

public class QuizGame {
	public static void main(String[] args) {

		// Create a variable to hold the user's score. Set it equal to zero.
		int count = 0;

		// ASK A QUESTION AND CHECK THE ANSWER

		// 2. Ask the user a question
		String input = JOptionPane.showInputDialog("What is the square root of 441");
		// 3. Use an if statement to check if their answer is correct
		if (Integer.parseInt(input) == 21) {
			JOptionPane.showMessageDialog(null, "correcto ");
			count += 1;
		}
		// 4. if the user's answer was correct, add one to their score
		else {
			JOptionPane.showMessageDialog(null, "incorrect");
			count -= 1;
		}
		String polkm = JOptionPane.showInputDialog("is 1234567890 divible by 3");
		if(polkm.equals("yes")){
		JOptionPane.showMessageDialog(null,"correcto ");
		count += 1;
		}
		else {
			JOptionPane.showMessageDialog(null, "incorrect");
			count -= 1;
		}
		String pollkm = JOptionPane.showInputDialog("what year was TOTK released");
		if(pollkm.equals("2023")){
		JOptionPane.showMessageDialog(null,"correcto ");
		count += 1;
		}
		else {
			JOptionPane.showMessageDialog(null, "incorrect");
			count -= 1;
		}
		String polllkm = JOptionPane.showInputDialog("what is the best soda in my opinion");
		if(polllkm.equals("sprite")){
		JOptionPane.showMessageDialog(null,"correcto ");
		count += 1;
		}
		else {
			JOptionPane.showMessageDialog(null, "incorrect");
			count -= 1;
		}
		JOptionPane.showMessageDialog(null, "you got this number "+count+" i hope you like your score");
	}
}
	// 4. if the user's answer was correct, add one to their score

	// MAKE MORE QUESTIONS. Ask more questions by repeating the above
	// Option: Subtract a point from their score for a wrong answer

	// After all the questions have been asked, tell the user their final score


