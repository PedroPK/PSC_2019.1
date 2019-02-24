package psc.jpa.daos;

import javax.persistence.EntityManager;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import psc.jpa.entities.Correntista;
import psc.jpa.utils.UtilJPA;

public class DAOBasico {
	
	private Logger logger;
	
	public DAOBasico() {
		this.logger = LoggerFactory.getLogger("psc.jpa.daos.DAOBasico");
		this.logger.info("DAOBasico instancializado");
	}
	
	public void insert(Correntista pCorrentista) {
		logger.debug("Método Inserir Correntista invocado");
		
		EntityManager em = UtilJPA.getEntityManager();
		logger.debug("Entity Manager obtido com Sucesso");
		
		em.getTransaction().begin();
		logger.debug("Transação aberta");
		
		em.persist(pCorrentista);
		logger.debug("Persist invocado com Sucesso");
		
		em.getTransaction().commit();
		logger.debug("Transação finalizada com Sucesso");
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