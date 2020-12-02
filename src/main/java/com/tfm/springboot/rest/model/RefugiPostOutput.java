package com.tfm.springboot.rest.model;

import javax.validation.constraints.NotEmpty;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder(alphabetic = true)
public class RefugiPostOutput {

	@JsonProperty("id_Refugi")
	@JsonPropertyDescription("refugi code")
	@NotEmpty(message = "id_Refugi is mandatory")
	private Integer id_Refugi;

	@JsonProperty("nom")
	@JsonPropertyDescription("nom code")
	@NotEmpty(message = "nom is mandatory")
	private String nom;

	@JsonProperty("id_Refugi")
	public Integer getId_Refugi() {
		return id_Refugi;
	}

	@JsonProperty("id_Refugi")
	public void setId_Refugi(Integer id_Refugi) {
		this.id_Refugi = id_Refugi;
	}

	@JsonProperty("nom")
	public String getNom() {
		return nom;
	}

	@JsonProperty("nom")
	public void setNom(String nom) {
		this.nom = nom;
	}

	@Override
	public String toString() {
		return "RefugiPostOutput [id_Refugi=" + id_Refugi + ", nom=" + nom + "]";
	}
}
