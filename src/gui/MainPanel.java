package gui;

import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;

public class MainPanel extends JPanel {
	
	private JButton btnNouveau, btnCharger;
	private JPanel topPanel;
	private JTabbedPane onglets;
	private ProfPanel profs;
	private ModulesPanel modules;
	
	public MainPanel() throws Exception {
		btnNouveau = new JButton("Nouvelle Surveillance");
		btnCharger = new JButton("ChargerSurveillance");
		profs = new ProfPanel();
		modules = new ModulesPanel();
		onglets = new JTabbedPane();
		topPanel = new JPanel();
		
		setLayout(new BorderLayout());
		
		topPanel.add(btnNouveau);
		topPanel.add(btnCharger);
		add(topPanel,BorderLayout.NORTH);
		
		onglets.add("Professeurs",profs);
		onglets.add("Modules",modules);
		
		add(onglets);
		
	}

}
