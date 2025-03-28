import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class MyFrame extends JFrame implements ActionListener {
	
	JButton button;
	JLabel label;
	
	MyFrame() {
		
		ImageIcon icon = new ImageIcon("Like.png");
		ImageIcon icon2 = new ImageIcon("Smilee.jpg");
		
		label = new JLabel();
		label.setIcon(icon2);
		label.setBounds(120, 100, 500, 500);
		label.setVisible(false);
		
		button = new JButton();
		button.setBounds(150, 100, 150, 90);
		button.addActionListener(this);
		button.setText("I like it");
		
		button.setFocusable(false);
		button.setIcon(icon);
		button.setHorizontalTextPosition(JButton.CENTER);
		button.setVerticalTextPosition(JButton.BOTTOM);
		button.setFont(new Font("Comic Sans",Font.BOLD,20));
		button.setIconTextGap(5);
		button.setForeground(Color.black);
		button.setBackground(new Color(0xece75f));
		button.setBorder(BorderFactory.createLineBorder(new Color(0xfffdd835),2));
	
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLayout(null);
		this.setSize(500,500);
		this.setVisible(true);
		this.setResizable(false);
		this.add(button);
		this.add(label);
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		if(e.getSource()==button) {
			
			System.out.println("smilee....");
			//button.setEnabled(false);
			label.setVisible(true);
			
		}	
		
	}

}

