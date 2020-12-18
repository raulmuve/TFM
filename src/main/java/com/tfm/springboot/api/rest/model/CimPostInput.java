package com.tfm.springboot.api.rest.model;

import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder(alphabetic = true)
public class CimPostInput {
	
	@JsonProperty("id")
	@JsonPropertyDescription("id code")
	private String id;
	
	@JsonProperty("nom")
	@JsonPropertyDescription("nom code")
	@NotNull(message = "nom is mandatory")
	private String nom;
	
	@JsonProperty("descripcio")
	@JsonPropertyDescription("descripcio cim")
	@NotNull(message = "descripcio is mandatory")
	private String descripcio;
	
	@JsonProperty("informacioGeneral")
	@JsonPropertyDescription("informacioGeneral cim")
	@NotNull(message = "cimInformacioGeneral is mandatory")
	private CimPostInputInformacioGeneral cimInformacioGeneral;
	
	@JsonProperty("altitud")
	@JsonPropertyDescription("altitud cim")
	@NotNull(message = "atitud is mandatory")
	private CimPostInputAltitud cimAltitud;
	
	@JsonProperty("actiu")
	@JsonPropertyDescription("actiu cim")
	private String actiu;
	
	@JsonProperty("dataCreacio")
	@JsonPropertyDescription("dataCreacio cim")
	private String dataCreacio;
	
	@JsonProperty("dataModificacio")
	@JsonPropertyDescription("dataModificacio cim")
	private String dataModificacio;
	
	@JsonProperty("numRefugis")
	@JsonPropertyDescription("numRefugis cim")
	private int numRefugis;
	
	@JsonProperty("numRutes")
	@JsonPropertyDescription("numRutes cim")
	private int numRutes;
	
	@JsonProperty("numConsultes")
	@JsonPropertyDescription("numConsultes cim")
	private int numConsultes;

	@JsonProperty("idRefugi")
	private String idRefugi;
	
	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getDescripcio() {
		return descripcio;
	}

	public void setDescripcio(String descripcio) {
		this.descripcio = descripcio;
	}

	public CimPostInputInformacioGeneral getCimInformacioGeneral() {
		return cimInformacioGeneral;
	}

	public void setCimInformacioGeneral(CimPostInputInformacioGeneral cimInformacioGeneral) {
		this.cimInformacioGeneral = cimInformacioGeneral;
	}

	public CimPostInputAltitud getCimAltitud() {
		return cimAltitud;
	}

	public void setCimAltitud(CimPostInputAltitud cimAltitud) {
		this.cimAltitud = cimAltitud;
	}

	public String getIdRefugi() {
		return idRefugi;
	}

	public void setIdRefugi(String idRefugi) {
		this.idRefugi = idRefugi;
	}

}
