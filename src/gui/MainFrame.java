package gui;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class MainFrame extends JFrame{
	private MainPanel mainPan;

	
	public MainFrame() throws Exception {
		mainPan = new MainPanel();	
		setSize(800,680);	
		getContentPane().add(mainPan);
		
		
		setResizable(false);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
	}
	
	public static void main(String[] args) throws Exception {
		new MainFrame();
	}
	
}
