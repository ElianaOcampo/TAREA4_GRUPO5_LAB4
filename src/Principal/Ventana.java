package Principal;

import java.awt.BorderLayout;

import javax.swing.DefaultListModel;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Clases.Peliculas;
import Paneles.IngresarPeliculas;
import Paneles.ListarPeliculas;

import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JMenu;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Ventana extends JFrame {

	private JPanel contentPane;
	private static DefaultListModel<Peliculas> listModel;

	public Ventana() {
		setTitle("Programa");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 500, 351);
		listModel = new DefaultListModel<Peliculas>();
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu Menu = new JMenu("Pel\u00EDculas");
		Menu.setFont(new Font("Trebuchet MS", Font.PLAIN, 20));
		menuBar.add(Menu);
		
		JMenuItem MenuItemAgregar = new JMenuItem("Agregar");
		MenuItemAgregar.setFont(new Font("Trebuchet MS", Font.PLAIN, 18));
	
		MenuItemAgregar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				contentPane.removeAll();
				IngresarPeliculas panel = new IngresarPeliculas();
				panel.setDefaultListModel(listModel);
				contentPane.add(panel);
				contentPane.repaint();
				contentPane.revalidate();				
			}
		});
		Menu.add(MenuItemAgregar);
		
		JMenuItem MenuItemListar = new JMenuItem("Listar");
		MenuItemListar.setFont(new Font("Trebuchet MS", Font.PLAIN, 18));
		
		MenuItemListar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				contentPane.removeAll();
				ordenarPeliculas();
				ListarPeliculas panel = new ListarPeliculas();
				panel.setDefaultListModel(listModel);
				contentPane.add(panel);
				contentPane.repaint();
				contentPane.revalidate();
			}
		});
		Menu.add(MenuItemListar);
		
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
	}
	
	public void ordenarPeliculas() {
		Peliculas temp;
	    Peliculas[] ob = new Peliculas[listModel.getSize()];
	    for(int i = 0 ; i <listModel.getSize(); i++ )
	        ob[i] = listModel.getElementAt(i);
	    int n=ob.length;
	    for(int i=0;i<n;i++)
	        for(int j=0;j<n-i-1;j++)
	        {
	            if(ob[j].getNombre().compareTo(ob[j+1].getNombre())>0)
	            {
	             temp=ob[j];
	             ob[j]=ob[j+1];
	             ob[j+1]=temp;
	            }

	          }
	    listModel.removeAllElements();
	    for(int i=0;i<n;i++)
	      listModel.addElement((Peliculas) ob[i]);
	}

}
