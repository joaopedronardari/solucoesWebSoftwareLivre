package controle;

import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ApplicationScoped;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.bean.ViewScoped;

import modelo.Carro;

@ManagedBean
//@RequestScoped
//@ViewScoped
//@SessionScoped
@ApplicationScoped
public class CarroBean {
	private List<Carro> carros = new ArrayList<Carro>();
	private Carro carro = new Carro();
	
	public void adicionaCarro() {
		this.carros.add(this.carro);
		this.carro = new Carro();
	}

	public List<Carro> getCarros() {
		return carros;
	}

	public void setCarros(List<Carro> carros) {
		this.carros = carros;
	}

	public Carro getCarro() {
		return carro;
	}

	public void setCarro(Carro carro) {
		this.carro = carro;
	}
}
