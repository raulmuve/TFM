package com.tfm.springboot.api.rest.model;

import javax.validation.constraints.NotEmpty;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({ "id_ruta", "nom" })
public class RutaPostInput {
	
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
	
	@JsonProperty("urlPic")
	@JsonPropertyDescription("urlPic link")
	@NotEmpty(message = "urlPic is mandatory")
	private String urlPic;
	

	@JsonProperty("nom")
	public String getNom() {
		return nom;
	}

	@JsonProperty("nom")
	public RutaPostInput setNom(String nom) {
		this.nom = nom;
		return this;
	}

	@JsonProperty("descripcio")
	public String getDescripcio() {
		return descripcio;
	}

	@JsonProperty("descripcio")
	public RutaPostInput setDescripcio(String descripcio) {
		this.descripcio = descripcio;
		return this;
	}

	@JsonProperty("link")
	public String getLink() {
		return link;
	}

	@JsonProperty("link")
	public RutaPostInput setLink(String link) {
		this.link = link;
		return this;
	}

	public String getUrlPic() {
		return urlPic;
	}

	public void setUrlPic(String urlPic) {
		this.urlPic = urlPic;
	}
	
}
