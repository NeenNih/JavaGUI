import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import javax.swing.JPanel;
import javax.swing.JFrame;

public class Main {
	
	public static void main(String[] args) {

		JFrame frame = new JFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(500, 500);
		//frame.setLayout(new BorderLayout(5,5));
		frame.setVisible(true);
		frame.setResizable(false);

		JPanel panel1 = new JPanel();
		JPanel panel2 = new JPanel();
		JPanel panel3 = new JPanel();
		JPanel panel4 = new JPanel();
		JPanel panel5 = new JPanel();
		
		panel1.setBackground(new Color(0x2395fa));
		panel2.setBackground(new Color(0x6259ff));
		panel3.setBackground(new Color(0x9051fc));
		panel4.setBackground(new Color(0x2ef4ff));
		panel5.setBackground(new Color(0xfc9df9));
		
		panel5.setLayout(new BorderLayout());
				
		panel1.setPreferredSize(new Dimension(100,100));
		panel2.setPreferredSize(new Dimension(100,100));
		panel3.setPreferredSize(new Dimension(100,100));
		panel4.setPreferredSize(new Dimension(100,100));
		panel5.setPreferredSize(new Dimension(100,100));
		
		//------------- sub panels --------------------
		
		JPanel panel6 = new JPanel();
		JPanel panel7 = new JPanel();
		JPanel panel8 = new JPanel();
		JPanel panel9 = new JPanel();
		JPanel panel10 = new JPanel();
		
		panel6.setBackground(new Color(0xff6ed1));
		panel7.setBackground(new Color(0xfcc2e2));
		panel8.setBackground(new Color(0xd2118d));
		panel9.setBackground(new Color(0xff427f));
		panel10.setBackground(new Color(0x74fcc4));
		
		panel5.setLayout(new BorderLayout());
				
		panel6.setPreferredSize(new Dimension(70,70));
		panel7.setPreferredSize(new Dimension(70,70));
		panel8.setPreferredSize(new Dimension(70,70));
		panel9.setPreferredSize(new Dimension(70,70));
		panel10.setPreferredSize(new Dimension(70,70));
	
		panel5.add(panel6,BorderLayout.NORTH);
		panel5.add(panel7,BorderLayout.SOUTH);
		panel5.add(panel8,BorderLayout.WEST);
		panel5.add(panel9,BorderLayout.EAST);
		panel5.add(panel10,BorderLayout.CENTER);
		
		//------------- sub panels --------------------
	
		frame.add(panel1,BorderLayout.NORTH);
		frame.add(panel2,BorderLayout.WEST);
		frame.add(panel3,BorderLayout.EAST);
		frame.add(panel4,BorderLayout.SOUTH);
		frame.add(panel5,BorderLayout.CENTER);
		
	}

}
