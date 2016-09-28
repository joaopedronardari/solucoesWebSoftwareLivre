package models;

import java.math.BigDecimal;
import java.util.Collection;

import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Pessoa {
	
	@Id
	@GeneratedValue
	private Long id;
	
	@Column(length=30,nullable=false,unique=true)
	private String nome;
	
	@Column(precision=3,scale=2)
	private BigDecimal altura;
	
	@ElementCollection
	private Collection<String> telefones;
}
