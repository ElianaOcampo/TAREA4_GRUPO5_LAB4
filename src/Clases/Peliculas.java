package Clases;

public class Peliculas {

	private final int ID;
	private String Nombre;
	private Categorias genero;
	
	private static int count = 0;
	
////// Constructores //////////
	
	public Peliculas()
	{
		count++;
		ID = count;
		Nombre = "";
		genero = new Categorias();
	}
	
	
	public Peliculas(String nombre, Categorias genero) {
		count++;
		ID = count;
		Nombre = nombre;
		this.genero = genero;
	}
	
//////////////// Gets and Sets/////////////

	public int getID() {
		return ID;
	}
	
	public String getNombre() {
		return Nombre;
	}
	public void setNombre(String nombre) {
		Nombre = nombre;
	}
	public Categorias getGenero() {
		return genero;
	}
	public void setGenero(Categorias genero) {
		this.genero = genero;
	}

////////////// ToString()//////////
	
	public String toString() {
		return "ID= " + ID + ", Nombre= " + Nombre + ", Genero= " + genero.getNombre();
	}
	
	public static int devuelveProximoID() {
		return count+1;
	}	
}
