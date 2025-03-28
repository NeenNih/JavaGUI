import java.awt.*;
import javax.swing.*;

public class NewWindow {
	
	 JFrame frame = new JFrame();
	 JLabel label = new JLabel("Hello Nishi...");
	 
	 NewWindow() {
	  
		  label.setBounds(100,140,400,100);
		  label.setFont(new Font("Gabriola",Font.BOLD,50));
		  label.setForeground(new Color(0x681efc));
		  
		  frame.add(label);
		  
		  frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		  frame.setSize(420,420);
		  frame.setLayout(null);
		  frame.setVisible(true);
	  
     }

}
