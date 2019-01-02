import javax.swing.JOptionPane;

public final class Horoscope {
public static void main(String[] args) {
	String Sign = JOptionPane.showInputDialog("What's your zodiac sign?");
	if(Sign.equalsIgnoreCase("Aries")) {
		JOptionPane.showMessageDialog(null,"Courageous, energetic, willful, commanding, leading. Often leads when following would be best course of action.");
	}
	else if(Sign.equalsIgnoreCase("Aquarius")) {
		JOptionPane.showMessageDialog(null, "Forward thinking, communicative, people oriented, stubborn, generous, and dedicated.");
	}
	else if(Sign.equalsIgnoreCase("Libra")) {
		JOptionPane.showMessageDialog(null, "Balanced, seeks beauty, sense of justice.");
	}
	else if(Sign.equalsIgnoreCase("Scorpio")) {
		JOptionPane.showMessageDialog(null, "Passionate, exacting, loves extremes, combative, reflective.");
	}
	else if(Sign.equalsIgnoreCase("Cancer")) {
		JOptionPane.showMessageDialog(null, "Emotional, group oriented, seeks security, family.");
	}
	else {
		JOptionPane.showMessageDialog(null, "That's not a star sign!");
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
}
