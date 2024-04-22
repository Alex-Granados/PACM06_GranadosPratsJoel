package PACM06;

import java.sql.Date;

public class Prestamo {
	private int idPrestamo;
	private Date fecha_prestamo;
	private Date fecha_devolucion;
	
	
	public Prestamo() {
		
	}

	public Prestamo (int idPrestamo, Date fecha_prestamo, Date fecha_devolucion) {
		super();
		this.idPrestamo = idPrestamo;
		this.fecha_prestamo = fecha_prestamo;
		this.fecha_devolucion = fecha_devolucion;
	}
	
	public int getIdPrestamo() {
		return idPrestamo;
	}
	
	public Date getFecha_prestamo() {
		return fecha_prestamo;
	}
	
	public Date getFecha_devolucion() {
		return fecha_devolucion;
		
	}
	
	public void setIdPrestamo(int idPrestamo) {
		this.idPrestamo = idPrestamo;
	}
	public void setFecha_prestamo (Date fecha_prestamo) {
		this.fecha_prestamo = fecha_prestamo;

	}
	public void setFecha_devolucion (Date fecha_devolucion) {
		this.fecha_devolucion = fecha_devolucion;
	}

}
