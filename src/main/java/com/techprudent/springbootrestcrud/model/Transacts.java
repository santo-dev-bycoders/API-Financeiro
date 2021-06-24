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
	private long id;

	@Column(name = "Description")
	private String description;

	@Column(name = "Natureza", length = 100)
	private String natureze;

	@Column(name = "Sinal", length = 100)
	private String signal;

	public static long getSerialVersionUID() {
		return serialVersionUID;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getNatureze() {
		return natureze;
	}

	public void setNatureze(String natureze) {
		this.natureze = natureze;
	}

	public String getSignal() {
		return signal;
	}

	public void setSignal(String signal) {
		this.signal = signal;
	}
}