import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.*;
import javax.swing.*;

public class MyFrame extends JFrame implements ActionListener {
	
	JButton button;
	JLabel label;
	
	MyFrame() {	
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLayout(new FlowLayout());
		
		button = new JButton("Pick a color");
		button.addActionListener(this);
		
		label = new JLabel();
		label.setBackground(Color.white);
		label.setText("Wow it's your favorite color");
		label.setFont(new Font("Comic Sans MS",Font.PLAIN,80));
		label.setForeground(Color.gray);
		label.setOpaque(true);
		
		this.add(button);
		this.add(label);
		this.pack();
		this.setVisible(true);
		
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {

		if(e.getSource()==button) {
			
			new JColorChooser();
			
			Color color = JColorChooser.showDialog(null, "Choose your favorite color", Color.black);
			
			label.setForeground(color);
			//label.setBackground(color);
			
		}
		
	}

}
