package relacionamentos;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

import org.hibernate.annotations.ManyToAny;

@Entity
public class Livro {

	@Id
	@GeneratedValue
	private Long id;
	
	@ManyToMany
	private Collection<Autor> autores = new ArrayList<Autor>();

	public Collection<Autor> getAutores() {
		return autores;
	}

	public void addAutor(Autor autor) {
		autores.add(autor);
	}
}
