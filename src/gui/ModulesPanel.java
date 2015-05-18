package gui;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.net.URL;
import java.util.Scanner;
import java.lang.*;

import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class ModulesPanel extends JPanel {
	private JTable listeModules;
	private JButton btnAjouter, btnSupprimer, btnModifier;
	private JPanel topPanel;
	private DefaultTableModel model;
	
	public ModulesPanel() throws Exception {
		
		setLayout(new BorderLayout());
		
		btnAjouter = new JButton("Ajouter");
		btnModifier = new JButton("Modifier");
		btnSupprimer = new JButton("Supprimer");
		topPanel = new  JPanel();
		topPanel.add(btnAjouter);
		topPanel.add(btnSupprimer);
		topPanel.add(btnModifier);
		
		String[] col = {"Nom", "Semestre", "Responsable","Filére"};
		String [][] data = new String[0][4];
		
		model = new DefaultTableModel(data,col);
		chargerModules();
		listeModules = new JTable(model);
	    listeModules.setRowSelectionAllowed(true);
		JScrollPane scrollPane = new JScrollPane(listeModules);
		listeModules.setFillsViewportHeight(true);
		add(scrollPane,BorderLayout.CENTER);
		add(topPanel,BorderLayout.NORTH);
		
		
		btnAjouter.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				new FenetreAjouterModule(model);
			}
		});
		
		btnSupprimer.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				if(listeModules.getSelectedRow()>= 0){
					model.removeRow(listeModules.getSelectedRow());
				}else{
					System.out.print("pas de selection");
				}
			}
		});
		
	}
	/**
	 * rempli un tableau 2 D avec des mosules a partir du fichier module.txt
	 * methode temporaire pur tester l'affichage
	 * @return
	 */
	private void chargerModules() throws Exception{
		//ClassLoader classLoader = getClass().getClassLoader();
		//File file = new File(classLoader.getResource("modules").getFile());
		
		//Class c = this.getClass();
		//URL path = c.getResource("module");
		//File file = new
		
		File file = new File("/home/marwan/workspace/interfacePFE" +
				"/resources/modules");
		String []s = new String[4];
		Scanner scan = new Scanner(file);

		while(scan.hasNext()){
			for(int j =0;j<4;j++){
				s[j] = scan.next();
			}
			model.addRow(s);
		}
		
		scan.close();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
}
