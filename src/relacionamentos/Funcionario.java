package relacionamentos;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Funcionario {

	@Id
	@GeneratedValue
	private Long id;
	
	private String name;
}
