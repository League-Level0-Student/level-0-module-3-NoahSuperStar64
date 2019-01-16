import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

public class ObediantRobot {
	static Robot MAP = new Robot();
public static void main(String[] args) {
	
String Answer = JOptionPane.showInputDialog("What shape do you want?");
	if(Answer.equalsIgnoreCase("Circle")) {
		drawCircle();
	}
	else if(Answer.equalsIgnoreCase("Square")) {
		drawSquare();
	}
	else if(Answer.equalsIgnoreCase("Triangle")) {
		drawTriangle();
	}
	
	
	
}
static void drawSquare() {
	MAP.miniaturize();
	MAP.setSpeed(100);
	MAP.penDown();
	for (int i = 0; i < 4; i++) {
	MAP.move(100);
	MAP.turn(90);
	}
	}


static void drawTriangle() {
MAP.miniaturize();
MAP.setSpeed(100);
MAP.penDown();
for (int j = 0; j < 3; j++) {
	MAP.move(100);
	MAP.turn(120);
}
}

static void drawCircle() {
MAP.miniaturize();
MAP.setSpeed(10000);
MAP.penDown();

for (int k = 0; k < 360; k++) {
	MAP.move(1);
	MAP.turn(1);
}
}

}
