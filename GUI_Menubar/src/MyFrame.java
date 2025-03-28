import java.awt.FlowLayout;
import java.awt.event.*;
import javax.swing.*;

public class MyFrame extends JFrame implements ActionListener {
	
	JMenuBar menuBar;
	
	JMenu fileMenu;
	JMenu editMenu;
	JMenu helpMenu;
	
	JMenuItem loadItem;
	JMenuItem saveItem;
	JMenuItem exitItem;
	
	ImageIcon loadIcon;
	ImageIcon saveIcon;
	ImageIcon exitIcon;
	
	MyFrame() {	
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(400,400);
		this.setLayout(new FlowLayout());
		
		menuBar = new JMenuBar();
		
		fileMenu = new JMenu("File");
		editMenu = new JMenu("Edit");
		helpMenu = new JMenu("Help");
		
		loadItem = new JMenuItem("Load");
		saveItem = new JMenuItem("Save");
		exitItem = new JMenuItem("Exit");
		
		loadIcon = new ImageIcon("load.png");
		saveIcon = new ImageIcon("save.png");
		exitIcon = new ImageIcon("exit.png");
		
		loadItem.setIcon(loadIcon);
		saveItem.setIcon(saveIcon);
		exitItem.setIcon(exitIcon);
		
		loadItem.addActionListener(this);
		saveItem.addActionListener(this);
		exitItem.addActionListener(this);
		
		menuBar.add(fileMenu);
		menuBar.add(editMenu);
		menuBar.add(helpMenu);
		
		fileMenu.add(loadItem);
		fileMenu.add(saveItem);
		fileMenu.add(exitItem);
		
		fileMenu.setMnemonic(KeyEvent.VK_F); // Alt + f for file
		editMenu.setMnemonic(KeyEvent.VK_E); // Alt + e for edit
		helpMenu.setMnemonic(KeyEvent.VK_H); // Alt + h for help
		
		loadItem.setMnemonic(KeyEvent.VK_L); // l for load
		saveItem.setMnemonic(KeyEvent.VK_S); // s for save
		exitItem.setMnemonic(KeyEvent.VK_E); // e for exit
		
		this.setJMenuBar(menuBar);
		this.setVisible(true);
		
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		
		if(e.getSource()==loadItem) {
			
			System.out.println("You loaded a file");
			
		}
		
		if(e.getSource()==saveItem) {
			
			System.out.println("You saved a file");
			
		}
		
		if(e.getSource()==exitItem) {
			
			System.exit(0);
			
		}
		
	}

}
