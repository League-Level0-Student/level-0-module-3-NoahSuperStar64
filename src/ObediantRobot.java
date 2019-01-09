import org.jointheleague.graphical.robot.Robot;

public class ObediantRobot {
public static void main(String[] args) {
	Robot MAP = new Robot();
	MAP.miniaturize();
	MAP.setSpeed(100);
	MAP.penDown();
	
	
	
	
	
	
	
	
	
}
static void drawSquare() {
	for (int i = 0; i < 4; i++) {
	MAP.move(100);
	MAP.turn(90);
	}
	}
}
