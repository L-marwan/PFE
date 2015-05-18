package gui;

import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JTable;

public class ProfPanel extends JPanel {
	
	private JTable listeProf;
	private JButton btnAjouter, btnSupprimer, btnModifier;
	
	public ProfPanel() {
		btnAjouter = new JButton("Ajouter");
		btnModifier = new JButton("Modifier");
		btnSupprimer = new JButton("Supprimer");
		add(btnAjouter);
		add(btnSupprimer);
		add(btnModifier);
		
	}

}
