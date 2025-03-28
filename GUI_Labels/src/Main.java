import java.awt.Color;
import java.awt.Font;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.border.Border;

public class Main {
	
	public static void main(String[] args) {

		// JLabel = a GUI display area for a string of text, an image, or both
		
		ImageIcon image = new ImageIcon("nishi.png");
		Border border = BorderFactory.createLineBorder(new Color(0x9a66d9),5);
		
		JLabel label = new JLabel(); //create a label
		label.setText("Nishi, are you coding Java?"); //set text of label
		label.setIcon(image);
		label.setHorizontalTextPosition(JLabel.CENTER); //set text LEFT,CENTER, RIGHT of imageicon
		label.setVerticalTextPosition(JLabel.TOP); //set text TOP,CENTER, BOTTOM of imageicon
		label.setForeground(new Color(0x3e018a)); //set font color of text
		label.setFont(new Font("Comic Sans MS",Font.PLAIN,50)); //set font of text
		label.setIconTextGap(50); //set gap of text to image
		label.setBackground(new Color(0x7d6ffc)); //set background color
		label.setOpaque(true); //display background color
		label.setBorder(border); //sets border of label (not image+text)
		label.setVerticalAlignment(JLabel.CENTER); //set vertical position of icon+text within label
		label.setHorizontalAlignment(JLabel.CENTER); //set horizontal position of icon+text within label
		//label.setBounds(100, 100, 200, 200); //set x,y position within frame as well as dimensions
			
		JFrame frame = new JFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//frame.setSize(500,500); not needed if pack() is added
		//frame.setLayout(null);
		frame.setVisible(true);	 
		frame.setResizable(false);
		frame.add(label);
		frame.pack(); // must be written at last
		
	}

}
