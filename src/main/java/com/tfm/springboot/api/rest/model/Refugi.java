package com.tfm.springboot.api.rest.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.validation.constraints.NotEmpty;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder(alphabetic = true)
public class Refugi {
	
	@JsonProperty("id")
	@JsonPropertyDescription("id code")
	@NotEmpty(message = "id is mandatory")
	public String id;

	@JsonProperty("nom")
	@JsonPropertyDescription("nom code")
	@NotEmpty(message = "nom is mandatory")
	private String nom;
	
	@JsonProperty("ubicacio")
	@JsonPropertyDescription("ubicacio code")
	@NotEmpty(message = "ubicacio is mandatory")
	private RefugiUbicacio ubicacio = new RefugiUbicacio();
	
	@JsonProperty("places")
	@JsonPropertyDescription("places code")
	@NotEmpty(message = "places is mandatory")
	private Integer places;
	
	@JsonProperty("rutes")
	@JsonPropertyDescription("rutes code")
	@NotEmpty(message = "rutes is mandatory")
	private List<String> rutes = new ArrayList<String>();

	@JsonProperty("cims")
	@JsonPropertyDescription("cims code")
	@NotEmpty(message = "cims is mandatory")
	private List<String> cims = new ArrayList<String>();

	
	@JsonProperty("dataCreacio")
	@JsonPropertyDescription("dataCreacio code")
	@NotEmpty(message = "dataCreacio is mandatory")
	private Date dataCreacio;
	
	@JsonProperty("dataModificacio")
	@JsonPropertyDescription("dataModificacio code")
	@NotEmpty(message = "dataModificacio is mandatory")
	private Date dataModificacio;
	
	@JsonProperty("numConsultes")
	@JsonPropertyDescription("numConsultes code")
	@NotEmpty(message = "numConsultes is mandatory")
	private Integer numConsultes;
	
	@JsonProperty("actiu")
	@JsonPropertyDescription("actiu code")
	@NotEmpty(message = "actiu is mandatory")
	private boolean actiu;

	@JsonProperty("id")
	public String getId() {
		return id;
	}

	@JsonProperty("id")
	public void setId(String id) {
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
	public RefugiUbicacio getUbicacio() {
		return ubicacio;
	}

	@JsonProperty("ubicacio")
	public void setUbicacio(RefugiUbicacio ubicacio) {
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

	@JsonProperty("rutes")
	public List<String> getRutes() {
		return rutes;
	}

	@JsonProperty("rutes")
	public void setRutes(List<String> rutes) {
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
	
	@JsonProperty("cims")
	public List<String> getCims() {
		return cims;
	}
	
	@JsonProperty("cims")
	public void setCims(List<String> cims) {
		this.cims = cims;
	}
}
