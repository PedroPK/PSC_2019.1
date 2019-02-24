package psc.jpa.entities;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Correntista {
	
	@Id
	private int		codigoCorrentista;
	
	private String	nome;
	
	public Correntista() {
	}
	
	public int getCodigoCorrentista() {
		return codigoCorrentista;
	}
	
	public void setCodigoCorrentista(int codigoCorrentista) {
		this.codigoCorrentista = codigoCorrentista;
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + codigoCorrentista;
		result = prime * result + ((nome == null) ? 0 : nome.hashCode());
		return result;
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Correntista other = (Correntista) obj;
		if (codigoCorrentista != other.codigoCorrentista)
			return false;
		if (nome == null) {
			if (other.nome != null)
				return false;
		} else if (!nome.equals(other.nome))
			return false;
		return true;
	}
	
}