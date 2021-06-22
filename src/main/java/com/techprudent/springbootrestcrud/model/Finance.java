package com.techprudent.springbootrestcrud.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;

/**
 * @author Santos Russo
 */

@Entity
@Table(name = "finance")
public class Finance {

	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id_finance",unique = true,nullable = false)
	@Getter @Setter
	private long id;

	@ManyToOne
	@JoinColumn(name="type")
	@Getter @Setter
	private Transacts type;

	@Column(name = "Data")
	@Getter @Setter
	private Date dateFinance;

	@Column(name = "Valor",length = 100)
	@Getter @Setter
	private int value;

	@Column(name = "CPF",length = 100)
	@Getter @Setter
	private String cpf;

	@Column(name = "Cartao",length = 100)
	@Getter @Setter
	private String card;

	@Column(name="Hora")
	@Getter @Setter
	private String hour;

	@Column(name="DonoLoja")
	@Getter @Setter
	private String ownerStore;

	@Column(name="NomeLoja")
	@Getter @Setter
	private String nameStore;

}
