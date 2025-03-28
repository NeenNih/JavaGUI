import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.*;
import javax.swing.*;

public class MyFrame extends JFrame implements MouseListener {
	
	JLabel label;
	
	ImageIcon smile;
	ImageIcon fun;
	ImageIcon laugh;
	ImageIcon yoyo;
	
	MyFrame() {
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(500,500);
		this.getContentPane().setBackground(Color.black);
		this.setLocationRelativeTo(null);
		this.setResizable(false);
		
		label = new JLabel();
		label.addMouseListener(this);
		
		smile = new ImageIcon("smile.png");
		fun = new ImageIcon("fun.png");
		laugh = new ImageIcon("laugh.png");
		yoyo = new ImageIcon("yoyo.png");
	
		/*// project 1
		this.setLayout(null);
		label.setBounds(0, 0, 100, 100); 
		label.setBackground(Color.cyan); 
		label.setOpaque(true);*/ 
		
		
		// project 2
		this.setLayout(new FlowLayout()); 
		label.setIcon(smile); //
		
		this.add(label);
		this.pack(); // p2
		this.setVisible(true);
		
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		
		// Invoked when the mouse enters a component
		
		System.out.println("You entered the component");
		label.setIcon(fun);
		//label.setBackground(Color.magenta);
		
	}
	
	@Override
	public void mousePressed(MouseEvent e) {
		
		// Invoked when a mouse button has been pressed on a component
		
		System.out.println("You pressed the mouse");
		label.setIcon(laugh);
		//label.setBackground(Color.pink);
		
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		
		// Invoked when a mouse button has been released on a component
		
		System.out.println("You released the mouse");
		label.setIcon(yoyo);
		//label.setBackground(Color.yellow);
		
	}
	
	@Override
	public void mouseClicked(MouseEvent e) {
		
		// Invoked when the mouse button has been clicked (pressed & released) on a component
		
		System.out.println("You clicked the mouse");
		//label.setBackground(Color.gray);
		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		
		// Invoked when the mouse exits a component
		
		System.out.println("You exited the component");
		label.setIcon(smile);
		//label.setBackground(Color.cyan);
		
	}

}
