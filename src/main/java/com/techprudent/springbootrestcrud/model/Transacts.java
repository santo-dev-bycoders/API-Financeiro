package com.techprudent.springbootrestcrud.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;

/**
 * @author Santos Russo
 */

@Entity
@Table(name = "transact")
public class Transacts {

	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "type", unique = true, nullable = false)
	@Getter
	@Setter
	private long id;

	@Column(name = "Description")
	@Getter
	@Setter
	private String description;

	@Column(name = "Natureza", length = 100)
	@Getter
	@Setter
	private String natureze;

	@Column(name = "Sinal", length = 100)
	@Getter
	@Setter
	private String signal;

}