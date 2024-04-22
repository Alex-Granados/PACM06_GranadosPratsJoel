package PACM06;

public class Lector {
	private int idLector;
	private String nombre;
	private String apellido;
	private String email;


	
	public Lector() {
		
	}

	public Lector (int idLector, String nombre, String apellido, String email, int telefono) {
		super();
		this.idLector = idLector;
		this.nombre = nombre;
		this.apellido = apellido;
		this.email = email;
	
		
	}
	
	public int getIdLector() {
		return idLector;
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public String getApellido() {
		return apellido;
		
	}
	
	public String getEmail() {
		return email;
		
	}
	
	
	public void setIdLibro(int idLector) {
		this.idLector = idLector;
	}
	public void setNombre (String nombre) {
		this.nombre = nombre;

	}
	
	public void setApellido (String apellido) {
		this.apellido = apellido;

	}
	public void setEmail (String email) {
		this.email = email;
}
	
	

}
