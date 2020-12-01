package com.tfm.springboot.rest.model;

import javax.validation.constraints.NotEmpty;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({ "uuid", "documents" })
public class RutaSearchOutput {

	@JsonProperty("id_ruta")
	@JsonPropertyDescription("ruta code")
	@NotEmpty(message = "id_ruta is mandatory")
	private Integer id_ruta;

	@JsonProperty("nom")
	@JsonPropertyDescription("ruta name")
	@NotEmpty(message = "name is mandatory")
	private String nom;

	@JsonProperty("id_ruta")
	public Integer getId_ruta() {
		return id_ruta;
	}

	@JsonProperty("id_ruta")
	public RutaSearchOutput setId_ruta(Integer id_ruta) {
		this.id_ruta = id_ruta;
		return this;
	}

	@JsonProperty("nom")
	public String getNom() {
		return nom;
	}

	@JsonProperty("nom")
	public RutaSearchOutput setNom(String nom) {
		this.nom = nom;
		return this;
	}

}
