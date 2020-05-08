package Paneles;

import javax.swing.JPanel;
import javax.swing.JLabel;

import java.awt.Font;
import javax.swing.JTextField;

import Clases.Categorias;
import Clases.Peliculas;

import javax.swing.JComboBox;
import javax.swing.DefaultListModel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class IngresarPeliculas extends JPanel {
	
	private JTextField textFNombre;
	private DefaultListModel<Peliculas> listModel;
	JComboBox<Categorias> cbGenero;
	
	public IngresarPeliculas() {
		setLayout(null);
		
		JLabel lblID = new JLabel("ID");
		lblID.setFont(new Font("Trebuchet MS", Font.PLAIN, 18));
		lblID.setBounds(108, 38, 56, 16);
		add(lblID);
		
		JLabel TextLabelID = new JLabel("");
		TextLabelID.setFont(new Font("Tahoma", Font.BOLD, 13));
		TextLabelID.setEnabled(false);
		TextLabelID.setBounds(200, 33, 56, 31);
		add(TextLabelID);
		
		TextLabelID.setText(Integer.toString(Peliculas.devuelveProximoID()));
		
		JLabel lblNombre = new JLabel("Nombre");
		lblNombre.setFont(new Font("Trebuchet MS", Font.PLAIN, 18));
		lblNombre.setBounds(85, 83, 91, 31);
		add(lblNombre);
		
		JLabel lblGenero = new JLabel("G\u00E9nero");
		lblGenero.setFont(new Font("Trebuchet MS", Font.PLAIN, 18));
		lblGenero.setBounds(89, 140, 75, 16);
		add(lblGenero);
		
		textFNombre = new JTextField();
		textFNombre.setFont(new Font("Trebuchet MS", Font.PLAIN, 15));
		textFNombre.setBounds(200, 89, 131, 22);
		add(textFNombre);
		textFNombre.setColumns(10);
		
		cbGenero = new JComboBox<Categorias>();
		cbGenero.setBounds(200, 139, 131, 22);
		add(cbGenero);
				
		cbGenero.addItem(new Categorias(0, "Seleccione un genero"));
		cbGenero.addItem(new Categorias(1, "Terror"));
		cbGenero.addItem(new Categorias(2, "Acción"));
		cbGenero.addItem(new Categorias(3, "Suspenso"));
		cbGenero.addItem(new Categorias(4, "Romántica"));
		cbGenero.addItem(new Categorias(5, "Thriller"));
		
		JButton BtnAceptar = new JButton("Aceptar");
		BtnAceptar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				if(!textFNombre.getText().isEmpty() && cbGenero.getSelectedIndex()>0)
				{				
					Peliculas peliculas = new Peliculas();					
					peliculas.setNombre(textFNombre.getText());
					peliculas.setGenero((Categorias)cbGenero.getSelectedItem());					
					listModel.addElement(peliculas);
					
					textFNombre.setText("");
					cbGenero.setSelectedIndex(0);
					TextLabelID.setText(Integer.toString(Peliculas.devuelveProximoID()));
				}
			}
		});
		
		BtnAceptar.setFont(new Font("Trebuchet MS", Font.PLAIN, 17));
		BtnAceptar.setBounds(67, 216, 155, 31);
		add(BtnAceptar);	
			
	}

	public void setDefaultListModel(DefaultListModel<Peliculas> listModelRecibido) {
		this.listModel = listModelRecibido;
	}
}
