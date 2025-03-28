import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class MyFrame extends JFrame implements ActionListener {
	
	JComboBox<String> comboBox;
	 
	MyFrame() {
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    this.setLayout(new FlowLayout()); 
	    this.setResizable(false);
	  
	    String[] animals = {"Lion","Zebra","Deer"};
	  
	    comboBox = new JComboBox<String>(animals);
	    comboBox.addActionListener(this);
	  
	    comboBox.setEditable(true);
	    comboBox.addItem("Horse");
	    comboBox.insertItemAt("Tiger", 0);
	    comboBox.removeItem("Zebra");
	    //comboBox.removeItemAt(0);
	    //comboBox.removeAllItems();
	  
	    this.add(comboBox);
	    this.pack();
	    this.setVisible(true);

	}
	 
	@Override
	public void actionPerformed(ActionEvent e) {
		
		if(e.getSource()==comboBox) {
			
			System.out.println(comboBox.getSelectedIndex() + " " + comboBox.getSelectedItem());
		
		}
	  
	}

}
