package teste;

import javax.faces.bean.ManagedBean;

@ManagedBean
public class TesteBean {
	private int numero;
	
	public void incrementaNumero() {
		this.numero = numero + 1;
	}
	
	public void setNumero(int numero) {
		this.numero = numero;
	}
	
	public int getNumero() {
		return numero;
	}
}
