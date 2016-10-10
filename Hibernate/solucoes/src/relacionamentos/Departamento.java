package relacionamentos;

import java.util.Collection;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Departamento {
	
	@Id
	@GeneratedValue
	private Long id;
	
	@OneToMany
	private List<Funcionario> funcionarios;
	
}
