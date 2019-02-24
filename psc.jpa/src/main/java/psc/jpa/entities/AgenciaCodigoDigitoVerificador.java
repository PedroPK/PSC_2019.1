package psc.jpa.entities;

import java.io.Serializable;

import javax.persistence.Embeddable;

@Embeddable
public class AgenciaCodigoDigitoVerificador implements Serializable {
	public int cdAgencia;
	public short cdDigitoVerificador;

	public AgenciaCodigoDigitoVerificador() {}

	public int getCdAgencia() {
		return cdAgencia;
	}

	public void setCdAgencia(int cdAgencia) {
		this.cdAgencia = cdAgencia;
	}

	public short getCdDigitoVerificador() {
		return cdDigitoVerificador;
	}

	public void setCdDigitoVerificador(short cdDigitoVerificador) {
		this.cdDigitoVerificador = cdDigitoVerificador;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + cdAgencia;
		result = prime * result + cdDigitoVerificador;
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
		AgenciaCodigoDigitoVerificador other = (AgenciaCodigoDigitoVerificador) obj;
		if (cdAgencia != other.cdAgencia)
			return false;
		if (cdDigitoVerificador != other.cdDigitoVerificador)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "AgenciaCodigoDigitoVerificador [cdAgencia=" + cdAgencia + 
				", cdDigitoVerificador=" + cdDigitoVerificador
				+ "]";
	}
	
	
}