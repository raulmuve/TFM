package com.tfm.springboot.api.rest.model;

import javax.validation.constraints.NotEmpty;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Cim {
	
	@JsonProperty("id")
	@NotEmpty(message = "id is mandatory")
	private String id;
	
	@JsonProperty("nom")
	@NotEmpty(message = "nom is mandatory")
	private String nom;
	
	@JsonProperty("actiu")
	@NotEmpty(message = "actiu is mandatory")
	private boolean actiu;
	
	@JsonProperty("dataCreacio")
	@NotEmpty(message = "dataCreacio is mandatory")
	private String dataCreacio;
	
	@JsonProperty("dataModificacio")
	@NotEmpty(message = "dataModificacio is mandatory")
	private String dataModificacio;
	
	@JsonProperty("numRutes")
	@NotEmpty(message = "numRutes is mandatory")
	private String numRutes;
	
	@JsonProperty("numConsultes")
	@NotEmpty(message = "numConsultes is mandatory")
	private String numConsultes;

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

	public boolean isActiu() {
		return actiu;
	}

	public void setActiu(boolean actiu) {
		this.actiu = actiu;
	}

	public String getDataCreacio() {
		return dataCreacio;
	}

	public void setDataCreacio(String dataCreacio) {
		this.dataCreacio = dataCreacio;
	}

	public String getDataModificacio() {
		return dataModificacio;
	}

	public void setDataModificacio(String dataModificacio) {
		this.dataModificacio = dataModificacio;
	}

	public String getNumRutes() {
		return numRutes;
	}

	public void setNumRutes(String numRutes) {
		this.numRutes = numRutes;
	}

	public String getNumConsultes() {
		return numConsultes;
	}

	public void setNumConsultes(String numConsultes) {
		this.numConsultes = numConsultes;
	}
}
