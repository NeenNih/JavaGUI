import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;


public class Main {
	
	public static void main(String[] args) {

		// JPanel = a GUI component that functions as a container to hold other components
		
		ImageIcon icon1 = new ImageIcon("cyan.jfif");
		ImageIcon icon2 = new ImageIcon("pink.jfif");
		ImageIcon icon3 = new ImageIcon("purple.jfif");
		
		JLabel label1 = new JLabel();
		label1.setText("Cyan");
		label1.setIcon(icon1);
		label1.setVerticalAlignment(JLabel.CENTER);
		label1.setHorizontalAlignment(JLabel.CENTER);
		label1.setForeground(new Color(0x0071fc));
		label1.setFont(new Font("Comic Sans MS",Font.BOLD,20));
		//label1.setBounds(100, 100, 75, 75);
		
		JLabel label2 = new JLabel();
		label2.setText("Pink");
		label2.setIcon(icon2);
		label2.setVerticalAlignment(JLabel.CENTER);
		label2.setHorizontalAlignment(JLabel.CENTER);
		label2.setForeground(new Color(0xe702f7));
		label2.setFont(new Font("Comic Sans MS",Font.BOLD,20));
		//label2.setBounds(100, 100, 75, 75);
		
		JLabel label3 = new JLabel();
		label3.setText("Purple");
		label3.setIcon(icon3);
		label3.setVerticalAlignment(JLabel.CENTER);
		label3.setHorizontalAlignment(JLabel.CENTER);
		label3.setForeground(new Color(0x3e018a));
		label3.setFont(new Font("Comic Sans MS",Font.BOLD,20));
		//label3.setBounds(100, 100, 75, 75);
		
		JPanel cyanPanel = new JPanel();
		cyanPanel.setBackground(new Color(0x70fff8));
		cyanPanel.setBounds(0, 0, 300, 300);
		cyanPanel.setLayout(new BorderLayout());
		
		JPanel pinkPanel= new JPanel();
		pinkPanel.setBackground(new Color(0xff91f2));
		pinkPanel.setBounds(300, 0, 300, 300);
		pinkPanel.setLayout(new BorderLayout());
		
		JPanel purplePanel = new JPanel();
		purplePanel.setBackground(new Color(0xba82ff));
		purplePanel.setBounds(0, 300, 600, 300);
		purplePanel.setLayout(new BorderLayout());
		
		JFrame frame = new JFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLayout(null);
		frame.setSize(700,700);
		frame.setVisible(true);	
		frame.setResizable(false);
		
		frame.add(cyanPanel);
		frame.add(pinkPanel);
		frame.add(purplePanel);
		
		cyanPanel.add(label1);
		pinkPanel.add(label2);
		purplePanel.add(label3);
		
	}

}
