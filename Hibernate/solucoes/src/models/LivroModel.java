package models;

import javax.annotation.Generated;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class LivroModel {
	@Id
	@GeneratedValue
	private Long id;
	
}
