package psc.jpa.daos;

import static org.junit.Assert.*;

import java.util.Iterator;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.metamodel.EntityType;

import org.junit.Test;

import psc.jpa.entities.Correntista;
import psc.jpa.utils.UtilJPA;

public class DAOBasicoTest {
	
	@Test
	public void testeInserCorrentista() {
		// Arrange
		Correntista c = new Correntista();
		c.setCodigoCorrentista(1);
		c.setNome("Pedro C. Ferreira Santos");
		
		// Act
		DAOBasico dao = new DAOBasico();
		dao.insert(c);
		
		Correntista c2 = dao.select(1);
		
		/*
		 *  Assert
		 */
		// Modo de descobrir se uma Classe é uma Entidade
		assertNotNull(c.getClass().getAnnotation(Entity.class));
		
		printAllEntities();
		
		assertNotNull(c2);
		assertEquals(1, c2.getCodigoCorrentista());
	}
	
	private void printAllEntities() {
		Set<EntityType<?>> conjuntoEntidades = UtilJPA.getEntityManager().getMetamodel().getEntities();
		Iterator<EntityType<?>> iterator = conjuntoEntidades.iterator();
		while ( iterator.hasNext() ) {
			EntityType<?> entidade = iterator.next();
			System.out.println(entidade.getJavaType().toString());
		}
	}
	
}