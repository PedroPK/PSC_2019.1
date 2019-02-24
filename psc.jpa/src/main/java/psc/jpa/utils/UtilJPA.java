package psc.jpa.utils;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class UtilJPA {
	
	private static EntityManagerFactory emf = null;
	
	public static void createEntityManagerFactory() {
		if ( emf == null ) {
			emf = Persistence.createEntityManagerFactory("PSC_H2");
		}
	}
	
	public static void closeEntityManagerFactory() {
		if ( emf != null ) {
			emf.close();
		}
	}
	
	public static EntityManager getEntityManager() {
		if ( emf == null ) {
			createEntityManagerFactory();
		}
		
		return emf.createEntityManager();
	}
	
}