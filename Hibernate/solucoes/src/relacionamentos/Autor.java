package relacionamentos;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Autor {

	@Id
	@GeneratedValue
	private Long id;
	
	@Column(name="name",unique=true)
	private String nome;
	
	public Autor(String nome) {
		this.nome = nome;
	}
	
}
