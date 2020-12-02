package com.tfm.springboot.api.rest.model;

import java.util.Date;

import javax.validation.constraints.NotEmpty;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({ "id_ruta", "nom" })
public class RutesSearchOutputRuta {

	@JsonProperty("id_ruta")
	@JsonPropertyDescription("ruta code")
	@NotEmpty(message = "id_ruta is mandatory")
	private Integer id_ruta;

	@JsonProperty("nom")
	@JsonPropertyDescription("ruta name")
	@NotEmpty(message = "name is mandatory")
	private String nom;
	
	@JsonProperty("descripcio")
	@JsonPropertyDescription("ruta descripcio")
	@NotEmpty(message = "descripcio is mandatory")
	private String descripcio;
	
	@JsonProperty("link")
	@JsonPropertyDescription("ruta link")
	@NotEmpty(message = "link is mandatory")
	private String link;
	
	@JsonProperty("actiu")
	@JsonPropertyDescription("ruta actiu")
	@NotEmpty(message = "actiu is mandatory")
	private boolean actiu;
	
	@JsonProperty("dataCreacio")
	@JsonPropertyDescription("ruta dataCreacio")
	@NotEmpty(message = "dataCreacio is mandatory")
	private Date dataCreacio;
	
	@JsonProperty("dataModificacio")
	@JsonPropertyDescription("ruta dataModificacio")
	@NotEmpty(message = "dataModificacio is mandatory")
	private Date dataModificacio;
	
	@JsonProperty("numeroConsultes")
	@JsonPropertyDescription("ruta numConsultes")
	@NotEmpty(message = "numConsultes is mandatory")
	private Integer numeroConsultes;

	@JsonProperty("id_ruta")
	public Integer getId_ruta() {
		return id_ruta;
	}

	@JsonProperty("id_ruta")
	public RutesSearchOutputRuta setId_ruta(Integer id_ruta) {
		this.id_ruta = id_ruta;
		return this;
	}

	@JsonProperty("nom")
	public String getNom() {
		return nom;
	}

	@JsonProperty("nom")
	public RutesSearchOutputRuta setNom(String nom) {
		this.nom = nom;
		return this;
	}

	@JsonProperty("descripcio")
	public String getDescripcio() {
		return descripcio;
	}

	@JsonProperty("descripcio")
	public RutesSearchOutputRuta setDescripcio(String descripcio) {
		this.descripcio = descripcio;
		return this;
	}

	@JsonProperty("link")
	public String getLink() {
		return link;
	}

	@JsonProperty("link")
	public RutesSearchOutputRuta setLink(String link) {
		this.link = link;
		return this;
	}

	@JsonProperty("actiu")
	public boolean isActiu() {
		return actiu;
	}

	@JsonProperty("actiu")
	public RutesSearchOutputRuta setActiu(boolean actiu) {
		this.actiu = actiu;
		return this;
	}

	@JsonProperty("dataCreacio")
	public Date getDataCreacio() {
		return dataCreacio;
	}

	@JsonProperty("dataCreacio")
	public RutesSearchOutputRuta setDataCreacio(Date dataCreacio) {
		this.dataCreacio = dataCreacio;
		return this;
	}

	@JsonProperty("dataModificacio")
	public Date getDataModificacio() {
		return dataModificacio;
	}

	@JsonProperty("dataModificacio")
	public RutesSearchOutputRuta setDataModificacio(Date dataModificacio) {
		this.dataModificacio = dataModificacio;
		return this;
	}

	@JsonProperty("numeroConsultes")
	public Integer getNumeroConsultes() {
		return numeroConsultes; 
	}

	@JsonProperty("numeroConsultes")
	public RutesSearchOutputRuta setNumeroConsultes(Integer numeroConsultes) {
		this.numeroConsultes = numeroConsultes;
		return this;
	}
}
