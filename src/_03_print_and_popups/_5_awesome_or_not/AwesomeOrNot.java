
package _03_print_and_popups._5_awesome_or_not;

import java.util.Random;

import javax.swing.JOptionPane;

public class AwesomeOrNot {

	// 1. Make a main method that includes everything below
	public static void main(String[] args) {

		Random ran = new Random(); // This will be used below to make a random number.
		int randNum = ran.nextInt(4);
		// 2. Make a variable that will hold a random whole number

		// 3. Set your variable equal to a positive number less than 4 using
		// ran.nextInt(4);

		// 3. Print your variable to the console
		System.out.println(randNum);
		// 4. Get the user to enter something that they think is awesome
		// 5. If your variable is 0
		String input = JOptionPane.showInputDialog("what do you think is awesome.");
		if(randNum == (0)) {
			JOptionPane.showMessageDialog(null, "your "+input+ " is awesome");
		}
		// -- tell the user whatever they entered is awesome!
		//String inputg = JOptionPane.showInputDialog("what do you think is awesome.");
		if(randNum == (1)) {
			JOptionPane.showMessageDialog(null, "your "+input+ " ok");
		}
		// 6. If your variable is 1
		//String inputgg = JOptionPane.showInputDialog("what do you think is awesome.");
		if(randNum == (2)) {
			JOptionPane.showMessageDialog(null, "your "+input+ " boring");
		}
		// -- tell the user whatever they entered is ok.
		//String inputggg = JOptionPane.showInputDialog("what do you think is awesome.");
		if(randNum == (3)) {
			JOptionPane.showMessageDialog(null, "your "+input+ " i do think you should be nice right?");
		}
		// 7. If your variable is 2

		// -- tell the user whatever they entered is boring.

		// 8. If your variable is 3

		// -- invent your own message to give to the user (be nice).

	}
}