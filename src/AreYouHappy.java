import javax.swing.JOptionPane;

public class AreYouHappy {
public static void main(String[] args) {
int answer = JOptionPane.showConfirmDialog(null, "Are you happy?");
if(answer==0) {
JOptionPane.showMessageDialog(null, "Then keep doing whatever.");	
}
else if(answer==1) {
	int answer2 = JOptionPane.showConfirmDialog(null, "Do you want to be happy?");
	if(answer2==0) {
		JOptionPane.showMessageDialog(null, "Then change something.");
	}
	else if(answer2==1) {
		JOptionPane.showMessageDialog(null, "I think you have depression.");
	}
}



}
}
