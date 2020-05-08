package Paneles;

import javax.swing.JPanel;

import Clases.Peliculas;

import javax.swing.DefaultListModel;
import javax.swing.JLabel;
import javax.swing.JList;
import java.awt.Font;

public class ListarPeliculas extends JPanel {

	private JList<Peliculas> list;
	private DefaultListModel<Peliculas> listModel;
	
	public ListarPeliculas() {
		setLayout(null);
		
		JLabel lblPeliculas = new JLabel("Pel\u00EDculas");
		lblPeliculas.setFont(new Font("Trebuchet MS", Font.PLAIN, 18));
		lblPeliculas.setBounds(25, 124, 95, 44);
		add(lblPeliculas);
		
		list = new JList<Peliculas>();
		list.setBounds(112, 13, 323, 280);
		add(list);
	}

	public void setDefaultListModel(DefaultListModel<Peliculas> listModelRecibido) {
		this.listModel = listModelRecibido;
		list.setModel(this.listModel);
	}
	
	public void ordenarPeliculas() {
		
	}
}
