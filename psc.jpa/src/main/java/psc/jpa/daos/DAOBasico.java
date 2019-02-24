package psc.jpa.daos;

import javax.persistence.EntityManager;

import psc.jpa.entities.Correntista;
import psc.jpa.utils.UtilJPA;

public class DAOBasico {
	
	public DAOBasico() {
		//Logger logger = LoggerFactory.getLogger(name)
	}
	
	public void insert(Correntista pCorrentista) {
		EntityManager em = UtilJPA.getEntityManager();
		
		em.getTransaction().begin();
		
		em.persist(pCorrentista);
		
		em.getTransaction().commit();
	}
	
	public Correntista select(int pCodigoCorrentista) {
		EntityManager em = UtilJPA.getEntityManager();
		
		Correntista c = 
			em.find(
				Correntista.class, 
				pCodigoCorrentista);
		
		return c;
	}
	
}