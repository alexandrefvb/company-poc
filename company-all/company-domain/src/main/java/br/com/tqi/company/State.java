package br.com.tqi.company;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;

import org.hibernate.validator.constraints.NotBlank;

@Entity
public class State implements Serializable {

	private static final long serialVersionUID = 4332373099953265681L;

	@Id
	private Long id;

	@NotBlank
	private String name;

	@NotBlank
	private String acronym;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAcronym() {
		return acronym;
	}

	public void setAcronym(String acronym) {
		this.acronym = acronym;
	}
}
