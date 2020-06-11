package org.generation.getMoveis.model;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Compra_Produto {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	@ManyToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="codigoDaCompra", referencedColumnName="codigoDaCompra")	
	private Compra compra;
	
	@ManyToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="codigoDoProduto", referencedColumnName="codigoDoProduto")	
	private Produto produto;

	
}
