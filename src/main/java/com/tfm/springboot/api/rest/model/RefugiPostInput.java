package com.tfm.springboot.api.rest.model;

import java.util.Date;
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
	private List<Integer> cims = null;

	@JsonProperty("rutes")
	@JsonPropertyDescription("rutes code")
	private List<Integer> rutes;

	@JsonProperty("dataCreacio")
	@JsonPropertyDescription("dataCreacio code")
	private Date dataCreacio;

	@JsonProperty("dataModificacio")
	@JsonPropertyDescription("dataModificacio code")
	private Date dataModificacio;

	@JsonProperty("numConsultes")
	@JsonPropertyDescription("numConsultes code")
	private Integer numConsultes;

	@JsonProperty("actiu")
	@JsonPropertyDescription("actiu value")
	@NotNull(message = "actiu is mandatory")
	private boolean actiu;

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
	public List<Integer> getCims() {
		return cims;
	}

	@JsonProperty("cims")
	public void setCims(List<Integer> cims) {
		this.cims = cims;
	}

	@JsonProperty("rutes")
	public List<Integer> getRutes() {
		return rutes;
	}

	@JsonProperty("rutes")
	public void setRutes(List<Integer> rutes) {
		this.rutes = rutes;
	}

	@JsonProperty("dataCreacio")
	public Date getDataCreacio() {
		return dataCreacio;
	}

	@JsonProperty("dataCreacio")
	public void setDataCreacio(Date dataCreacio) {
		this.dataCreacio = dataCreacio;
	}

	@JsonProperty("dataModificacio")
	public Date getDataModificacio() {
		return dataModificacio;
	}

	@JsonProperty("dataModificacio")
	public void setDataModificacio(Date dataModificacio) {
		this.dataModificacio = dataModificacio;
	}

	@JsonProperty("numConsultes")
	public Integer getNumConsultes() {
		return numConsultes;
	}

	@JsonProperty("numConsultes")
	public void setNumConsultes(Integer numConsultes) {
		this.numConsultes = numConsultes;
	}

	@JsonProperty("actiu")
	public boolean isActiu() {
		return actiu;
	}

	@JsonProperty("actiu")
	public void setActiu(boolean actiu) {
		this.actiu = actiu;
	}

}
