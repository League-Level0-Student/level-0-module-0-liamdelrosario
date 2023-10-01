package _03_print_and_popups._3_world_domination;


import javax.swing.JOptionPane;

public class WorldDomination {
	
	public static void main(String[] args) {
		
		// 1. Ask the user if they know how to write code.
		String input = JOptionPane.showInputDialog("Do you know how to code(;?");
		if(input.equals("yes")) {
			JOptionPane.showMessageDialog(null,"you evil person cant believe you would do that your going to rule the world ): thumbs down");
		}
		else {
			
				JOptionPane.showMessageDialog(null,"you dont know it you should definetly go to a coding class you silly goose");
			}
		}

		// 2. If they say "yes", tell them they will rule the world.

		// 3. Otherwise, tell them to sign up for classes at The League.

	}


