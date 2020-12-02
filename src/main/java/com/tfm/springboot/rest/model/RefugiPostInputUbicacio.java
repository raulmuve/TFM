package com.tfm.springboot.rest.model;

import javax.validation.constraints.NotEmpty;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder(alphabetic = true)
public class RefugiPostInputUbicacio {
	
	@JsonProperty("latitud")
	@JsonPropertyDescription("latitud code")
	@NotEmpty(message = "latitud is mandatory")
	private String latitud;
	
	@JsonProperty("longitud")
	@JsonPropertyDescription("longitud code")
	@NotEmpty(message = "longitud is mandatory")
	private String longitud;
	
	@JsonProperty("comentaris")
	@JsonPropertyDescription("comentaris code")
	@NotEmpty(message = "comentaris is mandatory")
	private String comentaris;
	
	@JsonProperty("Altitud")
	@JsonPropertyDescription("Altitud code")
	@NotEmpty(message = "Altitud is mandatory")
	private String Altitud;

	@JsonProperty("latitud")
	public String getLatitud() {
		return latitud;
	}

	@JsonProperty("latitud")
	public RefugiPostInputUbicacio setLatitud(String latitud) {
		this.latitud = latitud;
		return this;
	}

	@JsonProperty("longitud")
	public String getLongitud() {
		return longitud;
	}

	@JsonProperty("longitud")
	public RefugiPostInputUbicacio setLongitud(String longitud) {
		this.longitud = longitud;
		return this;
	}

	@JsonProperty("comentaris")
	public String getComentaris() {
		return comentaris;
	}

	@JsonProperty("comentaris")
	public RefugiPostInputUbicacio setComentaris(String comentaris) {
		this.comentaris = comentaris;
		return this;
	}

	@JsonProperty("Altitud")
	public String getAltitud() {
		return Altitud;
	}

	@JsonProperty("Altitud")
	public RefugiPostInputUbicacio setAltitud(String altitud) {
		Altitud = altitud;
		return this;
	}

}
