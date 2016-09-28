package relacionamentos;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Pedido {
	
	@Id
	@GeneratedValue
	private Long id;
	
	@ManyToOne
	private Cliente cliente;
}
