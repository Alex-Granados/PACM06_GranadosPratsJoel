package PACM06;

public class Libro {
	private int idLibro;
	private String nombre;
	private boolean disponible;
	
	public Libro() {
		
	}

	public Libro (int idLibro, String nombre, boolean disponible) {
		super();
		this.idLibro = idLibro;
		this.nombre = nombre;
		this.disponible = disponible;
	}
	
	public int getIdLibro() {
		return idLibro;
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public boolean getDisponible() {
		return disponible;
		
	}
	
	public void setIdLibro(int idAlumno) {
		this.idLibro = idAlumno;
	}
	public void setIdNombre (String nombre) {
		this.nombre = nombre;

	}
	public void setDisponible (boolean disponible) {
		this.disponible = disponible;
}
	
	
}



