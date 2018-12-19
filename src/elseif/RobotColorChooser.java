//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0

package elseif;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

import java.awt.Color;

public class RobotColorChooser {
	public static void main(String[] args) {
		//1. Create a new Robot
		Robot MAP = new Robot();
		//3. Ask the user what color they would like the robot to draw
		
		String Color = JOptionPane.showInputDialog("What color do you want?");
		//5. Use an if/else statement to set the pen color that the user requested
if(Color.equalsIgnoreCase("Red")) {
	MAP.setPenColor(java.awt.Color.RED);
}
else if(Color.equalsIgnoreCase("Orange")) {
	MAP.setPenColor(java.awt.Color.ORANGE);
}
else if(Color.equalsIgnoreCase("Yellow")) {
	MAP.setPenColor(java.awt.Color.YELLOW);
}
else if(Color.equalsIgnoreCase("Green")) {
	MAP.setPenColor(java.awt.Color.GREEN);
}
else if(Color.equalsIgnoreCase("Bue")) {
	MAP.setPenColor(java.awt.Color.BLUE);
}
else if(Color.equalsIgnoreCase("Magenta")) {
	MAP.setPenColor(java.awt.Color.MAGENTA);
}
        //6. If the user doesn’t enter anything, choose a random color
else {
	MAP.setRandomPenColor();
}
        //7. Put a loop around your code so that you keep asking the user for more colors & drawing them
		
		//4. Set the pen width to 10
		
	    //2. Make the robot draw a shape (this will take more than one line of code)
MAP.penDown();
MAP.setSpeed(100);
MAP.move(100);
MAP.turn(120);
MAP.move(100);
MAP.turn(120);
MAP.move(100);
MAP.turn(120);
	}
}
