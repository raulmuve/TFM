package com.tfm.springboot.api.rest.model;

import java.util.List;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder(alphabetic = true)
public class RefugiPostInput {
	@JsonProperty("id")
	@JsonPropertyDescription("id code")
	private String id;

	@JsonProperty("nom")
	@JsonPropertyDescription("nom code")
	@NotEmpty(message = "nom is mandatory")
	private String nom;

	@JsonProperty("ubicacio")
	@JsonPropertyDescription("ubicacio code")
	@NotNull(message = "ubicacio is mandatory")
	private RefugiPostInputUbicacio ubicacio;

	@JsonProperty("places")
	@JsonPropertyDescription("places code")
	@NotNull(message = "id_Refugi is mandatory")
	private Integer places;

	@JsonProperty("cims")
	@JsonPropertyDescription("cims code")
	private String cims = null;

	@JsonProperty("rutes")
	@JsonPropertyDescription("rutes code")
	private String rutes;

	@JsonProperty("id")
	public String getId() {
		return id;
	}

	@JsonProperty("id")
	public void setId_Refugi(String id) {
		this.id = id;
	}

	@JsonProperty("nom")
	public String getNom() {
		return nom;
	}

	@JsonProperty("nom")
	public void setNom(String nom) {
		this.nom = nom;
	}

	@JsonProperty("ubicacio")
	public RefugiPostInputUbicacio getUbicacio() {
		return ubicacio;
	}

	@JsonProperty("ubicacio")
	public void setUbicacio(RefugiPostInputUbicacio ubicacio) {
		this.ubicacio = ubicacio;
	}

	@JsonProperty("places")
	public Integer getPlaces() {
		return places;
	}

	@JsonProperty("places")
	public void setPlaces(Integer places) {
		this.places = places;
	}

	@JsonProperty("cims")
	public String getCims() {
		return cims;
	}

	@JsonProperty("cims")
	public void setCims(String cims) {
		this.cims = cims;
	}

	@JsonProperty("rutes")
	public String getRutes() {
		return rutes;
	}

	@JsonProperty("rutes")
	public void setRutes(String rutes) {
		this.rutes = rutes;
	}
}
