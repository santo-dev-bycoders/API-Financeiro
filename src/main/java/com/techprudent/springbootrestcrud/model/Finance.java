package com.techprudent.springbootrestcrud.model;

import lombok.Getter;
import lombok.Setter;
import org.springframework.format.annotation.DateTimeFormat;

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
	private long id;

	@ManyToOne
	@JoinColumn(name="type")
	private Transacts type;

	@Temporal(TemporalType.DATE)
	@DateTimeFormat(pattern = "dd/MM/yyyy")
	@Column(name = "Data")
	private Date dateFinance;

	@Column(name = "Valor",length = 100)
	private int value;

	@Column(name = "CPF",length = 100)
	private String cpf;

	@Column(name = "Cartao",length = 100)
	private String card;

	@Column(name="Hora")
	private String hour;

	@Column(name="DonoLoja")
	private String ownerStore;

	@Column(name="NomeLoja")
	private String nameStore;

	public static long getSerialVersionUID() {
		return serialVersionUID;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public Transacts getType() {
		return type;
	}

	public void setType(Transacts type) {
		this.type = type;
	}

	public Date getDateFinance() {
		return dateFinance;
	}

	public void setDateFinance(Date dateFinance) {
		this.dateFinance = dateFinance;
	}

	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getCard() {
		return card;
	}

	public void setCard(String card) {
		this.card = card;
	}

	public String getHour() {
		return hour;
	}

	public void setHour(String hour) {
		this.hour = hour;
	}

	public String getOwnerStore() {
		return ownerStore;
	}

	public void setOwnerStore(String ownerStore) {
		this.ownerStore = ownerStore;
	}

	public String getNameStore() {
		return nameStore;
	}

	public void setNameStore(String nameStore) {
		this.nameStore = nameStore;
	}
}
