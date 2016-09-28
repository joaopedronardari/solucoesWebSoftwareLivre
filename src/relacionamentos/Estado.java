package relacionamentos;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
public class Estado {

	@Id
	@GeneratedValue
	private Long id;
	
	@OneToOne
	@JoinColumn(name="gov_id")
	private Governador governador;
}
