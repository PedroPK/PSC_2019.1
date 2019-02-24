package psc.jpa.daos;

import static org.junit.Assert.*;
import org.junit.Test;

import psc.jpa.entities.Correntista;

public class DAOBasicoTest {
	
	@Test
	public void testeInserCorrentista() {
		Correntista c = new Correntista();
		c.setCodigoCorrentista(1);
		c.setNome("Pedro C. Ferreira Santos");
		
		DAOBasico dao = new DAOBasico();
		dao.insert(c);
		
		Correntista c2 = dao.select(1);
		
		assertNotNull(c2);
		assertEquals(1, c2.getCodigoCorrentista());
	}
	
}