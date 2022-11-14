package client;

import javax.swing.ImageIcon;
import javax.swing.JFrame;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		JFrame mainFrame = new JFrame();
		mainFrame.setSize(700, 500);
		mainFrame.setVisible(true);
		mainFrame.setLayout(null);
		mainFrame.setTitle("TeamViewer Premium Limited Edition 1.0.69");
		
		mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);	// Make X button works
		mainFrame.setResizable(false);	// Make frame unresizable. To prevent components getting displayed unproperly
		
		
		ImageIcon logo = new ImageIcon("conho.png");
		mainFrame.setIconImage(logo.getImage());	// Change frame icon
		
		
	}

}
