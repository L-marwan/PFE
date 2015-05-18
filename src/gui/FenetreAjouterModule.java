package gui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

public class FenetreAjouterModule extends JFrame {
	
	private JPanel panel;
	private JButton btnAjouter, btnAnnuler;
	private JTextField nomModTF,nomResTF,semTF,filTF;
	private JLabel nomModLbl,nomResLbl, semLbl,filLbl;
	//private  JTable tab1;
	private DefaultTableModel model;
	
	public FenetreAjouterModule( final DefaultTableModel model) {
		panel = new JPanel();
		this.model = model;
		
		nomModLbl = new JLabel("Module: ");
		nomModTF = new JTextField(20);
		panel.add(nomModLbl);
		panel.add(nomModTF);

		nomResLbl = new JLabel("Responsable: ");
		nomResTF = new JTextField(20);
		panel.add(nomResLbl);
		panel.add(nomResTF);
		
		semLbl = new JLabel("Semestre: ");
		semTF = new JTextField(20);
		panel.add(semLbl);
		panel.add(semTF);
		
		filLbl = new JLabel("Filiére: ");
		filTF = new JTextField(20);
		panel.add(filLbl);
		panel.add(filTF);
		
		btnAjouter = new JButton("Ajouter");
		btnAjouter.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
 
				model.addRow(new String []{nomModTF.getText(),nomResTF.getText(),
						semTF.getText(),filTF.getText()});
				dispose();
				
			}
		});
		btnAnnuler = new JButton("Annuler");
		btnAnnuler.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				dispose();
			}
		});
		panel.add(btnAjouter);
		panel.add(btnAnnuler);
		
		getContentPane().add(panel);
		setSize(350,250);
		setLocationRelativeTo(getParent());
		setResizable(false);
		//setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		setVisible(true);
		
		
	}
	
	
}
