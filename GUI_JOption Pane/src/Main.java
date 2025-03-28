import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) {
		
		JOptionPane.showMessageDialog(null, "This is a message dialog box", "Title", JOptionPane.PLAIN_MESSAGE);
		JOptionPane.showMessageDialog(null, "Here is some info", "Title", JOptionPane.INFORMATION_MESSAGE);
		JOptionPane.showMessageDialog(null, "Really?", "Title", JOptionPane.QUESTION_MESSAGE);
		JOptionPane.showMessageDialog(null, "Please be alert!", "Title", JOptionPane.WARNING_MESSAGE);
		JOptionPane.showMessageDialog(null, "You have to say your name!", "Title", JOptionPane.ERROR_MESSAGE);
		
		System.out.println(JOptionPane.showInputDialog("What is your name?"));
		JOptionPane.showConfirmDialog(null, "Hi, are you coding Java?");
		
		
		ImageIcon icon = new ImageIcon("Smilee.jpg");
		String[] responses = {"Yes!","Thank you!","OK!"};
		
		int answer = JOptionPane.showOptionDialog(
				
				null,
				"Congrats for coding java...", 
				"Secret message", 
				JOptionPane.DEFAULT_OPTION, 
				0, 
				icon, 
				responses, 
				responses[0]);
		
		System.out.println(answer);
		
	}

}
