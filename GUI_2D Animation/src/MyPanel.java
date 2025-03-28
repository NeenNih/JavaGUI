import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class MyPanel extends JPanel implements ActionListener {
	
	final int PANEL_WIDTH = 550;
	final int PANEL_HEIGHT = 360;
	
	Image fly;
	Image backgroundImage;
	Timer timer;
	
	int xVelocity = 50;
	int yVelocity = 150;
	int x = 100;
	int y = 10;
	
	MyPanel() {
		
		this.setPreferredSize(new Dimension(PANEL_WIDTH,PANEL_HEIGHT));
		this.setBackground(Color.black);
		fly = new ImageIcon("butterfly.png").getImage();	
		backgroundImage = new ImageIcon("base.jpg").getImage();
		timer = new Timer(100, this);
		timer.start();
		
	}

	public void paint(Graphics g) {
		
		super.paint(g); // paint background
		Graphics2D g2D = (Graphics2D) g;
		g2D.drawImage(backgroundImage, 0, 0, null);
		g2D.drawImage(fly, x, y, null);
		
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		
		x = x + xVelocity;
		
		if(x >= PANEL_WIDTH - fly.getWidth(null) || x < 0) {
			
			xVelocity = xVelocity * -1;
			
		}
		
		y = y + yVelocity;
		
		if(y >= PANEL_HEIGHT - fly.getHeight(null) || y < 0) {
			
			yVelocity = yVelocity * -1;
			
		}
		
		repaint();
		
	}

}
