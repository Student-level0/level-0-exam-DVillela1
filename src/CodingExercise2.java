
/* Level 0 Exam: Coding  Exercise #2 */
import javax.swing.JOptionPane;

/**
 * Write a program that asks the user for their age. Tell them which year they
 * were born. If they are over 30, tell them they are too old to play this game.
 **/

public class CodingExercise2 {

	public static void main(String[] args) {

		String x = JOptionPane.showInputDialog("What is your age?");

		int age = Integer.parseInt(x);

		System.out.println("You were born in " + (2018 - age) + ".");

		if (age > 30) {
			System.out.println("You are too old to play this game!");
		}

	}
}
