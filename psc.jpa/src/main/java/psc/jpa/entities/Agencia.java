package psc.jpa.entities;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;

@Entity
public class Agencia {
	
	@EmbeddedId
	private AgenciaCodigoDigitoVerificador data = new AgenciaCodigoDigitoVerificador();
	
	private String	endereco;
	
	public AgenciaCodigoDigitoVerificador getData() {
		return data;
	}
	public void setData(AgenciaCodigoDigitoVerificador data) {
		this.data = data;
	}
	public String getEndereco() {
		return endereco;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((data == null) ? 0 : data.hashCode());
		result = prime * result + ((endereco == null) ? 0 : endereco.hashCode());
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
		Agencia other = (Agencia) obj;
		if (data == null) {
			if (other.data != null)
				return false;
		} else if (!data.equals(other.data))
			return false;
		if (endereco == null) {
			if (other.endereco != null)
				return false;
		} else if (!endereco.equals(other.endereco))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "Agencia [data=" + data + ", endereco=" + endereco + "]";
	}
	
}
