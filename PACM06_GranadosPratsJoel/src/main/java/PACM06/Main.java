package PACM06;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import java.util.List;



public class Main {

	public static void main(String[] args) {
		
		System.out.println("INICIO DEL PROGRAMA....");
		//Para indicar que queremos usar Hibernate definimos las interfaces
		
		Configuration cfg = new Configuration().configure();
		
		//Única instancia de sessionFactory en nuestra sesión
		
		SessionFactory sessionFactory = cfg.buildSessionFactory(new StandardServiceRegistryBuilder().configure().build());
		Session session = sessionFactory.openSession();
		
		System.out.println("CONFIGURACIÓN REALIZADA");
		
		//Insertar Libro
				Transaction tx = session.beginTransaction();
				Libro libro = new Libro();
				libro.setIdNombre("El señor de los anillos");
				libro.setDisponible(true);
				session.save(libro);
				tx.commit();

		//Insertar Lector
				tx = session.beginTransaction();
				Lector lector = new Lector();
				lector.setNombre("Alberto");
				lector.setApellido("Gonzalez");
				lector.setEmail("AlbertoGonzalez@gmail.com");
				session.save(lector);
				tx.commit();
				
		//Listado de libros
				
				List<Libro> libros = session.createQuery("From Libros", Libro.class).getResultList();
				for (Libro l: libros) {
					System.out.println("Libro " + l.getNombre() + ", Disponible: " + l.getDisponible());
				}
					
		//Listado de lectores
				
				List<Lector> lectores = session.createQuery("From Lectores", Lector.class).getResultList();
				for (Lector lec: lectores) {
					System.out.println("Nombre: " + lec.getNombre() +  "  Apellido: " + lec.getApellido() + " Email: " + lec.getEmail());
					}
		//Ver libro por ID
						
		
						
		//Ver lector por ID
						
						
		

		session.close();
		sessionFactory.close();

	}

}

