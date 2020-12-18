package com.tfm.springboot.api.rest.model;

import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder(alphabetic = true)
public class CimPostOutput {

	@JsonProperty("id")
	@JsonPropertyDescription("id code")
	@NotNull(message = "id is mandatory")
	public String id;
	
	@JsonProperty("nom")
	@JsonPropertyDescription("nom code")
	@NotNull(message = "nom is mandatory")
	private String nom;
	
	@JsonProperty("dataCreacio")
	@JsonPropertyDescription("dataCreacio code")
	@NotNull(message = "dataCreacio is mandatory")
	private String dataCreacio;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getDataCreacio() {
		return dataCreacio;
	}

	public void setDataCreacio(String dataCreacio) {
		this.dataCreacio = dataCreacio;
	}
	
	
}
