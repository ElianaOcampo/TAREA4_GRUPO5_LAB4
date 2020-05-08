package Clases;

public class Categorias {
	
	private int ID;
	private String nombre;
	
	
////////// Constructores /////////////
	
	public Categorias() {
		ID = 0;
		nombre = "";
	}
	
	
	public Categorias(int iD, String nombre) {
		
		ID = iD;
		this.nombre = nombre;
	}


///////// Gets and sets //////////////
	public int getID() {
		return ID;
	}

	public void setID(int iD) {
		ID = iD;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	
///////////// To String /////////////////
	
	
	public String toString() {
		return ID + " -"+ nombre;
	}
	

	
	
}
