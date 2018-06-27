import java.awt.Color;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

/* Level 0 Exam: Coding  Exercise #1 */
public class CodingExercise1 {

	public static void main(String[] args) {
		// 3. ask the user what color they would like the Robot to draw

		// 4. use an if/else statement to set the pen color that the user requested
		// (minimum of 2 colors)

		// 2. set the pen width to 10

		// 1. make the Robot draw a shape

		Robot rob = new Robot();
		rob.penDown();
		rob.setSpeed(10);

		String color = JOptionPane.showInputDialog(
				"Choose a color for the robot to draw.\nRed, Orange, Yellow, Green, Blue, or Magenta.");

		if (color.equalsIgnoreCase("Red")) {
			rob.setPenColor(Color.RED);
		} else if (color.equalsIgnoreCase("Orange")) {
			rob.setPenColor(Color.ORANGE);
		} else if (color.equalsIgnoreCase("Yellow")) {
			rob.setPenColor(Color.YELLOW);
		} else if (color.equalsIgnoreCase("Green")) {
			rob.setPenColor(Color.GREEN);
		} else if (color.equalsIgnoreCase("Blue")) {
			rob.setPenColor(Color.BLUE);
		} else if (color.equalsIgnoreCase("Purple")) {
			rob.setPenColor(Color.MAGENTA);
		} else {
			JOptionPane.showMessageDialog(null,
					"Error(s)\n1. That color is not one of the ones the program specified.\n2. You spelled the color incorrectly.\n3. The code is messed up.");
			System.exit(0);
		}

		rob.setPenWidth(10);

		for (int i = 0; i < 4; i++) {
			rob.move(100);
			rob.turn(90);
		}
		rob.hide();

	}

}
