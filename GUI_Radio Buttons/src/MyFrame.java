import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class MyFrame  extends JFrame implements ActionListener {
	
	 JRadioButton birianyButton;
	 JRadioButton fuchkaButton;
	 JRadioButton ilishButton;
	 ImageIcon birianyIcon;
	 ImageIcon fuchkaIcon;
	 ImageIcon ilishIcon;
	 
	 MyFrame() {
		 
		 this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		 this.setLayout(new FlowLayout());
		 this.setResizable(false);
			
		 birianyIcon = new ImageIcon("Biriany.jpg");
		 fuchkaIcon = new ImageIcon("Fuchka.jpg");
		 ilishIcon = new ImageIcon("Ilish.jpg");
		  
		 birianyButton = new JRadioButton("Biriany");
		 fuchkaButton = new JRadioButton("Fuchka");
		 ilishButton = new JRadioButton("Ilish");
		  
		 ButtonGroup group = new ButtonGroup();
		 group.add(birianyButton);
		 group.add(fuchkaButton);
		 group.add(ilishButton);
		  
		 birianyButton.addActionListener(this);
		 fuchkaButton.addActionListener(this);
		 ilishButton.addActionListener(this);
		  
		 birianyButton.setIcon(birianyIcon);
		 fuchkaButton.setIcon(fuchkaIcon);
		 ilishButton.setIcon(ilishIcon);
		  
		 this.add(birianyButton);
		 this.add(fuchkaButton);
		 this.add(ilishButton);
		 this.pack();
		 this.setVisible(true);
		  
	  }
	 
	  @Override
	  public void actionPerformed(ActionEvent e) {
	 	 
	  if(e.getSource()==birianyButton) {
		  
		  System.out.println("You ordered Biriany...");
	   
	  }
	  else if(e.getSource()==fuchkaButton) {
		  
		  System.out.println("You ordered Fuchka...");
	   
	  }
	  else if(e.getSource()==ilishButton) {
		  
		  System.out.println("You ordered Ilish...");
	   
	  }

   }

}



